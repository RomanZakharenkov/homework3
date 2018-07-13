package com.itacademy.zakharenkov.task2;

import java.util.Scanner;

/*
 * Created by Roman Zakharenkov on 13.07.2018.
 *
 * It-academy.
 * Lesson 3. Homework 3.
 * Task 2.
 *
 * Написать программу, вычисляющую и отображающую все числа
   Фибоначчи меньше введённого пользователем целого числа.
   Решить двумя способами: с помощью цикла и с помощью
   рекурсии.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        printFibonachiCycle(number);
        printFibonachiRecursive(number, 0, 1);
    }

    public static void printFibonachiRecursive(int number, int firstNumber, int secondNumber) {
        System.out.print(firstNumber + " ");
        if (secondNumber < number) {
            printFibonachiRecursive(number, secondNumber, firstNumber + secondNumber);
        }
    }
    public static void printFibonachiCycle(int number) {
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print(firstNumber + " ");
        while (number > secondNumber) {
            System.out.print(secondNumber + " ");
            int x = secondNumber;
            secondNumber += firstNumber;
            firstNumber = x;
        }
    }

}
