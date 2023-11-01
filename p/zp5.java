package p.zp5;
import p.n63;
import java.util.List;
import p.fl6;
import p.hu1;
import java.lang.Object;
import p.qb3;
import p.rn4;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;
import p.au0;
import p.xp5;
import p.dx0;
import p.eb3;
import p.sm1;
import p.p63;

public final class zp5	// class@002f41 from classes.dex
{
    public final n63 a;
    public final List b;
    public final int c;
    public final n63 d;
    public final fl6 e;
    public final hu1 f;
    public final boolean g;

    public void zp5(n63 p0,List p1,int p2,n63 p3,fl6 p4,hu1 p5,boolean p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final void a(n63 p0,qb3 p1){
       zp5 ta = this.a;
       int i = 1;
       int i1 = (p0.a == ta.a)? 1: 0;
       if (i1) {
          i1 = (p0.b != rn4.a)? 1: 0;
          if (i1) {
             i1 = (p0.c == ta.c)? 1: 0;
             if (i1) {
                i1 = (p0.A == ta.A)? 1: 0;
                if (i1) {
                   if (p0.B != ta.B) {
                      i = 0;
                   }
                   if (i) {
                      return;
                   }else {
                      throw new IllegalStateException("Interceptor \'"+p1+"\' cannot modify the request\'s size resolver. Use `Interceptor.Chain.withSize` instead.".toString());
                   }
                }else {
                   throw new IllegalStateException("Interceptor \'"+p1+"\' cannot modify the request\'s lifecycle.".toString());
                }
             }else {
                throw new IllegalStateException("Interceptor \'"+p1+"\' cannot modify the request\'s target.".toString());
             }
          }else {
             throw new IllegalStateException("Interceptor \'"+p1+"\' cannot set the request\'s data to null.".toString());
          }
       }else {
          throw new IllegalStateException("Interceptor \'"+p1+"\' cannot modify the request\'s context.".toString());
       }
    }
    public final Object b(n63 p0,au0 p1){
       xp5 oxp5;
       xp5 y1;
       xp5 v;
       zp5 tc;
       if (p1 instanceof xp5) {
          oxp5 = p1;
          xp5 y = oxp5.y;
          int i = Integer.MIN_VALUE;
          if ((y & i)) {
             oxp5.y = y - i;
          label_0018 :
             xp5 w = oxp5.w;
             dx0 a = dx0.a;
             if ((y1 = oxp5.y) != null) {
                if (y1 == 1) {
                   v = oxp5.v;
                   oxp5 = oxp5.t;
                   eb3.G(w);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                eb3.G(w);
                zp5 tb = this.b;
                if ((tc = this.c) > null) {
                   this.a(p0, tb.get((tc - 1)));
                }
                qb3 oqb3 = tb.get(tc);
                tc = new zp5(this.a, this.b, (tc + 1), p0, this.e, this.f, this.g);
                oxp5.t = this;
                oxp5.v = oqb3;
                oxp5.y = 1;
                v = oqb3;
                if ((w = v.d(tc, oxp5)) == a) {
                   return a;
                }else {
                   zp5 ozp5 = this;
                }
             }
             oxp5.a(w.a(), v);
             return w;
          }
       }
       oxp5 = new xp5(this, p1);
       goto label_0018 ;
    }
}
