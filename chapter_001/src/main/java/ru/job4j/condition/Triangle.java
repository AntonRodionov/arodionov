package ru.job4j.condition;
/**
* Class Triangle.
* @author arodionov
* @since 10.05.2017
*/

public class Triangle {
/**
*Поле для хранения координат вершины А.
*/
	private Point a;
/**
*Поля для хранения координат вершины В.
*/
	private Point b;
/**
*Поле для хранения координат вершины С.
*/
	private Point c;
/**
*Конструктор объекта - треугольник.
*@param a - вершина A.
*@param b - вершина B.
*@param c - вершина C.
*/
    public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
/**
*Вычисление площади треугольника.
*@return - площадь треугольника.
*/
    public double area() {
		double s  = 0.5 * ((b.getX() - c.getX()) * (a.getY() - c.getY()) - (a.getX() - c.getX()) * (b.getY() - c.getY()));
		s = s <= 0.01 ? 0 : s;
		return s;
	}
}
