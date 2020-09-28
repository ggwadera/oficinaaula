package br.com.digitalhouse.oficina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.digitalhouse.oficina.model.Ordem;

@Repository
public interface OrdemRepository extends JpaRepository<Ordem, Long> {

}
