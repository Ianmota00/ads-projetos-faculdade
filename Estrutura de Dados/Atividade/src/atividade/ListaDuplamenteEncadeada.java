package atividade;

public class ListaDuplamenteEncadeada {
   private No inicio = null;
    private No fim = null;
    private int tamanhoList = 0;
    
    public void InsersirInicio (int valor) {
  	   No novoNo = new No();
  	   novoNo.setValor(valor);
  	   
  	   if (tamanhoList == 0) {
  		 inicio = fim = novoNo;
  	   }else {
  		   novoNo.setProximo(inicio);;
  		   inicio.setAnterior(novoNo);
  		  
  		   inicio = novoNo;
  	   }
  	 tamanhoList++;

    }
    
  public void InsersirFim (int valor) {
	  No novoNo = new No();
	  novoNo.setValor(valor);
	  
	  if (tamanhoList == 0) {
		  inicio = fim = novoNo;
		  
	  }else {
		  fim.setProximo(novoNo);
		  novoNo.setAnterior(fim);
		 
		  fim = novoNo;
		  
	  }
	  tamanhoList++;

  	  
    }

  public void exibir() {
	  
	  No atual = inicio;
	  if (atual != null) {
		  while (atual!= null) {
		  
		  System.out.println(atual.getValor());
		   atual = atual.getProximo();
		  }
	  }else {
		  System.out.println("lista vazia.....");
	  }
	  

  	
  }
}
