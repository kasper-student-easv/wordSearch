package dk.easv.wordsearch.dal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WordsData {
    private List<String> Words;
    private final String WordsPath ="src/main/java/dk/easv/wordsearch/data/brit-a-z.txt";
    private final String historyPath ="src/main/java/dk/easv/wordsearch/data/history.txt";
    private List<String> history;

    public WordsData()
    {
        Words = new ArrayList<>();
        history = new ArrayList<>();
    }
    public List<String> getWords()
    {
        if(Words.isEmpty()) {
            try (BufferedReader br = new BufferedReader(new FileReader(WordsPath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    Words.add(line);
                }
                return Words;

            } catch (IOException e) {
                return null;
            }
        }
        else
        {
            return Words;
        }

    }

    public List<String> getHistory() {
        if(history.isEmpty()) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(historyPath));
                String line;
                while ((line = br.readLine()) != null) {
                    history.add(line);
                }
                return history;
            }
            catch (IOException e) {
                return null;
            }
        }
        else
        {
            return history;
        }
    }
    public void writeHistory(String line) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(historyPath,true));
            bw.write(line);
        }
        catch (Exception e){
            
        }
    }
}

