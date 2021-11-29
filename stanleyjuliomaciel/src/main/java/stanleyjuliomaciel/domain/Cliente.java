package stanleyjuliomaciel.domain;


import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.fasterxml.jackson.core.sym.Name;

@SuppressWarnings("serial")
@Entity
@Table(name = "FUNCIONARIOS")

public class Cliente extends AbstractEntity<Long> {
	
	@Column(nullable = false, unique = true)
	private String nome;
	
	@NumberFormat(style = Style.CURRENCY, pattern = "#,# 0,00")
	@Column(name = "Salário", nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal salario;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "data-entrada", nullable = false, columnDefinition = "DATE")
	private LocalDate dataEntrada;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "data-saida", columnDefinition = "DATE")
	private LocalDate dataSaida;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id_fk")
	private Endereco endereco;
	
	
	@ManyToOne
	@JoinColumn(name = "cargo_id_fk")
	private Profissao profissao;


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public BigDecimal getSalario() {
		return salario;
	}


	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}


	public LocalDate getDataEntrada() {
		return dataEntrada;
	}


	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public LocalDate getDataSaida() {
		return dataSaida;
	}


	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Profissao getCargo() {
		return profissao;
	}


	public void setCargo(Profissao profissao) {
		this.profissao = profissao;
	}
	
	
	
}