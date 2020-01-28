package lv.qaguru.homework;

import org.junit.jupiter.api.Test;

public class Hw1Task1 {

    // ================== Метод #1

    @Test
    public void helloDima () {
        String name = "Дима";
        String age = "33";
        System.out.println("Привет, " + name + ", тебе увы аж " + age);
    }

    // ================== Метод #2

    @Test
    public void calculateConsumption () {
        // Дано:
        double distance = 200;
        double fuel = 30;

        // Результат:
        double consumption = distance / fuel;

        System.out.println("Расход: " + consumption);
    }


    // ================== Метод #3

    @Test
    public void calculateCircle () {
        // Дано:
        double radiusCm = 120;
        double pi = 3.14;
        double distanceKm = 1000;

        // Результат
        double circleCm = 2 * pi * radiusCm;

        System.out.println("* Длина окружности колеса в см: " + circleCm);


        // Результат:
        double circleKm = circleCm / 1000;

        // System.out.println("Окружность в км: " + circleKm);


        // Результат:
        double wheelingNumber = distanceKm / circleKm;

        System.out.println("* Кол-во оборотов колеса на 1000 км: " + wheelingNumber);

    }



}
