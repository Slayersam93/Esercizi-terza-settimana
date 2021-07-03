package esercizio.due.giorno.due;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> listaNumeri=numeriCrescenti(15);
		System.out.println(listaNumeri);
		listaReverse(listaNumeri);
		System.out.println(listaNumeri);
		listaPariDispari(listaNumeri, false);
		System.out.println();
		listaPariDispari(listaNumeri, true);
		
		
		
	}
	public static List<Integer> numeriCrescenti (int x) {
		List<Integer> numeri = new ArrayList<Integer>();
		for (int i = 0; i < x; i++) {
			numeri.add((int)(Math.random()*100));
		}	
		Collections.sort(numeri);
		return numeri;
	}
	public static List<Integer> listaReverse (List<Integer> lista){
		for (int i=lista.size()-1;i>= 0; i-- ) {
			lista.add(lista.get(i));
		}
		return lista;
	}
	public static void listaPariDispari(List<Integer> lista,boolean pari){
		for (int i = pari? 0:1; i<lista.size(); i +=2) {
			System.out.print(lista.get(i)+", ");
		}
	}
}
