package listas;

public class PessoaCadastro extends CadastroAbstract{

	@Override
	public boolean cadastrar(Pessoa pessoa) {
		String nome = pessoa.getNome();
		Pessoa p = localizar(nome); 
		if (p == null ) {
			getPessoas().add(pessoa);
			return true;
		}
		return false;
	}

	@Override
	public boolean excluir(String nome) {
		Pessoa p = localizar(nome); 
		if (p != null ) {
			getPessoas().remove(p);
			return true;
		}
		return false;
	}

	@Override
	public Pessoa localizar(String nome) {
		if (getPessoas() != null ) {
			for (Pessoa p : getPessoas()) {
				if ( p.getNome().equalsIgnoreCase(nome)) {
					return p;
				}
			}
		}
		return null;
	}
 
	
	
	
	
	
	
	
	
	
	
	
	
	

}
