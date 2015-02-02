package src.br.bl4.teste;

import javax.ejb.Stateless;

@Stateless
public class TesteEjb implements TesteEjbLocal {

	@Override
	public String addPipe(String text) {
		return "|" + text + "|";
	}

}
