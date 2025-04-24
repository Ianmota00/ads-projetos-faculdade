package listas.menu;

import java.util.List;

import listas.CadastroAbstract;

public abstract class MenuAbstract {

	public abstract void cadastrar(List<CadastroAbstract> cadastro);
	public abstract void excluir(List<CadastroAbstract> cadastro);
	public abstract void localizar(List<CadastroAbstract> cadastro);
	
}
