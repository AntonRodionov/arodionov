package ru.job4j.mytracker;

/**
 * Created by Ant on 18.05.2017.
 */
public class StartUI {
    private Input input;

    public StartUI(Input input) {
        this.input = input;
    }
    /**public void init(){
        System.out.println("Choose menu options");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
        Tracker tracker = new Tracker();
        }*/


    public static void main(String[] args) {
        System.out.println("Choose menu options");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
        Tracker tracker = new Tracker();
        Input input = new ConsoleInput();
        //new StartUI(input).init();

    }
}
