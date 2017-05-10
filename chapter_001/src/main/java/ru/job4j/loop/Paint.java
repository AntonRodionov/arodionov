package ru.job4j.loop;
/**
* Class Paint.
* @author arodionov
* @since 10.05.2017
*/

public class Paint {
/**
*Построение пирамиды.
*@param h - высота пирамиды.
*@return - возвращает пирамиду заданной высоты в строковом виде.
*/
    public String piramid(int h) {
		StringBuilder stroka = new StringBuilder();
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= (2 * h - 1); j++) {
				stroka.append(Math.abs(h - j) < i ? '^' : ' ');
			}
			stroka.append(System.getProperty("line.separator"));
		}
		return stroka.toString();
	}
}
