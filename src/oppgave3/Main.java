package oppgave3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Sortering sort = new Sortering();
		Integer[] tabell = new Integer[10];
		Random tilfeldig = new Random();
		
		for (int i = 0; i < tabell.length; i++) {
			tabell[i] = tilfeldig.nextInt(10);
		}
		sort.Innsettingssortering(tabell);
	
		for (int i = 0; i<tabell.length;i++) {
			System.out.print(tabell[i]+" ");
		}
	}

}
