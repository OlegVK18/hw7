package ru.skypro;

public class Main {


    public static void main(String[] args) {

        // Задача 1

        int[] arr = generateRandomArray();
        int sum = 0;

        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задача 2


        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
            System.out.println("Минимальная сумма трат за день составила" + min + "рублей");
            System.out.println("Максимальная сумма трат за день составила" + max + "рублей");
        }

        // Задача 3

        for (int i :arr) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / (float) arr.length + " рублей");

        // Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i>= 0; i --) {
            System.out.print(reverseFullName[i]);
        }

    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}





