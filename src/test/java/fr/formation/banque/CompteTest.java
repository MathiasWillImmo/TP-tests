package fr.formation.banque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CompteTest {
	
	public Compte compte;
	
	@BeforeClass
	public static void start() {
		System.out.println(">> debut des tests ");
	}
	
	@AfterClass
	public static void fin() {
		System.out.println(">> fin des tests");
	}
	
	@Before
	public void creationCompte() {
		System.out.println("---- creation du compte ------");
		compte = new Compte(1, 2, "client test");
	}
	
	@After
	public void suppressionCompte() {
		System.out.println("---- suppression du compte ---");
		
	}

	/**
	 * test 1
	 */
	@Test
	public void testGetNumero() {
		// (expected, actual)
		assertEquals(1, compte.getNumero());
		
		System.out.println("id compte : " + compte.getNumero()  + " | Attendu : 1" );
	}
	
	/**
	 * test 2
	 */
	@Test
	public void testSetNumero() {
		
		long numero = 456987123;
		// (expected, actual)
		compte.setNumero(numero);
		assertEquals(numero, compte.getNumero());
		
		System.out.println("id compte : " + compte.getNumero() + " | Attendu : " + numero);
	}
	
	/**
	 * test 3
	 */
	@Test
	public void testGetSolde() {
		
		System.out.println("solde : " + compte.getSolde()  + " | Attendu : 1");
		// (expected , actual, delta possible)
		assertEquals(1,compte.getSolde() , 0);
	}
	
	/**
	 * test 4
	 */
	@Test
	public void testSetSolde() {
		
		double soldeTest = 1000;
		compte.setSolde(soldeTest);
		
		System.out.println("solde : " + compte.getSolde()  + " | Attendu : " + soldeTest);
		// (expected , actual, delta possible)
		assertEquals(soldeTest,compte.getSolde() , 0);
	}
	
	/**
	 * test 5
	 */
	@Test
	public void testGetClient() {
		
		System.out.println("Client : " + compte.getReferenceClient()  + " | Attendu : client test");
		// (expected, actual)
		assertEquals("client test", compte.getReferenceClient());
		
	}
	
	/**
	 * test 6
	 */
	@Test
	public void testSetClient() {
		String client = "963258741";
		compte.setReferenceClient(client);
		System.out.println("Client : " + compte.getReferenceClient() + " | Attendu : " + client);
		// (expected, actual)
		assertEquals(client, compte.getReferenceClient());
		
	}
	
	/**
	 * test 7
	 */
	@Test
	public void testCompte() {
		// test de constructeur sans paramètre
		Compte compteTest = new Compte();
		assertNotNull(compteTest);
 		
	}
	
	/**
	 * test 8
	 */
	@Test
	public void testCompteParam() {
		// test de constructeur sans paramètre
		Compte compteTest = new Compte(150, 123, "clienttestparam");
		assertNotNull(compteTest);
		assertEquals(150, compteTest.getNumero());
		assertEquals(123,compteTest.getSolde() , 0);
		assertEquals("clienttestparam", compteTest.getReferenceClient());
	}
}
