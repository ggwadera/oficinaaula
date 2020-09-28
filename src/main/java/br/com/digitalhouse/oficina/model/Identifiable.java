package br.com.digitalhouse.oficina.model;

public interface Identifiable<ID> {

	ID getId();
	
	void setId(ID id);
}
