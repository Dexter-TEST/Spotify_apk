package p.rm1;
import p.ng2;
import p.ww6;
import p.sm1;
import p.km1;
import p.u45;
import java.util.List;
import p.hu1;
import p.n63;
import p.au0;
import java.lang.Object;
import p.cx0;
import p.jc7;
import p.dx0;
import p.eb3;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Class;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import p.r;
import p.uk;
import android.graphics.drawable.Drawable;
import p.fl6;
import p.lv1;
import p.ki0;
import p.ib1;
import java.lang.Integer;
import p.q77;
import p.xw0;
import p.gg1;
import p.ww0;
import p.vw0;
import p.me3;
import p.ve3;
import java.util.concurrent.CancellationException;
import android.content.res.Resources;
import android.content.Context;

public final class rm1 extends ww6 implements ng2	// class@002514 from classes.dex
{
    public Object A;
    public final sm1 B;
    public final km1 C;
    public final u45 D;
    public final List E;
    public final hu1 F;
    public final n63 G;
    public List v;
    public u45 w;
    public int x;
    public int y;
    public int z;

    public void rm1(sm1 p0,km1 p1,u45 p2,List p3,hu1 p4,n63 p5,au0 p6){
       this.B = p0;
       this.C = p1;
       this.D = p2;
       this.E = p3;
       this.F = p4;
       this.G = p5;
       super(p6);
    }
    public final Object b(Object p0,Object p1){
       return this.c(p0, p1).f(jc7.a);
    }
    public final au0 c(Object p0,au0 p1){
       rm1 v8 = new rm1(this.B, this.C, this.D, this.E, this.F, this.G, p1);
       v8.A = p0;
       return v8;
    }
    public final Object f(Object p0){
       rm1 tw;
       rm1 tv;
       rm1 tA;
       rm1 orm1;
       me3 ome3;
       int i1;
       Bitmap bitmap;
       Bitmap$Config config;
       dx0 a = dx0.a;
       rm1 tz = this.z;
       int i = 1;
       if (tz != null) {
          if (tz == i) {
             tz = this.y;
             rm1 tx = this.x;
             tw = this.w;
             tv = this.v;
             tA = this.A;
             eb3.G(p0);
             orm1 = this;
          label_00ba :
             if ((ome3 = tA.c().f(gg1.y)) != null && !ome3.b()) {
                throw ome3.o();
             }else {
                i1 = tx + i;
             }
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          eb3.G(p0);
          p0 = this.A;
          km1 a2 = this.C.a;
          this.B.getClass();
          tw = this.D;
          if (a2 instanceof BitmapDrawable) {
             bitmap = a2.getBitmap();
             if ((config = bitmap.getConfig()) == null) {
                config = Bitmap$Config.ARGB_8888;
             }
             if (uk.i0(r.a, config)) {
             label_005d :
                this.F.getClass();
                tz = this.E;
                orm1 = this;
                tA = p0;
                p0 = bitmap;
                i1 = 0;
                tv = tz;
                int i2 = tz.size();
             }
          }
          bitmap = lv1.i(a2, tw.b, tw.d, tw.e, tw.f);
          goto label_005d ;
       }
       if (i1 < tz) {
          ki0 oki0 = tv.get(i1);
          u45 d = tw.d;
          orm1.A = tA;
          orm1.v = tv;
          orm1.w = tw;
          orm1.x = i1;
          orm1.y = tz;
          orm1.z = i;
          oki0.getClass();
          fl6 a1 = d.a;
          ib1 h = (a1 instanceof ib1)? a1.H: p0.getWidth();
          Integer integer = new Integer(h);
          fl6 b = d.b;
          ib1 h1 = (b instanceof ib1)? b.H: p0.getHeight();
          if ((p0 = oki0.b.b(p0, integer, new Integer(h1))) == a) {
             return a;
          }else {
             goto label_00ba ;
          }
       }else {
          orm1.F.getClass();
          p0 = orm1.C;
          return new km1(new BitmapDrawable(orm1.G.a.getResources(), p0), p0.b, p0.c, p0.d);
       }
    }
}
