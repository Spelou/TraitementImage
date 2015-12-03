/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delguidice_dlmr_tp2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Quentin
 */
public class HistoVectTest {
    
    public HistoVectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of remplissageVecteur method, of class HistoVect.
     */
    @Test
    public void testRemplissageVecteur() {
        System.out.println("remplissageVecteur");
        int[][] M = null;
        HistoVect instance = new HistoVect();
        instance.remplissageVecteur(M);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficheVecteur method, of class HistoVect.
     */
    @Test
    public void testAfficheVecteur() {
        System.out.println("afficheVecteur");
        HistoVect instance = new HistoVect();
        instance.afficheVecteur();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficheVecteurDetailler method, of class HistoVect.
     */
    @Test
    public void testAfficheVecteurDetailler() {
        System.out.println("afficheVecteurDetailler");
        HistoVect instance = new HistoVect();
        instance.afficheVecteurDetailler();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVecteur method, of class HistoVect.
     */
    @Test
    public void testGetVecteur() {
        System.out.println("getVecteur");
        HistoVect instance = new HistoVect();
        int[] expResult = null;
        int[] result = instance.getVecteur();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVecteur method, of class HistoVect.
     */
    @Test
    public void testSetVecteur() {
        System.out.println("setVecteur");
        int[] vecteur = null;
        HistoVect instance = new HistoVect();
        instance.setVecteur(vecteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maximumVecteur method, of class HistoVect.
     */
    @Test
    public void testMaximumVecteur() {
        System.out.println("maximumVecteur");
        HistoVect instance = new HistoVect();
        int expResult = 0;
        int result = instance.maximumVecteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
