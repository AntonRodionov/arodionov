package ru.job4j.calculator;
/**
* Class Calculator.
* @author arodionov
* @since 08.05.2017
*/

public class Calculator {
/**
*���� ��� �������� ����������.
*/
	private double result;
/**
*��������.
*@param first - ������ ���������.
*@param second - ������ ���������.
*/
    public void add(double first, double second) {
        this.result = first + second;
    }

/**
*���������.
*@param first - �����������.
*@param second - ����������.
*/
	public void substract(double first, double second) {
        this.result = first - second;
    }
/**
*�������.
*@param first - �������.
*@param second - ��������.
*/

	public void div(double first, double second) {
        this.result = first / second;
    }
/**
*���������.
*@param first - ������ ���������.
*@param second - ������ ���������.
*/
	public void multiple(double first, double second) {
        this.result = first * second;
    }
/**
*����������� ����������.
*@return - ���������.
*/
    public double getResult() {
        return this.result;
    }
}