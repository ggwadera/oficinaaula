package br.com.digitalhouse.oficina.resource;

import java.net.URI;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.digitalhouse.oficina.model.Identifiable;
import br.com.digitalhouse.oficina.service.AbstractService;

public abstract class AbstractResource<T extends Identifiable<ID>, ID> {

	private AbstractService<T, ID> service;

	public AbstractResource(AbstractService<T, ID> service) {
		this.service = service;
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> create(@RequestBody T object) {
		object = this.service.create(object);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(object.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> update(@PathVariable ID id, @RequestBody T object) {
		this.service.update(id, object);
		return ResponseEntity.noContent().build();
	}

	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<T> findById(@PathVariable ID id) {
		T object = this.service.findById(id);
		return ResponseEntity.ok(object);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<T>> findAll() {
		List<T> objects = this.service.findAll();
		return ResponseEntity.ok(objects);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable ID id) {
		this.service.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
