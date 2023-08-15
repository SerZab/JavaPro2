package de.telran.javaPro.lesson30_15082023.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

public class JoinTest {
    public static void main(String[] args) {
        /*
	1. Написать класс MyThread, метод run которого может запускаться в отдельном потоке.
	2. Метод run должен выводить информацию о том, что поток с таким-то именем начал работу,
	затем ждать 5 секунд и выводить информацию, что поток с таким-то именем закончил работу.
	3. В главном потоке запустить три потока и дать им какие-то имена.
	4. При помощи методов join(final long millis) и join() добиться следующего выполнения программы:
		а. Стартует первый поток.
		б. Второй поток должен стартовать когда или закончит работу первый поток,
		или пройдёт две секунды с момента его старта.
		в. Третий поток должен стартовать когда закончит работу первый поток.
		г. Главный поток должен вывести информацию о том, что все потоки отработали,
		когда это действительно произойдёт.
		д. Конец работы программы.
	*/
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.setName("Alpha");
        thread2.setName("Beta");
        thread3.setName("Gamma");


        thread1.start();
        try {
            thread1.join(2000);
            thread2.start();
            thread1.join();
            thread3.start();
            thread3.join();
            thread2.join();

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("Все потоки завершили свою работу");
    }
}