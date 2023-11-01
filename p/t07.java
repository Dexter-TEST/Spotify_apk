package p.t07;
import java.lang.Runnable;
import p.u07;
import java.lang.Object;
import p.i07;
import p.co5;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.r07;
import java.lang.Class;
import java.lang.System;
import java.lang.String;
import p.is7;
import p.s07;
import java.util.concurrent.ThreadPoolExecutor;

public final class t07 implements Runnable	// class@00033d from classes2.dex
{
    public final u07 a;

    public void t07(u07 p0){
       this.a = p0;
       super();
    }
    public final void run(){
       boolean b;
       long l;
       while (true) {
          t07 ta = this.a;
          _monitor_enter(ta);
          i07 oi07 = ta.c();
          _monitor_exit(ta);
          if (oi07 == null) {
             break ;
          }else {
             i07 c = oi07.c;
             co5.i(c);
             t07 ta1 = this.a;
             if (b = u07.i.isLoggable(Level.FINE)) {
                c.a.a.getClass();
                l = System.nanoTime();
                is7.c(oi07, c, "starting");
             }else {
                l = -1;
             }
             u07.a(ta1, oi07);
             if (b) {
                c.a.a.getClass();
                long l1 = System.nanoTime() - l;
                is7.c(oi07, c, co5.K(is7.m(l1), "finished run in "));
             }
          }
       }
       return;
    }
}
