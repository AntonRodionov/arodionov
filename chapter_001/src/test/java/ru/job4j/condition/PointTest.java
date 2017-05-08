package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Anton Rodionov
* @version $Id$
*/
public class PointTest {
/**
* Test точка принадлежит прямой.
*/
	@Test
    public void pointIn() {
        Point tochka = new Point(2, 4);
        boolean result = tochka.is(1, 2);
        boolean expected = true;
        assertThat(result, is(expected));
    }
/**
* Test точка не принадлежит прямой.
*/
	@Test
    public void pointOut() {
        Point tochka = new Point(2, 4);
        boolean result = tochka.is(2, 2);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}