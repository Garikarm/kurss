﻿/**
* указываем на то, что класс принадлежит пакету 
*/
package Calc;

/**
* описываем класс дл¤ расчЄта объЄма видеопам¤ти 
*/
public class physhicalCalc {
	/**
* —оздаем метод дл¤ расчЄта пам¤ти дл¤ корпоративных клиентов 
*/
	public String getK(int t, int d, double m){ 
		/**
*переменна¤, котора¤ будет возвращена в методе 
*/
		double V = 0; 
		/**
* »ницилизаци¤ перемнной строкового типа дл¤ вывода результата 
*/
		String str;
		
		/**
* —читаем необходимый объЄм видеопам¤ти 
*/
		V = (m*t*d)/1024 ; 
		/**
*ќкругление до сотых 
*/
		V = V * 10; 
		/**
*ќкругление до сотых 
*/
		int i = (int) Math.round(V); 
	 	/**
*ќкругление до сотых 
*/
		V = (double)i / 10; 
		 /**
*  онвертирование ежемес¤черно платежа из типа double в String(дл¤ вывода)  
*/
			str = Double.toString(V); 
			/**
* возвращаем методу результат 
*/
		return str; 
	}
}

