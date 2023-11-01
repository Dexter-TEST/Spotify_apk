package p.zq2;
import p.el6;
import p.er2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.yc2;
import p.b57;
import p.e70;
import p.f70;
import java.lang.IllegalStateException;
import java.lang.Class;

public final class zq2 implements el6	// class@0003f8 from classes2.dex
{
    public final yc2 a;
    public boolean b;
    public final er2 c;

    public void zq2(er2 p0){
       co5.o(p0, "this$0");
       this.c = p0;
       super();
       this.a = new yc2(p0.d.e());
    }
    public final void I(e70 p0,long p1){
       co5.o(p0, "source");
       if (!((this.b ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       if (!(p1)) {
          return;
       }
       zq2 tc = this.c;
       tc.d.m(p1);
       tc.d.W("\r\n");
       tc.d.I(p0, p1);
       tc.d.W("\r\n");
       return;
    }
    public synchronized final void close(){
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.c.d.W("0\r\n\r\n");
       zq2 ta = this.a;
       this.c.getClass();
       yc2 e = ta.e;
       ta.e = b57.d;
       e.a();
       e.b();
       this.c.e = 3;
       return;
    }
    public final b57 e(){
       return this.a;
    }
    public synchronized final void flush(){
       if (this.b != null) {
          return;
       }
       this.c.d.flush();
       return;
    }
}
