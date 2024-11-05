package Objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vaga {
	private Integer vaga;
	private Integer tamanho;
	private Boolean disponivel;
	public static List<Vaga> vagas = new ArrayList<Vaga>();
	private static Scanner scan = new Scanner(System.in);
	
	public Vaga(Integer vaga, Integer tamanho) {
		super();
		this.vaga = vaga;
		this.tamanho = tamanho;
		this.disponivel = true;
	}

	public Integer getVaga() {
		return vaga;
	}

	public void setVaga(Integer vaga) {
		this.vaga = vaga;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}


	public static void criarVaga() {
		System.out.println("digite o numero da vaga");
		Integer cod = scan.nextInt();
		System.out.println("digite o tamanho da vaga \n"
				+ " 1 - pequeno \n"
				+ " 2 - medio \n"
				+ " 3 - grande");
		Integer tamanho = scan.nextInt();
		vagas.add(new Vaga(cod, tamanho));
		
	}
	
	public static void visualizarVagas() {
		Integer cont = 0;
		for(Vaga vagas: vagas) {
			cont = cont + 1;
		}
		System.out.println("numero de vagas " + cont);
		for(Vaga vagas: vagas) {
			System.out.println(vagas);
		}
	}

	public static Integer verifica(Integer vaga, Integer tamanho) {
		Integer aux = 0;
		for(Vaga vagas: vagas) {
			if(vagas.vaga == vaga) 
			{
				
				if(vagas.tamanho == tamanho) 
				{
					aux = 1;
				} 	
			}
		}
		return aux;
		
	}
	 
	public static void ocupar(Integer vaga) {
		for(Vaga vagas: vagas) {
			vagas.disponivel = false;
		}
	}
	
	public static void desocupar() {
		for(Vaga vagas: vagas) {
			vagas.disponivel = true;
		}
		
	}
	
	@Override
	public String toString() {
		return "Vaga [vaga=" + vaga + ", tamanho=" + tamanho + ", disponivel=" + disponivel + "]";
	}

	

	

	
	
	
}
