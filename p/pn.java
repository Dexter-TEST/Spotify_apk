package p.pn;
import p.b57;
import java.util.concurrent.TimeUnit;
import p.ff7;
import java.lang.Thread;
import java.lang.System;
import java.lang.Math;
import java.lang.Object;
import p.co5;
import java.lang.AssertionError;
import java.lang.IllegalStateException;
import java.lang.String;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.Throwable;

public class pn extends b57	// class@0002ff from classes2.dex
{
    public boolean e;
    public pn f;
    public long g;
    public static final long h;
    public static final long i;
    public static pn j;

    static {
       long l = TimeUnit.SECONDS.toMillis(60);
       pn.h = l;
       pn.i = TimeUnit.MILLISECONDS.toNanos(l);
    }
    public void pn(){
       super();
    }
    public final void h(){
       pn f;
       b57 tc = this.c;
       b57 ta = this.a;
       if (!(v5 = tc) && ta == null) {
          return;
       }
       _monitor_enter(pn.class);
       int i = 1;
       if (!((this.e ^ i))) {
          throw new IllegalStateException("Unbalanced enter/exit".toString());
       }
       this.e = i;
       if (pn.j == null) {
          pn.j = new pn();
          new ff7().start();
       }
       long l = System.nanoTime();
       if (v5 && ta != null) {
          this.g = Math.min(tc, (this.c() - l)) + l;
       }else if(v5){
          this.g = tc + l;
       }else if(ta != null){
          this.g = this.c();
       }else {
          throw new AssertionError();
       }
       long l1 = this.g - l;
       pn j = pn.j;
       co5.i(j);
       while ((f = j.f) != null) {
          long l2 = f.g - l;
          if ((l1 - l2) < 0) {
             break ;
          }
          j = f;
       }
       this.f = f;
       if ((j.f = this) == pn.j) {
          pn.class.notify();
       }
       _monitor_exit(pn.class);
       return;
    }
    public final boolean i(){
       pn f;
       _monitor_enter(pn.class);
       boolean b = false;
       if (this.e == null) {
          _monitor_exit(pn.class);
       }else {
          this.e = b;
          pn j = pn.j;
          while (true) {
             if (j != null) {
                if ((f = j.f) == this) {
                   j.f = this.f;
                   this.f = null;
                   _monitor_exit(pn.class);
                   break ;
                }else {
                   j = f;
                }
             }else {
                _monitor_exit(pn.class);
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public InterruptedIOException j(IOException p0){
       InterruptedIOException interruptedI = new InterruptedIOException("timeout");
       if (p0 != null) {
          interruptedI.initCause(p0);
       }
       return interruptedI;
    }
    public void k(){
    }
}
