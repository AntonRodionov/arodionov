package ru.job4j.mytracker;

/**
 * Created by RedKrab on 20.06.2017.
 */
public class StubInput implements Input {
    private String [] answers;
    private int position = 0;
    public StubInput(String [] answers){
        this.answers = answers;
    }
    public String ask (String question){
        return answers[position++];
    }
}
