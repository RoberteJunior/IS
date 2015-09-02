package br.unibh.pessoas;

import java.util.Date;

import br.unibh.pessoas.entidades.PessoaFisica;

public class Main {

	public static void main(String[] args) 
	{
		PessoaFisica pf1 = new PessoaFisica (1L, "João", "Rua A", "3333-3333", "10010010080", "pessoafisica@pessoafisica.br", new Date(), "M");
		
		
		
		System.out.println(pf1);
		
	}

}
