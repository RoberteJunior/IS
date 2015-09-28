package br.unibh.pessoas;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.pessoas.entidades.PessoaFisica;
import br.unibh.pessoas.entidades.PessoaJuridica;
import br.unibh.pessoas.persistencias.PessoaFisicaDAO;
import br.unibh.pessoas.persistencias.PessoaJuridicaDAO;

public class Testes {
	@Test
	public void testePesssoaFissicaFindAll() {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		List<PessoaFisica> l = dao.findAll();
		Assert.assertEquals(l.size(), 100);
	}

	@Test
	public void testePesssoaFissicaFind() {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica p = dao.find(6L);
		Assert.assertEquals(p.getNome(), "Wyoming C. Randolph");
	}

	@Test
	public void testePessoaFisicaInserir() {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica pf = new PessoaFisica(null, "Fulano da Silva", "Rua A", "7070707070", "10010010010",
				"fulano@fulano.com.br", new Date(), "M");
		dao.insert(pf);
		PessoaFisica pf2 = dao.find("Fulano da Silva");
		Assert.assertNotNull(pf2);
		dao.delete(pf2);
		PessoaFisica pf3 = dao.find("Fulano da Silva");
		Assert.assertNull(pf3);

	}

	@Test
	public void testePessoaFisicaAtualizar() {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica pf = new PessoaFisica(null, "Ciclano da Silva", "Rua A", "7070707070", "10010010010",
				"ciclano@ciclano.com.br", new Date(), "M");
		dao.insert(pf);
		PessoaFisica pf2 = dao.find("Ciclano da Silva");
		pf2.setNome("Beltrano da Silva");
		pf2.setEmail("beltrano@beltrano.com.br");
		dao.update(pf2);
		PessoaFisica pf3 = dao.find("Beltrano da Silva");
		Assert.assertEquals(pf3.getEmail(), "beltrano@beltrano.com.br");
		Assert.assertNotNull(pf3);
		dao.delete(pf3);

	}
	@Test
	public void testePesssoaJuridicaFindAll() {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		List<PessoaJuridica> l = dao.findAll();
		Assert.assertEquals(l.size(), 100);
	}

	@Test
	public void testePesssoaJuridicaFind() {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		PessoaJuridica p = dao.find(6L);
		Assert.assertEquals(p.getNome(), "Thane S. Hayden");
	}

	@Test
	public void testePessoaJuridicaInserir() {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		PessoaJuridica pf = new PessoaJuridica(null, "Fulano da Silva", "Rua A", "7070707070", "10010010010000",
				"fulano@fulano.com.br", new Date());
		dao.insert(pf);
		PessoaJuridica pf2 = dao.find("Fulano da Silva");
		Assert.assertNotNull(pf2);
		
		dao.delete(pf2);
		PessoaJuridica pf3 = dao.find("Fulano da Silva");
		Assert.assertNull(pf3);

	}

	@Test
	public void testePessoaJuridicaAtualizar() {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		PessoaJuridica pf = new PessoaJuridica(null, "Antonio da Silva", "Rua A", "7070707077", "10010010010081",
				"antoniodasilva@antoniodasilva.com.br", new Date());
		dao.insert(pf);
		PessoaJuridica pf2 = dao.find("Antonio da Silva");
		
		pf2.setNome("Maria da Silva");
		pf2.setSite("maria@maria.com.br");
		dao.update(pf2);
		
		PessoaJuridica pf3 = dao.find("Maria da Silva");
		Assert.assertEquals(pf3.getSite(), "maria@maria.com.br");
		Assert.assertNotNull(pf3);
		dao.delete(pf3);

	}

}