package esercizio.uno.giorno.tre;

public class Stampe {

	public static void main(String[] args) {
		Thread t1 = new AsteriscoThread();
		Thread t2 = new CancellettoThread();
		t1.start();
		t2.start();
	}

}
