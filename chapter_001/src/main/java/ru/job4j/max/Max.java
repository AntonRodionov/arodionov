package ru.job4j.max;
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
*Нахождение большего числа из двух.
*@param first - первое число.
*@param second - второе число.
*@return - максимальное число.
*/
    public int max(int first, int second) {
        this.result = first > second ? first : second;
		return this.result;
    }
/**
*Нахождение большего числа из трех.
*@param first - первое число.
*@param second - второе число.
*@param third - третье число.
*@return - максимальное число.
*/
    public int max(int first, int second, int third) {
        this.result = max(max(first, second), third);
		return this.result;
    }
}