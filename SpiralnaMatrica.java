package Zadatak;

import javax.swing.JOptionPane;

public class SpiralnaMatrica {

	public static void main(String[] args) {

		int red;
		int stupac;
		int i, j;
		int prviRed = 0;
		int prviStupac = 0;
		int polje = 1;
		
		
		do {
			
		 red = Integer.parseInt(JOptionPane.showInputDialog("Unesite velièinu redova"));
		 stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesite velièinu stupaca"));

		 if(red <= 0 | stupac <= 0) {
			 System.out.println("Pogrešan unos, ponovite");
		 }
		 
		}while(red <= 0 | stupac <= 0);
		
		int zadnjiRed = red - 1;
		int zadnjiStupac = stupac - 1;
		
		int matrica[][] = new int[red][stupac];
		while (polje <= red * stupac) {
			for (i = zadnjiStupac; i >= prviStupac; i--) {
				matrica[prviRed][i] = polje++;

				if (polje > red * stupac)
					break;

			}
			for (j = prviRed+1; j <= zadnjiRed; j++) {
				matrica[j][prviStupac] = polje++;
				if (polje > red * stupac)
					break;
			}
			for (i = prviStupac + 1; i <= zadnjiStupac; i++) {
				matrica[zadnjiRed][i] = polje++;
				if (polje > red * stupac)
					break;
			}
			for (j = zadnjiRed - 1; j > prviRed; j--) {
				matrica[j][zadnjiStupac] = polje++;
				if (polje > red * stupac)
					break;
			}
			prviStupac++;
			prviRed++;
			zadnjiStupac--; 
			zadnjiRed--;
		}
		for (i = 0; i < red; i++) {
			for (j = 0; j < stupac; j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
