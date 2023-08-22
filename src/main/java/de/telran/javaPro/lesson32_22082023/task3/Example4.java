package de.telran.javaPro.lesson32_22082023.task3;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example4 {

    public static void main(String[] args) {

        // Компания имеет технику для всех объектов сразу,
        // но строительство каждого объекта должно начинаться
        // в определённое время

        String[] stages = {"1. Проектная деятельность", "2. Начало строительных работ",
                "3. Окончание строительных работ", "4. Отделочные работы"};

//        new Thread(new Building("Berlin", stages, false)).start();

        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);

//        service.execute(new Building("Berlin", stages, false));
//        service.execute(new Building("Dusseldorf", stages, false));
//        service.execute(new Building("Essen", stages, false));
//        service.execute(new Building("Dortmund", stages, false));

        System.out.println(new Date());

        service.schedule(new Building("Berlin", stages, true), 3, TimeUnit.SECONDS);
        service.schedule(new Building("Dusseldorf", stages, true), 4, TimeUnit.SECONDS);
        service.schedule(new Building("Essen", stages, true), 5, TimeUnit.SECONDS);
        service.schedule(new Building("Dortmund", stages, true), 8, TimeUnit.SECONDS);

        service.shutdown();
    }
}