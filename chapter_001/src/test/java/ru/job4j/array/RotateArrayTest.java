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
public class RotateArrayTest {
/**
* Test поворот массива 2x2.
*/
	@Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rotar = new RotateArray();
		int[][] mas = {{1, 2}, {3, 4}};
		int[][] resultArray = rotar.rotate(mas);
		int[][] expectedArray = {{3, 1}, {4, 2}};
		assertThat(resultArray, is(expectedArray));
    }
/**
* Test поворот массива 3x3.
*/
	@Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray rotar = new RotateArray();
		int[][] mas = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] resultArray = rotar.rotate(mas);
		int[][] expectedArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(resultArray, is(expectedArray));
    }
}