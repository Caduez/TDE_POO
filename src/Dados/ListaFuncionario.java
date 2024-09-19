package Dados;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListaFuncionario {
	private ArrayList<Funcionario> funcionarios;
	
	public ListaFuncionario() {
		funcionarios = new ArrayList<>();
	}
	
	public void cadastrarFuncionario(int fcodigo, String fnome, String funcao, LocalDate dataAdmissao) {
		Funcionario funcionario = new Funcionario(fcodigo, fnome, funcao, dataAdmissao);
		funcionarios.add(funcionario);
		System.out.println("Funcionario cadastrado com sucesso!");
	}
	
	public void removerFuncionario(int codigo) {
		funcionarios.removeIf(funcionarios -> funcionarios.getCodigo() == codigo);
	}
	
	public Funcionario buscarFuncionario(int codigo) {
		for(Funcionario obj: funcionarios) {
			if( obj.getCodigo() == codigo) {
				return obj;
			}
		}
		return null;
	}
	
	public void mostrarFuncionarios() {
		for(Funcionario obj : funcionarios) {
			System.out.println(obj);
			System.out.println("--------------------------------------------");
		}
	}
	
	public int quantidadeFuncionario() {
		return funcionarios.size();
	}
}
