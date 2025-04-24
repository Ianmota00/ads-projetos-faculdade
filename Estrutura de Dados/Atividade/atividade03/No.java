package atividade03;

public class No {
    private Aluno aluno;
    private No anterior;
    private No proximo;
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public No getAnterior() {
		return anterior;
	}
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

   
}

