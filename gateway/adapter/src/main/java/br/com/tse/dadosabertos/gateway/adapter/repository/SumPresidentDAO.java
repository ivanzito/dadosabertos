package br.com.tse.dadosabertos.gateway.adapter.repository;

import br.com.tse.dadosabertos.gateway.adapter.entity.SumPresidentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SumPresidentDAO extends MongoRepository<SumPresidentEntity, Long> {
}
