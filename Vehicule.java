package co.simplon;

import java.util.ArrayList;

public class Vehicule {
	
	private String modele;
	private String marque;
	private ArrayList<Vehicule> listeVehicule = new ArrayList<Vehicule>();
	private static int compteur = 0;
		
		public Vehicule(String marque, String modele) {
		super();
		this.modele = modele;
		this.marque = marque;
	}
		
	public void ajoutStock() {
		listeVehicule.add(this);
		compteur++;
	}
		
		
		
		
		
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public ArrayList<Vehicule> getListeVehicule() {
		return listeVehicule;
	}

	public void setListeVehicule(ArrayList<Vehicule> listeVehicule) {
		this.listeVehicule = listeVehicule;
	}

	public static int getCompteur() {
		return compteur;
	}

	public static void setCompteur(int compteur) {
		Vehicule.compteur = compteur;
	}


	
}
