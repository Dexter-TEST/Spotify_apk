package p.ub2;
import p.jw3;
import p.jv5;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import p.wh6;
import java.lang.String;
import android.content.Context;
import p.ob2;
import p.tb2;
import android.graphics.Typeface;
import p.r8;
import p.io2;
import p.dc2;
import p.pa7;
import p.vf;

public abstract class ub2	// class@002879 from classes.dex
{
    public static final jw3 a;
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final wh6 d;

    static {
       ub2.a = new jw3(16);
       ThreadPoolExecutor v0 = new ThreadPoolExecutor(0, 1, (long)0x2710, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new jv5());
       v0.allowCoreThreadTimeOut(true);
       ub2.b = v0;
       ub2.c = new Object();
       ub2.d = new wh6();
    }
    public static tb2 a(String p0,Context p1,ob2 p2,int p3){
       Typeface typeface;
       r8 or8;
       int i1;
       Typeface typeface1;
       dc2 e;
       jw3 a = ub2.a;
       if ((typeface = a.b(p0)) != null) {
          return new tb2(typeface);
       }
       try{
          or8 = io2.l(p1, p2);
          r8 b = or8.b;
          int i = 1;
          if (b != null) {
             if (b != i) {
             label_0036 :
                i1 = -3;
             }else {
                i1 = -2;
             }
          }else if((b = or8.c) != null && b.length){
             i = b.length;
             int i2 = 0;
             while (true) {
                if (i2 < i) {
                   if ((e = b[i2].e) != null) {
                      if (e < null) {
                         goto label_0036 ;
                      }else {
                         i1 = e;
                      }
                   }else {
                      i2 = i2 + 1;
                   }
                }else {
                   i = 0;
                }
             }
             return new tb2(i1);
          }
          i1 = i;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          return new tb2(-1);
       }
          if (i1 != null) {
          }else if((typeface1 = pa7.a.h(p1, or8.c, p3)) != null){
             a.c(p0, typeface1);
             return new tb2(typeface1);
          }else {
             return new tb2(-3);
          }
    }
}
