package jeu;
import constantes.Paragraphes;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import org.fxmisc.richtext.StyleClassedTextArea;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try
        {
            VBox root = new VBox();

            StyleClassedTextArea textArea1 = new StyleClassedTextArea();
            StyleClassedTextArea textArea2 = new StyleClassedTextArea();
            textArea2.replaceText(Paragraphes.PARAGRAPHE_2);

            //textArea3.replaceText("message...");


            textArea1.setStyle("-fx-font-size: 20px; -fx-background-color: grey");
            textArea2.setStyle("-fx-font-size: 20px; -fx-background-color: white");
            //textArea3.setStyle("-fx-font-size: 20px; -fx-background-color: yellow");

            //textArea1.minHeight(30);
            //textArea1.minWidth(30);
            //textArea1.setPrefHeight(30);
            textArea1.setPrefSize(280, 280);
            textArea2.setPrefSize(280, 280);

            textArea2.setEditable(false);
            //textArea1.setWrapText(true);
            textArea2.setWrapText(true);

            //textArea1.setOnKeyPressed((e) ->action(e));

            /* Pour lire */
            /*textArea1.setOnInputMethodTextChanged(event -> {
                System.out.println("Du texte a été entré dans la zone de texte");
            });*/

            /*textArea1.textProperty().addListener(
                    (observable, ancienValeur, nouvelleValeur)->
                    {
                        Recuperer ce qui à été taper au clavier
                        System.out.println(observable.getValue());
                        System.out.println(observable.);
                        if (nouvelleValeur.length() < ancienValeur.length()) {
                            System.out.println("Un caractère a été supprimé !");
                        }
                        else
                        {
                            System.out.println("Un caractère est ajouté !");
                        }
                    }*/
            //);*/
            /*textArea1.setOnInputMethodTextChanged(event -> {
                System.out.println("Du texte a été entré dans la zone de texte");
            });
            TextArea text = new TextArea();*/
            //text.setOnk

            //Important recuperer les elements caractère par caractère
            textArea1.setOnKeyTyped(e -> System.out.println(e.getCharacter()));

            /*textArea1.selectionProperty().addListener((observable, oldValue, newValue) -> {
                System.out.println(observable.);
                //System.out.println("La sélection de texte a été modifiée");
            });*/

            textArea1.setOnInputMethodTextChanged(event -> {
                System.out.println("Du texte a été entré dans la zone de texte");
            });

            //textArea2.getStyleClass().add("red-background");
            //textArea1.setStyle();
            //textArea1.setStyleClass( 5, 9, "red");
            root.getChildren().addAll(textArea1, textArea2);
            Scene scene = new Scene(root, 900, 600);
            //scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

            primaryStage.setTitle("DACTYLO-GAME");
            primaryStage.setScene(scene);
            //scene.getStylesheets().add("jeu/style.css");
            primaryStage.show();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void actionOnprecced()
    {

    }

    public void actionSupprimerCaractere()
    {

    }

    public void action(KeyEvent e)
    {
        System.out.println("Un caractère est taper");
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
