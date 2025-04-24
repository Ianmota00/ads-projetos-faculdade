package listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
	 	
		
		
		List<String> listas = new ArrayList<>();
		
		String s = new String("joao");
		listas.add(s);
		listas.add("Sizenando 2");
		
		String nome = listas.get(0);
		System.out.println(nome);
		
		for (String valor : listas) {
            System.out.println(valor);
        }
		
		for (int i =0; i<listas.size(); i++) {
			System.out.println(listas.get(i));
		}
		
		List<Carro> carros = new ArrayList<Carro>();
		Carro carro = new Carro();
		carro.setMarca("Chevrolet");
		carro.setModelo("Monza");
		carro.setCombustivel(Carro.COMBUSTIVEL_FLEX);
		carro.setCor(Carro.COR_AMARELO);
		carros.add(carro);
		Carro carro2 = new Carro();
		carro2.setMarca("VoksWagen");
		carro2.setModelo("GOL");
		carro2.setCombustivel(Carro.COMBUSTIVEL_GASOLINA);
		carro2.setCor(Carro.COR_PRETO);
		carros.add(carro2);
		carros.get(0).getMarca();
		carros.get(0).getModelo();
	}
}














