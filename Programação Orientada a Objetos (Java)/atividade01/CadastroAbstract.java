package listas;

import java.util.ArrayList;
import java.util.List;

public abstract class CadastroAbstract {
	
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public abstract boolean cadastrar(Pessoa pessoa);
	public abstract boolean excluir(String nome);
	public abstract Pessoa localizar(String nome);
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
