package br.com.Locadora.model.bean;

public class CarBean {
	
	private String nome;
	private String fabricante;
	private Double valor;
	
	public CarBean(String nome, String fabricante, Double valor) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.valor = valor;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getFabricante() {
		return fabricante;
	}
}
