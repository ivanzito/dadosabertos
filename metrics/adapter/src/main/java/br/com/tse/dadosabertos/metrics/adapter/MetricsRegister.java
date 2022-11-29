package br.com.tse.dadosabertos.metrics.adapter;

import br.com.tse.dadosabertos.metrics.port.Gauge;
import br.com.tse.dadosabertos.metrics.port.Metricable;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.MultiGauge;
import io.micrometer.core.instrument.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

import static java.util.stream.Collectors.toList;


@Service
public class MetricsRegister implements Metricable {

    private static final String COUNTER_NAME = "dadosabertos_counter";
    private static final String DADOS_ABERTOS_VOTES = "dadosabertos_gauge";

    @Autowired
    private MeterRegistry meterRegistry;
    private MultiGauge multiGauge;

    @PostConstruct
    public void postConstruct() {
        multiGauge = MultiGauge.builder(DADOS_ABERTOS_VOTES)
                .tag("candidate", "votes")
                .description("The number of votes by type")
                .register(meterRegistry);
    }

    @Override
    public void count() {
        meterRegistry.counter(COUNTER_NAME).increment();
    }

    @Override
    public void registryVotes(List<Gauge> resultSet) {


        multiGauge.register(resultSet.stream()
                        .map(gauge -> MultiGauge.Row.of(
                                Tags.of("candidate", gauge.getVoteType().name()),
                                gauge.getQuantity()))
                        .collect(toList())
                );
    }
}
