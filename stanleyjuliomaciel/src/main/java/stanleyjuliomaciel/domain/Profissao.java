package stanleyjuliomaciel.domain;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "CARGOS")
public class Profissao extends AbstractEntity<Long> {
	
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private Empresa empresa;
	
	
	@OneToMany(mappedBy = "cargo")
	private List<Cliente> clientes;

	public List<Cliente> getFuncionarios() {
		return clientes;
	}

	public void setFuncionarios(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Empresa getDepartamento() {
		return empresa;
	}

	public void setDepartamento(Empresa empresa) {
		this.empresa = empresa;
	}
}