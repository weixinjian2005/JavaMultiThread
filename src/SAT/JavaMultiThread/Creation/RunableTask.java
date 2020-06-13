package SAT.JavaMultiThread.Creation;

/**
 * @Auther: Mark Wei
 * @Date 2020/6/13
 * @Description: SAT.JavaMultiThread.Creation
 * Multiple thread can execute same runnable task
 */
public class RunableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Implements Runnable to create.");
    }
}
