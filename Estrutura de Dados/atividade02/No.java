package atividade02;

public class No {
 private No anterior = null;
  private No proximo = null;
  private  int valor;
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
public int getValor() {
	return valor;
}
public void setValor(int valor) {
	this.valor = valor;
}


  

}
