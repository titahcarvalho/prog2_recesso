package prog2_exercicio_recesso;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<MeiodeTransporte> automovel = new ArrayList<>();
		MeiodeTransporte Vectra = new Carro ("Vectra", "Wolks",2009, 12345678, 4, "turbo");
		MeiodeTransporte SuperKat = new Lancha ("Super kat","Lanchiiite", 2014, 102030, 13, "Simples");
		
		
		automovel.add(Vectra);
		automovel.add(SuperKat);
		
		for(MeiodeTransporte z : automovel) {
			System.out.println(z.toString());
			z.calculaKm();
			z.temperatura();
		
		}
	}

}
