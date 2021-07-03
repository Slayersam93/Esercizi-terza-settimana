package esercizio.tre.giorno.due;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
	private Map<String, String> contatti = new HashMap<>();
	
	public void nuovoContatto (String nome, String numero) {
		contatti.put(nome, numero);
	}
	public void eliminaContatto (String nome) {
		contatti.remove(nome);
	}
	public String cercaContatto (String numero) {
		for(Map.Entry<String,String> num : contatti.entrySet()) {
			if (num.getValue()==numero) {
				return num.getKey();
			}
		}
		return "Numero non Presente";
	}
	public String cercaNumero (String nome) {
		return contatti.get(nome);
	}
	public void printRubrica(){
		for (Map.Entry<String,String> x : contatti.entrySet()) {
			System.out.print(x.getKey()+ " ");
			System.out.println(x. getValue());
		}
	}

}
