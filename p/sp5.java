package p.sp5;
import p.ng2;
import p.ww6;
import p.wp5;
import p.n63;
import p.au0;
import java.lang.Object;
import p.cx0;
import p.jc7;
import p.dx0;
import p.eb3;
import java.lang.IllegalStateException;
import java.lang.String;
import p.p63;
import p.to1;
import java.lang.Class;

public final class sp5 extends ww6 implements ng2	// class@002675 from classes.dex
{
    public int v;
    public final wp5 w;
    public final n63 x;

    public void sp5(wp5 p0,n63 p1,au0 p2){
       this.w = p0;
       this.x = p1;
       super(p2);
    }
    public final Object b(Object p0,Object p1){
       return this.c(p0, p1).f(jc7.a);
    }
    public final au0 c(Object p0,au0 p1){
       return new sp5(this.w, this.x, p1);
    }
    public final Object f(Object p0){
       dx0 a = dx0.a;
       sp5 tv = this.v;
       sp5 tw = this.w;
       if (tv != null) {
          if (tv == 1) {
             eb3.G(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          eb3.G(p0);
          this.v = 1;
          if ((p0 = wp5.a(tw, this.x, this)) == a) {
             return a;
          }
       }
       if (p0 instanceof to1) {
          tw.getClass();
       }
       return p0;
    }
}
