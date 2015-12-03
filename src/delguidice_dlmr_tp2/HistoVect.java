package delguidice_dlmr_tp2;


/**
 *
 * @author Romain
 */
public class HistoVect {

    private int[] vecteur;

    /**
     *Constructeur 
     * @param M Attention le constructeur prend en paramètre la matrice correspondant au fichier .PGM.
     * Cette matrice doit d'abord être remplit par la classe LectureFichier.
     * 
     * Description: construit le vecteur où sont stockés les valeurs niveau de gris.
     * A la case i de "vecteur" correspond le nombre d'occurrence de la valeur i dans la matrice
     * correspondant au fichier PGM.
     * 
     */
    public HistoVect(int[][] M) {
        int taille = M.length;
        //initialisation du vecteur au valeurs 0
        vecteur = new int[taille];
        //remplissage du vecteur de l'histogramme
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                vecteur[M[i][j]]++;
            }
        }
    }
    
    public void afficheVecteur() {
        for (int i = 0; i < vecteur.length; i++) {
            System.out.print(" "+vecteur[i]+" ");
        }
    }
     public void afficheVecteurDetailler() {
        for (int i = 0; i < vecteur.length; i++) {
            System.out.println("Gris"+i+" : "+vecteur[i]+" ");
        }
    }

    /**
     *Getter de vecteur
     * @return vecteur d'entier, correspondant à l'histogramme.
     */
    public int[] getVecteur() {
        return vecteur;
    }

    /**
     *Setter de vecteur
     * Prend un vecteur d'entier en paramètre.
     * @param vecteur
     */
    public void setVecteur(int[] vecteur) {
        this.vecteur = vecteur;
    }

    public int maximumVecteur(){
        int max=0;
        for(int i=0;i<vecteur.length;i++){
            if(vecteur[i]>max){
                max=vecteur[i];
            }
        }
        return max;
    }
}
