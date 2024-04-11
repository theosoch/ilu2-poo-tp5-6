package test_fonctionnel;

import control.ControlConnecterClient;
import control.ControlCreerClient;
import frontiere.BoundaryConnecterClient;
import frontiere.BoundaryCreerClient;
import model.CarnetClientele;

public class TestConnecterClient {
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

		System.out.println("\n---------- CONNECTER CLIENT ----------");
		ControlConnecterClient controlConnecterClient = new ControlConnecterClient(carnetClientele);
		BoundaryConnecterClient boundaryConnecterClient = new BoundaryConnecterClient(controlConnecterClient);
		int numClient = boundaryConnecterClient.connecterClient();

		System.out.println("\n\n---------- CONTROLE DES DONNEES ----------");
		System.out.println("Cr�ation du client n�" + numClient);
		System.out.println(carnetClientele);
	}
}
