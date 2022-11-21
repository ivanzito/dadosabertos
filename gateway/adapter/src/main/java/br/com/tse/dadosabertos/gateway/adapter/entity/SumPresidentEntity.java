package br.com.tse.dadosabertos.gateway.adapter.entity;

import br.com.tse.dadosabertos.gateway.port.SumPresident;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sumPresident")
public class SumPresidentEntity {

    private final SumPresident sumPresident;

    public SumPresidentEntity(SumPresident sumPresident) {
        this.sumPresident = sumPresident;
    }

    public SumPresident getSumPresident() {
        return sumPresident;
    }
}
