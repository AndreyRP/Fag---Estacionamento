package ClassePrincipal;

import java.util.Scanner;

import Objeto.Ocupacao;
import Objeto.Vaga;
import Objeto.Veiculo;

public class Main {

	public static void main(String[] args) {
		Menu();
	}

	public static void Menu() {
		Integer resp = 0;
		while(resp != 6) {
			Scanner scan = new Scanner(System.in);
			System.out.println("digeite \n"
					+ "1 - Cadastrar nova vaga \n"
					+ "2 - registrar uso de vaga \n"
					+ "3 - ver vagas \n"
					+ "4 - registrar saida \n"
					+ "5 - visualizar veiculos \n"
					+ "6 - sair");
			resp = scan.nextInt();
			if(resp == 1){
				Vaga.criarVaga();
			} else if(resp == 2) {
				Ocupacao.entrada();
			} else if(resp == 3) {
				Vaga.visualizarVagas();
			} else if(resp == 4) {
				Ocupacao.saida();
			} else if(resp == 5) {
				Veiculo.visualizarVeiculos();
			}else {
				resp = 6;
			}
		}
	}
}
