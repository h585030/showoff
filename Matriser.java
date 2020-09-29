package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		/*
		int[][] k = matrise;
		for (int[] navn:k) {
			for (int valg:navn) {
				System.out.println(valg);
			}
		}
		*/
		int k = 0;
		//int[][] l = matrise;
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise[i].length; j++) {
				k = matrise[i][j];
				System.out.print(k);
				System.out.print(matrise[i][j]);
			}
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String innholdet = "";
		
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise[i].length; j++) {
				innholdet += matrise[i][j];
				if (i < matrise.length) {
					innholdet += " ";
				}
			}
		if (i<matrise.length) {
			innholdet += "\n";
		}
		}
		
		return innholdet;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		int nyMatr[][] = new int[matrise.length][matrise.length];
		nyMatr = matrise;
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise[i].length; j++) {
				nyMatr[i][j] = nyMatr[i][j] * tall;
				
			}
		
		}
		
		return nyMatr;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		boolean lik = false;
		if (a == b) {
			lik = true;
		}
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		int nyMatris[][] = new int[matrise.length][matrise.length];
		nyMatris = matrise;
		int i = 0;
		int j = 0;
		int k = matrise.length - 1;
		int l = matrise.length - 1;
		while (i < matrise.length && k > -1) {
			while (j < matrise.length && l > -1) {
				System.out.println(matrise[i][j]);
				System.out.println(nyMatris[k][l]);
				/*
				//nyMatris[k][l] = matrise[i][j];
				System.out.println(i);
				System.out.println(j);
				System.out.println(k);
				System.out.println(l);
				System.out.println(matrise[i][j]);
				System.out.println(nyMatris[k][l]);
				*/
				j++;
				l--;
			}
			i++;
			k--;
			j = 0;
			l = matrise.length - 1;
		}
		return nyMatris;
		//denna e ikkje mulig, gir de feil matrise.
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		int nyMatrise[][] = new int[a.length][b.length];
		nyMatrise = a;
		nyMatrise = nyMatrise * b;
		return nyMatrise;
		//i gidd ikkje detta.
	}
}
