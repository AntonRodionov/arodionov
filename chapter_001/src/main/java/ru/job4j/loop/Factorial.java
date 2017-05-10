package ru.job4j.loop;
/**
* Class Factorial.
* @author arodionov
* @since 10.05.2017
*/

public class Factorial {
/**
*Вычисление факториала числа .
*@param n - число для которого высчитывается факториал.
*@return - факториал.
*/
    public int calc(int n) {
		int s  = 1;
		for (int i = 1; i <= n; i++) {
			s = s * i;
		}
		return s;
	}
}
