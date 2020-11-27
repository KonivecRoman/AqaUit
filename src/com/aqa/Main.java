package com.aqa;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        //1
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String s = scanner.nextLine();
        scanner.close();
        System.out.println("Привет " + s + ", как дела?!");*/


        //2
        /*for (int i = 100; i >= 0; i--) {
            System.out.println("i = " + i);
        }*/
        ////////////////////или используя while
        /*int a = 100;
        while (a >=0) {
            System.out.println(a);
            a--;
        }*/


        //3
        /*Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        System.out.println(a);
        System.out.print(b);*/

        //4
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password please");
            String s = scanner.nextLine();
            String s1 = "qwerty123";
        if (s.equals(s1))
             System.out.println("Pass");
        else System.out.println("Fail");*/


        //5
        /*int sum=0;
        int sum1=6;
        for (int i = args.length - 1; i >= 0; i--) {
            sum+= Integer.parseInt(args[i]);
            sum1*= Integer.parseInt(args[i]);
            System.out.println(args[i]);
        }
              System.out.println(sum);
              System.out.println(sum1);*/

        //6
        //6.1

        //Выводим четные числа методом wile
        /*int a = 0;
        while (a <= 64) {
            if (a % 2 == 0) {
                System.out.println("a = " + a);
            }
            a++;
        }*/

        //Выводим четные числа методом for
        /*for (int i = 0; i <=64 ; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }*/

        //Выводим нечетные числа методом wile
        /*int a = 0;
        while (a <= 57) {
            if (a % 2 != 0) {
                System.out.println("a = " + a);
            }
            a++;
        }*/

        //Выводим нечетные числа методом for
        /*for (int i = 0; i <=57 ; i++) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
        }*/

        //6.2
        /*int num1 = 55;
        int num2 =148;

        System.out.println("Большее число: " + Math.max(num1,num2));
        System.out.println("Меньшее число: " + Math.min(num1,num2));*/

        //6.3
        //Числа, которые делятся на 3

        /*for (int i = 0; i < 100; i++) {
            if ((i % 3 == 0) || (i % 9 == 0))
                System.out.println(i);
        }*/


         //6.4
        //Числа, которые делятся на 5 и 7
        /*for (int i = 0; i < 100; i++) {
            if ((i % 5 == 0) && (i % 7 == 0))
                System.out.println(i);
        }*/





            }
        }
