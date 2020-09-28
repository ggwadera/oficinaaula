package br.com.digitalhouse.oficina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.digitalhouse.oficina.model.Ordem;
import br.com.digitalhouse.oficina.repository.OrdemRepository;

@Service
public class OrdemService extends AbstractService<Ordem, Long> {
	
	@Autowired
	public OrdemService(OrdemRepository ordemRepository) {
		super(ordemRepository);
	}

}
