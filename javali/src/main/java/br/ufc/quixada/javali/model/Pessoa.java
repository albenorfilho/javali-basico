package br.ufc.quixada.javali.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
// @EntityListeners(PessoaEntityListener.class)
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "id", "cpf" }) )
public class Pessoa {

	public Pessoa() {
		super();
	}

	public Pessoa(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Transient
	private String email;

	@Transient
	private String nome;
	private String cpf;
}
