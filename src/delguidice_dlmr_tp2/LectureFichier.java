/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delguidice_dlmr_tp2;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Quentin
 */
public class LectureFichier {
    // commentaire inutile
    //attributs
    /**
     * Attribut 1/3. String addresse ou nom du fichier .PGM à lire.
     */
    private String nomFichierImage;
    /**
     * Attribut 2/3. BufferedReader Le BufferReader.
     */
    private BufferedReader reader;
    /**
     * Attribut 3/3 int[][] La matrice où l'on stocke les niveaux de gris (int)
     * de chaque pixel.
     */
    private int matriceImage[][];

    /**
     * Constructeur
     *
     * @param nomACharger nom du fichier à charger sans l'extension
     */
    public LectureFichier() {
    }
    
    public void lectureNomFichier(String nomACharger){
        try {
            this.nomFichierImage = nomACharger;
            //ouverture fichier    
            System.out.println("Ouverture du fichier...");
            BufferedReader fichier = new BufferedReader(new FileReader(nomFichierImage + ".pgm"));
            System.out.println("Fichier Ouvert");

            //traitement
            String line;
            String delimiteurs = " ,.:_-\t";
            line = fichier.readLine(); // lecture des 2 premières lignes inutile
            line = fichier.readLine();
            //arrivée troisième ligne (taille matrice)
            line = fichier.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line, delimiteurs);
            String tailleChaineAbcisse = tokenizer.nextToken();
            String tailleChaineOrdonnee = tokenizer.nextToken();

            //Conversion des string en int
            int tailleEntiereAbcisse = Integer.parseInt(tailleChaineAbcisse);
            int tailleEntiereOrdonnee = Integer.parseInt(tailleChaineOrdonnee);

            //création de la matrice
            matriceImage = new int[tailleEntiereAbcisse][tailleEntiereOrdonnee];

            //lecture ligne vide
            line = fichier.readLine();

            //lecture première ligne des valeurs
            line = fichier.readLine();

            //indice de ligne à 0 au départ
            int i = 0;
            while (line != null) {
                StringTokenizer tokenizerParcours = new StringTokenizer(line, delimiteurs);
                for (int j = 0; j < tailleEntiereOrdonnee; j++) {
                    if (tokenizerParcours.hasMoreTokens()) {

                        //récupération du token contenant le niveau de gris
                        String niveauGrisCourant = tokenizerParcours.nextToken();

                        //cast en entier
                        int niveauGrisCourantEntier = Integer.parseInt(niveauGrisCourant);

                        //remplissage de la matrice
                        matriceImage[i][j] = niveauGrisCourantEntier;
                    }

                }
                // passage à la ligne suivante de la matrice
                i++;
                // passage à la ligne suivante dans le fichier
                line = fichier.readLine();
            }
            // fermeture du fichier
            fichier.close();
        }

        catch (FileNotFoundException e1) {
            System.out.println("");
            e1.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    /**
     * Méthode de lecture du fichier ligne par ligne. Pas de retour utilise les
     * attributs pour afficher le fichier de lecture ligne par ligne dans la
     * console
     */
    public void lecture() {
        try {
            String line;
            System.out.println("Ouverture du fichier...");
            BufferedReader fichier = new BufferedReader(new FileReader(nomFichierImage + ".pgm"));
            System.out.println("Fichier Ouvert");
            line = fichier.readLine();
            while (line != null) {
                System.out.println(line);
                line = fichier.readLine();
            }
            fichier.close();
            System.out.println("Fichier Fermé");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * getter 1/3.
     *
     * @return nomFichierImage de type String, le nom du fichier sans
     * l'extension
     *
     */
    public String getNomFichierImage() {
        return nomFichierImage;
    }

    /**
     * getter 1/3.
     *
     * @return un BufferedReader en attribut qui permet de lire dans un fichier
     */
    public BufferedReader getReader() {
        return reader;
    }

    /**
     * getter 1/3.
     *
     * @return retourne une matrice dont les valeurs sont des entiers
     * correspondant aux niveaux de gris
     */
    public int[][] getMatriceImage() {
        return matriceImage;
    }

    /**
     * Setter 1/3. adresse ou nom du fichier à lire
     *
     * @param nomFichierImage String
     */
    public void setNomFichierImage(String nomFichierImage) {
        this.nomFichierImage = nomFichierImage;
    }

    /**
     * Setter 2/3.
     *
     * @param reader
     */
    public void setReader(BufferedReader reader) {
        this.reader = reader;
    }

    /**
     * Setter 3/3.
     *
     * @param matriceImage
     */
    public void setMatriceImage(int[][] matriceImage) {
        this.matriceImage = matriceImage;
    }

    /**
     * La fonction affiche matrice utilise la matrice de niveaux de gris en
     * attributs d'une taille de 256x256 et afficher les termes 1 par 1
     *
     */
    public void afficheMatrice() {
        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 256; j++) {
                System.out.print(matriceImage[i][j]);
                System.out.print(" ");
            }
            System.out.println("");

        }
        int j = 0;

    }
}
