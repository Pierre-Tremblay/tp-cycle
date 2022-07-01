package jre.tp.tpcycles.bo;

import java.time.LocalDate;

public class Velo extends Cycle {
	private int nbVitesses;

	/**
	 * Constructeur de Velo
	 * 
	 * @param dateAchat  date d'achat du v�lo
	 * @param marque     marque du v�lo
	 * @param modele     mod�le du v�lo
	 * @param nbVitesses nombre de vitesses du v�lo
	 */
	public Velo(LocalDate dateAchat, String marque, String modele, int nbVitesses) {
		super(dateAchat, marque, modele);
		this.nbVitesses = nbVitesses;
	}

	/**
	 * {@inheritDoc}
	 *
	 */
	@Override
	public double getTarifLocationHeure() {
		return 4.9;
	}

	/**
	 * {@inheritDoc}
	 *
	 */
	@Override
	public String toString() {
		return String.format("%s %d vitesse%s", super.toString(), this.nbVitesses, this.nbVitesses > 1 ? "s" : "");
	}
}