package ru.job4j.calculator;
/**
* Class Calculator.
* @author arodionov
* @since 08.05.2017
*/

public class Calculator {
/**
*Поле для хранения результата.
*/
	private double result;
/**
*Сложение.
*@param first - первое слагаемое.
*@param second - второе слагаемое.
*/
    public void add(double first, double second) {
        this.result = first + second;
    }

/**
*Вычитание.
*@param first - уменьшаемое.
*@param second - вычитаемое.
*/
	public void substract(double first, double second) {
        this.result = first - second;
    }
/**
*Деление.
*@param first - делимое.
*@param second - делитель.
*/

	public void div(double first, double second) {
        this.result = first / second;
    }
/**
*Умножение.
*@param first - первый множитель.
*@param second - второй множитель.
*/
	public void multiple(double first, double second) {
        this.result = first * second;
    }
/**
*Возвращение результата.
*@return - результат.
*/
    public double getResult() {
        return this.result;
    }
}