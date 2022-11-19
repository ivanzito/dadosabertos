package br.com.tse.dadosabertos.gateway.adapter.mapper;

import br.com.tse.dadosabertos.gateway.adapter.entity.SumPresidentEntity;
import br.com.tse.dadosabertos.gateway.port.SumPresident;

public class MapPresident {

    public SumPresidentEntity map(SumPresident sumPresident) {
        return new SumPresidentEntity();
    }
}
