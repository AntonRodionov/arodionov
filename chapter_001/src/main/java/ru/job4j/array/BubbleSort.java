package ru.job4j.array;
/**
* Class BubbleSort.
* @author arodionov
* @since 10.05.2017
*/

public class BubbleSort {
/**
*Сортировка массива.
*@param array - входной массив.
*@return - возвращает отсортированный массив массив.
*/
    public int[] sort(int[] array) {
		int len = array.length;
		int p1 = 1;
		int p2;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - p1; j++) {
				if (array[j] > array[j + 1]) {
					p2 = array[j];
					array[j] = array[j + 1];
					array[j + 1] = p2;
				}
			}
			p1++;
		}
		return array;
	}
}
