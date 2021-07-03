package esercizio.uno.giorno.due;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Set <String> parole = new HashSet<String>();
	Set <String> paroleDoppie = new HashSet<String>();
	System.out.println("Inserisci il numero di parole da inserire");
	int imput = scanner.nextInt();
	scanner.nextLine();
	for (int i=0; i<imput; i++) {
		System.out.println("Scrivi la parola da inserire");
		String parola = scanner.nextLine();
		if (parole.add(parola)) {
			parole.add(parola);
			System.out.println("Inserito in parole");
		}else {
			paroleDoppie.add(parola);
			System.out.println("Inserito in parole doppie");
		}
	}
	System.out.println(parole.size());
	System.out.println("Le parole distinte sono: "+parole);
	System.out.println("Le parole doppie sono: "+paroleDoppie);
	scanner.close();
}
}
