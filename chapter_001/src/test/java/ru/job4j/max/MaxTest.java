package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Anton Rodionov
* @version $Id$
*/
public class MaxTest {
/**
* Test все числа различны.
*/
	@Test
    public void firstNumberIsBigger() {
        Max sravn = new Max();
        int result = sravn.max(5, 2, 7);
        int expected = 7;
        assertThat(result, is(expected));
    }
/**
* Test 2 числа равны.
*/
	@Test
    public void numbersAreEqual() {
        Max sravn = new Max();
        int result = sravn.max(5, 5, 9);
        int expected = 9;
        assertThat(result, is(expected));
    }

}