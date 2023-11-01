package p.ax5;
import java.lang.Object;
import p.sm2;
import p.cx5;
import java.lang.String;
import p.co5;
import p.mp2;
import java.lang.IllegalArgumentException;
import p.bv5;
import p.sm5;
import p.zn2;
import p.fx5;
import p.l67;
import java.lang.IllegalStateException;
import java.lang.Integer;

public final class ax5	// class@001010 from classes.dex
{
    public bv5 a;
    public sm5 b;
    public int c;
    public String d;
    public zn2 e;
    public sm2 f;
    public fx5 g;
    public cx5 h;
    public cx5 i;
    public cx5 j;
    public long k;
    public long l;
    public l67 m;

    public void ax5(){
       super();
       this.c = -1;
       this.f = new sm2();
    }
    public void ax5(cx5 p0){
       co5.o(p0, "response");
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.t;
       this.d = p0.c;
       this.e = p0.v;
       this.f = p0.w.d();
       this.g = p0.x;
       this.h = p0.y;
       this.i = p0.z;
       this.j = p0.A;
       this.k = p0.B;
       this.l = p0.C;
       this.m = p0.D;
    }
    public static void b(String p0,cx5 p1){
       if (p1 == null) {
       }else {
          int i = 0;
          int i1 = (p1.x == null)? 1: 0;
          if (i1) {
             i1 = (p1.y == null)? 1: 0;
             if (i1) {
                i1 = (p1.z == null)? 1: 0;
                if (i1) {
                   if (p1.A == null) {
                      i = 1;
                   }
                   if (!i) {
                      throw new IllegalArgumentException(co5.K(".priorResponse != null", p0).toString());
                   }
                }else {
                   throw new IllegalArgumentException(co5.K(".cacheResponse != null", p0).toString());
                }
             }else {
                throw new IllegalArgumentException(co5.K(".networkResponse != null", p0).toString());
             }
          }else {
             throw new IllegalArgumentException(co5.K(".body != null", p0).toString());
          }
       }
       return;
    }
    public final cx5 a(){
       ax5 c;
       ax5 a;
       ax5 b;
       ax5 d;
       ax5 uoax5 = this;
       int i = ((c = uoax5.c) >= null)? 1: 0;
       if (i) {
          if ((a = uoax5.a) != null) {
             if ((b = uoax5.b) != null) {
                if ((d = uoax5.d) != null) {
                   cx5 v17 = new cx5(a, b, d, c, uoax5.e, uoax5.f.e(), uoax5.g, uoax5.h, uoax5.i, uoax5.j, uoax5.k, uoax5.l, uoax5.m);
                   return v17;
                }else {
                   throw new IllegalStateException("message == null".toString());
                }
             }else {
                throw new IllegalStateException("protocol == null".toString());
             }
          }else {
             throw new IllegalStateException("request == null".toString());
          }
       }else {
          throw new IllegalStateException(co5.K(Integer.valueOf(c), "code < 0: ").toString());
       }
    }
    public final void c(mp2 p0){
       co5.o(p0, "headers");
       this.f = p0.d();
    }
}
