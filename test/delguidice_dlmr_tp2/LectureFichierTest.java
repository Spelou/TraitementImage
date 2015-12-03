/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delguidice_dlmr_tp2;

import java.io.BufferedReader;
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
     * Test of lectureNomFichier method, of class LectureFichier.
     */
    @Test(expected=Exception.class)
    public void testLectureNomFichier() {
        System.out.println("lectureNomFichier");
        System.out.println("Ouverture du fichier avec le nom lean au lieu de lena");
        LectureFichier lectureFausse=new LectureFichier();
        lectureFausse.lectureNomFichier("lean");
    }

    /**
     * Test of lecture method, of class LectureFichier.
     */
    @Test
    public void testLecture() {
        System.out.println("lecture");
        LectureFichier instance = new LectureFichier();
        instance.lecture();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomFichierImage method, of class LectureFichier.
     */
    @Test
    public void testGetNomFichierImage() {
        System.out.println("getNomFichierImage");
        LectureFichier instance = new LectureFichier();
        String expResult = "";
        String result = instance.getNomFichierImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReader method, of class LectureFichier.
     */
    @Test
    public void testGetReader() {
        System.out.println("getReader");
        LectureFichier instance = new LectureFichier();
        BufferedReader expResult = null;
        BufferedReader result = instance.getReader();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatriceImage method, of class LectureFichier.
     */
    @Test
    public void testGetMatriceImage() {
        System.out.println("getMatriceImage");
        LectureFichier instance = new LectureFichier();
        int[][] expResult = null;
        int[][] result = instance.getMatriceImage();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomFichierImage method, of class LectureFichier.
     */
    @Test
    public void testSetNomFichierImage() {
        System.out.println("setNomFichierImage");
        String nomFichierImage = "";
        LectureFichier instance = new LectureFichier();
        instance.setNomFichierImage(nomFichierImage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReader method, of class LectureFichier.
     */
    @Test
    public void testSetReader() {
        System.out.println("setReader");
        BufferedReader reader = null;
        LectureFichier instance = new LectureFichier();
        instance.setReader(reader);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatriceImage method, of class LectureFichier.
     */
    @Test
    public void testSetMatriceImage() {
        System.out.println("setMatriceImage");
        int[][] matriceImage = null;
        LectureFichier instance = new LectureFichier();
        instance.setMatriceImage(matriceImage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficheMatrice method, of class LectureFichier.
     */
    @Test
    public void testAfficheMatrice() {
        System.out.println("afficheMatrice");
        LectureFichier instance = new LectureFichier();
        instance.afficheMatrice();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
