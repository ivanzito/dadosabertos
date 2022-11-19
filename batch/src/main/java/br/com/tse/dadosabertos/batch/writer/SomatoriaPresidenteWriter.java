package br.com.tse.dadosabertos.batch.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.support.transaction.TransactionAwareProxyFactory;

import java.util.List;


public class SomatoriaPresidenteWriter<T> implements ItemWriter<T> {

    private final List<T> output = TransactionAwareProxyFactory.createTransactionalList();

    @Override
    public void write(List<? extends T> items) throws Exception {
        output.addAll(items);
    }

    public List<T> getOutput() {
        return output;
    }
}
