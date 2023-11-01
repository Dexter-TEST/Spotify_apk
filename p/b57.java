package p.b57;
import p.a57;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Thread;
import java.lang.System;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p.co5;
import p.kg4;
import java.lang.IllegalArgumentException;

public class b57	// class@000177 from classes2.dex
{
    public boolean a;
    public long b;
    public long c;
    public static final a57 d;

    static {
       b57.d = new a57();
    }
    public void b57(){
       super();
    }
    public b57 a(){
       this.a = false;
       return this;
    }
    public b57 b(){
       this.c = 0;
       return this;
    }
    public long c(){
       if (this.a != null) {
          return this.b;
       }
       throw new IllegalStateException("No deadline".toString());
    }
    public b57 d(long p0){
       this.a = true;
       this.b = p0;
       return this;
    }
    public boolean e(){
       return this.a;
    }
    public void f(){
       if (Thread.currentThread().isInterrupted()) {
          throw new InterruptedIOException("interrupted");
       }
       if (this.a != null && ((this.b - System.nanoTime())) <= 0) {
          throw new InterruptedIOException("deadline reached");
       }
       return;
    }
    public b57 g(long p0,TimeUnit p1){
       co5.o(p1, "unit");
       int i = ((p0) >= 0)? 1: 0;
       if (i) {
          this.c = p1.toNanos(p0);
          return this;
       }else {
          throw new IllegalArgumentException(kg4.k("timeout < 0: ", p0).toString());
       }
    }
}
