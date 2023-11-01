package p.cr2;
import p.el6;
import p.er2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.yc2;
import p.b57;
import p.gp5;
import java.util.zip.Deflater;
import p.e70;
import p.we7;
import java.lang.IllegalStateException;
import p.u96;
import java.lang.Math;
import p.x96;
import p.f70;
import java.lang.Class;
import java.lang.StringBuilder;

public final class cr2 implements el6	// class@0001a2 from classes2.dex
{
    public final int a;
    public boolean b;
    public final Object c;
    public final Object t;

    public void cr2(er2 p0){
       this.a = 0;
       co5.o(p0, "this$0");
       this.t = p0;
       super();
       this.c = new yc2(p0.d.e());
    }
    public void cr2(gp5 p0,Deflater p1){
       this.a = 1;
       super();
       this.c = p0;
       this.t = p1;
    }
    public final void I(e70 p0,long p1){
       cr2 tt = this.t;
       String str = "source";
       switch (this.a){
           case 0:
             break;
           default:
             co5.o(p0, str);
             co5.p(p0.b, 0, p1);
             while ((p1) > 0) {
                e70 a = p0.a;
                co5.i(a);
                int i = a.c - a.b;
                int i1 = (int)Math.min(p1, (long)i);
                tt.setInput(a.a, a.b, i1);
                this.b(false);
                long l = (long)i1;
                long l1 = p0.b - l;
                p0.b = l1;
                i = a.b + i1;
                a.b = i;
                if (i == a.c) {
                   p0.a = a.a();
                   x96.a(a);
                }
                p1 = p1 - l;
             }
             return;
       }
       co5.o(p0, str);
       if ((this.b ^ 0x01)) {
          we7.c(p0.b, 0, p1);
          tt.d.I(p0, p1);
          return;
       }else {
          throw new IllegalStateException("closed".toString());
       }
    }
    public final void b(boolean p0){
       u96 c;
       int i;
       int i1;
       cr2 tc = this.c;
       e70 uoe70 = tc.c();
       while (true) {
          u96 ou96 = uoe70.t0(1);
          cr2 tt = this.t;
          u96 a = ou96.a;
          if (p0) {
             c = ou96.c;
             i = c - 8192;
             i1 = tt.deflate(a, c, i, 2);
          label_002c :
             if (i1 > 0) {
                int i2 = ou96.c + i1;
                ou96.c = i2;
                long l = uoe70.b + (long)i1;
                uoe70.b = l;
                tc.K();
             }else if(tt.needsInput()){
                if (ou96.b == ou96.c) {
                   uoe70.a = ou96.a();
                   x96.a(ou96);
                   break ;
                }
                break ;
             }
          }else {
             c = ou96.c;
             i = c - 8192;
             i1 = tt.deflate(a, c, i);
             goto label_002c ;
          }
       }
       return;
    }
    public final void close(){
       cr2 tc = this.c;
       cr2 tt = this.t;
       boolean b = true;
       switch (this.a){
           case 0:
             if (this.b == null) {
                this.b = b;
                tt.getClass();
                yc2 e = tc.e;
                tc.e = b57.d;
                e.a();
                e.b();
                tt.e = 3;
             }
             break;
           default:
             if (this.b == null) {
                tt.finish();
                this.b(false);
                void ovoid = null;
                tt.end();
                tc.close();
                this.b = b;
                if (ovoid) {
                   throw ovoid;
                }
             }
             return;
       }
       return;
    }
    public final b57 e(){
       cr2 tc = this.c;
       switch (this.a){
           case 0:
           default:
             return tc.e();
       }
       return tc;
    }
    public final void flush(){
       switch (this.a){
           case 0:
             break;
           default:
             this.b(true);
             this.c.flush();
             return;
       }
       if (this.b == null) {
          this.t.d.flush();
       }
       return;
    }
    public final String toString(){
       switch (this.a){
           case 1:
           default:
             return super.toString();
       }
       return "DeflaterSink\("+this.c+')';
    }
}
