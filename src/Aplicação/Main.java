package Aplicação;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import Dados.Equipamento;
import Dados.Funcionario;
import Dados.ListaEmprestimo;
import Dados.ListaFuncionario;
import Dados.ListaEquipamentos;
import Dados.Emprestimo;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter emprestimoDtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		int opcao;
		ListaFuncionario funcionarios = new ListaFuncionario();
		ListaEquipamentos equipamentos = new ListaEquipamentos();
		ListaEmprestimo addEmprestimo = new ListaEmprestimo();

		do {
			System.out.println("----MENU----");
			System.out.println("1.Cadastrar Funcionário");
			System.out.println("2.Cadastrar Equipamento");
			System.out.println("3.Cadastrar Empréstimo");
			System.out.println("4.Vizualizar Funcionario");
			System.out.println("5.Vizualizar Equipamento");
			System.out.println("6.Vizualizar Empréstimo");
			System.out.println("7.Devolução");
			System.out.println("8.Sair");
			System.out.println("Escolha uma opção: ");
			opcao = ler.nextInt();
			ler.nextLine();
			switch (opcao) {

			case 1:
				if (funcionarios == null) {
					int fcodigo = 1;
					System.out.println("Digite o nome do funcionário: ");
					String fnome = ler.nextLine();
					System.out.println("Digite qual a função do funcionário: ");
					String funcao = ler.nextLine();
					System.out.println("Data de admissão: ");
					String fdata = ler.nextLine();
					LocalDate dataAdmissao = LocalDate.parse(fdata, dtf);
					funcionarios.cadastrarFuncionario(fcodigo, fnome, funcao, dataAdmissao);
				} else {
					int fcodigo = funcionarios.quantidadeFuncionario() + 1;
					System.out.println("Digite o nome do funcionário: ");
					String fnome = ler.nextLine();
					System.out.println("Digite qual a função do funcionário: ");
					String funcao = ler.nextLine();
					System.out.println("Data de admissão: ");
					String fdata = ler.nextLine();
					LocalDate dataAdmissao = LocalDate.parse(fdata, dtf);
					funcionarios.cadastrarFuncionario(fcodigo, fnome, funcao, dataAdmissao);
				}
				System.out.println("--------------------------------------------");
				break;

			case 2:
				if (equipamentos == null) {
					int ecodigo = 1;
					System.out.println("Digite a descrição do equipamento: ");
					String descricao = ler.nextLine();
					System.out.println("Data da compra: ");
					String edata = ler.nextLine();
					LocalDate dataCompra = LocalDate.parse(edata, dtf);
					System.out.println("Digite o peso do equipamento: ");
					double peso = ler.nextDouble();
					System.out.println("Digite a largura do equipamento: ");
					double largura = ler.nextDouble();
					System.out.println("Digite o comprimento do equipamento: ");
					double comprimento = ler.nextDouble();
					ler.nextLine();
					System.out.println("Qual o estado do equipamento: ");
					String estado = ler.nextLine();
					equipamentos.cadastrarEquipamento(ecodigo, descricao, dataCompra, peso, largura, comprimento,estado);
				} else {
					int ecodigo = equipamentos.quantidadeEquipamento() + 1;
					System.out.println("Digite a descrição do equipamento: ");
					String descricao = ler.nextLine();
					System.out.println("Data da compra: ");
					String edata = ler.nextLine();
					LocalDate dataCompra = LocalDate.parse(edata, dtf);
					System.out.println("Digite o peso do equipamento: ");
					double peso = ler.nextDouble();
					System.out.println("Digite a largura do equipamento: ");
					double largura = ler.nextDouble();
					System.out.println("Digite o comprimento do equipamento: ");
					double comprimento = ler.nextDouble();
					ler.nextLine();
					System.out.println("Qual o estado do equipamento: ");
					String estado = ler.nextLine();
					equipamentos.cadastrarEquipamento(ecodigo, descricao, dataCompra, peso, largura, comprimento,estado);

				}
				System.out.println("--------------------------------------------");
				break;

			case 3:
				System.out.println("Informe o codigo do funcionario: ");
				int codigoFuncionario = ler.nextInt();
				ler.nextLine();
				System.out.println("Informe o codigo do equipamento: ");
				String codigoEquipamento = ler.nextLine();
				System.out.println("Informe a data de saida: ");
				String sdata = ler.nextLine();
				LocalDateTime dataDeSaida = LocalDateTime.parse(sdata, emprestimoDtf);
				System.out.println("Responsável pelo equipamento: ");
				String responsavel = ler.nextLine();
				System.out.println("Observação: ");
				String obs = ler.nextLine();
				addEmprestimo.adicionarEmprestimo(codigoFuncionario, codigoEquipamento, dataDeSaida, responsavel, obs);
				System.out.println("--------------------------------------------");
				break;

			case 4:
				funcionarios.mostrarFuncionarios();
				break;

			case 5:
				equipamentos.mostrarEquipamento();
				break;

			case 6:
				addEmprestimo.mostrarEmprestimos();
				addEmprestimo.mostrarNaoDevolvidos();
				break;

			case 7:
				System.out.println("Digite o codigo do equipamento: ");
				String idEquipamento = ler.nextLine();
				System.out.println("Digite a Data de retorno: ");
				String rdata = ler.nextLine();
				LocalDateTime dataDeRetorno = LocalDateTime.parse(rdata, emprestimoDtf);
				addEmprestimo.registrarDevolucao(idEquipamento, dataDeRetorno);

				System.out.println("--------------------------------------------");
				break;

			case 8:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção Inválida!");
				System.out.println("--------------------------------------------");
				break;
			}

		} while (opcao != 8);
		ler.close();
	}

}
