package day1;

import java.time.LocalDate;

public class Voiture {
	
	String marque;
	String modele;
	int vitesseMax;
	LocalDate dateImmatriculation;
	
	static int nbreVoiture = 0;
	
	public Voiture() {} // constructeur par d�faut
	
	// constructeur avec param�tres
	public Voiture(String marque, String modele, int vitesseMax, LocalDate dateImmatriculation) {
		this.marque = marque;
		this.modele = modele;
		this.vitesseMax = vitesseMax;
		this.dateImmatriculation = dateImmatriculation;
		//nbreVoiture = nbreVoiture + 1;
		nbreVoiture++;
	}

	//@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", vitesseMax=" + vitesseMax
				+ ", dateImmatriculation=" + dateImmatriculation + "]";
	}
	
	public static void getNbreVoitures()  // m�thode de classe
	{
		System.out.println("Nbre de voitures en m�moire : "+nbreVoiture);
	}

}