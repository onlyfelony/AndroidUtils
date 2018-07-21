package Utils;

import android.util.Log;
/**
 * ��ӡ������Ϣ
 */
public class Logger {

    public static final String TAG = "MYLOG";

    //�ж��Ƿ��ӡ
    public static final boolean DEBUG = true;


    //ת����Ϊstring (��Ϊ�������Ϊnull ���Բ���ֱ��toString())

    private static String getMsg(Object o) {
        return o == null ? "null" : o.toString();
    }

    public static void i(Object msg) {
        if (DEBUG) {
            Log.i(TAG, getMsg(msg));
        }
    }

    public static void e(Object msg) {
        if (DEBUG) {
            Log.e(TAG, getMsg(msg));
        }
    }

    public static void d(Object msg) {
        if (DEBUG) {
            Log.d(TAG, getMsg(msg));
        }
    }

    /**
     * ��ӡ������Ϣ
     *
     * @param msg
     */
    public static void w(Object msg) {
        if (DEBUG) {
            Log.w(TAG, getMsg(msg));
        }
    }
}