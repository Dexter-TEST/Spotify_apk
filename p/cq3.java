package p.cq3;
import p.yf2;
import p.eq3;
import java.lang.Object;
import p.tv;
import java.lang.Class;
import com.google.common.collect.c;
import p.d73;
import java.io.File;
import android.content.Context;
import p.a73;
import p.ys5;
import java.lang.Iterable;
import p.g16;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.ha5;
import p.jk0;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;
import java.util.List;
import java.util.Iterator;
import p.wp3;
import p.vp3;
import java.lang.StringBuilder;
import java.lang.String;
import p.jl;
import java.io.IOException;
import java.lang.Exception;
import java.lang.Long;

public final class cq3 implements yf2	// class@001259 from classes.dex
{
    public final int a;
    public final eq3 b;

    public void cq3(eq3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       double d;
       double d1;
       cq3 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             Iterator iterator = p0.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   tv otv = iterator.next();
                   if (otv.h != null) {
                      if (otv.f == null) {
                         d = 0x3fe0000000000000;
                         d1 = d;
                      }else {
                         d = 0x3fb999999999999a;
                         d1 = 0x3fa999999999999a;
                      }
                      double d2 = (double)eq3.a(otv);
                      p0 = tb.d;
                      p0.getClass();
                      Scheduler c = s36.c;
                      p0 = Completable.i(new vp3(p0, (long)(d * d2), 1)).p(c).c(Completable.i(new vp3(p0, (long)(d2 * d1), 0)).p(c));
                      break ;
                   }
                }else {
                   jl.d("Invalid storage setup, "+p0);
                   p0 = Completable.h(new IOException("Invalid storage setup, could not find app-internal"));
                   break ;
                }
             }
             return p0;
             break;
           case 1:
           case 2:
             tb.getClass();
             d73 uod73 = new d73();
             uod73.D0(tb.b.getCacheDir());
             if (p0.h == null) {
                uod73.D0(p0.j);
             }
             return uod73.I0();
             break;
           default:
             tb.getClass();
             long l = eq3.a(p0);
             p0 = (p0.h != null)? Long.valueOf((long)((double)l * 0x3feb333333333333)): Long.valueOf((long)((double)l * 0x3ff0000000000000));
             return p0;
       }
       tb.getClass();
       return new jk0(Completable.i(new g16(tb, 8, p0)), 2, new ha5(10, tb)).p(s36.c);
    }
}
