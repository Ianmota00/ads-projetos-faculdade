package atividade03;

public class ListaDuplamenteEncadeada {
    private No inicio = null;
    private No fim = null;
    private int tamanho = 0;

    public void inserirInicio(Aluno aluno) {
        No novoNo = new No();
        novoNo.setAluno(aluno);
        if (tamanho == 0) {
            inicio = fim = novoNo;
        } else {
            novoNo.setProximo(inicio);
            inicio.setAnterior(novoNo);
            inicio = novoNo;
        }
        tamanho++;
    }

    public void inserirFim(Aluno aluno) {
        No novoNo = new No();
        novoNo.setAluno(aluno);
        if (tamanho == 0) {
            inicio = fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            novoNo.setAnterior(fim);
            fim = novoNo;
        }
        tamanho++;
    }

    public void exibirLista() {
        No atual = inicio;
        if (atual != null) {
            while (atual != null) {
                Aluno aluno = atual.getAluno();
                System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
                atual = atual.getProximo();
            }
        } else {
            System.out.println("Lista vazia.");
        }
    }
}

