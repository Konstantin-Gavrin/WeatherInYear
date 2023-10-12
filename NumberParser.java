/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class NumberParser {
    private final Scanner scanner;

    public NumberParser(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doParse() {
        
        boolean repeat = true;
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("+       парсер числа      +");       
        System.out.println("+++++++++++++++++++++++++++");
        
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Число не является трехзначным.");
        } else {
            int units = number % 10;         // Получаем единицы
            int tens = (number / 10) % 10;  // Получаем десятки
            int hundreds = number / 100;    // Получаем сотни
            int sumDigits = units + tens + hundreds;

            System.out.println("В этом числе:");
            System.out.println("- единиц: " + units);
            System.out.println("- десятков: " + tens);
            System.out.println("- сотен: " + hundreds);
            System.out.println("- сумма цифр: " + sumDigits);
        }

    }

    void doParser() {
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Число не является трехзначным.");
        } else {
            int units = number % 10;         // Получаем единицы
            int tens = (number / 10) % 10;  // Получаем десятки

            System.out.println("В этом числе:");
            System.out.println("- единиц: " + units);
            System.out.println("- десятков: " + tens);
        }
    }
}
