package esercizio.due.giorno.tre;

import java.util.List;

public class ListaUno extends Main implements Runnable {
	private List<Integer> listaUno;
	private int somma;
	
	public ListaUno(List<Integer> listaUno) {
		this.listaUno = listaUno;
	}

	@Override
	public void run() {
		for (int i=0; i <1000; i++) {
			somma += listaUno.get(i);
		}
		System.out.println(somma);
	}
	public int getSomma() {
		return somma;
	}

	public List<Integer> getListaUno() {
		return listaUno;
	}

}
