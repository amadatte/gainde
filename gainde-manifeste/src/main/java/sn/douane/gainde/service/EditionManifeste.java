package sn.douane.gainde.service;

public class EditionManifeste implements IRechercheManifeste {

	public String rechercheByDirect(String annee, String bur, Integer num) {
		String numéro = annee + "/" + bur + "/" + num;

		System.out.println("Le numéro complet du Manifeste est : " + numéro);

		return numéro;

	}

}