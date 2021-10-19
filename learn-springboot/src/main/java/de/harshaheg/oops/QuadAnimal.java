package de.harshaheg.oops;

public abstract class QuadAnimal implements Animal{
    @Override
    public int getLegs() {
        return 4;
    }

    @Override
    public void eatFood() {
        System.out.println("yummy");
    }
}
