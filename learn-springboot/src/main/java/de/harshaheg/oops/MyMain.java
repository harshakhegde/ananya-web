package de.harshaheg.oops;

public class MyMain {
    public static void main(String[] args) {
        Animal a = new Dog();

        System.out.println(a.makeSound());
        System.out.println(a.getLegs());
        a.eatFood();


        System.out.println("--------------");
        a = new Cat();
        System.out.println(a.makeSound());
        System.out.println(a.getLegs());
        a.eatFood();


    }
}
