package ru.job4j.loop;
/**
* Class Counter.
* @author arodionov
* @since 10.05.2017
*/

public class Counter {
/**
*Вычисление суммы четных чисел в заданном интервале .
*@param start - начало интервала.
*@param finish - конец интервала.
*@return - сумма.
*/
    public int add(int start, int finish) {
		int s  = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				s = s + i;
			}
		}
		return s;
	}
}
