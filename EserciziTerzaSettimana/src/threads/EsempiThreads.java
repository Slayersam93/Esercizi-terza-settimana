package threads;

public class EsempiThreads {

	public static void main(String[] args) {
//		Thread t1 = new BuongiornoThread();
//		Thread t2 = new BuonaseraThread();
//		t1.start();
//		t2.start();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Fine main");
		Runnable r1 = new BuongiornoRunnable();
		Runnable r2 = new BuonaseraRunnable();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
