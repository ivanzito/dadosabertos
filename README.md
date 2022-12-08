# Dados Abertos do TSE
Faz a extração dos CSVs disponibilizados no site do TSE

## Contexto
Este projeto foi criado para aprender extrair dados disponibilizados no TSE. Por hora, foi extraído apenas os dados das eleições presidenciais do segundo turno de 2022. Neste case a importação dos dados, são efetuados assim que a aplicação faz o startup. Não é um cenário comum, mas, por hora, não há a necessidade de criar um cronjob para ser executado.

## Motivação
Usar os dados coletados para gerar métricas em processos a fim de estudos. Para tanto

- Foi utilizado o Spring Batch para extrair os dados de um arquivo com a extensão csv e persisti-los de 10 em 10 registros para não onerar a memória.
- Usado o actuator do Spring para disponibilizar os dados ao Prometheus
- Feito a integração junto ao Grafana, para gerar os dashboards das métricas coletadas

## Quer saber mais
Veja o artigo que foi criado no [Medium](https://medium.com/@ivanzito.jr/monitoring-metrics-from-your-application-based-on-spring-772777263d2f)