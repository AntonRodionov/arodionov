package ru.job4j.mytracker;

/**
 * Class Tracker.
 * @author arodionov
 * @since 16.05.2017
 */
public class Tracker{
    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    private Item[] items = new Item[100];
/**
 *добавляет заявку, переданную в аргументах в массив заявок this.items.
 *@param item - заявка.
 *@return - возвращает заявку добавленную в трэкер.
 */
    public Item add(Item item){
        System.arraycopy(this.items, 0, this.items, 1, 99);
        this.items[0] = item;
        return item;
    }
/**
 * заменяет ячейку в массиве this.items.
 * Для этого необходимо найти ячейку в массиве по id (id у Item можно получить с помощью метода getId).
 * Обязательно принимать один параметр Item, а не список полей;
 * @param item - заявка.
 */
    public void update(Item item){
        for (int i = 0; i < 100; i++) {
            if (this.items[i].getId() == item.getId()){
                this.items[i] = item;
                break;
            }
        }
    }
/**
 * удаляет ячейку в массиве this.items.
 * Для этого необходимо найти ячейку в массиве по id. После этого присвоить ей null,
 * либо сместить все значения справа от удаляемого элемента - на одну ячейку влево с помощью System.arrayCopy();
 * @param item - заявка.
 */
    public void delete(Item item){
        for (int i = 0; i < 100; i++) {
            if (this.items[i].getId() == item.getId()){
                System.arraycopy(this.items, i + 1, this.items, i, 100 - i - 1);
                break;
            }
        }
    }
/**
 * возвращает копию массива this.items без null элементов.
 * @return - возвращает массив заявок.
 */
    public Item[] findAll(){
        int j = 0;
        int k = 0;
        for (int i = 0; i < 100; i++) {
            if (this.items[i] != null){j++;}
        }
        Item[] copyArray = new Item[j];
        for (int l = 0; l < 100; l++) {
            if (this.items[l] != null){
                copyArray[k] = this.items[l];
                k++;
            }
        }
        return copyArray;
    }
/**
 * ищет заявку, переданную в аргументах в массиве заявок this.items.
 * проверяет в цикле все элементы массива this.items, сравнивая name
 * (используя метод getName класса Item) с аргументом метода String key.
 * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
 *@param key - имя заявки.
 *@return - возвращает перечень заявок с искомым именем.
 */
    public Item[] findByName(String key){
        int j = 0;
        int k = 0;
        for (int i = 0; i < 100; i++) {
            if (this.items[i] == null){break;}
            if (this.items[i].getName() == key){j++;}
        }
        Item[] copyArray = new Item[j];
        for (int l = 0; l < 100; l++) {
            if (this.items[l].getName() == key){
                copyArray[k] = this.items[l];
                k++;}
            if (k == j){break;}
        }
        return copyArray;
        }
/**
 * проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id и возвращает найденный Item.
 * Если Item не найден - возвращает null.
 * @param id - уникальный номер заявки.
 * @return - возвращает заявку с искомым id.
 */
    public Item findById(String id) {
        Item itm;
        itm = null;
        for (int i = 0; i < 100; i++) {
            if (this.items[i] == null){break;}
            if (this.items[i].getId() == id){
                itm = this.items[i];
                break;
            }
        }
        return itm;
    }

}
