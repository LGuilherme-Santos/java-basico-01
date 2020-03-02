package br.fai.projeto01;

public class Main {

	public static void main(String[] args) {


		Main app = new Main();
		app.start();
	}

	private void start() {

		int idade = 15;
		
		System.out.println("A idade é de " + idade + " anos.");
		
		
		idade += 5; //idade = idade + 5;
		idade *= 2;
		
		System.out.println("Resultado 1: " + idade);
		
	}

}
