package br.com.tse.dadosabertos.gateway.adapter;

import br.com.tse.dadosabertos.gateway.adapter.entity.SumPresidentEntity;
import br.com.tse.dadosabertos.gateway.adapter.mapper.MapPresident;
import br.com.tse.dadosabertos.gateway.adapter.repository.SumPresidentDAOImpl;
import br.com.tse.dadosabertos.gateway.port.SumPresident;
import br.com.tse.dadosabertos.gateway.port.SumPresidentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SumPresidentRepositoryImpl implements SumPresidentRepository {

    @Autowired
    private SumPresidentDAOImpl dao;

    private final MapPresident mapPresident = new MapPresident();

    @Override
    public void persist(SumPresident sumPresident) {
        SumPresidentEntity entity = mapPresident.map(sumPresident);
        dao.save(entity);
    }
}
