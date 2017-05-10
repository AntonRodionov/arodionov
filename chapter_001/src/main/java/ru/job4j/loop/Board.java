package ru.job4j.loop;
/**
* Class Board.
* @author arodionov
* @since 10.05.2017
*/

public class Board {
/**
*Построение шахматной доски	 .
*@param width - ширина доски.
*@param height - высота доски.
*@return - возвращает шахматную доску в виде строки типа String.
*/
    public String paint(int width, int height) {
		StringBuilder stroka = new StringBuilder();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				stroka.append((width * (i - 1) + j) % 2 == 1 ? 'x' : ' ');
			}
			stroka.append(System.getProperty("line.separator"));
		}
		return stroka.toString();
	}
}
