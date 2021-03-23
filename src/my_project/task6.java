package my_project;

import my_project.staty.Cat;
import my_project.staty.Dog;
import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat(200, 0);
        Dog dog = new Dog(500,  10);

        System.out.println("Кошка может пробежать: " + (int)cat.getAnimalDistanceRun() +
                " м. \nСобака может пробежать: " + (int)dog.getAnimalDistanceRun() + " м.");

        System.out.println("Введите дистанцию для бега:");
        int distance = (int) scanner.nextInt();

        System.out.print("Кошка бежит " + distance + "м.,");
        if (!cat.run(distance)){System.out.println(" не пробежала");} else {System.out.println(" пробежала");}
        System.out.print("Собака бежит " + distance + "м.," );
        if (!dog.run(distance)){System.out.println(" не пробежала");} else {System.out.println(" пробежала");}
        System.out.println();

        System.out.println("Кошка может проплыть: " + (int)cat.getAnimalDistanceSwim() +
                " м. \nСобака может проплыть: " + (int)dog.getAnimalDistanceSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextInt();

        System.out.print("Кошка поплыла " + distance + "м., ");
        if (!cat.swim(distance)){System.out.println(" не проплывет так как не умеет");} else {System.out.println(" проплыла");}
        System.out.print("Собака поплыла " + distance + "м., ");
        if (!dog.swim(distance)){System.out.println(" утонула");} else {System.out.println(" проплыла");}

    }


}