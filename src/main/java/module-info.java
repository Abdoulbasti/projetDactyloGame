module projetDactyloGame {
    requires  javafx.graphics;
    requires javafx.controls;
    requires org.fxmisc.richtext;
    requires javafx.fxml;
    requires  javafx.base;

    exports interface_graphique;
    exports jeu;
    exports constantes;
    //exports mode_solo;
    //exports mode_solo.mode_jeu;
    //exports mode_solo.mode_normal;
    //exports multi_jeu;

    //opens javafxtoto;
    opens jeu;
}