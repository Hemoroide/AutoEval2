package co.simplon;

import java.util.ArrayList;

public class Voiture extends Vehicule {
	
	private String motorisation;
	private int nbPlace;
		
	public Voiture(String marque, String modele, String motorisation, int nbPlace) {
		super(modele, marque);
		this.motorisation = motorisation;
		this.nbPlace = nbPlace;
	}



	public String getMotorisation() {
		return motorisation;
	}

	public void setMotorisation(String motorisation) {
		this.motorisation = motorisation;
	}

	public int getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

}
