package exercicio01;

import java.util.Scanner;

public class Ponto {
	
	Scanner sc = new Scanner(System.in);
	int valorX;
	int valorY;
	
	static void mostrarCoordenadas(int valorX, int valorY, int valorA, int valorB) {
        System.out.println("As coordenadas do ponto C são: (" + valorX + ", " + valorY + ")");
        System.out.println("As coordenadas do ponto P são: (" + valorA + ", " + valorB + ")");
        
    }
	public void buscarCoordenadasX() {
		System.out.println("Escreva o valor do centro do círculo que correponde ao eixo X");
		this.valorX = sc.nextInt();
		
	}
	public void buscarCoordenadasY() {
		System.out.println("Escreva o valor do centro do círculo que correponde ao eixo Y");
		this.valorY = sc.nextInt();
	}
}
