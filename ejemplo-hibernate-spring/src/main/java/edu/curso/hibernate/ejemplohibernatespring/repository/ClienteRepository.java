package edu.curso.hibernate.ejemplohibernatespring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.curso.hibernate.ejemplohibernatespring.bo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
