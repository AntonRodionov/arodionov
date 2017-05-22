package ru.job4j.mytracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
/**
 * Class TrackerTest.
 * @author arodionov
 * @since 17.05.2017
 */
public class TrackerTest {
/**
 * Тест добавления элемента в начало массива
 */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("testID","testName");
        tracker.add(item);
        assertThat(tracker.getItems()[0], is(item));
    }
    /**
     * Тест изменеия элемента по Id
     */
    @Test
    public void whenUpdateItemById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("1","test1Name", "test1description");
        Item item2 = new Item("2","test2Name", "test2description");
        Item item3 = new Item("3","test3Name", "test3description");
        Item item4 = new Item("4","test4Name", "test4description");
        Item item5 = new Item("5","test5Name", "test5description");
        Item correctItem = new Item("3","testUpdateName", "testUpdateDescription");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        tracker.update(correctItem);
        assertThat(tracker.getItems()[2], is(correctItem));
    }
    /**
     * Тест удвления элемента по Id со сдвигом массива влево
     */
    @Test
    public void whenDeleteItemById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1_ID","test1Name");
        Item item2 = new Item("test2_ID","test2Name");
        Item item3 = new Item("test3_ID","test3Name");
        Item item4 = new Item("test4_ID","test4Name");
        Item item5 = new Item("test5_ID","test5Name");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        Item deleteItem = new Item("test3_ID");
        Item nullItem = null;
        tracker.delete(deleteItem);
        assertThat(tracker.getItems()[2], is(item4));
        assertThat(tracker.getItems()[3], is(item5));
        assertThat(tracker.getItems()[4], is(nullItem));
    }
    /**
     * Тест генерации массива без пустых (null) строчек
     */
    @Test
    public void whenReturnArrayWithoutNull() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1_ID","test1Name");
        Item item2 = new Item("test2_ID","test2Name");
        Item item3 = new Item("test3_ID","test3Name");
        Item item4 = new Item("test4_ID","test4Name");
        Item item5 = new Item("test5_ID","test5Name");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        Item[] resTracker = new Item[5];
        resTracker[0] = item1;
        resTracker[1] = item2;
        resTracker[2] = item3;
        resTracker[3] = item4;
        resTracker[4] = item5;
        assertThat(tracker.findAll(), is(resTracker));
        assertThat(tracker.getItems(), not(resTracker));
    }
    /**
     * Тест поиска элементов массива по неуникальному полю Name
     */
    @Test
    public void whenFindItemsByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1_ID","test1Name");
        Item item2 = new Item("test2_ID","test2Name");
        Item item3 = new Item("test3_ID","test3Name");
        Item item4 = new Item("test4_ID","test3Name");
        Item item5 = new Item("test5_ID","test5Name");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        Item[] resTracker = new Item[2];
        resTracker[0] = item3;
        resTracker[1] = item4;
        assertThat(tracker.findByName("test3Name"), is(resTracker));
    }
    /**
     * Тест поиска существующего элемента массива по уникальному полю Id
     */
    @Test
    public void whenFindItemsById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1_ID","test1Name");
        Item item2 = new Item("test2_ID","test2Name");
        Item item3 = new Item("test3_ID","test3Name");
        Item item4 = new Item("test4_ID","test4Name");
        Item item5 = new Item("test5_ID","test5Name");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        assertThat(tracker.findById("test2_ID"), is(item2));
    }
    /**
     * Тест поиска НЕсуществующего элемента массива по уникальному полю Id
     */
    @Test
    public void whenFindItemsByIdNotExist() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1_ID","test1Name");
        Item item2 = new Item("test2_ID","test2Name");
        Item item3 = new Item("test3_ID","test3Name");
        Item item4 = new Item("test4_ID","test4Name");
        Item item5 = new Item("test5_ID","test5Name");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        assertThat(tracker.findById("test6_ID"), is(nullValue()));
    }
}
