package Dados;

import java.time.LocalDate;

public class Funcionario {
	private int fcodigo;
	private String nome;
	private String funcao;
	private LocalDate dataAdmissao;
	
	public Funcionario(int codigo, String nome, String funcao, LocalDate dataAdmissao) {
		this.fcodigo = codigo;
		this.nome = nome;
		this.funcao = funcao;
		this.dataAdmissao = dataAdmissao;
	}

	public int getCodigo() {
		return fcodigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	@Override
	public String toString() {
		return "Funcionário: Código= " + fcodigo + 
				", Nome= " + nome + 
				", Função= " + funcao + 
				", Data de admissao= " + dataAdmissao;
	}
}
