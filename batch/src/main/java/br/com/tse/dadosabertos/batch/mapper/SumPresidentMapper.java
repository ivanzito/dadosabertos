package br.com.tse.dadosabertos.batch.mapper;

import br.com.tse.dadosabertos.gateway.port.SumPresident;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Service;

@Service
public class SumPresidentMapper<T> extends FlatItemMapperDefault<T> implements FieldSetMapper<T> {

    @Override
    public T mapFieldSet(FieldSet fieldSet) {
        SumPresident dto = new SumPresident();
        dto.setCodigoPleito(fieldSet.readInt(0));
        dto.setCodigoEleicao(fieldSet.readInt(1));
        dto.setCodigoCargo(fieldSet.readInt(2));
        dto.setSiglaUF(fieldSet.readString(3));
        dto.setDataTotalizacao(fieldSet.readString(4));
        dto.setQuantidadeSecoesTotal(fieldSet.readBigDecimal(5));
        dto.setQuantidadeAptosTotal(fieldSet.readBigDecimal(6));
        dto.setQuantidadeSecoesTotal(fieldSet.readBigDecimal(7));
        dto.setQuantidadeSecoesTotalAcumulado(fieldSet.readBigDecimal(8));
        dto.setPercentualSecoesTotalAcumulado(fieldSet.readBigDecimal(9));
        //dto.setQuantidadeAptosTotal(fieldSet.readBigDecimal(9));
        dto.setQuantidadeAptosTotalAcumulado(fieldSet.readBigDecimal(10));
        dto.setQuantidadeVotosTotal(fieldSet.readBigDecimal(11));
        dto.setQuantidadeVotosTotalAcumulado(fieldSet.readBigDecimal(12));
        dto.setQuantidadeDeVotosConcorrentes(fieldSet.readBigDecimal(13));
        dto.setQuantidadeDeVotosConcorrentesAcumulado(fieldSet.readBigDecimal(14));

        dto.setLulaQuantidadeTotalDeVotos(fieldSet.readBigDecimal(15));
        dto.setLulaQuantidadeVotosTotAcumulado(fieldSet.readBigDecimal(16));
        dto.setLulaPercentualVotosTotalAcumulado(fieldSet.readBigDecimal(17));

        dto.setJairBolsonaroQuantidadeVotosTotal(fieldSet.readBigDecimal(18));
        dto.setJairBolsonaroQuantidadeVotosTotalAcumulado(fieldSet.readBigDecimal(19));
        dto.setJairBolsonaroPercentualVotosTotalAcumulado(fieldSet.readBigDecimal(20));

        dto.setBrancoQuantidadeDeVotos(fieldSet.readBigDecimal(21));
        dto.setBrancoQuantidadeVotosTotalAcumulado(fieldSet.readBigDecimal(22));
        dto.setBrancPercentualVotosTotalAcumulado(fieldSet.readBigDecimal(23));

        dto.setNuloQuantidadeVotosTotal(fieldSet.readBigDecimal(24));
        dto.setNuloQuantidadeVotosTotalAcumulado(fieldSet.readBigDecimal(25));
        dto.setNuloPercentualVotosTotalAcumulado(fieldSet.readBigDecimal(26));


        return (T) dto;
    }

    @Override
    public void afterPropertiesSet() {
        super.setFieldSetMapper(this);
        this.setLineTokenizer(new DelimitedLineTokenizer(";"));
    }
}
