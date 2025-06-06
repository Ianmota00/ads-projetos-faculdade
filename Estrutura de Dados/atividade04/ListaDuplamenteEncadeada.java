package atividade04;

public class ListaDuplamenteEncadeada {
	private No inicio = null;
	private No fim = null;
	private int tamanho = 0;

	public void inserirInicio(int valor) {
		No novo = new No();
		novo.setValor(valor);
		if (tamanho == 0) {
			inicio = fim = novo;
		} else {
			novo.setProximo(inicio);
			inicio.setAnterior(novo);
			inicio = novo;
		}
		tamanho++;
	}

	public void removerInicio() {
		if (tamanho == 0) {
			System.out.println("Lista vazia.");
			return;
		}
		inicio = inicio.getProximo();
		if (inicio != null) {
			inicio.setAnterior(null);
		} else {
			fim = null;
		}
		tamanho--;
	}

	public void removerFim() {
		if (tamanho == 0) {
			System.out.println("Lista vazia.");
			return;
		}
		fim = fim.getAnterior();
		if (fim != null) {
			fim.setProximo(null);
		} else {
			inicio = null;
		}
		tamanho--;
	}

	public void listar() {
		No atual = inicio;

		if (inicio != null) {

			while (atual != null) {
				System.out.println(atual.getValor());
				atual = atual.getProximo();
			}

		} else {
			System.out.println("Lista vazia.");

		}
	}

}
