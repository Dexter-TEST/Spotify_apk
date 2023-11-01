package p.br2;
import p.yq2;
import p.er2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.concurrent.TimeUnit;
import p.nn6;
import p.we7;
import p.np5;
import p.e70;
import java.lang.Math;
import java.net.ProtocolException;
import java.lang.IllegalStateException;
import java.lang.Long;
import java.lang.IllegalArgumentException;

public final class br2 extends yq2	// class@000183 from classes2.dex
{
    public long t;
    public final er2 v;

    public void br2(er2 p0,long p1){
       co5.o(p0, "this$0");
       this.v = p0;
       super(p0);
       this.t = p1;
       if (!(p1)) {
          this.b();
       }
       return;
    }
    public final void close(){
       if (this.b != null) {
          return;
       }
       if ((this.t) && !we7.h(this, TimeUnit.MILLISECONDS)) {
          this.v.b.l();
          this.b();
       }
       this.b = true;
       return;
    }
    public final long o(e70 p0,long p1){
       co5.o(p0, "sink");
       int i = 1;
       int i1 = ((p1) >= 0)? 1: 0;
       if (i1) {
          if ((i ^ this.b)) {
             br2 tt = this.t;
             if (!(tt)) {
                return -1;
             }else {
                long l = super.o(p0, Math.min(tt, p1));
                if (l - -1) {
                   long l1 = this.t - l;
                   this.t = l1;
                   if (!(l1)) {
                      this.b();
                   }
                   return l;
                }else {
                   this.v.b.l();
                   this.b();
                   throw new ProtocolException("unexpected end of stream");
                }
             }
          }else {
             throw new IllegalStateException("closed".toString());
          }
       }else {
          throw new IllegalArgumentException(co5.K(Long.valueOf(p1), "byteCount < 0: ").toString());
       }
    }
}
