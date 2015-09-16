package br.unibh.pessoas;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.pessoas.entidades.PessoaFisica;
import br.unibh.pessoas.persistencias.PessoaFisicaDAO;

public class Testes 
{
	@Test
	public void testePesssoaFissicaFindAll()
	{
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		List<PessoaFisica> l = dao.findAll();
		Assert.assertEquals(l. size(), 100);
	}
	
	@Test
	public void testePesssoaFissicaFind()
	{
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica p = dao.find(6L);
		Assert.assertEquals(p.getNome(),"Wyoming C. Randolph");
	}
}