import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {

////        // Thread 1
////        TaskService.createLongRunningTask(); // Thread 1
////        TaskService.createLongRunningTask(); // Thread 1
////        TaskService.createLongRunningTask(); // Thread 1    total == 5000 x 5
////        TaskService.createLongRunningTask(); // Thread 1
////        TaskService.createLongRunningTask(); // Thread 1
//
//        Afisare afisare = new Afisare("Ion", 23);
//        Thread thread = new Thread(afisare); // Thread 2 -> start
//        thread.start(); // -> run()
//
//        Thread thread2 = new Thread(new Afisare2(22, 28)); // Thread 3 -> start
//        thread2.start();
//
//        CustomThread customThread = new CustomThread();
//        customThread.start();
//
//        Thread thread1 = new Thread(() -> System.out.println("AAA"));
//
////
////        Thread thread3 = new Thread(() -> TaskService.createLongRunningTask()); // Thread 4 -> start  === total 5000
////        thread3.start();
////
////        Thread thread4 = new Thread(() -> TaskService.createLongRunningTask()); // Thread 5 -> start
////        thread4.start();
////
////        Thread thread5 = new Thread(() -> TaskService.createLongRunningTask()); // Thread 5 -> start
////        thread5.start();

//        List<Runnable> taskList = new ArrayList<>();
//        taskList.add(() -> TaskService.createLongRunningTask());
//        taskList.add(() -> TaskService.createLongRunningTask());
//        taskList.add(() -> TaskService.createLongRunningTask());
//        taskList.add(() -> TaskService.createLongRunningTask());
//        taskList.add(() -> TaskService.createLongRunningTask());
//
//        for (int i = 0; i < taskList.size(); i++) {
//            Thread thread = new Thread(taskList.get(i));
//            thread.start();
//        }

//        System.out.println("Incepem executia ..."); // Thread 1
//
//        new Thread(() -> TaskService.createLongRunningTask()).start(); // Thread 1 -> Thread2.start() -> Hello World
//
//        try {
//            Thread.sleep(2000);   // Thread 1 -> sleep
//        } catch (Exception e) {
//
//        }
//
//        System.out.println("Finisam executia ..."); //  Thread 1


        for (int i = 0; i < 100; i++) {
            new Thread(() -> TaskService.incrementCounter()).start();
        }

    }
}