/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delguidice_dlmr_tp2;
import java.io.*;
import java.io.IOException; 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
public class LectureFichierTest {
    
    public LectureFichierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Test Lecture fichier");
    }
    
    @AfterClass
    public static void tearDownClass() {
         System.out.println("Fin du test Lecture fichier");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of lectureNomFichier method, of class LectureFichier.
     */
    @Test
    public void testLectureNomFichier() {
        System.out.println("lectureNomFichier");
        System.out.println("Ouverture du fichier avec le nom lean au lieu de lena");
        LectureFichier lectureFausse=new LectureFichier();
        lectureFausse.lectureNomFichier("lean");
         System.out.println("Ouverture d'un fichier du même type contenant 4 valeurs (test)");
         // création matrice voulue
         int matriceTest[][];
         matriceTest= new int[2][2];
         matriceTest[0][0]=255;
         matriceTest[0][1]=0;
         matriceTest[1][0]=40;
         matriceTest[1][1]=16;
         //lecture fichier
         LectureFichier lectureTest=new LectureFichier();
         lectureTest.lectureNomFichier("test");
         //vérification de l'égalité
         assertEquals(lectureTest.getMatriceImage(),matriceTest);
         //la classe lecture fais appel au même code que lectureNom mais print (inutile de la tester)
        
    }

    /**
     * Test of lecture method, of class LectureFichier.
     */
    @Test
    public void testLecture() {
    }

    /**
     * Test of getNomFichierImage method, of class LectureFichier.
     */
    @Test
    public void testGetNomFichierImage() {
    }

    /**
     * Test of getReader method, of class LectureFichier.
     */
    @Test
    public void testGetReader() {
    }

    /**
     * Test of getMatriceImage method, of class LectureFichier.
     */
    @Test
    public void testGetMatriceImage() {
    }

    /**
     * Test of setNomFichierImage method, of class LectureFichier.
     */
    @Test
    public void testSetNomFichierImage() {
    }

    /**
     * Test of setReader method, of class LectureFichier.
     */
    @Test
    public void testSetReader() {

    }

    /**
     * Test of setMatriceImage method, of class LectureFichier.
     */
    @Test
    public void testSetMatriceImage() {

    }

    /**
     * Test of afficheMatrice method, of class LectureFichier.
     */
    @Test
    public void testAfficheMatrice() {

    }
    
}
