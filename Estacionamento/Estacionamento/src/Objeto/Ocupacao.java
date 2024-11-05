package Objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Objeto.Veiculo;

public class Ocupacao {
	private String carro;
	private Integer vaga;
	public static List<Ocupacao> entradas = new ArrayList<Ocupacao>();
	public static Scanner scan = new Scanner(System.in);
	
	public Ocupacao(String carro, Integer vaga) {
		super();
		this.carro = carro;
		this.vaga = vaga;
	}

	public static void entrada(){
		String carro = Veiculo.criarVeiculo();
		Integer corr = 0;
		Integer vaga = 0;
		while(corr != 1)
		{
			System.out.println("Informe vaga desejada");
			vaga = scan.nextInt();
			Integer tamanho = Veiculo.pegarPlaca(carro);
			corr = Vaga.verifica(vaga, tamanho);
		}
		entradas.add(new Ocupacao(carro, vaga));
		Vaga.ocupar(vaga);
	}
	
	public static void saida() {
		System.out.println("informe numero da vaga");
		Integer vaga = scan.nextInt();
		for(Ocupacao entradas:entradas) {
			if(entradas.vaga == vaga) {
				Veiculo.passarHoras(entradas.carro);
			}
		}
	}
	
	public static void saidaValor(Integer hEnt, Integer hSaida) {
		Integer cont = 0;
		while(hEnt != hSaida) {
		cont ++;
			if(hEnt == 24) {
				hEnt = 0;
			}
			hEnt ++;
		}
		pagar(cont);
	}
	
	public static void pegarHoras(Integer hEnt, Integer hSaida) {
		Integer cont = 0;
		while(hEnt != hSaida) {
		cont ++;
			if(hEnt == 24) {
				hEnt = 0;
			}
			hEnt ++;
		}
		pegarValor(cont);
	}
	
	public static void pegarValor(Integer horas) {
		if(horas <= 1) {
			System.out.println("valor a pagar igual " + horas*5);
		} else if(horas > 1 && horas <= 3) {
			System.out.println("valor a pagar igual " + horas*10);
		} else {
			System.out.println("valor a pagar igual " + horas*15);
		}
	}
	
	public static void pagar(Integer horas) {
		if(horas <= 1) {
			System.out.println("valor a pagar igual " + horas*5);
		} else if(horas > 1 && horas <= 3) {
			System.out.println("valor a pagar igual " + horas*10);
		} else {
			System.out.println("valor a pagar igual " + horas*15);
		}
		Vaga.desocupar();
	}
}
