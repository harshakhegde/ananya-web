package de.harshaheg.oops;

public class Dog extends QuadAnimal{

    @Override
    public int getLegs() {
        return 5;
    }

    @Override
    public String makeSound() {
        return "bow bow";
    }
}
