package ru.job4j.mytracker;

import java.util.*;
/**
 * Created by Ant on 18.05.2017.
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner (System.in);
    public String ask(String question){
        return scanner.nextLine();
    }
}
