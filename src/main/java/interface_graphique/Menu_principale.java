package interface_graphique;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import constantes.Pargraphes;

public class Menu_principale extends Application{



    public void parametrage_fenetre_principale(Stage fenetre)
    {
        //Color couleur = Color.GREY;
        int espace = 100;
        String nom_fenetre_princile = "DACTYLO-GAME";
        VBox parent = new VBox(espace);

        Label text_affiche = new Label(Pargraphes.PARAGRAPHE_1);
        TextArea saisie_utilisateur = new TextArea();

        parent.getChildren().addAll(text_affiche, saisie_utilisateur);
        gestion_emplacement_enfants(parent);



        Scene scene = new Scene(parent);
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

    public void gestion_emplacement_enfants(VBox elements)
    {
        elements.setAlignment(Pos.CENTER);
    }

    @Override
    public void start(Stage fenetre_principale) throws Exception
    {
        this.parametrage_fenetre_principale(fenetre_principale);
    }
}
