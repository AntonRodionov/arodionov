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
        System.out.println("MENU:");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        int id = 1;
        Tracker tracker = new Tracker();
        Input input = new ConsoleInput();
        String request = input.ask("choose menu options:");
        while (Integer.parseInt(request) != 6) {
            switch (Integer.parseInt(request)){
                case 0:
                    String name0 = input.ask("Enter name:");
                    String desc0 = input.ask("Enter description");
                    Item item0 = new Item (Integer.toString(id), name0, desc0);
                    tracker.add(item0);
                    id++;
                    break;
                case 1:
                    for (Item  item2 : tracker.findAll()) {
                        System.out.println("id:" + item2.getId() + "   name: " + item2.getName() + "   description: " + item2.getDesc());
                    }
                    break;
                case 2:
                    String id2 = input.ask("Enter task id:");
                    String name2 = input.ask("Enter new name:");
                    String desc2 = input.ask("Enter new description:");
                    Item item2 = new Item (id2, name2, desc2);
                    tracker.update(item2);
                    break;
                case 3:
                    String id3 = input.ask("Enter task id:");
                    Item item3 = new Item(id3);
                    tracker.delete(item3);
                    break;
                case 4:
                    String id4 = input.ask("Enter task id:");
                    System.out.println("id:" + tracker.findById(id4).getId() + "   name: " + tracker.findById(id4).getName() + "   description: " + tracker.findById(id4).getDesc());
                    break;
                case 5:
                    String name5 = input.ask("Enter task name:");
                    for (Item  item5 : tracker.findByName(name5)) {
                        if (item5 != null) {
                            System.out.println("id:" + item5.getId() + "   name: " + item5.getName() + "   description: " + item5.getDesc());
                        }
                        else {
                            System.out.println("this name tasks doesn't exist");
                        }
                    }
                    break;
                default:
                    System.out.println("incorrect input, try again");
            }
            request = input.ask("choose menu options:");
        }
        System.out.println("Close program, thank you for using");






    }
}
