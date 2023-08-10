package de.telran.javaPro.lesson28_08082023.task6;

public class ClassB {
    private ClassA classA;

    public void setClassA(ClassA classA) {
        this.classA = classA;
    }

    public synchronized void methodA(){
        System.out.printf("Поток %s выполняет метод А\n", Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ignored){}
        System.out.printf("Поток %s успешно завершил метод А\n", Thread.currentThread().getName());
        classA.methodB();
    }

    public synchronized void methodB(){
        System.out.printf("Поток %s выполняет метод B\n", Thread.currentThread().getName());

    }
}
