package de.telran.javaPro.lesson28_08082023.task6;

public class ClassA {

    private ClassB classB;

    public void setClassB(ClassB classB) {
        this.classB = classB;
    }

    public synchronized void methodA(){
        System.out.printf("Поток %s выполняет метод А\n", Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ignored){}
        System.out.printf("Поток %s успешно завершил метод А\n", Thread.currentThread().getName());
        classB.methodB();
    }

    public synchronized void methodB(){
        System.out.printf("Поток %s выполняет метод B\n", Thread.currentThread().getName());

    }
}
