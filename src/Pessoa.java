
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo
 */
public class Pessoa {
	
	private String nome;
	private LocalDate datanascimento;
	private Double altura;

	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa(String nome, LocalDate nascimento, Double altura) {
		this.nome = nome;
		this.datanascimento = nascimento;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(LocalDate datanascimento) {
		this.datanascimento = datanascimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Long idade() {
		return ChronoUnit.YEARS.between(datanascimento, LocalDate.now());
	}
	@Override
	public String toString() {
		return "Nome: "+nome+" idade: " +idade()+ " altura: "+altura;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
