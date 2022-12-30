package mode_solo.mode_jeu;

import constantes.Paragraphes;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LesFiles {

    final static int   MAX_TAILLE_FILLE_PREMIERE = 15;
    final static int   MAX_TAILLE_FILLE_SECONDAIRE = 40;
    public static int positionMots = 0; //La position de depart doit être 0
    //public static int positionMotsSuivant = MAX_TAILLE_FILLE_PREMIERE; //La position de depart
    //public  static String [] stringsParagraphe = new String[MAX_TAILLE_FILLE_SECONDAIRE];// tableau pour stocker l'ensembe de tous les elements
    public static String [] stringsParagraphe = Paragraphes.PARAGRAPHE_2.split(" ");
    public static String [] chaineReelementTaper = new String[stringsParagraphe.length];

    public static ArrayDeque<String> filePremiere = new ArrayDeque<>(MAX_TAILLE_FILLE_PREMIERE);
    public static ArrayDeque<String> fileSecondaire = new ArrayDeque<>(MAX_TAILLE_FILLE_SECONDAIRE);
    //LesFiles queue = new LesFiles();



    public static void main(String[] args) {
        remplissagePremiereFile(filePremiere);
        //affichageMotsQueue(filePremiere);
        //System.out.println(positionMots);
        //System.out.println(stringsParagraphe[positionMots-1]);
        actionMotValide();
        actionMotValide();
        actionMotValide();
        actionMotSupprime();
        actionMotSupprime();
        actionMotSupprime();
        actionMotSupprime();
        actionMotSupprime();
        System.out.println(stringsParagraphe[positionMots-1]);

    }


    //Test ok
    public static void remplissagePremiereFile(Queue<String> file)
    {
        //String[] words = str.split("\\s+");//str.split(" ");
        for (String word : stringsParagraphe) {
            if(file.size() < MAX_TAILLE_FILLE_PREMIERE)
            {
                file.add(word);
                positionMots++;
            }
        }
    }

    /*
    Lorsque le mot courant est validé.
    Enlever un element de la filePremiere et le rajouter dans la fileSecondaire, et ajouter l'element à l'indice suivant à la filePremiere*/
    //public static void enleverEtRemetreAutreElementFilePremiere(String[] tabTousMots)

    //Test ok
    public static void actionMotValide()
    {
        //Enlever l'element en tête de file
        String enleve = filePremiere.pollFirst();
        if(enleve!=null)
        {
            positionMots++;
            //stockerElementDansFileSecondaire(enleve); //On en a pas besoin

            //On arrête dès que positionMotsSuivant > stringsParagraphe.length
            if(positionMots < stringsParagraphe.length)
            {
                //Ajouter un element à la queue de la file
                filePremiere.add(stringsParagraphe[positionMots - 1]);
            }
        }
        else
        {
            System.out.println("la filePremiere est vide");
            System.out.println(enleve);
        }
    }

    /*
    Lorsque le mot est supprimer de la ligne

    Enlever un element de la fileSecondaire et le rajouter a la file premiere, et decrementer l'indice de position
    * */
    //Test ok
    public static void actionMotSupprime()
    {
        //Retirer la queue de la liste avec pollLast
        String enleve = filePremiere.pollLast();

        //Si on est à 0, c'est le tous premier mot
        if(positionMots >= 0)
        {
            positionMots--;
        }

        //Ajouter un element à la tête de la file
        boolean bool = filePremiere.offerFirst(stringsParagraphe[positionMots -1 ]);
        if(!bool){
            System.out.println("L'ajout de l'element en tête de file à echoué...");
        }

        //Retirer le denier
    }



    public static void stockerElementDansFileSecondaire(String element)
    {
        fileSecondaire.add(element);
    }


    //test ok
    public static void affichageMotsQueue(Queue<String> file)
    {
        while (!file.isEmpty()) {
            System.out.println(file.poll());
        }
    }
}
