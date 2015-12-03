/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delguidice_dlmr_tp2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Romain
 */
public class EcritureHistoPGM {

    private String nomNvFichier;
    BufferedWriter writer;

    public EcritureHistoPGM(int[] vecteur) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Donner le nom du fichier dans lequel sera enregistrer l'histogramme au format PGM: \n");
        nomNvFichier = scan.next();
        nomNvFichier += ".pgm";
        try {
            writer = new BufferedWriter(new FileWriter(nomNvFichier));

            writer.write("P2");
            writer.newLine();
            writer.write("#");
            writer.newLine();
            writer.write("2726 255");
            writer.newLine();
            writer.write("255");
            writer.newLine();
            for (int i = 0; i < vecteur.length; i++) {

                for (int j = 0; j < 1; j++) {

                    for (int p = 0; p < vecteur[i]; p++) {
                        writer.write("255");

                        writer.write("\t");
                        if ((p % 50) == 0) {
                            writer.newLine();
                        }
                    }
                    writer.newLine();

                    for (int q = vecteur[i]; q < 2726; q++) {
                        writer.write("0");
                        writer.write("\t");
                        if ((q % 50) == 0) {
                            writer.newLine();
                        }
                    }
                    writer.newLine();
                }
            }
        } catch (FileNotFoundException e1) {
            System.out.println("");
            e1.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }

    }

}
