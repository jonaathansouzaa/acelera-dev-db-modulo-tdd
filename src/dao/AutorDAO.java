package dao;

import java.time.LocalDate;

import exceptions.CpfInvalidoException;
import exceptions.IdadeInvalidaException;

public class AutorDAO {

	public Boolean salvar(Autor autor) throws CpfInvalidoException, IdadeInvalidaException {
		// TODO Auto-generated method stub

		if (autor.getCpf() == null || autor.getCpf().length() != 11) {
			throw new CpfInvalidoException();
		}
		
		Integer ano = LocalDate.now().getYear() - autor.getDataNascimento().getYear();
		if (ano > 100) {
			throw new IdadeInvalidaException();
		}
		
		return Boolean.TRUE;
	}

}
