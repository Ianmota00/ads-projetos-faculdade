package listas;

public class Carro {
	public static final int COR_AMARELO = 0;
	public static final int COR_AZUL = 1;
	public static final int COR_BRANCO = 2;
	public static final int COR_PRETO = 3;
	public static final int COMBUSTIVEL_GASOLINA = 0;
	public static final int COMBUSTIVEL_ALCOOL = 1;
	public static final int COMBUSTIVEL_FLEX = 2;
	private int cor;
	private String marca;
	private String modelo;
	private int combustivel;
	
	
	public int getCor() {
		return cor;
	}
	public void setCor(int cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}

}
