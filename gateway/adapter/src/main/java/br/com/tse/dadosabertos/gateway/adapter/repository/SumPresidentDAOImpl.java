package br.com.tse.dadosabertos.gateway.adapter.repository;

import br.com.tse.dadosabertos.gateway.adapter.entity.SumPresidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SumPresidentDAOImpl extends JpaRepository<SumPresidentEntity, Long> {
}
