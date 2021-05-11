package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
//1. Приветствовать любого пользователя при вводе его имени через командную строку.

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name!");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        scanner.close();*/


//2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

  /*      String arr = Arrays.toString(args);
        String[] items = arr.replaceAll("\\[", "").replaceAll("]", "").replaceAll("\\s", "").split(",");

        int[] res = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                res[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.println();
        for (int i = res.length - 1; i >= 0; i--) {
            System.out.print(res[i] + " ");
              }
*/
//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

/*        Scanner scan_val = new Scanner(System.in);
        System.out.println("Enter value:");
        int input_val = scan_val.nextInt();


        int[] array = new int[input_val];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 50));
            System.out.println(array[i] + " ");
        }
        System.out.println(Arrays.toString(array));*/


//4. Ввести пароль из командной строки и сравнить его со строкой-образцом.

   /*     String pattern_pass = "password111";

        Scanner pass_scan = new Scanner(System.in);
        System.out.println("Enter password:");
        String input_pass = pass_scan.nextLine();

        System.out.println(input_pass);

        if (pattern_pass.equals(input_pass)) {
            System.out.println("Password is correct!");
        } else {
            System.out.println("Password isn't correct!");
        }*/


//5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.

/*        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter value 1:");
        Integer input_val1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter value 1:");
        Integer input_val2 = scanner1.nextInt();

        System.out.println(input_val1 + input_val2);*/

//6.Ввести с консоли n целых чисел. На консоль вывести:
//6.1. Четные и нечетные числа.

 /*       Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number");
            numbers[i] = input.nextInt();
        }

        int[] res_pos = new int[5];
        int[] res_neg = new int[5];
        int index_pos = 0;
        int index_neg = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                res_pos[index_pos] = numbers[i];
                index_pos++;
            } else if (numbers[i] % 2 != 0) {
                res_neg[index_neg] = numbers[i];
                index_neg++;
            }
        }
        System.out.println("Четные числа:");
        System.out.println(Arrays.toString(res_pos));
        System.out.println("Не четные числа:");
        System.out.println(Arrays.toString(res_neg));*/


//6.2. Наибольшее и наименьшее число.

/*        Scanner input = new Scanner(System.in);
        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter a number");
            array[i] = input.nextInt();
        }

        System.out.println(Arrays.stream(array).min());
        System.out.println(Arrays.stream(array).max());*/

//6.3. Числа, которые делятся на 3 или на 9.

      /*  Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter a number");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println("число " + array[i] + " делится на 3");
            } else if (array[i] % 9 == 0) {
                System.out.println("число " + array[i] + " делится на 3");
            }
        }*/

//6.4. Числа, которые делятся на 5 и на 7.

/*        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter a number");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if ((array[i] / 5) % 7 == 0) {
                System.out.println("число " + array[i] + " делится на 5 и на 7");
            }
        }*/

//6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.

        Scanner input = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter a number");
            array[i] = input.nextInt();
        }

        String str = "11 34 3 45 23 5 67";
        String strArr[] = str.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
            // System.out.println(numArr[i]);

//6.6. «Счастливые» числа.



    }
}
