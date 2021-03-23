package my_project.staty;


import my_project.AnimalInterface;

public class Animal implements AnimalInterface {
    private final int animalDistanceRun;
    private final int animalDistanceSwim;


    Animal(int animalDistanceRun, int animalDistanceSwim) {
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceSwim = animalDistanceSwim;
    }

    @Override
    public boolean run(double value)  {
        return animalDistanceRun > value;
    }

    @Override
    public boolean swim(double value) {
        return animalDistanceSwim > value;
    }

    public double getAnimalDistanceRun() {
        return animalDistanceRun;
    }

    public double getAnimalDistanceSwim() {
        return animalDistanceSwim;
    }
}