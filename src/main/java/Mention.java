/**
 * TP3 - Exercice 6
 *
 * @author Romy Chauvière
 */
import java.util.Scanner;
public class Mention {

    //Module (fonction) permettant de retourner une valeur comprise entre pfBorneInf et pfBorneSup
    public static double saisieC(double pfBorneInf, double pfBorneSup){
        double valeurC;
        Scanner clavier = new Scanner(System.in) ;
        System.out.println("Donnez une valeur comprise entre "+pfBorneInf+" et "+pfBorneSup+ "?");
        valeurC=clavier.nextDouble();
        while (valeurC<pfBorneInf || valeurC>pfBorneSup){
            System.out.println("Erreur ! Donnez une valeur comprise entre "+pfBorneInf+" et "+pfBorneSup+ "?");
            valeurC=clavier.nextDouble();
        }
        return valeurC;
    }

    // Calcule la somme des 3 notes entre 0 et 20 saisies au clavier
    public static void main(String[] args) {

        // Declaration des variables
        double note1, note2, note3 ;
        double somme ;
        double moyenne;
        String mention ;

        // Saisie des 3 notes
        System.out.println("Donnez la note 1");
        note1 = saisieC(0,20);
        System.out.println("Donnez la note 2");
        note2 = saisieC(0,20);
        System.out.println("Donnez la note 3");
        note3 = saisieC(0,20);

        // Calcul de la somme et de la moyenne
        somme = note1+ note2+ note3;
        moyenne = somme/3;

        //Mention
        if (moyenne < 10) {
            mention = "collé";
        }else {
            if (moyenne < 12) {
                mention = "passable";
            }else {
                if (moyenne < 14){
                    mention = "assez bien";
                }else {
                    if (moyenne < 16){
                        mention = "bien";
                    }else {
                        mention = "très bien";
                    }
                }
            } 
        } 
        //Affichage
        System.out.println("La moyenne des 3 notes est : "+ moyenne);
        System.out.println("Mention obtenue : "+ mention);
    }
} 