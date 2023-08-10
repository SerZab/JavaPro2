package de.telran.javaPro.lesson28_08082023.task6;

public class ThreadB extends Thread{
    private ClassB classB;

    public ThreadB(ClassB classB){
        this.classB = classB;
    }

    @Override
    public void run() {
        classB.methodA();
    }
}
