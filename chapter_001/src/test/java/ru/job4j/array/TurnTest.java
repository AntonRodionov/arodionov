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
public class TurnTest {
/**
* Test нечетное количество элементов в массиве.
*/
	@Test
    public void nechetMass() {
        Turn trn = new Turn();
		int[] mass = {1, 2, 3, 4, 5};
		int[] resultArray = trn.back(mass);
		int[] expectedArray = {5, 4, 3, 2, 1};
		assertThat(resultArray, is(expectedArray));
    }
/**
* Test четное количество элементов в массиве.
*/
	@Test
    public void chetMass() {
        Turn trn = new Turn();
		int[] masss = {1, 2, 3, 4};
        int[] resultArray = trn.back(masss);
		int[] expectedArray = {4, 3, 2, 1};
		assertThat(resultArray, is(expectedArray));
    }
}