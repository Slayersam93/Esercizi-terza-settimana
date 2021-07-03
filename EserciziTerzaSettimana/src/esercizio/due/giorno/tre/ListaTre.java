package esercizio.due.giorno.tre;

import java.util.List;

public class ListaTre extends Main implements Runnable {
	private List<Integer> listaTre;
	public int somma;
	
	public ListaTre(List<Integer> listaTre) {
		this.listaTre = listaTre;
	}

	@Override
	public void run() {
		for (int i=2000; i <3000; i++) {
			somma += listaTre.get(i);
		}
		System.out.println(somma);
	}

	
	public int getSomma() {
		return somma;
	}

	public List<Integer> getListaTre() {
		return listaTre;
	}

}