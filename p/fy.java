package p.fy;
import p.nu7;
import p.bl2;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicInteger;
import p.ey;
import java.lang.Class;
import java.lang.Object;
import p.fp0;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.IInterface;
import p.cy;
import java.lang.System;
import android.app.PendingIntent;
import p.x3;
import p.dp0;
import java.lang.StringBuilder;
import java.lang.Exception;

public final class fy extends nu7	// class@001665 from classes.dex
{
    public final bl2 a;

    public void fy(bl2 p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public final void handleMessage(Message p0){
       Message what;
       fy ta1;
       bl2 s;
       int i = 0;
       if (this.a.v.get() != p0.arg1) {
          if ((what = p0.what) == 2 || (what == 1 || what == 7)) {
             i = 1;
          }
          if (i) {
             p0 = p0.obj;
             p0.getClass();
             p0.d();
          }
          return;
       }else {
          what = p0.what;
          int i1 = 4;
          if (what != 1 && what != 7) {
             if (what == i1) {
                this.a.getClass();
             }else if(what == 5){
             label_004b :
                what = p0.what;
                IInterface iInterface = null;
                if (what == i1) {
                   fy ta = this.a;
                   ta.s = new fp0(p0.arg2);
                   if (ta.t == null && (!TextUtils.isEmpty(ta.j()) && !TextUtils.isEmpty(iInterface))) {
                      try{
                         Class.forName(ta.j());
                         i = 1;
                      }catch(java.lang.ClassNotFoundException e0){
                      }
                   }
                   if (i) {
                      ta1 = this.a;
                      if (ta1.t == null) {
                         ta1.o(3, iInterface);
                         return;
                      }
                   }
                   ta1 = this.a;
                   if ((s = ta1.s) == null) {
                      s = new fp0(8);
                   }
                   ta1.i.a(s);
                   this.a.getClass();
                   System.currentTimeMillis();
                   return;
                }else if(what == 5){
                   ta1 = this.a;
                   if ((s = ta1.s) == null) {
                      fp0 uofp0 = new fp0(8);
                   }
                   ta1.i.a(s);
                   this.a.getClass();
                   System.currentTimeMillis();
                   return;
                }else if(what == 3){
                   what = p0.obj;
                   if (what instanceof PendingIntent) {
                      iInterface = what;
                   }
                   this.a.i.a(new fp0(p0.arg2, iInterface));
                   this.a.getClass();
                   System.currentTimeMillis();
                   return;
                }else if(what == 6){
                   this.a.o(5, iInterface);
                   if ((s = this.a.n) != null) {
                      s.a.g(p0.arg2);
                   }
                   this.a.getClass();
                   System.currentTimeMillis();
                   bl2.q(this.a, 5, 1, iInterface);
                   return;
                }else if(what == 2 && !this.a.m()){
                   p0 = p0.obj;
                   p0.getClass();
                   p0.d();
                   return;
                }else if((what = p0.what) != 2 && (what != 1 && what != 7)){
                   i = 1;
                }
                if (i) {
                   p0 = p0.obj;
                   _monitor_enter(p0);
                   ey a = p0.a;
                   if (p0.b != null) {
                      StringBuilder i2 = new StringBuilder((String.valueOf(p0).length() + 47));
                   }
                   _monitor_exit(p0);
                   if (a != null) {
                      try{
                         p0.a(a);
                      }catch(java.lang.RuntimeException e11){
                         throw e11;
                      }
                   }
                   _monitor_enter(p0);
                   p0.b = true;
                   _monitor_exit(p0);
                   p0.d();
                   return;
                }else {
                   Exception uException = new Exception();
                   return;
                }
             }
          }
          if (!this.a.n()) {
             p0 = p0.obj;
             p0.getClass();
             p0.d();
             return;
          }else {
             goto label_004b ;
          }
       }
    }
}
