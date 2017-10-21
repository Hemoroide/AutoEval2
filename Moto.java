package co.simplon;

public class Moto extends Vehicule {
	
	private String cylindre;

		
	public Moto(String marque, String modele, String cylindre) {
		super(modele, marque);
		this.cylindre = cylindre;
	}


	public String getCylindre() {
		return cylindre;
	}

	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}


}
