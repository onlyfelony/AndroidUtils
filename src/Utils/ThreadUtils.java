package Utils;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̷߳�װ��
 */

public class ThreadUtils {

    private static ExecutorService sExecutorService = Executors.newSingleThreadExecutor();//�����̳߳�

    public static void execute(Runnable runnable) {
        sExecutorService.execute(runnable);//ִ��һ���߳�
    }
}