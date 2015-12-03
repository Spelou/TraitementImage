/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delguidice_dlmr_tp2;

/**
 *
 * @author Quentin
 */
public class DelGuidice_DLMR_TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenue dans le traitement d'image");
        System.out.println("");
        LectureFichier lectureSimple= new LectureFichier();
        lectureSimple.lectureNomFichier("lena");
        HistoVect vecto = new HistoVect();
        vecto.remplissageVecteur(lectureSimple.getMatriceImage());
        vecto.afficheVecteurDetailler();
        System.out.println(vecto.maximumVecteur());
        EcritureHistoPGM ecritureSimple=new EcritureHistoPGM();
        ecritureSimple.MethodeEcritureHistoPGM(vecto.getVecteur());
                
        
        }
    
}
