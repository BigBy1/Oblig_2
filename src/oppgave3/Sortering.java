package oppgave3;

public class Sortering {
	
	public void Innsettingssortering(Comparable<Integer>[]table){
		
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
		
		Comparable <Integer> holder = table[0];
		table[0]= table[plasseringMinste];
		table[plasseringMinste]=holder;
		
		
		
		for (int i = 1;i<=table.length-1;i++) {
			
			int j =i-1;
			Comparable<Integer> key = table[i];
			
			while (table[j].compareTo((Integer) (key))>0) {
				table[j+1] =table[j];
				j=j-1;
			}
			table[j+1]=key;
		}
	}
}
