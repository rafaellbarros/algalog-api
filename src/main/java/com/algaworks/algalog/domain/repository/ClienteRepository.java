package com.algaworks.algalog.domain.repository;

import com.algaworks.algalog.domain.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 18/05/2022
 */

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome);
    List<Cliente> findByNomeContaining(String nome);
}
