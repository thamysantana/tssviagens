package br.com.tssviagens.model;

import java.util.Date;

public class Passagem01 {


	  private int id_pass;
	  private Date dataEmbarque;
	  private Date dataRetorno;
	  private double preco_pass;
	  public int getId_pass() {
		return id_pass;
	}
	public void setId_pass(int id_pass) {
		this.id_pass = id_pass;
	}
	public Date getDataEmbarque() {
		return dataEmbarque;
	}
	public void setDataEmbarque(Date dataEmbarque) {
		this.dataEmbarque = dataEmbarque;
	}
	public Date getDataRetorno() {
		return dataRetorno;
	}
	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}
	public double getPreco_pass() {
		return preco_pass;
	}
	public void setPreco_pass(double preco_pass) {
		this.preco_pass = preco_pass;
	}
	  
}
