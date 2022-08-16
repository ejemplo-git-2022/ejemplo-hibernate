package edu.curso.hibernate.ejemplohibernatespring.service;

import java.util.List;

import edu.curso.hibernate.ejemplohibernatespring.bo.Cliente;

public interface ClienteService {

	Long guardarCliente(Cliente cliente);

	List<Cliente> recuperarClientes();

	Cliente buscarClientePorId(Long id);

	void borrarCliente(Long id);

}