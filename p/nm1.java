package p.nm1;
import p.ng2;
import p.ww6;
import p.sm1;
import p.ks5;
import p.n63;
import java.lang.Object;
import p.hu1;
import p.au0;
import p.cx0;
import p.jc7;
import p.dx0;
import p.eb3;
import java.lang.IllegalStateException;
import java.lang.String;
import p.qn6;
import p.an0;
import p.u45;

public final class nm1 extends ww6 implements ng2	// class@002005 from classes.dex
{
    public final Object A;
    public final ks5 B;
    public final hu1 C;
    public int v;
    public final sm1 w;
    public final ks5 x;
    public final ks5 y;
    public final n63 z;

    public void nm1(sm1 p0,ks5 p1,ks5 p2,n63 p3,Object p4,ks5 p5,hu1 p6,au0 p7){
       this.w = p0;
       this.x = p1;
       this.y = p2;
       this.z = p3;
       this.A = p4;
       this.B = p5;
       this.C = p6;
       super(p7);
    }
    public final Object b(Object p0,Object p1){
       return this.c(p0, p1).f(jc7.a);
    }
    public final au0 c(Object p0,au0 p1){
       nm1 p0 = new nm1(this.w, this.x, this.y, this.z, this.A, this.B, this.C, p1);
       return p0;
    }
    public final Object f(Object p0){
       dx0 a = dx0.a;
       nm1 tv = this.v;
       int i = 1;
       if (tv != null) {
          if (tv == i) {
             eb3.G(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          eb3.G(p0);
          this.v = i;
          if ((p0 = sm1.a(this.w, this.x.a, this.y.a, this.z, this.A, this.B.a, this.C, this)) == a) {
             return a;
          }
       }
       return p0;
    }
}
