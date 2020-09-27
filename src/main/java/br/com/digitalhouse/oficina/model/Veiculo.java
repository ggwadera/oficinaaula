package br.com.digitalhouse.oficina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "veiculos")
@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Veiculo {

	@Id
	@GeneratedValue
	@EqualsAndHashCode.Include
	private Long id;

	@Column(length = 7, nullable = false)
	private String placa;

	@Column(length = 30, nullable = false)
	private String cor;
	
	@Column(length = 30, nullable = false)
	private String modelo;
	
	@Column(length = 30, nullable = false)
	private String marca;

}
