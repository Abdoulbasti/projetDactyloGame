package javafxtoto;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class Test extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world !!");

        Application.launch(args); // Pour lancer notre fenêtre

        System.exit(0);
    }

    public void parametrage_fenetre_principale(Stage fenetre)
    {
        Color couleur = Color.GREY;
        String nom_fenetre_princile = "DACTYLO-GAME";
        Group root = new Group();
        Scene scene = new Scene(root, couleur);
        fenetre.setTitle(nom_fenetre_princile);
        this.logo_jeu(fenetre);
        caracteristiques_fenetres(fenetre);



        fenetre.setScene(scene);
        fenetre.show();
    }

    public void logo_jeu(Stage fenetre)
    {
        String nom_logo = "pngegg.png";
        Image logo  = new Image(nom_logo);
        fenetre.getIcons().add(logo);
    }

    public void caracteristiques_fenetres(Stage fenetre)
    {
        boolean changement_taille = true;
        double largeur = 1400, longeur = 1000;
        fenetre.setWidth(largeur);
        fenetre.setHeight(longeur);
        fenetre.setResizable(changement_taille);
        fenetre.centerOnScreen();
    }

    @Override
    public void start(Stage fenetre_principale) throws Exception
    {
        this.parametrage_fenetre_principale(fenetre_principale);
    }

}
