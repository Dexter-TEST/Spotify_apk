package p.de7;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.ee7;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import p.nj7;
import p.mj7;

public final class de7 implements Runnable	// class@001331 from classes.dex
{
    public final int a;
    public final String b;
    public final String c;

    public void de7(int p0,String p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void run(){
       SharedPreferences b;
       de7 tc = this.c;
       de7 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             co5.o(tb, "$queriedEvent");
             co5.o(tc, "$buttonText");
             float[] uofloatArray = new float[0];
             mj7.n(tb, tc, uofloatArray);
             return;
       }
       co5.o(tb, "$key");
       co5.o(tc, "$value");
       if (!ee7.c.get()) {
          ee7.a.a();
       }
       if ((b = ee7.b) != null) {
          b.edit().putString(tb, tc).apply();
          return;
       }else {
          co5.N("sharedPreferences");
          throw null;
       }
    }
}
