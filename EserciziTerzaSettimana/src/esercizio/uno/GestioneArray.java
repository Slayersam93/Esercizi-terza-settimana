package esercizio.uno;

import java.util.*;

public class GestioneArray {
	private static Scanner console = new Scanner(System.in);

	public static void f1() {

		int[] lista = new int[5];

		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int) (Math.random() * 10);
		}
		stampaStato(lista);

		int x = 1;

		do {
			System.out.println("Inserisci un numero");
			x = console.nextInt();
			if (x != 0) {
				try {
					System.out.println("In quale posizione vuoi inserire il numero?");
					int y = console.nextInt();
					lista[y] = x;
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Posizione non consentita. Devi inserire un numero tra 0  e 4.");
				}
				stampaStato(lista);
			}
		} while (x != 0);
	}

	public static int inserisciElemento(int[] lista) throws ArrayIndexOutOfBoundsException {
		int contatore = 0;
		boolean valid = false;
		int y = -1;
		System.out.println("Dammi un nuovo valore");
		int x = console.nextInt();
		do {
			contatore++;
			System.out.println("In quale posizione vuoi inserire il valore?");
			y = console.nextInt();
			valid = y >= 0 && y < 5;
			if (!valid) {
				System.out.println("Posizione non consentita. Devi inserire un numero tra 0  e 4.");
			}
		} while (contatore < 4 && !valid);
		lista[y] = x;
		return x;
	}

	public static void stampaStato(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	public static void f2() {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		int[] lista = new int[5];

		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int) (Math.random() * 10);
		}
		stampaStato(lista);

		int x = 1;

		do {
			System.out.println("Inserisci un numero");
			x = console.nextInt();
			if (x != 0) {
				System.out.println("In quale posizione vuoi inserire il numero?");
				int y = console.nextInt();
				if (y < 5 && y >= 0) {
					lista[y] = x;
				} else
					System.out.println("Posizione non consentita. Devi inserire un numero tra 0  e 4.");
			}
			stampaStato(lista);

		} while (x != 0);
	}

	public static void f3() {
		//Scanner console = new Scanner(System.in);
		int[] lista = new int[5];

		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int) (Math.random() * 10);
		}
		stampaStato(lista);

		int x = 1;

		do {

			try {
				x = inserisciElemento(lista);
				stampaStato(lista);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Tentativi esauriti, programma terminato. Arriverderci!");
				return;
			}

		} while (x != 0);
	}

	public static void main(String[] args) {
		f3();
	}

}
