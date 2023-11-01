package p.ip5;
import java.lang.Runnable;
import p.lp5;
import p.da0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.concurrent.atomic.AtomicInteger;
import p.bv5;
import p.os2;
import p.ps2;
import p.gg1;
import java.lang.Thread;
import p.pn;
import p.cx5;
import p.t90;
import p.g15;
import java.io.IOException;
import java.lang.Throwable;
import p.io2;
import p.re5;
import java.lang.Class;
import p.kc1;

public final class ip5 implements Runnable	// class@000247 from classes2.dex
{
    public final da0 a;
    public AtomicInteger b;
    public final lp5 c;

    public void ip5(lp5 p0,da0 p1){
       co5.o(p0, "this$0");
       this.c = p0;
       super();
       this.a = p1;
       this.b = new AtomicInteger(0);
    }
    public final void run(){
       lp5 a;
       g15 a1;
       os2 oos2 = this.c.b.a.g("/...");
       co5.i(oos2);
       boolean b = false;
       oos2.b = gg1.i("", 0, 0, " \"\':;<=>@[]^`{}|/\\?#", b, false, false, false, 251);
       oos2.c = gg1.i("", 0, b, " \"\':;<=>@[]^`{}|/\\?#", 0, 0, 0, 0, 251);
       ip5 tc = this.c;
       Thread thread = Thread.currentThread();
       String name = thread.getName();
       thread.setName(co5.K(oos2.b().i, "OkHttp "));
       tc.w.h();
       try{
          oos2 = 0;
          cx5 uocx5 = tc.h();
          try{
             int i = 1;
             this.a.onResponse(tc, uocx5);
             a = tc.a;
          label_0063 :
             a1 = a.a;
             a1.c(this);
             thread.setName(name);
             return;
          }catch(java.io.IOException e0){
             Throwable throwable = e0;
             a1 = 1;
          }
          if (uocx5) {
             re5.a.getClass();
             re5.i(4, co5.K(lp5.a(tc), "Callback failure for "), e4);
          }else {
             this.a.onFailure(tc, e4);
          }
          a = tc.a;
          goto label_0063 ;
       }catch(java.io.IOException e4){
       }
    }
}
