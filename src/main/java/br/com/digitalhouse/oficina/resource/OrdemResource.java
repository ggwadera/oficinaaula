package br.com.digitalhouse.oficina.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.oficina.model.Ordem;
import br.com.digitalhouse.oficina.service.OrdemService;

@RestController
@RequestMapping(path = "/ordens")
public class OrdemResource extends AbstractResource<Ordem, Long> {
	
	@Autowired
	public OrdemResource(OrdemService ordemService) {
		super(ordemService);
	}

}
