package br.com.locadora.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Carro")
public class CarBean {

	//MARK:- Properties
	@Id
	private int id;
	
	private String fabricante;
	
	private String modelo;
	
	private float preco;
	
	private String cambio;
	
	private String urlImage;
		
	@Column(name="disponibilidade")
	private boolean disponivel;
	
	//MARK:- Methods
	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public float getPreco() {
		return preco;
	}

	public String getCambio() {
		return cambio;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	
	
}
