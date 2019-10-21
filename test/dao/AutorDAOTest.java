package dao;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import exceptions.CpfInvalidoException;
import exceptions.IdadeInvalidaException;

public class AutorDAOTest {

	
	@Test
	public void deveCadastrarUmAutorCasoDadosForemValidos() throws Exception {
		Autor autor = new Autor("12345678901", "Jonathan Souza", LocalDate.of(1988, 1, 8));
		
		AutorDAO autorDAO = new AutorDAO();
		assertTrue(autorDAO.salvar(autor));
	}
	
	@Test(expected = CpfInvalidoException.class)
	public void deveRetornarUmaExcecaoCasoCpfDiferenteDe11Caracters() throws Exception {
		Autor autor = new Autor("12345");
		
		AutorDAO autorDAO = new AutorDAO();
		autorDAO.salvar(autor);
	}
	
	@Test(expected = CpfInvalidoException.class)
	public void deveRetornarUmaExcecaoCasoCpfNulo() throws Exception {
		String cpf = null;
		Autor autor = new Autor(cpf);
		
		AutorDAO autorDAO = new AutorDAO();
		autorDAO.salvar(autor);
	}
	
	@Test(expected = IdadeInvalidaException.class)
	public void deveRetornarUmaExcecaoCasoAutorTiverMaisQue100Anos() throws Exception {
		LocalDate dataNascimento = LocalDate.of(1918, 1, 1);
		Autor autor = new Autor("12345678901", dataNascimento);
		
		AutorDAO autorDAO = new AutorDAO();
		autorDAO.salvar(autor);
	}
	
	
}
