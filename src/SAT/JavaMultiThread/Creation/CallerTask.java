package SAT.JavaMultiThread.Creation;

import java.util.concurrent.Callable;

/**
 * @Auther: Mark Wei
 * @Date 2020/6/13
 * @Description: SAT.JavaMultiThread.Creation
 */
public class CallerTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hello";
    }
}
