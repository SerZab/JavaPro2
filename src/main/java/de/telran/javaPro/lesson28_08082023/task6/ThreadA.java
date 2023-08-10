package de.telran.javaPro.lesson28_08082023.task6;

public class ThreadA extends Thread{

    private ClassA classA;

    public ThreadA(ClassA classA){
        this.classA = classA;
    }

    @Override
    public void run() {
        classA.methodA();
    }
}
