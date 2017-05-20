package ru.job4j.mytracker;

/**
 * Created by Ant on 18.05.2017.
 */
public class StartUI {
    private Input input;

    public StartUI(Input input) {
        this.input = input;
    }
    public void init(){
        String name = input.ask("Choose menu options");
        Tracker tracker = new Tracker();
        tracker.add(new Item(name,"first desc"));
        for (Item item : tracker.getItems()){
            System.out.println(item.getName());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }
}
