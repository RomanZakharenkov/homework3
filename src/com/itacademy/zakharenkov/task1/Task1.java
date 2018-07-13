package com.itacademy.zakharenkov.task1;

import java.util.Scanner;

import static java.lang.Math.abs;

/*
 * Created by Roman Zakharenkov on 13.07.2018.
 *
 * It-academy.
 * Lesson 3. Homework 3.
 * Task 1.
 *
 * Написать программу, вычисляющую сумму цифр введённого
 пользователем целого числа.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int sumDigits = getSumDigits(number);
        System.out.println("Сумма цифр числа равна - " + sumDigits);
    }

    public static int getSumDigits(int number) {
        int sumDigits = 0;
        while (number != 0) {
            sumDigits += number % 10;
            number /= 10;
        }
        return abs(sumDigits);
    }
}