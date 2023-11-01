package p.pa7;
import android.os.Build$VERSION;
import p.ua7;
import p.ta7;
import p.sa7;
import p.ra7;
import p.qa7;
import p.jw3;
import android.content.Context;
import p.wb2;
import android.content.res.Resources;
import java.lang.String;
import p.uw5;
import android.graphics.Typeface;
import p.zb2;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import p.u44;
import p.si4;
import p.ub2;
import java.lang.StringBuilder;
import p.ob2;
import p.ka0;
import java.lang.Runnable;
import p.tb2;
import p.rb2;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;
import java.lang.RuntimeException;
import java.lang.Throwable;
import p.yx5;
import p.sb2;
import p.wh6;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import p.xb2;
import p.vf;

public abstract class pa7	// class@002226 from classes.dex
{
    public static final vf a;
    public static final jw3 b;

    static {
       int sDK_INT;
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 29) {
          pa7.a = new ua7();
       }else if(sDK_INT >= 28){
          pa7.a = new ta7();
       }else if(sDK_INT >= 26){
          pa7.a = new sa7();
       }else if(sDK_INT >= 24){
          sDK_INT = (ra7.v != null)? 1: 0;
          if (sDK_INT) {
             pa7.a = new ra7();
          }
       }
       pa7.a = new qa7();
       pa7.b = new jw3(16);
    }
    public static Typeface a(Context p0,wb2 p1,Resources p2,int p3,String p4,int p5,int p6,uw5 p7,boolean p8){
       tb2 otb2;
       Typeface typeface;
       Typeface typeface1;
       tb2 otb21;
       rb2 orb2;
       Object c;
       ArrayList orDefault;
       Context uContext = p0;
       zb2 ozb2 = p1;
       int i = p6;
       uw5 ouw5 = p7;
       if (ozb2 instanceof zb2) {
          zb2 d = ozb2.d;
          int i1 = 0;
          otb2 = null;
          if (d != null && !d.isEmpty()) {
             typeface = Typeface.create(d, i1);
             Typeface typeface2 = Typeface.create(Typeface.DEFAULT, i1);
             if (typeface != null && !typeface.equals(typeface2)) {
             label_002f :
                if (typeface != null) {
                   if (ouw5) {
                      ouw5.d(typeface);
                   }
                   return typeface;
                }else {
                   int i2 = 1;
                   if (p8) {
                      if (ozb2.c == null) {
                      label_0041 :
                         typeface = 1;
                      label_0044 :
                         int i3 = -1;
                         zb2 ozb21 = (p8)? ozb2.b: -1;
                         zb2 a = ozb2.a;
                         si4 osi4 = new si4(new u44(ouw5), new Handler(Looper.getMainLooper()));
                         if (typeface) {
                            try{
                               String str = a.w+"-"+i;
                               if ((typeface1 = ub2.a.b(str)) != null) {
                                  osi4.b.post(new ka0(osi4, osi4.a, typeface1, i1));
                               label_0127 :
                                  otb2 = typeface1;
                               }else if(ozb21 == i3){
                                  otb21 = ub2.a(str, uContext, a, i);
                                  osi4.d(otb21);
                                  otb2 = otb21.a;
                               }else {
                                  orb2 = i2;
                                  Context uContext1 = p0;
                                  zb2 ozb22 = a;
                                  i3 = p6;
                                  orb2 = new rb2(str, uContext1, ozb22, i3, 0);
                                  Future uFuture = ub2.b.submit(i2);
                                  try{
                                     long l = (long)ozb21;
                                     otb21 = uFuture.get(l, TimeUnit.MILLISECONDS);
                                     osi4.d(otb21);
                                     otb2 = otb21.a;
                                  }catch(java.util.concurrent.ExecutionException e0){
                                     throw new RuntimeException(e0);
                                  }catch(java.lang.InterruptedException e0){
                                     throw e0;
                                  }catch(java.util.concurrent.TimeoutException e0){
                                     throw new InterruptedException("timeout");
                                  }
                               }
                            }catch(java.lang.InterruptedException e0){
                               yx5 orb21 = new yx5(osi4, osi4.a, -3, 5, 0);
                               osi4.b.post(orb2);
                            }
                         }else {
                            String str1 = a.w+"-"+i;
                            if ((typeface1 = ub2.a.b(str1)) != null) {
                               osi4.b.post(new ka0(osi4, osi4.a, typeface1, i1));
                               goto label_0127 ;
                            }else {
                               sb2 osb2 = new sb2(i1, osi4);
                               c = ub2.c;
                               _monitor_enter(c);
                               wh6 d1 = ub2.d;
                               if ((orDefault = d1.getOrDefault(str1, otb2)) != null) {
                                  orDefault.add(osb2);
                                  _monitor_exit(c);
                               }else {
                                  orDefault = new ArrayList();
                                  orDefault.add(osb2);
                                  d1.put(str1, orDefault);
                                  _monitor_exit(c);
                                  orb2 = new rb2(str1, p0, a, p6, 1);
                                  ThreadPoolExecutor b = ub2.b;
                                  osb2 = new sb2(i2, str1);
                                  Handler handler = (Looper.myLooper() == null)? new Handler(Looper.getMainLooper()): new Handler();
                                  b.execute(new ka0(handler, v11, osb2, 2));
                               }
                            }
                         }
                         i1 = p2;
                      }
                   }else if(ouw5 == null){
                      goto label_0041 ;
                   }
                   c = 0;
                   goto label_0044 ;
                }
             }
          }
          typeface = otb2;
          goto label_002f ;
       }else {
          otb2 = pa7.a.f(uContext, ozb2, p2, i);
          if (ouw5 != null) {
             if (otb2 != null) {
                ouw5.d(otb2);
             }else {
                ouw5.c(-3);
             }
          }
       }
       if (otb2 != null) {
          pa7.b.c(pa7.b(p2, p3, p4, p5, p6), otb2);
       }
       return otb2;
    }
    public static String b(Resources p0,int p1,String p2,int p3,int p4){
       return p0.getResourcePackageName(p1)+'-'+p2+'-'+p3+'-'+p1+'-'+p4;
    }
}
