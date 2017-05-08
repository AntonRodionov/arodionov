package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Anton Rodionov
* @version $Id$
*/
public class CalculatorTest {
/**
* Test add.
*/
	@Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
/**
* Test Sub.
*/
	public void whenSubstract() {
        Calculator calc = new Calculator();
        calc.substract(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
/**
* Test Div.
*/
	public void whenDiv() {
        Calculator calc = new Calculator();
        calc.div(6D, 2D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }
/**
* Test Mult.
*/
	public void whenMult() {
        Calculator calc = new Calculator();
        calc.multiple(5D, 3D);
        double result = calc.getResult();
        double expected = 15D;
        assertThat(result, is(expected));
    }
}