package p.ar2;
import p.yq2;
import p.er2;
import p.ps2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.concurrent.TimeUnit;
import p.nn6;
import p.we7;
import p.np5;
import p.e70;
import p.g70;
import java.lang.CharSequence;
import p.av6;
import p.mp2;
import p.op2;
import p.g15;
import p.vu0;
import p.es2;
import java.lang.Math;
import java.net.ProtocolException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import java.lang.Long;
import java.lang.IllegalArgumentException;

public final class ar2 extends yq2	// class@00016a from classes2.dex
{
    public final ps2 t;
    public long v;
    public boolean w;
    public final er2 x;

    public void ar2(er2 p0,ps2 p1){
       co5.o(p0, "this$0");
       co5.o(p1, "url");
       this.x = p0;
       super(p0);
       this.t = p1;
       this.v = -1;
       this.w = true;
    }
    public final void close(){
       if (this.b != null) {
          return;
       }
       if (this.w != null && !we7.h(this, TimeUnit.MILLISECONDS)) {
          this.x.b.l();
          this.b();
       }
       this.b = true;
       return;
    }
    public final long o(e70 p0,long p1){
       co5.o(p0, "sink");
       int i = 1;
       boolean b = false;
       int i1 = 0;
       int i2 = ((p1 - i1) >= 0)? 1: 0;
       if (i2) {
          if ((this.b ^ i)) {
             if (this.w == null) {
                return -1;
             }else {
                try{
                   ar2 tv = this.v;
                   ar2 tx = this.x;
                   if (!(tv - i1) || !(tv - -1)) {
                      if (tv - -1) {
                         tx.c.B();
                      }
                      this.v = tx.c.b0();
                      String str = av6.K0(tx.c.B()).toString();
                      if ((this.v - i1) >= 0) {
                         if (str.length() <= 0) {
                            i = 0;
                         }
                         if (!i || av6.D0(str, ";", b)) {
                            if (!(this.v - i1)) {
                               this.w = b;
                               tx.g = tx.f.a();
                               er2 a = tx.a;
                               co5.i(a);
                               er2 g = tx.g;
                               co5.i(g);
                               es2.b(a.A, this.t, g);
                               this.b();
                            }
                            if (this.w == null) {
                               return -1;
                            }
                         }
                      }
                      throw new ProtocolException("expected chunk size and optional extensions but was \""+this.v+str+'"');
                   }
                   long l = super.o(p0, Math.min(p1, this.v));
                   if (l - -1) {
                      this.v = this.v - l;
                      return l;
                   }else {
                      tx.b.l();
                      this.b();
                      throw new ProtocolException("unexpected end of stream");
                   }
                }catch(java.lang.NumberFormatException e13){
                   throw new ProtocolException(e13.getMessage());
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
