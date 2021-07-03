package esercizio.due.giorno.tre;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> listaNumeri = creaLista();
		ListaUno x = new ListaUno(listaNumeri);
		ListaDue y = new ListaDue(listaNumeri);
		ListaTre z = new ListaTre(listaNumeri);
		Thread t1 = new Thread(x);
		Thread t2 = new Thread(y);
		Thread t3 = new Thread(z);
		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("La somma totale e': "+ (x.getSomma()+y.getSomma()+z.getSomma()));

	}

	public static List<Integer> creaLista() {
		List<Integer> numeri = new ArrayList<>();
		for (int i = 0; i < 3000; i++) {
			int x = (int) (Math.random() * 11);
			numeri.add(x);
		}
		return numeri;
	}
}
