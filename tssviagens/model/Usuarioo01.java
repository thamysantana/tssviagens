package br.com.tssviagens.model;

import java.util.Date;
public class Usuarioo01 {


		private int id_Usuario;
		private String nome;
		private String telefone;
		private String email;
		private String senha;
		private Date dataCad;
		public int getId_Usuario() {
			return id_Usuario;
		}
		public void setId_Usuario(int id_Usuario) {
			this.id_Usuario = id_Usuario;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public Date getDataCad() {
			return dataCad;
		}
		public void setDataCad(Date dataCad) {
			this.dataCad = dataCad;
		}
		
	
}
