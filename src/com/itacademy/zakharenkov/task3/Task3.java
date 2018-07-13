package com.itacademy.zakharenkov.task3;

import java.util.Scanner;

import static java.lang.Math.abs;

/*
 * Created by Roman Zakharenkov on 13.07.2018.
 *
 * It-academy.
 * Lesson 3. Homework 3.
 * Task 3.
 *
 * Написать программу, отображающую статистику по осадкам
    за N дней. N вводится пользователем.
    Пользователь также должен ввести N целых чисел, обозначающих
    величину осадков в день.
    Программа должна выводить:
    a. Количество дней
    b. Сумму осадков за этот период
    c. Среднее количество осадков за этот период
    d. Максимальное количество дневных осадков за этот период
    Не использовать массивы!
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во дней:");
        int days = scanner.nextInt();

        double sumRainfall = 0;
        double maxRainfall = 0;
        double rainfall = 0;
        for (int i = 0; i < days; i++) {
            System.out.println("Введите кол-во осадков в " + (i+1) + " день:");
            rainfall = scanner.nextDouble();
            sumRainfall += rainfall;
            if (rainfall >= maxRainfall) {
                maxRainfall = rainfall;
            }
        }
        System.out.println("Кол-во дней: " + days);
        System.out.println("Сумма осадков за этот период: " + sumRainfall);
        System.out.println("Среднее кол-во осадков за этот период: " + (sumRainfall/days));
        System.out.println("Максимальное кол-во дневных осадков за этот период: " + maxRainfall);
    }


}
