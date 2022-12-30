package mode_solo.mode_jeu;

import constantes.Paragraphes;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LesFiles {

    final static int   MAX_TAILLE_FILLE_PREMIERE = 15;
    final static int   MAX_TAILLE_FILLE_SECONDAIRE = 40;
    public static int positionMotsSuivant = 0; //La position de depart doit être 0
    //public static int positionMotsSuivant = MAX_TAILLE_FILLE_PREMIERE; //La position de depart
    //public  static String [] stringsParagraphe = new String[MAX_TAILLE_FILLE_SECONDAIRE];// tableau pour stocker l'ensembe de tous les elements
    public static String [] stringsParagraphe = Paragraphes.PARAGRAPHE_2.split(" ");
    public static String [] chaineReelementTaper = new String[stringsParagraphe.length];

    public static ArrayDeque<String> filePremiere = new ArrayDeque<>(MAX_TAILLE_FILLE_PREMIERE);
    public static ArrayDeque<String> fileSecondaire = new ArrayDeque<>(MAX_TAILLE_FILLE_SECONDAIRE);
    //LesFiles queue = new LesFiles();



    public static void main(String[] args) {
        remplissagePremiereFile(filePremiere, MAX_TAILLE_FILLE_PREMIERE);
        affichageMotsQueue(filePremiere);
    }


    public static void remplissagePremiereFile(Queue<String> file, int taille)
    {
        //String[] words = str.split("\\s+");//str.split(" ");
        for (String word : stringsParagraphe) {
            if(file.size() < taille)
            {
                file.add(word);
            }
        }
    }

    /*
    Lorsque le mot courant est validé.
    Enlever un element de la filePremiere et le rajouter dans la fileSecondaire, et ajouter l'element à l'indice suivant à la filePremiere*/
    //public static void enleverEtRemetreAutreElementFilePremiere(String[] tabTousMots)

    public static void enleverEtAjoutSuivantElementFilePremiere()
    {
        String enleve = filePremiere.poll();
        if(enleve!=null)
        {
            positionMotsSuivant++;
            //stockerElementDansFileSecondaire(enleve); On en a pas besoin

            //On arrête dès que positionMotsSuivant > stringsParagraphe.length
            if(positionMotsSuivant < stringsParagraphe.length)
            {
                filePremiere.add(stringsParagraphe[positionMotsSuivant]);
            }
        }
        else
        {
            System.out.println("la filePremiere est vide");
        }
    }

    /*
    Lorsque le mot est supprimer de la ligne

    Enlever un element de la fileSecondaire et le rajouter a la file premiere, et decrementer l'indice de position
    * */
    public static void remetreEtEneleverAutreElementFilePremiere()
    {
        positionMotsSuivant--;

        //Ajouter un element à la fin de la file
        boolean bool = filePremiere.offerFirst(stringsParagraphe[positionMotsSuivant]);
        if(!bool){
            System.out.println("L'ajout de l'element en tête de file à echoué...");
        }
    }



    public static void stockerElementDansFileSecondaire(String element)
    {
        fileSecondaire.add(element);
    }

    public static void affichageMotsQueue(Queue<String> file)
    {
        while (!file.isEmpty()) {
            System.out.println(file.poll());
        }
    }
}
