package br.com.tse.dadosabertos.batch.writer;

import br.com.tse.dadosabertos.gateway.port.SumPresident;
import br.com.tse.dadosabertos.gateway.port.SumPresidentRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.support.transaction.TransactionAwareProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SumPresidentWriter implements ItemWriter<SumPresident> {

    @Autowired
    private SumPresidentRepository repository;

    @Override
    public void write(List<? extends SumPresident> items) {
        items.forEach(repository::persist);
    }
}
