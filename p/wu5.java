package p.wu5;
import p.zw;
import p.xu5;
import java.util.List;
import java.lang.String;
import java.lang.Throwable;
import android.util.Log;
import java.lang.Thread;
import p.fy0;
import p.ly0;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import p.ru5;
import java.lang.Math;

public final class wu5 extends zw	// class@002bac from classes.dex
{
    public final List a;
    public final boolean b;
    public final float c;
    public final xu5 t;

    public void wu5(xu5 p0,List p1,boolean p2,float p3){
       this.t = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public final void a(){
       try{
          this.b(this.a, this.b);
       }catch(java.lang.Exception e0){
          Log.e("FirebaseCrashlytics", "An unexpected error occurred while attempting to upload crash reports.", e0);
       }
       this.t.g = null;
       return;
    }
    public final void b(List p0,boolean p1){
       Log.isLoggable("FirebaseCrashlytics", 3);
       wu5 tc = this.c;
       if ((0 - tc) > 0) {
          long l = (long)(tc * 1000.00f);
          try{
             Thread.sleep(l);
          }catch(java.lang.InterruptedException e0){
             Thread.currentThread().interrupt();
             return;
          }
       }
       wu5 tt = this.t;
       if (tt.f.a.j()) {
          return;
       }else {
          int i = 0;
          while (true) {
             if (p0.size() <= 0) {
                return;
             }
             if (tt.f.a.j()) {
                break ;
             }else {
                p0.size();
                Log.isLoggable("FirebaseCrashlytics", 3);
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = p0.iterator();
                while (iterator.hasNext()) {
                   ru5 oru5 = iterator.next();
                   if (!tt.a(oru5, p1)) {
                      uArrayList.add(oru5);
                   }
                }
                if (uArrayList.size() > 0) {
                   int i1 = i + 1;
                   long l1 = (long)xu5.h[Math.min(i, 5)];
                   Log.isLoggable("FirebaseCrashlytics", 3);
                   try{
                      l1 = l1 * 1000;
                      Thread.sleep(l1);
                      i = i1;
                   }catch(java.lang.InterruptedException e0){
                      Thread.currentThread().interrupt();
                      return;
                   }
                }
                ArrayList uArrayList1 = uArrayList;
             }
          }
          return;
       }
    }
}
