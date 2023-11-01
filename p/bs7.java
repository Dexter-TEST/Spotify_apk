package p.bs7;
import java.lang.Object;
import android.content.Context;
import p.a70;

public final class bs7	// class@00112a from classes.dex
{
    public a70 a;
    public static final bs7 b;

    static {
       bs7.b = new bs7();
    }
    public void bs7(){
       super();
       this.a = null;
    }
    public static a70 a(Context p0){
       bs7 b = bs7.b;
       _monitor_enter(b);
       if (b.a == null) {
          if (p0.getApplicationContext() != null) {
             p0 = p0.getApplicationContext();
          }
          b.a = new a70(p0);
       }
       _monitor_exit(b);
       return b.a;
    }
}
