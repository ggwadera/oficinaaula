package br.com.digitalhouse.oficina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.digitalhouse.oficina.model.Cliente;
import br.com.digitalhouse.oficina.repository.ClienteRepository;

@Service
public class ClienteService extends AbstractService<Cliente, Long> {

	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		super(clienteRepository);
	}

}
