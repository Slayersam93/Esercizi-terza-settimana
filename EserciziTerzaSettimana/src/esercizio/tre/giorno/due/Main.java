package esercizio.tre.giorno.due;

public class Main {

	public static void main(String[] args) {
		Rubrica r1 = new Rubrica();
		// test nuovo contatto
		r1.nuovoContatto("OscarCarogna", "334568907");
		r1.nuovoContatto("Bibbiri", "3365890234");
		r1.nuovoContatto("RiccardinoFuffolo", "336587421");
		r1.nuovoContatto("Geeno", "337865479");
		r1.nuovoContatto("Peppe", "34473781838");
		r1.printRubrica();
		System.out.println();
		// test elimina contatto
		r1.eliminaContatto("Geeno");
		r1.printRubrica();
		// test cerca contatto by numero
		System.out.println();
		System.out.println(r1.cercaContatto("34473781838"));
		//test cerca contatto by nome 
		System.out.println();
		System.out.println(r1.cercaNumero("Bibbiri"));
		
		
	
		
	}

}
