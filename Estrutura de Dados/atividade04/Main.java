package atividade04;

public class Main {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		for (int i = 1; i <= 29; i += 2) {
            lista.inserirInicio(i);
            
            
        }
		lista.listar();
	}

}
