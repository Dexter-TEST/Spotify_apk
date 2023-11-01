package p.up5;
import p.ng2;
import p.ww6;
import p.n63;
import p.wp5;
import p.fl6;
import p.hu1;
import android.graphics.Bitmap;
import p.au0;
import java.lang.Object;
import p.cx0;
import p.jc7;
import p.dx0;
import p.eb3;
import java.lang.IllegalStateException;
import java.lang.String;
import p.zp5;
import java.util.List;

public final class up5 extends ww6 implements ng2	// class@0028f7 from classes.dex
{
    public final Bitmap A;
    public int v;
    public final n63 w;
    public final wp5 x;
    public final fl6 y;
    public final hu1 z;

    public void up5(n63 p0,wp5 p1,fl6 p2,hu1 p3,Bitmap p4,au0 p5){
       this.w = p0;
       this.x = p1;
       this.y = p2;
       this.z = p3;
       this.A = p4;
       super(p5);
    }
    public final Object b(Object p0,Object p1){
       return this.c(p0, p1).f(jc7.a);
    }
    public final au0 c(Object p0,au0 p1){
       up5 p0 = new up5(this.w, this.x, this.y, this.z, this.A, p1);
       return p0;
    }
    public final Object f(Object p0){
       up5 tv;
       zp5 p0;
       dx0 a = dx0.a;
       if ((tv = this.v) != null) {
          if (tv == 1) {
             eb3.G(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          eb3.G(p0);
          tv = this.w;
          wp5 g = this.x.g;
          up5 ty = this.y;
          up5 tz = this.z;
          boolean b = (this.A != null)? true: false;
          p0 = new zp5(tv, g, 0, tv, ty, tz, b);
          this.v = 1;
          if ((p0 = p0.b(tv, this)) == a) {
             return a;
          }
       }
       return p0;
    }
}
