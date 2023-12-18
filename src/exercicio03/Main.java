package exercicio03;

public class Main {

	public static void main(String[] args) {
		Livro livro01 = new Livro();
		livro01.paginas = 254;
		livro01.titulo = "Das Cinzas de Onira";
		livro01.autor = "Umberto Mannarino";
		
		livro01.mostrarAutor();
		livro01.mostrarTitulo();
		livro01.mostrarPaginas();
		
		Livro livro02 = new Livro();
		livro02.paginas = 266;
		livro02.titulo = "O Crtiço";
		livro02.autor = "Aluísio Azevedo";
		
		livro02.mostrarAutor();
		livro02.mostrarTitulo();
		livro02.mostrarPaginas();
		
		Livro livro03 = new Livro();
		livro03.paginas = 391;
		livro03.titulo = "Mr. Mercedes";
		livro03.autor = "Stephen King";
		
		livro03.mostrarAutor();
		livro03.mostrarTitulo();
		livro03.mostrarPaginas();
		
		

	}

}
