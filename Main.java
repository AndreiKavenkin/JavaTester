package Lesson3;

import java.util.Arrays;

public class Main {
    private static <T> void replacementElements(T[] array, int x, int y) {
        T z = array[x];
        array[x] = array[y];
        array[y] = z;
    }
    public static void main(String[] args) {
        System.out.println("-------> Задание с массивом <-------");
        String[] massive = {"abc", "qwerty", "12345", "Hello"};
        System.out.println("Исходный массив:" + Arrays.toString(massive));
        replacementElements(massive, 0, 2);
        System.out.println("Измененный массив:" + Arrays.toString(massive));
        System.out.println("-------> Задание с фруктами <-------");
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox1 = new Box();
        Box<Apple> appleBox2 = new Box();
        for (int i = 0; i < 6; i++) {
            orangeBox1.add(new Orange());
        }
        for (int i = 0; i < 8; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 9; i++) {
            appleBox1.add(new Apple());
        }
        for (int i = 0; i < 10; i++) {
            appleBox2.add(new Apple());
        }
        orangeBox1.info();
        orangeBox2.info();
        appleBox1.info();
        appleBox1.info();
        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float apple1Weigth = appleBox1.getWeight();
        Float apple2Weigth = appleBox2.getWeight();
        System.out.println("Вес первой коробки с апельсинами: " + orange1Weigth + " кг.");
        System.out.println("Вес второй коробки с апельсинами: " + orange2Weigth + " кг.");
        System.out.println("Вес первой коробки с яблоками: " + apple1Weigth + " кг.");
        System.out.println("Вес второй коробки с яблоками: " + apple2Weigth + " кг.");
        System.out.println("Сравнить вес первой коробки с апельсинами и первой коробки с яблоками: " + orangeBox1.compare(appleBox1));
        System.out.println("Сравнить вес второй коробки с апельсинами и первой коробки с яблоками: " + orangeBox2.compare(appleBox1));
        System.out.println("Сравнить вес первой коробки с апельсинами и второй коробки с яблоками: " + orangeBox1.compare(appleBox2));
        System.out.println("Сравнить вес второй коробки с апельсинами и второй коробки с яблоками: " + orangeBox2.compare(appleBox2));
        orangeBox1.pourfruit(orangeBox2);
        appleBox1.pourfruit(appleBox2);
        orangeBox1.info();
        orangeBox2.info();
        appleBox1.info();
        appleBox2.info();
    }
}
