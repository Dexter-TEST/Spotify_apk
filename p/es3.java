package p.es3;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import android.util.Log;
import java.lang.Throwable;

public final class es3	// class@0014ea from classes.dex
{
    public final int a;
    public static final Object b;
    public static es3 c;

    static {
       es3.b = new Object();
    }
    public void es3(int p0){
       super();
       this.a = p0;
    }
    public static es3 c(){
       Object b = es3.b;
       _monitor_enter(b);
       if (es3.c == null) {
          es3.c = new es3(3);
       }
       _monitor_exit(b);
       return es3.c;
    }
    public static String d(String p0){
       StringBuilder str = new StringBuilder(23)+"WM-";
       str = (p0.length() >= 20)? str+p0.substring(0, 20): str+p0;
       return str;
    }
    public final void a(String p0,String p1){
       if (this.a <= 6) {
          Log.e(p0, p1);
       }
       return;
    }
    public final void b(String p0,String p1,Throwable p2){
       if (this.a <= 6) {
          Log.e(p0, p1, p2);
       }
       return;
    }
}
