package prog2_exercicio_recesso;

public class Carro extends MeiodeTransporte {
	private int rodas;
	private String tipodeMotor;
	
	public Carro (String nome, String marca, double ano, int chassi, int rodas, String tipodeMotor) {
		super(nome, marca, ano, chassi);
		this.rodas = rodas;
		this.tipodeMotor = tipodeMotor;
		
	}
	
	public void calculaKm() {
		//FAZ ALGO AQUI, USA O SYSTEM
		System.out.println("\nA quilometragem total do carro é: teste" );
	}
	public void temperatura() {
		//FAZ ALGO AQUI, USA O SYSTEM
		System.out.println("\nA temperatura total do carro é: teste" );
	}
	
}
