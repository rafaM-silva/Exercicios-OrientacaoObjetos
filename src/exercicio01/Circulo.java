package exercicio01;

import java.util.Scanner;

public class Circulo {
	Scanner sc = new Scanner(System.in);
	static double raio;
	static double valorCirculo;
	int valorA;
	int valorB;
	
	
	
	
	public void buscarCoordenadaA() {
		System.out.println("Escreva o valor do centro do círculo que correponde ao eixo A");
		valorA = sc.nextInt();
	}
	public void buscarCoordenadaB() {
		System.out.println("Escreva o valor do centro do círculo que correponde ao eixo B");
		valorB = sc.nextInt();
	}
	
	
	
	
	
	static double calculaRaio(int valorX, int valorY, int valorA, int valorB) {	
		
		return raio = Math.sqrt((valorX-valorA)*(valorX-valorA)+(valorY-valorB)*(valorY-valorB));
			
	}
	
	
	static double calculaCirculo() {
		return valorCirculo = 2*3.14d*raio;
	}
}

