package dk.easv.wordsearch.gui;

import dk.easv.wordsearch.bll.WordsLogic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class WordSearchController implements Initializable
{

    private WordsLogic wordsLogic = new WordsLogic();
    @FXML
    private ListView lstWords;
    @FXML
    private ListView lstHistory;
    @FXML
    private ListView lstN;
    @FXML
    private ListView lstA;
    @FXML
    private TextField txtSearchWord;
    @FXML
    private Label lblWordCount;
    @FXML
    private Label lblSearchResult;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        for (String word: wordsLogic.getWords()) {
            lstWords.getItems().add(word);
        }
    }

    @FXML
    private void onClickClearHistory(ActionEvent actionEvent) {
    }

    @FXML
    private void onClickSearch(ActionEvent actionEvent) {
    }
}

