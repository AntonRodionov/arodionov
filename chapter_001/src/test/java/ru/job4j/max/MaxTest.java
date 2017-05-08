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
* Test первое число больше.
*/
	@Test
    public void firstNumberIsBigger() {
        Max sravn = new Max();
        int result = sravn.max(5, 2);
        int expected = 5;
        assertThat(result, is(expected));
    }
/**
* Test второе число больше.
*/
	@Test
    public void secondNumberIsBigger() {
        Max sravn = new Max();
        int result = sravn.max(2, 5);
        int expected = 5;
        assertThat(result, is(expected));
    }
/**
* Test числа равны.
*/
	@Test
    public void numbersAreEqual() {
        Max sravn = new Max();
        int result = sravn.max(5, 5);
        int expected = 5;
        assertThat(result, is(expected));
    }

}