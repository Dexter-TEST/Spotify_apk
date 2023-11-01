package p.yb1;
import java.io.Closeable;
import p.ec1;
import p.wb1;
import java.lang.Object;
import p.m95;
import java.util.ArrayList;
import java.lang.IllegalStateException;
import java.lang.String;

public final class yb1 implements Closeable	// class@002d83 from classes.dex
{
    public final wb1 a;
    public boolean b;
    public final ec1 c;

    public void yb1(ec1 p0,wb1 p1){
       this.c = p0;
       this.a = p1;
    }
    public final m95 b(int p0){
       if ((this.b ^ 0x01)) {
          return this.a.c.get(p0);
       }
       throw new IllegalStateException("snapshot is closed".toString());
    }
    public final void close(){
       if (this.b == null) {
          this.b = true;
          yb1 tc = this.c;
          _monitor_enter(tc);
          yb1 ta = this.a;
          int i = ta.h - 1;
          ta.h = i;
          if (!i && ta.f != null) {
             tc.k0(ta);
          }
          _monitor_exit(tc);
       }
       return;
    }
}
