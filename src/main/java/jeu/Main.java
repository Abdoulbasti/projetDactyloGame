package jeu;
import constantes.Paragraphes;
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
            StyleClassedTextArea textArea3 = new StyleClassedTextArea();
            textArea1.replaceText("Lorem Ipsum");
            textArea2.replaceText(Paragraphes.PARAGRAPHE_1);

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
            textArea1.setWrapText(true);

            textArea1.setOnKeyPressed((e) ->action(e));

            //textArea2.getStyleClass().add("red-background");
            //textArea1.setStyle();
            textArea1.setStyleClass( 5, 9, "red");
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
