package ru.job4j.condition;
/**
* Class Point.
* @author arodionov
* @since 08.05.2017
*/

public class Point {
/**
*Поля для хранения координаты по оси Х.
*/
	private int x;
/**
*Поля для хранения координаты по оси Y.
*/
	private int y;
/**
*Конструктор объекта - точка.
*@param x - координата по X.
*@param y - координата по Y.
*/
    public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
/**
*Получение числовой координаты точки из объекта.
*@return - координата по X.
*/
    public int getX() {
		return this.x;
	}
/**
*Получение числовой координаты точки из объекта.
*@return - координата по Y.
*/
    public int getY() {
		return this.y;
	}
/**
*Проверка принадлежности точки прямой ax+b.
*@param a - угловой коэффициент.
*@param b - смещение.
*@return - координата по Y.
*/
    public boolean is(int a, int b) {
		return this.y == a * this.x + b;
	}
}
