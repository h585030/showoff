package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		for (int i=0; i<tabell.length; i++) {
			/*
			String helTall = showInputDialog(
					"Velg tall nr." + i + ": ");
			tabell[i] = parseInt (helTall);
			*/
			System.out.println(tabell[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		// TODO
		String innholdet = "[";
		
		for (int i=0; i<tabell.length; i++) {
				innholdet += tabell[i];
				if (i+1 < tabell.length) {
					innholdet += ",";
				}
					
		}
		innholdet += "]";
		return innholdet;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int sum = 0;
		for (int verdi:tabell)
			sum += verdi;
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		int i = 0;
		boolean funnet = false;
		while (!funnet && i<tabell.length) {
			if (tabell[i] == tall)
				funnet = true;
			else
				i++;
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		int i = 0;
		
		while (i<tabell.length && tabell[i] != tall) {
			i++;
		}
		if (i == tabell.length){
			i = -1;
		}
		return i;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		int tall[] = tabell;
		int reversal[] = new int[tall.length];
		int i = 0;
		int j = tabell.length - 1;
		while (i<tabell.length && j>-1) {
			reversal[i] = tall[j];
			i++;
			j--;
		}
		tall = reversal;
		return tall;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		
		boolean sjekk = true;
		int i = 0;
		int j = 0;
		if (tabell.length>1) {
			j = i + 1;
		}
		while (j<tabell.length) {
			if (tabell[i]>tabell[j]) {
				sjekk = false;
			}
			i++;
			j++;
		} 
		return sjekk;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTab = new int[nyLengde];
		for (int i=0; i<tabell1.length; i++) {
			nyTab[i] = tabell1[i];
		}
		for (int j=0; j<tabell2.length; j++) {
			nyTab[tabell1.length+j] = tabell2[j];
		}
		return nyTab;
	}
}
