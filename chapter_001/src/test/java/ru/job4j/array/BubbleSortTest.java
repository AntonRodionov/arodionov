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
public class BubbleSortTest {
/**
* Test сортировка массива {5, 1, 2, 7, 3}.
*/
	@Test
    public void sortMass() {
        BubbleSort trn = new BubbleSort();
		int[] mass = {5, 1, 2, 7, 3};
		int[] resultArray = trn.sort(mass);
		int[] expectedArray = {1, 2, 3, 5, 7};
		assertThat(resultArray, is(expectedArray));
    }
}