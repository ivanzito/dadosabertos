package br.com.tse.dadosabertos.batch.reader;

import br.com.tse.dadosabertos.batch.mapper.FlatItemMapperDefault;

import br.com.tse.dadosabertos.gateway.port.SumPresident;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

@Service
public class SumPresidentFlatItemReader<T> extends FlatFileItemReader<SumPresident> {

    private final FlatItemMapperDefault<SumPresident> lineMapper;

    public SumPresidentFlatItemReader(FlatItemMapperDefault<SumPresident> lineMapper) {
        this.lineMapper = lineMapper;
        super.setLineMapper(lineMapper);
        super.setResource(new ClassPathResource("Historico_Totalizacao_Presidente_BR_2T_2022.csv"));
    }

    public SumPresident reader() throws Exception {
        FlatFileItemReader<SumPresident> itemReader = new FlatFileItemReader<>();
        super.setLineMapper(lineMapper);
        itemReader.setLineMapper(lineMapper);
        itemReader.open(new ExecutionContext());
        return itemReader.read();
    }
}
