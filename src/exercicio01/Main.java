package exercicio01;

public class Main {

	public static void main(String[] args) {
		Ponto ponto = new Ponto();
		
		
		Circulo circulo = new Circulo();
		ponto.buscarCoordenadasX();;
		ponto.buscarCoordenadasY();
		
		circulo.buscarCoordenadaA();
		circulo.buscarCoordenadaB();
		
		
		
        Ponto.mostrarCoordenadas(ponto.valorX,ponto.valorY, circulo.valorA, circulo.valorB);
		
																																																																																																																																																																															
		Circulo.calculaRaio(ponto.valorX,ponto.valorY, circulo.valorA, circulo.valorB);
		
		double perimetroCirculo = Circulo.calculaCirculo();
		System.out.println(perimetroCirculo);

	}

}
