package Oppgave2.impl;

public class Sortering {

	public void sorteringOriginal(Comparable <Integer>[] table) {
		int n = table.length;
		for (int i = 1; i<n; i++) {
			Comparable key = table[i];
			int j = i-1;
			while (j>=0&&table[j].compareTo((Integer) key)>0) {
				table[j+1]=table[j];
				j=j-1;
			}
			table[j+1]=key;
		}
		
	}
	
	public void sorteringModefisertA(Comparable <Integer>[] table) {
		int n = table.length;
		int minst = (int) table[0];
		int plasseringMinste = 0;
		
		
		for (int i = 0; i<table.length;i++) {
			if(minst>(int)table[i]) {
				minst=(int)table[i];
				plasseringMinste = i;
			}
		}
		
		// etter å ha funnet plasseringen til den minste
		// så flytter jeg den minste til første plassen
		// og den som står der til plassen den minste var
		
		Comparable<Integer> holder = table[0];
		table[0]= table[plasseringMinste];
		table[plasseringMinste]=holder;
		
		
		for (int i = 1; i<n; i++) {
			Comparable key = table[i];
			int j = i-1;
			while (table[j].compareTo((Integer) key)>0) {
				table[j+1]=table[j];
				j=j-1;
			}
			table[j+1]=key;
		}
		
	}
	public void sorteringModefisertB(Comparable[] table) {
		int n = table.length;
		Comparable minst;
		Comparable storst;
		int plasseringMinste = 0;
		int plasseringStorste = 0;
		
		// i for while løkken:
		int i = 2;
		
		//skjekker om det er oddetals tabell eller partall
			if(n%2==0) {
				if(table[0].compareTo(table[1])>0) {
					Comparable holder = table[0];
				
					table[0]=table[1];
					table[1] = holder;
				
				}
				i++;
			}
			
		
		while (i<n-1) {
			//tar ut to ellementer fra usorterte tabellen
			minst = table[i];
			storst = table[i+1];
			
			//sørg for minst er minst og storst er storst:
			if (minst.compareTo(storst)>0) {
				Comparable holder;
				
				holder = minst;
				minst = storst;
				storst = holder;
			}
			//int til while indre
			int j = i-1;
			while (j>=0 && table[j].compareTo(storst)>0) {
				table[j+2]=table[j];
				j--;
			}
			//setter inn storste:
			table[j+2]=storst;
			j--;
			//løkke for å finne plassen til den minste
			while (j>=0 && table[j].compareTo(minst)>0) {
				table[j+1]=table[j];
				j--;
			}
			table[j+1]=minst;
			i++;
		}
		
		
	}
	
	public void sorteringModefisertC(Comparable[] table) {
		
		int n = table.length;
		Comparable minst = table[0];
		Comparable storst;
		int plasseringMinste = 0;
		int plasseringStorste = 0;
		
		for (int i = 0; i<n-1;i++) {
			if(minst.compareTo(table[i])>0) {
				minst=table[i];
				plasseringMinste = i;
			}
		}
		
		// etter å ha funnet plasseringen til den minste
		// så flytter jeg den minste til første plassen
		// og den som står der til plassen den minste var
		
		Comparable holder = table[0];
		table[0]= table[plasseringMinste];
		table[plasseringMinste]=holder;
		
		
		// i for while løkken:
		int i = 2;
		
		//skjekker om det er oddetals tabell eller partall
			if(n%2!=0) {
				if(table[0].compareTo(table[1])>0) {
					Comparable holder1 = table[0];
				
					table[0]=table[1];
					table[1] = holder1;
				
				}
				i++;
			}
			
		
		while (i<n-1) {
			//tar ut to ellementer fra usorterte tabellen
			minst = table[i];
			storst = table[i+1];
			
			//sørg for minst er minst og storst er storst:
			if (minst.compareTo(storst)>0) {
				Comparable holder1;
				
				holder1 = minst;
				minst = storst;
				storst = holder1;
			}
			//int til while indre
			int j = i-1;
			while (table[j].compareTo(storst)>0) {
				table[j+2]=table[j];
				j--;
			}
			//setter inn storste:
			table[j+2]=storst;
			j--;
			//løkke for å finne plassen til den minste
			while (table[j].compareTo(minst)>0) {
				table[j+1]=table[j];
				j--;
			}
			table[j+1]=minst;
			i++;
		}
		
		
	}
		
		
		
	}










