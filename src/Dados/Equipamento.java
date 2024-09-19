package Dados;

import java.time.LocalDate;

public class Equipamento {
	private int ecodigo;
	private String descricao;
	private LocalDate dataCompra;
	private double peso;
	private double largura;
	private double comprimento;
	private String estado;
	
	
	public Equipamento(int codigo, String descricao, LocalDate dataCompra, double peso, double largura, double comprimento,String estado) {
		this.ecodigo = codigo;
		this.descricao = descricao;
		this.dataCompra = dataCompra;
		this.peso = peso;
		this.largura = largura;
		this.comprimento = comprimento;
		this.estado = estado;
	}


	public int getCodigo() {
		return ecodigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Equipamento: Código= " + ecodigo + 
				", Descrição= " + descricao + 
				", Data da compra= " + dataCompra + 
				", Peso= " + peso + 
				", Largura= " + largura + 
				", Comprimento= " + comprimento +
				", Estado= " + estado;
	}
}
