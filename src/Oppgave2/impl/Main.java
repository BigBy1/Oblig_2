package Oppgave2.impl;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Integer[] tabell = new Integer[100000];
		Random tilfeldig = new Random();

		for (int i = 0; i < tabell.length; i++) {
			tabell[i] = tilfeldig.nextInt(1000000) + 1;
		}

		// Orginale sorteringen
		Sortering sort = new Sortering();

		long timestampFor = System.currentTimeMillis();

		sort.sorteringOriginal(tabell);

		long timestampEtter = System.currentTimeMillis();

		long timestamp = timestampEtter - timestampFor;

		System.out.println("Tiden på originale sorteringen  i Millisekunder " + timestamp);
		int timestampInteger = (int) (timestamp / 1000);

		System.out.println("Sekunder " + timestampInteger);

		// Sortering Modefisert A
		Integer[] tabell2 = new Integer[100000];

		for (int i = 0; i < tabell2.length; i++) {
			tabell2[i] = tilfeldig.nextInt(1000000);
		}

		timestampFor = System.currentTimeMillis();

		sort.sorteringModefisertA(tabell2);

		timestampEtter = System.currentTimeMillis();

		timestamp = timestampEtter - timestampFor;

		System.out.println("Tiden på versjon A sorteringen  i Millisekunder " + timestamp);
		timestampInteger = (int) (timestamp / 1000);

		System.out.println("Sekunder " + timestampInteger);


		// Sortering Modefisert B
		Integer[] tabell3 = new Integer[100000];

		for (int i = 0; i < tabell3.length; i++) {
			tabell3[i] = tilfeldig.nextInt(1000000);
		}

		timestampFor = System.currentTimeMillis();

		sort.sorteringModefisertB(tabell3);

		timestampEtter = System.currentTimeMillis();

		timestamp = timestampEtter - timestampFor;

		System.out.println("Tiden på versjon B sorteringen  i Millisekunder " + timestamp);
		timestampInteger = (int) (timestamp / 1000);

		System.out.println("Sekunder " + timestampInteger);
		
		// Sortering Modefisert C
				Integer[] tabell4 = new Integer[100000];

				for (int i = 0; i < tabell4.length; i++) {
					tabell4[i] = tilfeldig.nextInt(1000000);
				}

				timestampFor = System.currentTimeMillis();

				sort.sorteringModefisertC(tabell4);

				timestampEtter = System.currentTimeMillis();

				timestamp = timestampEtter - timestampFor;

				System.out.println("Tiden på versjon C sorteringen i Millisekunder " + timestamp);
				timestampInteger = (int) (timestamp / 1000);

				System.out.println("Sekunder " + timestampInteger);
				
				
				
//		skriv ut
//		for (int i = 0; i<tabell4.length;i++) {
//			System.out.print(tabell4[i]+"\n");
//		}
		
		
	}

}
