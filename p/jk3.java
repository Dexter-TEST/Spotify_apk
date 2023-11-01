package p.jk3;
import p.uw5;
import p.fl6;
import p.ib1;
import p.c32;
import android.os.SystemClock;
import java.lang.String;
import java.io.File;

public final class jk3 extends uw5	// class@001af2 from classes.dex
{

    public void jk3(){
       super();
    }
    public final boolean a(fl6 p0){
       boolean b;
       fl6 a = p0.a;
       int i = Integer.MAX_VALUE;
       ib1 h = (a instanceof ib1)? a.H: Integer.MAX_VALUE;
       if (h > 100) {
          p0 = p0.b;
          if (p0 instanceof ib1) {
             i = p0.H;
          }
          if (i > 100) {
             b = true;
          label_0024 :
             return b;
          }
       }
       b = false;
       goto label_0024 ;
    }
    public final boolean b(){
       c32 a = c32.a;
       _monitor_enter(a);
       int c = c32.c;
       c32.c = c + 1;
       int i = 0;
       String[] stringArray = (c < 30 && (SystemClock.uptimeMillis() - (c32.d + (long)0x7530)) <= 0)? 0: 1;
       if (c) {
          c32.c = i;
          c32.d = SystemClock.uptimeMillis();
          if ((stringArray = c32.b.list()) == null) {
             stringArray = new String[i];
          }
          if (stringArray.length < 800) {
             i = true;
          }
          c32.e = i;
       }
       _monitor_exit(a);
       return c32.e;
    }
}
