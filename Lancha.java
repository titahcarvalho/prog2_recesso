package prog2_exercicio_recesso;

public class Lancha extends MeiodeTransporte {
	private int tamanhoCasco;
	private String tipodeMotor;
	
	public Lancha (String nome, String marca, double ano, int chassi, int tamanhoCasco, String tipodeMotor) {
		super(nome, marca, ano, chassi);
		this.tamanhoCasco = tamanhoCasco;
		this.tipodeMotor = tipodeMotor;
		
	}
	
	public void calculaKm() {
		//FAZ ALGO AQUI, USA O SYSTEM
		System.out.println("\nA quilometragem total da lancha é: teste" );

	}
	public void temperatura() {
		//FAZ ALGO AQUI, USA O SYSTEM
		System.out.println("\nA temperatura total da lancha é: teste" );
	}
	


}
