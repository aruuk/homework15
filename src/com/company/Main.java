package com.company;

public class Main {
//    Для каждого объекта по отдельности создайте массив и разделите животных из Animal massiva и положите в свои массивы.
    public static void main(String[] args){
        Animal shark =  new Shark();
        Animal turtle =  new Turtle();
        Animal eagle =  new Eagle();
        Animal[] animals = {shark, turtle, eagle};

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
            }
            if (animal.getClass().getName().equals("com.company.Shark")) {
                ((Shark)animal).attack();
            }

            if (animal instanceof Turtle) {
                ((Turtle)animal).swim();
            }
            if (animal.getClass().getName().equals("com.company.Turtle")) {
                ((Turtle) animal).swim();
            }
            if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
            }
            if (animal.getClass().getName().equals("com.company.Eagle")) {
                ((Eagle) animal).fly();
            }
            System.out.println();
        }

    }
}
