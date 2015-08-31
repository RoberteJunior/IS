package br.unibh.pessoas;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("João");
		
		Pessoa p2 = new Pessoa(1l, "Tiago");
		
		Pessoa p3 = new Pessoa(2l, "Roberte", "rua B", "8888-8888");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
