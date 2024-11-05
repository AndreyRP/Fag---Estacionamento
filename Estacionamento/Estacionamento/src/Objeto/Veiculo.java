package Objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculo {
	private String placa;
	private  Integer hSaida;
	private  Integer hEntrada;
	private String modelo;
	private Integer tamanho;
	public static List<Veiculo> carros = new ArrayList<Veiculo>();
	public static Scanner scan = new Scanner(System.in);
	
	public Veiculo(String placa, String modelo, Integer tamanho, Integer hEntrada, Integer hSaida) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.hEntrada = hEntrada;
		this.hSaida = hSaida;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer gethSaida() {
		return hSaida;
	}

	public void sethSaida(Integer hSaida) {
		this.hSaida = hSaida;
	}

	public Integer gethEntrafa() {
		return hEntrada;
	}

	public void sethEntrafa(Integer hEntrafa) {
		this.hEntrada = hEntrafa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	
	public static String criarVeiculo() {
		System.out.println("digite a placa do carro");
		String placa = scan.next();
		System.out.println("digite o modelo do carro");
		String modelo = scan.next();
		System.out.println("digite o tamanho do carro \n"
				+ " 1 - pequeno \n"
				+ " 2 - medio \n"
				+ " 3 - grande");
		Integer tamanho = scan.nextInt();
		System.out.println("digite horario de entrada");
		Integer hEnt = scan.nextInt();
		System.out.println("digite horario de saida");
		Integer hSaida = scan.nextInt();
		carros.add(new Veiculo(placa, modelo, tamanho, hEnt, hSaida));
		
		return placa;
	}
	
	public static void visualizarVeiculos() {
		for(Veiculo carros: carros) {
			System.out.println(carros);
			if(carros.hEntrada != 0 && carros.hSaida != 0) {
			Ocupacao.pegarHoras(carros.hEntrada, carros.hSaida);
		}}
	}
	
	public static Integer pegarPlaca(String placa) {
		Integer tam = 0;
		for(Veiculo carros: carros) {
			if (carros.placa == placa ) {
				 tam = carros.tamanho;
			}
		}
		return tam;
	}
	
		public static Integer pegarEntrada(String carro) {
		for(Veiculo carros: carros) {
			if (carros.placa == carro ) {
					return carros.hEntrada;
			}
		}
		return null;
		}
		
		public static Integer pegarSaida(String carro) {
			for(Veiculo carros: carros) {
				if (carros.placa == carro ) {
						return carros.hSaida;
				}
			}
			return null;
		}
		
		public static Integer pegarTamanhi(String carro) {
			for(Veiculo carros: carros) {
				if (carros.placa == carro ) {
						return carros.tamanho;
				}
			}
		return null;
		}
		
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", hSaida=" + hSaida + ", hEntrafa=" + hEntrada + ", modelo=" + modelo
				+ ", tamanho=" + tamanho + "]";
	}

	public static void passarHoras(String carro) {
		for(Veiculo carros: carros) {
			if(carros.placa == carro) {
				if(carros.hEntrada != 0 && carros.hSaida != 0) {
			Ocupacao.saidaValor(carros.hEntrada, carros.hSaida);
		}}
		}		
	}
	

}

	

	
