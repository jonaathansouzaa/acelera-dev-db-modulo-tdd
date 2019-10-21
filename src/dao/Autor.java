package dao;

import java.time.LocalDate;

public class Autor {

	private String cpf;
	private String nome;
	private LocalDate dataNascimento;

	public Autor(String cpf) {
		this.cpf = cpf;
	}
	
	public Autor(String cpf, LocalDate dataNascimento) {
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public Autor(String cpf, String nome, LocalDate dataNascimento) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public Autor() {
		// TODO Auto-generated constructor stub
	}

	public String getCpf() {
		return cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	
}
