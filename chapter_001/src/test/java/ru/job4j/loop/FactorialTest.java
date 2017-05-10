package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Anton Rodionov
* @version $Id$
*/
public class FactorialTest {
/**
* Test вычисление факториала для числа 5.
*/
	@Test
    public void factFive() {
        Factorial fact = new Factorial();
		int result = fact.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }
/**
* Test вычисление факториала для числа 0.
*/
	@Test
    public void factNull() {
        Factorial fact = new Factorial();
		int result = fact.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}