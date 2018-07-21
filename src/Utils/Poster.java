package Utils;


import android.os.Handler;
import android.os.Looper;


/**
 * Created by dmrken on 2018/7/21.
 */
/*������ϢHandler
 */
public class Poster extends Handler {

    private static Poster instance;//����

    public static Poster getInstance() {
        if (instance == null)
            synchronized (Poster.class) {
                if (instance == null)
                    instance = new Poster();

            }
        return instance;
    }

    //Ϊ�˷�ֹ����ͨ��new����Poster,�����췽����Ϊprivate
    //�����߳��в���ֱ��new���̵߳�Handler����Looper.getMainLooper()�����߳�Looper����Handler
    private Poster() {
        //��main�̵߳�looper�������handler,���������̵߳��κεط������Խ���Ϣ�������߳�
        // ���handler�����handleMessage()�����������󶨵�Looper���߳���
        super(Looper.getMainLooper());
    }


}
