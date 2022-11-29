package br.com.tse.dadosabertos.batch.writer;

import br.com.tse.dadosabertos.gateway.port.SumPresident;
import br.com.tse.dadosabertos.gateway.port.SumPresidentRepository;
import br.com.tse.dadosabertos.metrics.port.Gauge;
import br.com.tse.dadosabertos.metrics.port.Metricable;
import br.com.tse.dadosabertos.metrics.port.VoteType;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.support.transaction.TransactionAwareProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
public class SumPresidentWriter implements ItemWriter<SumPresident> {

    @Autowired
    private Metricable metricable;
    @Autowired
    private SumPresidentRepository repository;

    @Override
    public void write(final List<? extends SumPresident> items) {
        items.forEach(repository::persist);
        items.forEach(item -> metricable.count());
        this.metricable.registryVotes(getGauge(items));
    }

    private List<Gauge> getGauge(final List<? extends SumPresident> items) {
        final List<Gauge> gaugesList = new ArrayList<>();
        for (SumPresident president :items) {
            gaugesList.add(new Gauge(VoteType.BOLSONARO, president.getJairBolsonaroQuantidadeVotosTotal()));
            gaugesList.add(new Gauge(VoteType.LULA, president.getLulaQuantidadeTotalDeVotos()));
            gaugesList.add(new Gauge(VoteType.BLANK, president.getBrancoQuantidadeDeVotos()));
            gaugesList.add(new Gauge(VoteType.NULL, president.getNuloQuantidadeVotosTotal()));
        }
        return gaugesList;
    }
}
