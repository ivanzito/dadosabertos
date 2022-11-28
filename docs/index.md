---
layout: default
---

# Contexto

Este projeto foi criado para aprender extrair dados disponibilizados no TSE. Por hora,
foi extraído apenas os dados das eleições presidenciais do segundo turno de 2022. Neste case a importação dos dados, são efetuados assim que a aplicação faz o startup. Não é um cenário comum, mas, por hora, não há a necessidade de criar um cronjob para ser executado.

## Motivação

Usar os dados coletados para gerar métricas em processos **a fim de estudos**. Para tanto
- Foi utilizado o Spring Batch para extrair os dados de um arquivo com a extensão csv e persisti-los de 10 em 10 registros para não onerar a memória. 
- Usado o actuator do Spring para disponibilizar os dados ao Prometheus
- Feito a integração junto ao Grafana, para gerar os dashboards das métricas coletadas
- Integrado o projeto apigateway para fazer o push das métricas

## Overview

![Overview](/assets/images/overview.png)

## Prometheus

O Prometheus utiliza uma estratégia de fazer pulling em um endpoint pré-configurado, no caso do actuator /actuator/prometheus. Esse
pulling é chamado de scrape e o seu intervalo é configurável. Abaixo um exemplo simples de configuração:
```yaml
# my global config
global:
  scrape_interval: 5s # Set the scrape interval to every 15 seconds. Default is every 1 minute.
  evaluation_interval: 5s # Evaluate rules every 15 seconds. The default is every 1 minute.
  # scrape_timeout is set to the global default (10s).

# Alertmanager configuration
alerting:
  alertmanagers:
    - static_configs:
        - targets:
          # - alertmanager:9093

# Load rules once and periodically evaluate them according to the global 'evaluation_interval'.
rule_files:
# - "first_rules.yml"
# - "second_rules.yml"

# A scrape configuration containing exactly one endpoint to scrape:
# Here it's Prometheus itself.
scrape_configs:
  # The job name is added as a label `job=<job_name>` to any timeseries scraped from this config.
  - job_name: "prometheus"

    # metrics_path defaults to '/metrics'
    # scheme defaults to 'http'.

    static_configs:
      - targets: ["localhost:9090"]

  # scrape for spring batch
  - job_name: 'dados abertos batch'
    honor_labels: true
    static_configs:
      - targets: ['172.17.0.1:9091']

  - job_name: 'dados abertos web'
    metrics_path: '/actuator/prometheus'
    scrape_interval: 15s
    static_configs:
      - targets: [ '172.17.0.1:8080' ]
```

## Apigateway

Usado em processos êfemeros(o que chamamos de batch), trabalha de forma contrária ao Prometheus, envia da aplicação métricas que posteriormente serão usadas pelo Prometheus.

## Grafana

Grafana é onde são criados os dashboards com as métricas exportadas pelo Prometheus, para isso, deve-se configurar o Grafana para receber as métricas do Prometheus, ou seja fazer com que o Prometheus seja um datasource do Grafana.

![Integração com o Prometheus](/assets/images/grafana-connection.png)

Uma boa dica é obter dashboards prontos do site do Grafana e importá-los por seu id
ou json, para isso acesse Grafana.com e procure um dashboard. Exemplo:

![Integração com o Prometheus](/assets/images/sample-dashboard.png)


## Rodando tudo localmente

Como atualmente todos os devs fazem é subir um docker/docker-compose. Abaixo segue o exemplo que eu fiz:
**Sobre a integração dos containers**, vi muito sobre problemas de como conectar os containers, já que não se consegue usar o localhost, para passar por esse problema conectei os serviços pelo ip criado na rede do docker

```shell
docker network ls #exibe suas networks
docker network inspect bridge #exibe informações sobre o Gateway e os ips dos outros containers
```

Assim ficou o docker-compose

```yaml
version: '3.3'
services:

  prometheus:
    image: prom/prometheus:v2.7.2
    container_name: 'prometheus'
    network_mode: bridge
    ports:
      - '9090:9090'
    volumes:
      - ./metrics/adapter/src/main/resources/prometheus.yml:/etc/prometheus/prometheus.yml

  pushgateway:
    image: prom/pushgateway:v0.6.0
    container_name: 'pushgateway'
    network_mode: bridge
    ports:
      - '9091:9091'

  grafana:
    image: grafana/grafana:6.0.2
    container_name: 'grafana'
    network_mode: bridge
    ports:
      - '3000:3000'
    environment:
      - GF_AUTH_ANONYMOUS_ENABLED=true
      - GF_AUTH_ANONYMOUS_ORG_NAME=Main Org.
      - GF_AUTH_ANONYMOUS_ORG_ROLE=Admin
      - GF_PATHS_PROVISIONING=/home/ivan/workspace/grafana

  mongo:
    image: mongo
    container_name: mongo
    ports:
      - "27018:27017"
    volumes:
      - /home/ivan/workspace/volumes/mongo:/data/db
    network_mode: bridge

  postgres:
    image: postgres
    container_name: postgres
    network_mode: bridge
    volumes:
      - ./gateway/adapter/src/main/resources/spring-data.sql:/docker-entrypoint-initdb.d/db.sql
      - /home/ivan/workspace/volumes/postgresql:/private/var/lib/postgresql
    ports:
      - "5433:5432"
    environment:
      POSTGRES_USER: pguser
      POSTGRES_PASSWORD: pguser
      POSTGRES_DB: dadosabertos
```

## Dev

Como esta página ficou muito extensa, criarei uma parte para devs, sobre as métricas e implementação delas. Esta página acabou ficando mais com a parte de Ops.