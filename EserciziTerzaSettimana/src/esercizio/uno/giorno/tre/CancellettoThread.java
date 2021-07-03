package esercizio.uno.giorno.tre;

public class CancellettoThread extends Thread{
	@Override	
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("#");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
