package SAT.JavaMultiThread.Creation;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Auther: Mark Wei
 * @Date 2020/6/13
 * @Description: SAT.JavaMultiThread.Creation
 */
public class ThreadFacade {
    public void Process(){
        MyThread  thread1 = new MyThread();
        thread1.start();

        Thread thread2 = new Thread(new RunableTask());
        thread2.start();

        FutureTask<String> fTask1 = new FutureTask<String>(new CallerTask());
        new Thread(fTask1).start();
        try{
            String result = fTask1.get();
            System.out.println(result);
        }catch (ExecutionException | InterruptedException e){
            e.printStackTrace();
        }
    }
}
