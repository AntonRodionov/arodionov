package ru.job4j.array;

import java.util.Arrays;
/**
* Class ArrayDuplicate.
* @author arodionov
* @since 12.05.2017
*/

public class ArrayDuplicate {
/**
*Удаление дубликатов в массиве.
*@param array - входной массив.
*@return - возвращает массив без дубликатов.
*/
    public String[] remove(String[] array) {
		int razmer = array.length;
        int i = 0;
        int k = 0;
        int n = 0;
        String s;
        while (i < razmer - k) {
            for (int j = i + 1; j < razmer - k; j++) {
                if (i != j) {
                    if (array[i] == array[j]) {
                        s = array[j];
                        array[j] = array[razmer - 1 - k];
                        array[razmer - 1 - k] = s;
                        k++;
						j--;
                    }
                }
            }
            if (k == n) {
                i++;
            }
            n = k;
        }
		return Arrays.copyOf(array, razmer - k);
	}
}
