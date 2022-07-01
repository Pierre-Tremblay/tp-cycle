package jre.tp.tpcycles.bo;

import java.time.LocalDate;

public class Gyroroue extends CycleElectrique {

	/**
	 * Constructeur
	 * 
	 * @param dateAchat   date d'achat du gyroroue
	 * @param marque      marque du gyroroue
	 * @param modele      mod�le du gyroroue
	 * @param autonomieKm autonomie du moteur en kilom�tres
	 */
	public Gyroroue(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
		super(dateAchat, marque, modele, autonomieKm);
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public double getTarifLocationHeure() {
		return 18.9;
	}
}
