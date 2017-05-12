package ru.job4j.array;
/**
* Class RotateArray.
* @author arodionov
* @since 12.05.2017
*/

public class RotateArray {
/**
*Поворот массива.
*@param array - входной массив.
*@return - возвращает повернутый массив.
*/
    public int[][] rotate(int[][] array) {
		int razmer = array.length;
		int[][] rotArray = new int[razmer][razmer];
		for (int i = 0; i < razmer; i++) {
			for (int j = 0; j < razmer; j++) {
				rotArray[j][razmer - i - 1] = array[i][j];
			}
		}
		return rotArray;
	}
}
