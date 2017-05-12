package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Anton Rodionov
* @version $Id$
*/
public class ArrayDuplicateTest {
/**
* Test удаление дубликатов из массива.
*/
	@Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrdup = new ArrayDuplicate();
		String[] mas = {"Привет", "Мир", "Привет", "Супер", "Мир"};
		String[] resultArray = arrdup.remove(mas);
		String[] expectedArray = {"Привет", "Мир", "Супер"};
		assertThat(resultArray, is(expectedArray));
    }
}