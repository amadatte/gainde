package sn.douane.gainde.service;

public class EditionManifeste implements IRechercheManifeste {

	public String rechercheByDirect(String annee, String bur, Integer num) {
		String num�ro = annee + "/" + bur + "/" + num;

		System.out.println("Le num�ro complet du Manifeste est : " + num�ro);

		return num�ro;

	}

}