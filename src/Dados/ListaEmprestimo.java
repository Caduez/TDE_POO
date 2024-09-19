package Dados;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ListaEmprestimo {
	private ArrayList<Emprestimo> emprestimos;
	
	public ListaEmprestimo() {
		this.emprestimos = new ArrayList<>();
	}
	
	public void adicionarEmprestimo(int codigoFuncionario, String codigoEquipamento, LocalDateTime dataDeSaida, String responsavel, String obs) {
		Emprestimo novoEmprestimo = new Emprestimo(codigoFuncionario,codigoEquipamento,dataDeSaida,responsavel,obs);
		emprestimos.add(novoEmprestimo);
		System.out.println("Empréstimo realizado com sucesso");
	}
	
	public void registrarDevolucao(String codigoEquipamento, LocalDateTime dataDeRetorno) {
		for(Emprestimo obj:emprestimos) {
			if(obj.getCodigoEquipamento().equals(codigoEquipamento) && !obj.verificarDevolucao()) {
				obj.resgistrarDevolucao(dataDeRetorno);
				System.out.println("Devolução realizada com sucesso!");
				return;
			}
		}
		System.out.println("Empréstimo não encontrado ou já devolvido.");
	}
	
	public void mostrarEmprestimos() {
		for(Emprestimo obj:emprestimos) {
			System.out.println("Empréstimos realizados:");
			System.out.println(obj);
			System.out.println("--------------------------------------------");
		}
	}
	
	public void mostrarNaoDevolvidos() {
		for(Emprestimo obj:emprestimos) {
			if(!obj.verificarDevolucao()) {
				System.out.println("Empréstimos não devolvidos");
				System.out.println(obj);
				System.out.println("--------------------------------------------");
			}
		}
	}
}
