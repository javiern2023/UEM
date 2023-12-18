
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PasoEstrecho pasoEstrecho = new PasoEstrecho();

		Balsa BalsaRescate1 = new Balsa(pasoEstrecho, 1);
		Balsa BalsaRescate2 = new Balsa(pasoEstrecho, 2);
		Balsa BalsaRescate3 = new Balsa(pasoEstrecho, 3);

		BalsaRescate1.start();
		BalsaRescate2.start();
		BalsaRescate3.start();

		try {
			BalsaRescate1.join();
			BalsaRescate2.join();
			BalsaRescate3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
