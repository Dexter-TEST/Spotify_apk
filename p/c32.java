package p.c32;
import java.io.File;
import java.lang.String;
import android.os.SystemClock;
import java.lang.Object;

public final class c32	// class@001189 from classes.dex
{
    public static final c32 a;
    public static final File b;
    public static int c;
    public static long d;
    public static boolean e;

    static {
       c32.a = new c32();
       c32.b = new File("/proc/self/fd");
       c32.c = 30;
       c32.d = SystemClock.uptimeMillis();
       c32.e = true;
    }
    public void c32(){
       super();
    }
}
