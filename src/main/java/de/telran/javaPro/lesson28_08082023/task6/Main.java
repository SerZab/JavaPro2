package de.telran.javaPro.lesson28_08082023.task6;

public class Main {

    public static void main(String[] args) {

        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        classA.setClassB(classB);
        classB.setClassA(classA);

        ThreadA threadA = new ThreadA(classA);
        ThreadB threadB = new ThreadB(classB);

        threadA.start();
        threadB.start();
    }
}

