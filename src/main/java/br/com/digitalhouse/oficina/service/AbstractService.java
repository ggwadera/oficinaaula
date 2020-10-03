package br.com.digitalhouse.oficina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.digitalhouse.oficina.model.Identifiable;

public class AbstractService<T extends Identifiable<ID>, ID> {

	private final JpaRepository<T, ID> repository;

	public AbstractService(JpaRepository<T, ID> repository) {
		this.repository = repository;
	}

	public T create(T object) {
		return this.repository.save(object);
	}

	public T update(ID id, T object) {
		T old = this.findById(id);
		object.setId(old.getId());
		return this.repository.save(object);
	}

	public T findById(ID id) {
		Optional.ofNullable(id).orElseThrow(() -> new RuntimeException("O id não pode ser nulo"));
		return this.repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Não foi possivel encontrar um objeto com id " + id));
	}

	public List<T> findAll() {
		return this.repository.findAll();
	}

	public void deleteById(ID id) {
		this.findById(id);
		this.repository.deleteById(id);
	}

}
