package br.ufc.quixada.javali.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "matricula" }) )

public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Campo obrigatório")
	private String matricula;
	
	@ManyToOne
	private Pessoa pessoa;
	
}
