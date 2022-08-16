package edu.curso.hibernate.ejemplohibernatespring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.hibernate.ejemplohibernatespring.bo.Cliente;
import edu.curso.hibernate.ejemplohibernatespring.service.ClienteService;

import java.util.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/{id}")
	public Cliente recuperarCliente(@PathVariable Long id) {
		return clienteService.buscarClientePorId(id);
	}
	
	@GetMapping
	public List<Cliente> recuperarClientes() {
		return clienteService.recuperarClientes();
	}
	
	@PostMapping
	public void altaCliente(@RequestBody Cliente cliente) {
		clienteService.guardarCliente(cliente);
	}

	@PutMapping("/{id}")
	public void actualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
		Cliente clienteRecuperado = clienteService.buscarClientePorId(id);
		clienteRecuperado.setNombre(cliente.getNombre());
		clienteRecuperado.setRazonSocial(clienteRecuperado.getRazonSocial());
		clienteService.guardarCliente(clienteRecuperado);
	}


	@DeleteMapping("/{id}")
	public void borrarCliente(@PathVariable Long id) {
		clienteService.borrarCliente(id);
	}
	
	
}
