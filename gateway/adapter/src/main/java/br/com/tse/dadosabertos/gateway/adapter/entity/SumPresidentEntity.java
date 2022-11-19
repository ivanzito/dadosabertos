package br.com.tse.dadosabertos.gateway.adapter.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
public class SumPresidentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Repository
    public static interface SumPresidentRepositoryImpl extends JpaRepository<SumPresidentEntity, Long> {
    }
}
