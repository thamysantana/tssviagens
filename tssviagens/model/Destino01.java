package br.com.tssviagens.model;

public class Destino01 {

	 private int id_Destino;
	    private String Nome_Destino;
	    private String  Aeroporto;
	    private int quant_Disponivel;
	    private double Valor_Destino;
		public int getId_Destino() {
			return id_Destino;
		}
		public void setId_Destino(int id_Destino) {
			this.id_Destino = id_Destino;
		}
		public String getNome_Destino() {
			return Nome_Destino;
		}
		public void setNome_Destino(String nome_Destino) {
			Nome_Destino = nome_Destino;
		}
		public String getAeroporto() {
			return Aeroporto;
		}
		public void setAeroporto(String aeroporto) {
			Aeroporto = aeroporto;
		}
		public int getQuant_Disponivel() {
			return quant_Disponivel;
		}
		public void setQuant_Disponivel(int quant_Disponivel) {
			this.quant_Disponivel = quant_Disponivel;
		}
		public double getValor_Destino() {
			return Valor_Destino;
		}
		public void setValor_Destino(double valor_Destino) {
			Valor_Destino = valor_Destino;
		}
	
}
