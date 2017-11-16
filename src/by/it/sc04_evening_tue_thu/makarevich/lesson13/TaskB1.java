package by.it.sc04_evening_tue_thu.makarevich.lesson13;

import java.util.Arrays;
import java.util.Scanner;

/*
Напишите отдельный класс Salary который принимает в конструктор
массив double[]
конструктор сохраняет данные в приватный массив класса salary

напишите нестатические методы для Salary:
метод double getSum() - считает сумму всех зарплат.
метод double getSum(double percent) - считает сумму всех зарплат с надбавкой в percent%.

метод double[] getSalary() возвращает массив из приватного поля.
метод double[] getSalary(double percent) возвращает новый массив с надбавкой в percent%.
метод void setSalary(double percent) обновляет массив в приватном поле с надбавкой в percent%.

метод void sort() сортирует массив через Arrays.sort в приватном поле.
метод String toString() возвращает Arrays.toString для в приватного поля

 в методе main
 с консоли вводите заработные платы в массив чисел типа double размером в 12 элементов
 и передайте их в конструктор Salary
 выведите на консоль по очереди:

 неотсортированные зарплаты без надбавок
 сумму без надбавок.
 неотсортированные зарплаты с надбавкой в 20%
 сумму с этой надбавкой.
 отсортированные зарплаты с надбавкой в 50%
 сумму с этой надбавкой.
*/
public class TaskB1 {

    public static void main(String[] args) {
        double [] m=new double[12];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <m.length ; i++) {
            m [i]=sc.nextDouble();
        }

        Salary salary = new Salary(m);

        System.out.println(salary.toString());
        System.out.println(salary.getSum());

        Salary salary20=new Salary(m);
        salary20.setSalary(20);
        System.out.println(salary20.toString());

        System.out.println(salary.getSum(20));

        salary.setSalary(50);
        salary.sort();
        System.out.println(salary.toString());
        System.out.println(salary.getSum());
    }
}
