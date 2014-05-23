package sn.douane.gainde.service;

import org.junit.Assert;
import org.junit.Test;

public class TestService {

	@Test
	public void afficherManifeste() throws Exception {
		EditionManifeste em = new EditionManifeste();
		Assert.assertEquals("2014/10S/5000",
				em.rechercheByDirect("2014", "10S", 5000));
	}
}
