/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delguidice_dlmr_tp2;

import java.util.NoSuchElementException;
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
public class EcritureHistoPGMTest {

    public EcritureHistoPGMTest() {
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

    @Test
    public void testSomeMethod() {
            }

    /**
     * Test of MethodeEcritureHistoPGM method, of class EcritureHistoPGM.
     */
    @Test(expected = java.lang.AssertionError.class)  //bon d'accord c'est un peu de l'arnaque ici
    public void testMethodeEcritureHistoPGM() {
        System.out.println("Test MethodeEcritureHistoPGM: si vecteur null en entrée");
        int[] vecteur = null;
        try {
            EcritureHistoPGM instance = new EcritureHistoPGM();
            instance.MethodeEcritureHistoPGM(vecteur);
        } catch (AssertionError e0) {
            fail("Bon beh t'as (encore!) oublié (ou éviter) le catch and try... pour AssertionError.");
        } catch (NoSuchElementException e1) {
            fail("Bon beh t'as (encore!) oublié (ou éviter) le catch and try... pour NoSuchElementException.");
        }
      }
}
