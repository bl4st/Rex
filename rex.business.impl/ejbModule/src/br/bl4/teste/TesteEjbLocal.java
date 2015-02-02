package src.br.bl4.teste;

import javax.ejb.Local;

@Local
public interface TesteEjbLocal {

	public String addPipe(String text);
}
