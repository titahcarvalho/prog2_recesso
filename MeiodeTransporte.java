package prog2_exercicio_recesso;

public abstract class MeiodeTransporte {
	private String nome;
	private String marca;
	private double ano;
	private int chassi;
	
	public MeiodeTransporte( String nome, String marca, double ano, int chassi) {
		this.nome = nome;
		this.marca = marca;
		this.ano = ano;
		this.chassi = chassi;
	}
	
	public abstract void calculaKm();
	public abstract void temperatura();
	public String toString() {
		return "Nome:" + this.nome + "\nMarca:" + this.marca + "\nAno:" + this.ano + "\nChassi:" + this.chassi;
	}

}
