package esercizio.due.giorno.tre;

import java.util.List;

public class ListaDue extends Main implements Runnable {
	private List<Integer> listaDue;
	public int somma;
	
	public ListaDue(List<Integer> listaUno) {
		this.listaDue = listaUno;
	}

	@Override
	public void run() {
		for (int i=1000; i <2000; i++) {
			somma += listaDue.get(i);
		}
		System.out.println(somma);
	}
	

	public int getSomma() {
		return somma;
	}

	public List<Integer> getListaDue() {
		return listaDue;
	}

}