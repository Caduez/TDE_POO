package Dados;

import java.time.LocalDateTime;

public class Emprestimo {
	private int codigoFuncionario;
	private String codigoEquipamento;
	private LocalDateTime dataDeSaida;
	private LocalDateTime dataDeRetorno;
	private String responsavel;
	private String obs;
	
	public Emprestimo(int codigoFuncionario, String codigoEquipamento,LocalDateTime dataDeSaida, String responsavel, String obs) {
		this.codigoFuncionario = codigoFuncionario;
		this.codigoEquipamento = codigoEquipamento;
		this.dataDeSaida = dataDeSaida;
		this.dataDeRetorno = null;
		this.responsavel = responsavel;
		this.obs = obs;
	}
	
	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}
	
	public String getCodigoEquipamento() {
		return codigoEquipamento;
	}
	
	public LocalDateTime getDataDeSaida() {
		return dataDeSaida;
	}

	public LocalDateTime getDataDeRetorno() {
		return dataDeRetorno;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
	public void resgistrarDevolucao(LocalDateTime dataDeRetorno) {
		this.dataDeRetorno = dataDeRetorno;
	}
	
	public boolean verificarDevolucao() {
		return this.dataDeRetorno != null;
	}
	
	@Override
	public String toString() {
		return "Empréstimo: Código Funcionário= " + codigoFuncionario +
				", Código Equipamento= " + codigoEquipamento +
				", Data de saída= " + dataDeSaida +
				", Responsável= " + responsavel + 
				", Observação= " + obs;
	}
}
