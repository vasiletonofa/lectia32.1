public class TaskService {


    public static int counter = 0;

    public static void createLongRunningTask()  {
       try {
           Thread.sleep(1000);
       } catch (Exception e) {
           System.out.println("Error");
       }

        System.out.println("Hello world");
    }


    public static void incrementCounter() {
        counter = counter + 1;

        System.out.println(counter);
//        try {
//            Thread.sleep(300);
//        } catch (Exception  e) {
//        }
    }



}
