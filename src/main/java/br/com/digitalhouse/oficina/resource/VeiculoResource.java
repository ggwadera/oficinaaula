package br.com.digitalhouse.oficina.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.oficina.model.Veiculo;
import br.com.digitalhouse.oficina.service.VeiculoService;

@RestController
@RequestMapping(path = "/veiculos")
public class VeiculoResource extends AbstractResource<Veiculo, Long> {

	@Autowired
	public VeiculoResource(VeiculoService veiculoService) {
		super(veiculoService);
	}

}
