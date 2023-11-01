package p.nn2;
import p.el6;
import java.lang.Object;
import p.gp5;
import java.util.zip.Deflater;
import p.cr2;
import java.util.zip.CRC32;
import p.e70;
import java.lang.String;
import p.co5;
import p.u96;
import java.lang.Math;
import p.kg4;
import java.lang.IllegalArgumentException;
import p.b57;

public final class nn2 implements el6	// class@0002cf from classes2.dex
{
    public final gp5 a;
    public final Deflater b;
    public final cr2 c;
    public boolean t;
    public final CRC32 v;

    public void nn2(el6 p0){
       super();
       gp5 ogp5 = new gp5(p0);
       this.a = ogp5;
       Deflater uDeflater = new Deflater(-1, true);
       this.b = uDeflater;
       this.c = new cr2(ogp5, uDeflater);
       this.v = new CRC32();
       gp5 b = ogp5.b;
       b.z0(8075);
       b.v0(8);
       b.v0(0);
       b.y0(0);
       b.v0(0);
       b.v0(0);
    }
    public final void I(e70 p0,long p1){
       co5.o(p0, "source");
       int i = 0;
       int i1 = ((v2 = p1 - i) >= 0)? 1: 0;
       if (i1) {
          if (!v2) {
             return;
          }else {
             e70 a = p0.a;
             co5.i(a);
             long l = p1;
             while ((l - i) > 0) {
                int i2 = a.c - a.b;
                int i3 = (int)Math.min(l, (long)i2);
                this.v.update(a.a, a.b, i3);
                l = l - (long)i3;
                co5.i(a.f);
             }
             this.c.I(p0, p1);
             return;
          }
       }else {
          throw new IllegalArgumentException(kg4.k("byteCount < 0: ", p1).toString());
       }
    }
    public final void close(){
       nn2 tb = this.b;
       nn2 ta = this.a;
       if (this.t != null) {
          return;
       }
       nn2 tc = this.c;
       tc.t.finish();
       tc.b(false);
       ta.b((int)this.v.getValue());
       ta.b((int)tb.getBytesRead());
       void ovoid = null;
       tb.end();
       ta.close();
       this.t = true;
       if (!ovoid) {
          return;
       }
       throw ovoid;
    }
    public final b57 e(){
       return this.a.e();
    }
    public final void flush(){
       this.c.flush();
    }
}
