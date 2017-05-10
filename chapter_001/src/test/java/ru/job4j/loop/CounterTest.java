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
public class CounterTest {
/**
* Test вычисление суммы четных чисел в интервале.
*/
	@Test
    public void pointIn() {
        Counter diap = new Counter();
		int result = diap.add(3, 10);
        int expected = 28;
        assertThat(result, is(expected));
    }
}