package school.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(doTask1(1, 9));
        doTask2(10);
        System.out.println(doTask3(-25));
        System.out.println(doTask4(1900));
        int[] i;
        int i1 = 5;

    }

    public static boolean doTask1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void doTask2(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отприцательное");
        }
    }

    public static boolean doTask3(int x) {
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean doTask4(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static int[] doTask5(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

    public static void doTask7(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }
}


