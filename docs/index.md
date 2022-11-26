---
layout: default
---

# Contexto

Este projeto foi criado para aprender extrair dados disponibilizados no TSE. Por hora,
foi extraído apenas os dados das eleições presidenciais do segundo turno de 2022.

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

Grafana é onde são criados os dashboards com as métricas exportadas pelo Prometheus, para isso, deve-se configurar o Grafana para receber as métricas do Prometheus

![Integração com o Prometheus](/assets/images/grafana-connection.png)

Uma boa dica é obter dashboards prontos do site do Prometheus e importá-los por seu id
- Vá no +
- Em Grafana.com Dashboard inclua o id
- No caso de aplicações com Spring + Actuator, já tem um dashboard bem completinho **id** __234__



> This is a blockquote following a header.
>
> When something is important enough, you do it even if the odds are not in your favor.

### Header 3

```js
// Javascript code with syntax highlighting.
var fun = function lang(l) {
  dateformat.i18n = require('./lang/' + l)
  return true;
}
```

```ruby
# Ruby code with syntax highlighting
GitHubPages::Dependencies.gems.each do |gem, version|
  s.add_dependency(gem, "= #{version}")
end
```

#### Header 4

*   This is an unordered list following a header.
*   This is an unordered list following a header.
*   This is an unordered list following a header.

##### Header 5

1.  This is an ordered list following a header.
2.  This is an ordered list following a header.
3.  This is an ordered list following a header.

###### Header 6

| head1        | head two          | three |
|:-------------|:------------------|:------|
| ok           | good swedish fish | nice  |
| out of stock | good and plenty   | nice  |
| ok           | good `oreos`      | hmm   |
| ok           | good `zoute` drop | yumm  |

### There's a horizontal rule below this.

* * *

### Here is an unordered list:

*   Item foo
*   Item bar
*   Item baz
*   Item zip

### And an ordered list:

1.  Item one
1.  Item two
1.  Item three
1.  Item four

### And a nested list:

- level 1 item
  - level 2 item
  - level 2 item
    - level 3 item
    - level 3 item
- level 1 item
  - level 2 item
  - level 2 item
  - level 2 item
- level 1 item
  - level 2 item
  - level 2 item
- level 1 item

### Small image

![Octocat](https://github.githubassets.com/images/icons/emoji/octocat.png)

### Large image

![Branching](https://guides.github.com/activities/hello-world/branching.png)


### Definition lists can be used with HTML syntax.

<dl>
<dt>Name</dt>
<dd>Godzilla</dd>
<dt>Born</dt>
<dd>1952</dd>
<dt>Birthplace</dt>
<dd>Japan</dd>
<dt>Color</dt>
<dd>Green</dd>
</dl>

```
Long, single-line code blocks should not wrap. They should horizontally scroll if they are too long. This line should be long enough to demonstrate this.
```

```
The final element.
```
