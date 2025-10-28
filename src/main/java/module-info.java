module dk.easv.wordsearch {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.wordsearch to javafx.fxml;
    exports dk.easv.wordsearch;
    exports dk.easv.wordsearch.gui;
    opens dk.easv.wordsearch.gui to javafx.fxml;
}