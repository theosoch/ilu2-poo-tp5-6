package test_fonctionnel;

import control.ControlCreerClient;
import frontiere.BoundaryCreerClient;
import model.CarnetClientele;

public class TestCreerClient {
	public static void main(String[] args) {
		CarnetClientele carnetClientele = new CarnetClientele();
		test(carnetClientele);
	}
	
	public static void test(CarnetClientele carnetClientele) {
		System.out.println("---------- CREER CLIENT ----------");
		// ENTITE : Creation du carnet de clientele

		ControlCreerClient controlCreerClient = new ControlCreerClient(carnetClientele);
		BoundaryCreerClient boundaryCreerClient 
			= new BoundaryCreerClient(controlCreerClient);
		boundaryCreerClient.creerClient();

		// ---------- CONTROLE DES DONNEES ----------
		System.out.println("\n\n---------- CONTROLE DES DONNEES ----------");
		System.out.println(carnetClientele);
	}
}
