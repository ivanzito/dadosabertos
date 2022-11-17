package br.com.tse.dadosabertos.batch.dadosabertos.reader;

import br.com.tse.dadosabertos.batch.dadosabertos.mapper.FlatItemMapperDefault;
import br.com.tse.dadosabertos.batch.dadosabertos.model.SomatoriaPresitente;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.core.io.ClassPathResource;


public class SomatoriaPresidenteFlatItemReader<T> extends FlatFileItemReader<SomatoriaPresitente> {

    private final FlatItemMapperDefault<SomatoriaPresitente> lineMapper;

    public SomatoriaPresidenteFlatItemReader(FlatItemMapperDefault<SomatoriaPresitente> lineMapper) {
        this.lineMapper = lineMapper;
        super.setLineMapper(lineMapper);
        super.setResource(new ClassPathResource("Historico_Totalizacao_Presidente_BR_2T_2022.csv"));
    }

    public SomatoriaPresitente reader() throws Exception {
        FlatFileItemReader<SomatoriaPresitente> itemReader = new FlatFileItemReader<>();
        super.setLineMapper(lineMapper);
        itemReader.setLineMapper(lineMapper);
        itemReader.open(new ExecutionContext());
        return itemReader.read();
    }
}
