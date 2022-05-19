/**
 * First JAVA program.
 */
package school.lesson1;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //Task 2
    public static void printThreeWords() {
        for (String s : Arrays.asList("Orange", "Banana", "Apple")) {
            System.out.println(s);
        }
    }

    // Task 3
    public static void checkSumSign() {
        int a = 25;
        int b = 30;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Task 4
    public static void printColor() {
        int value = 100;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Task 5
    public static void compareNumbers() {
        int a = 2;
        int b = 7;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}