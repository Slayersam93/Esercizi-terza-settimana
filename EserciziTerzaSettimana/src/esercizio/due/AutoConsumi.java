package esercizio.due;

import java.util.Scanner;

public class AutoConsumi {
	int km;
	int carburanteConsumato;

	@SuppressWarnings("resource")
	public void calcoloCosnumi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci i km percorsi");
		int km = scanner.nextInt();
		try {
			System.out.println("Inserisci il carburante consumato");
			int carburanteConsumato = scanner.nextInt();
			int consumo = km / carburanteConsumato;
			System.out.println(consumo);
		} catch (ArithmeticException ae) {
			System.out.println("Valore non consentito non puoi dividere per 0 ");
		}
	}
}
