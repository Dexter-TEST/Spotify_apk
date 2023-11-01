package p.i0;
import p.au0;
import p.cx0;
import p.ve3;
import p.xw0;
import p.gg1;
import p.ww0;
import p.vw0;
import p.me3;
import java.lang.String;
import java.lang.Object;
import p.ul0;
import p.ng2;
import p.jc7;
import p.w51;
import p.eo5;
import p.dx0;
import java.lang.Throwable;
import p.tx5;
import p.eb3;
import p.cd2;
import p.ye7;
import p.zf2;
import p.ux5;
import p.ox7;
import java.lang.Class;
import p.is7;

public abstract class i0 extends ve3 implements au0, cx0	// class@0018ff from classes.dex
{
    public final xw0 b;

    public void i0(xw0 p0,boolean p1){
       super(p1);
       this.w(p0.f(gg1.y));
       this.b = p0.T(this);
    }
    public final String C(){
       return super.C();
    }
    public final void F(Object p0){
       if (p0 instanceof ul0) {
          p0 = p0.a;
       }
       return;
    }
    public void M(Object p0){
       this.g(p0);
    }
    public final void N(int p0,i0 p1,ng2 p2){
       Object obj = null;
       if (!p0) {
          throw obj;
       }
       p0--;
       jc7 a = jc7.a;
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 == 3) {
                   i0 tb = this.b;
                   eo5.f(p2);
                   p1 = p2.b(p1, this);
                   w51.N(tb, w51.W(tb, obj));
                   if (p1 != dx0.a) {
                      this.d(p1);
                   }
                }else {
                   throw new cd2(10);
                }
             }else {
                ye7.E(ye7.p(p1, this, p2)).d(a);
             }
          }
       }else {
          w51.O(ye7.E(ye7.p(p1, this, p2)), a, obj);
       }
       return;
    }
    public final boolean b(){
       return super.b();
    }
    public final xw0 c(){
       return this.b;
    }
    public final void d(Object p0){
       Throwable throwable;
       if ((throwable = ux5.a(p0)) == null) {
       }else {
          p0 = new ul0(throwable, false);
       }
       if ((p0 = this.B(p0)) == ox7.w) {
          return;
       }else {
          this.M(p0);
          return;
       }
    }
    public final xw0 getContext(){
       return this.b;
    }
    public final String j(){
       return this.getClass().getSimpleName().concat(" was cancelled");
    }
    public final void v(cd2 p0){
       is7.r(this.b, p0);
    }
}
