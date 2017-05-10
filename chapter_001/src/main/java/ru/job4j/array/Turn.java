package ru.job4j.array;
/**
* Class Turn.
* @author arodionov
* @since 10.05.2017
*/

public class Turn {
/**
*"Переворачивание" массива.
*@param array - входной массив.
*@return - возвращает перевернутый массив.
*/
    public int[] back(int[] array) {
		int l = array.length;
		int p;
		for (int i = 0; i < l / 2; i++) {
			p = array[i];
			array[i] = array[l - i - 1];
			array[l - i - 1] = p;
		}
		return array;
	}
}
