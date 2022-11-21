package br.com.tse.dadosabertos.gateway.adapter;

import br.com.tse.dadosabertos.gateway.adapter.entity.SumPresidentEntity;
import br.com.tse.dadosabertos.gateway.adapter.repository.SumPresidentDAO;
import br.com.tse.dadosabertos.gateway.port.SumPresident;
import br.com.tse.dadosabertos.gateway.port.SumPresidentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
class SumPresidentRepositoryImpl implements SumPresidentRepository {

    @Autowired
    private SumPresidentDAO sumPresidentDAO;

    @Override
    public void persist(final SumPresident sumPresident) {
        sumPresidentDAO.save(new SumPresidentEntity(sumPresident));
    }
}
