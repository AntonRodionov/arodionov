package ru.job4j.calculator;
/**
* Class Maximum.
* @author arodionov
* @since 08.05.2017
*/

public class Max {
/**
*Поле для хранения результата.
*/
	private int result;
/**
*Нахождение большего числа.
*@param first - первое число.
*@param second - второе число.
*@return - максимальное число.
*/
    public int max(int first, int second) {
        this.result = first > second ? first : second;
		return this.result;
    }
}