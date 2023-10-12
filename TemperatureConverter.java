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
public class TemperatureConverter {
    
    private final Scanner scanner;

    public TemperatureConverter(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doConvert() {
        boolean repeat = true;
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("+  Конвертер температуры  +");       
        System.out.println("+++++++++++++++++++++++++++");
        
        do {
            System.out.println("Выберите направление конвертирования: ");
            System.out.println("0. Выход из программы: ");
            System.out.println("1. Цельсий -> фаренгейт: ");
            System.out.println("2. фаренгейт -> Цельсий: ");
            System.out.println("№ напрвления: ");
            int task = this.scanner.nextInt();scanner.nextLine();
        switch (task) {
            case 0:
                System.out.println("Выбран выход из программы: ");
                repeat = false;
                break;
            case 1:
                System.out.println("Выбрана задача 1");
                System.out.println("Напишите количество градус цельсия: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + " Градусов Цельсия = " + fahrenheit + " градусам фаренгейта");
                break;
            case 2:
                System.out.println("Выбрана задача 2");
                System.out.println("Напишите количество градус фаренгейта: ");
                double fahrenheit1 = scanner.nextDouble();
                double celsius1 = (fahrenheit1 - 32) * 5/9;
                System.out.println(fahrenheit1 + " Градусов фаренгейта = " + celsius1 + " градусам цельсия");
                break;
            default:
                System.out.println("Выбирайте номер из списка задач: ");
                break;
        }
        } while (repeat);
    }
    
}
