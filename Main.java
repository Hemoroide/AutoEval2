package co.simplon;

public class Main {

	public static void main(String[] args) {
	
		Voiture voiture1 = new Voiture("Bugatti" , "Chiron", "essence", 2);
		Voiture voiture2 = new Voiture("Mercedes", "Maybach S 600" , "essence", 3);
		Voiture voiture3 = new Voiture("Citroën", "C3 Picasso", "diesel", 5);
		Moto moto1 = new Moto("Kamasaki", "GTR 1400", "1400 cc");
		Moto moto2 = new Moto("Honda", "CB 600", "600 cc");
		
		voiture1.ajoutStock();
		voiture2.ajoutStock();
		voiture3.ajoutStock();
		moto1.ajoutStock();
		moto2.ajoutStock();
		
		System.out.println("Voiture 1 : " + voiture1.getMarque() + " - " + voiture1.getModele() + " - " + voiture1.getNbPlace() + " - " + voiture1.getMotorisation() );
		System.out.println("Voiture 2 : " + voiture2.getMarque() + " - " + voiture2.getModele() + " - " + voiture2.getNbPlace() + " - " + voiture2.getMotorisation() );
		System.out.println("Voiture 3 : " + voiture3.getMarque() + " - " + voiture3.getModele() + " - " + voiture3.getNbPlace() + " - " + voiture3.getMotorisation() );
		System.out.println("Moto 1 : " + moto1.getMarque() + " - " + moto1.getModele() + " - " + moto1.getCylindre() );
		System.out.println("Moto 2 : " + moto2.getMarque() + " - " + moto2.getModele() + " - " + moto2.getCylindre() );
		
		System.out.println("Nombre de vehicule disponible : " + Vehicule.getCompteur());		
	}

}
