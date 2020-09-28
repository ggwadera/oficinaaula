package br.com.digitalhouse.oficina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.digitalhouse.oficina.model.Veiculo;
import br.com.digitalhouse.oficina.repository.VeiculoRepository;

@Service
public class VeiculoService extends AbstractService<Veiculo, Long> {

	@Autowired
	public VeiculoService(VeiculoRepository veiculoRepository) {
		super(veiculoRepository);
	}

}
