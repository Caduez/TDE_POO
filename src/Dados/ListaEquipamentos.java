package Dados;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListaEquipamentos {
	private ArrayList<Equipamento> equipamentos;
	
	public ListaEquipamentos() {
		equipamentos = new ArrayList<>();
	}
	
	public void cadastrarEquipamento(int ecodigo,String descricao, LocalDate dataCompra, double peso, double largura, double comprimento, String estado) {
		Equipamento equipamento = new Equipamento(ecodigo, descricao, dataCompra, peso, largura,comprimento, estado);
		equipamentos.add(equipamento);
		System.out.println("Equipamento cadastrado com sucesso!");
	}
	
	public void removerEquipamento(int codigo) {
		equipamentos.removeIf(equipamentos -> equipamentos.getCodigo() == codigo);
	}
	
	public Equipamento buscarEquipamento(int codigo) {
		for(Equipamento obj: equipamentos) {
			if(obj.getCodigo()== codigo) {
				return obj;
			}
		}
		return null;
	}
	
	public void mostrarEquipamento() {
		for(Equipamento obj:equipamentos) {
			System.out.println(obj);
			System.out.println("--------------------------------------------");
		}
	}
	
	public int quantidadeEquipamento() {
		return equipamentos.size();
	}
}
