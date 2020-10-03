package br.com.digitalhouse.oficina.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "veiculos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Veiculo implements Identifiable<Long>, Serializable {

	private static final long serialVersionUID = 1L;
	
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
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	private LocalDateTime updatedAt;

}
