package ru.job4j.calculator;
/**
* Class Maximum.
* @author arodionov
* @since 08.05.2017
*/

public class Max {
/**
*���� ��� �������� ����������.
*/
	private int result;
/**
*���������� �������� �����.
*@param first - ������ �����.
*@param second - ������ �����.
*@return - ������������ �����.
*/
    public int max(int first, int second) {
        this.result = first > second ? first : second;
		return this.result;
    }
}