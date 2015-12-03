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
        System.out.println("Début des tests sur histo");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Fin des test sur histo");
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        System.out.println("Test Ok");
    }

    /**
     * Test of remplissageVecteur method, of class HistoVect.
     */
    @Test
    public void testRemplissageVecteur() {
        System.out.println("remplissageVecteur");
        // création matrice particulière
        int matriceTest[][];
        matriceTest = new int[2][3];
        matriceTest[0][0] = 255;
        matriceTest[0][1] = 16;
        matriceTest[0][2] = 40;
        matriceTest[1][0] = 40;
        matriceTest[1][1] = 16;
        matriceTest[1][2] = 40;
         //creation du vecteur voulu
        // décalage des indices de 1 en comptant le 0
        int[] vecteurVoulu;
        vecteurVoulu = new int[256];
        vecteurVoulu[255] = 1;
        vecteurVoulu[40] = 3;
        vecteurVoulu[16] = 2;

        //création du vecteur à partir de la classe
        HistoVect histoVect = new HistoVect();
        histoVect.remplissageVecteur(matriceTest);

        //assertion
        for (int i = 0; i < 256; i++) {
            assertEquals(vecteurVoulu[i], histoVect.getVecteur()[i]);
        }
    }

    /**
     * Test of afficheVecteur method, of class HistoVect.
     */
    @Test
    public void testAfficheVecteur() {
        System.out.println("Test affiche Vecteur");
        int[] vecteurParticulier;
        vecteurParticulier= new int [4];
        vecteurParticulier[0]=1;
        vecteurParticulier[1]=2;
        vecteurParticulier[2]=3;
        vecteurParticulier[3]=4;
        HistoVect histoVect= new HistoVect(vecteurParticulier);
        System.out.println("affichage du vecteur (1,2,3,4)");
        histoVect.afficheVecteur();
        
    }

    /**
     * Test of afficheVecteurDetailler method, of class HistoVect.
     */
    @Test
    public void testAfficheVecteurDetailler() {
        System.out.println("afficheVecteurDetailler");
        System.out.println("Pareil que précédement");
    }

    /**
     * Test of getVecteur method, of class HistoVect.
     */
    @Test
    public void testGetVecteur() {

    }

    /**
     * Test of setVecteur method, of class HistoVect.
     */
    @Test
    public void testSetVecteur() {

    }

    /**
     * Test of maximumVecteur method, of class HistoVect.
     */
    @Test
    public void testMaximumVecteur() {
        System.out.println("maximumVecteur");
        int[] vecteurParticulier;
        vecteurParticulier= new int [4];
        vecteurParticulier[0]=1;
        vecteurParticulier[1]=4;
        vecteurParticulier[2]=2;
        vecteurParticulier[3]=3;
        HistoVect histoVect= new HistoVect(vecteurParticulier);
        assertEquals(histoVect.maximumVecteur(),4);
         int[] vecteurParticulier1;
        vecteurParticulier1= new int [4];
        vecteurParticulier1[0]=1;
        vecteurParticulier1[1]=4;
        vecteurParticulier1[2]=4;
        vecteurParticulier1[3]=3;
        assertEquals(histoVect.maximumVecteur(),4);
    }

}
