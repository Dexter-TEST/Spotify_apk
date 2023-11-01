package p.xg3;
import java.io.Closeable;
import java.io.RandomAccessFile;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;
import p.j32;

public final class xg3 implements Closeable	// class@0003bd from classes2.dex
{
    public boolean a;
    public int b;
    public final RandomAccessFile c;

    public void xg3(RandomAccessFile p0){
       super();
       this.c = p0;
    }
    public final void b(){
       _monitor_enter(this);
       if (this.a != null) {
          _monitor_exit(this);
          return;
       }else {
          this.a = true;
          if (this.b != null) {
             _monitor_exit(this);
             return;
          }else {
             _monitor_exit(this);
             this.f();
             return;
          }
       }
    }
    public final void close(){
       this.b();
    }
    public synchronized final void f(){
       this.c.close();
    }
    public final long size(){
       _monitor_enter(this);
       if (!((this.a ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       _monitor_exit(this);
       return this.x();
    }
    public synchronized final long x(){
       return this.c.length();
    }
    public final j32 y(long p0){
       _monitor_enter(this);
       if (!((this.a ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.b = this.b + 1;
       _monitor_exit(this);
       return new j32(this, p0);
    }
}
