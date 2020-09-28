package br.com.digitalhouse.oficina.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ordens")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ordem implements Identifiable<Long> {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;
	
	private String descricao;
	
	private BigDecimal valor;

}
