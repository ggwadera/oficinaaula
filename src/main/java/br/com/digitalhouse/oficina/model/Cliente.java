package br.com.digitalhouse.oficina.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente implements Identifiable<Long> {

	@Id
	@GeneratedValue
	@EqualsAndHashCode.Include
	private Long id;

	@Column(length = 60, nullable = false)
	private String nome;

	@OneToMany
	@JoinColumn(name = "cliente_id")
	private Set<Veiculo> veiculos = new HashSet<Veiculo>();

}
