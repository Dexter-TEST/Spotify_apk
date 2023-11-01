package p.cc;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock;
import android.content.Context;
import p.sz1;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.lang.String;

public abstract class cc	// class@0011e1 from classes.dex
{
    public static final ReentrantReadWriteLock a;
    public static String b;
    public static boolean c;

    static {
       cc.a = new ReentrantReadWriteLock();
    }
    public static void a(){
       if (cc.c) {
          return;
       }
       ReentrantReadWriteLock a = cc.a;
       a.writeLock().lock();
       if (!cc.c) {
          cc.b = PreferenceManager.getDefaultSharedPreferences(sz1.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
          cc.c = true;
       }
       a.writeLock().unlock();
       return;
    }
}
