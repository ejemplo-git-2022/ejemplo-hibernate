package edu.curso.hibernate.ejemplohibernatespring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.curso.hibernate.ejemplohibernatespring.bo.Cliente;
import edu.curso.hibernate.ejemplohibernatespring.repository.ClienteRepository;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Long guardarCliente(Cliente cliente) {
		clienteRepository.save(cliente);
		return cliente.getId();
	}
	
	@Override
	public List<Cliente> recuperarClientes() {
		return clienteRepository.findAll();
	}
	
	@Override
	public Cliente buscarClientePorId(Long id) {
		return clienteRepository.findById(id).get();
	}
	
	@Override
	public void borrarCliente(Long id) {
		clienteRepository.deleteById(id);
	}
	
}
