package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Anton Rodionov
* @version $Id$
*/
public class TriangleTest {
/**
* Test вычисление ненулевой площади.
*/
	@Test
    public void pointIn() {
        Point tochkaA = new Point(2, 1);
		Point tochkaB = new Point(2, 4);
		Point tochkaC = new Point(6, 1);
        Triangle trglnk = new Triangle(tochkaA, tochkaB, tochkaC);
		double result = trglnk.area();
        double expected = 6;
        assertThat(result, closeTo(expected, 0.01));
    }
/**
* Test вычисление нулевой площади.
*/
	@Test
    public void pointOut() {
        Point tochkaA = new Point(2, 1);
		Point tochkaB = new Point(4, 2);
		Point tochkaC = new Point(6, 3);
        Triangle trglnk = new Triangle(tochkaA, tochkaB, tochkaC);
        double result = trglnk.area();
        double expected = 0;
        assertThat(result, is(expected));
    }
}