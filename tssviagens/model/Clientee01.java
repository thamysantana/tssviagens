package br.com.tssviagens.model;

import java.util.Date;

public class Clientee01 {

	//atributos
	private int id_cpf;
	private String nome;
	private String email;
	private String telefone;
	private Date dtNasc;
	public int getId_cpf() {
		return id_cpf;
	}
	public void setId_cpf(int id_cpf) {
		this.id_cpf = id_cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}
}