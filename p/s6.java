package p.s6;
import java.lang.Runnable;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import p.co5;
import p.t6;
import p.ac6;
import java.lang.Long;
import p.ej4;
import p.h22;
import p.sz1;
import p.f22;

public final class s6 implements Runnable	// class@0025ce from classes.dex
{
    public final long a;
    public final String b;
    public final Context c;

    public void s6(long p0,String p1,Context p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void run(){
       ac6 f;
       ac6 f1;
       ac6 f2;
       f22 uof22;
       s6 ta = this.a;
       s6 tb = this.b;
       s6 tc = this.c;
       co5.o(tb, "$activityName");
       Long longx = ((f = t6.f) == null)? null: f.b;
       if (t6.f == null) {
          t6.f = new ac6(Long.valueOf(ta), null);
          co5.l(tc, "appContext");
          ej4.d0(tb, t6.h, tc);
       }else if(longx != null){
          long l = ta - longx.longValue();
          int i = ((uof22 = h22.b(sz1.b())) == null)? 60: uof22.b;
          if ((l - (long)(i * 1000)) > 0) {
             ej4.e0(tb, t6.f, t6.h);
             co5.l(tc, "appContext");
             ej4.d0(tb, t6.h, tc);
             t6.f = new ac6(Long.valueOf(ta), null);
          }else if((l - 1000) > 0 && (f1 = t6.f) != null){
             f1.d = f1.d + 1;
          }
       }
       if ((f1 = t6.f) != null) {
          f1.b = Long.valueOf(ta);
       }
       if ((f2 = t6.f) != null) {
          f2.a();
       }
       return;
    }
}
