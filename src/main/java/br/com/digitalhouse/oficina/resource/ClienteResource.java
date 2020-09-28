package br.com.digitalhouse.oficina.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.oficina.model.Cliente;
import br.com.digitalhouse.oficina.service.ClienteService;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteResource extends AbstractResource<Cliente, Long> {

	@Autowired
	public ClienteResource(ClienteService clienteService) {
		super(clienteService);
	}

}
