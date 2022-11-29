package br.com.tse.dadosabertos.metrics.port;

import java.util.List;

public interface Metricable {

    void count();

    void registryVotes(List<Gauge> resultSet);

}