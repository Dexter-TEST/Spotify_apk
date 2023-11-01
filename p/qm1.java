package p.qm1;
import p.ng2;
import p.ww6;
import p.sm1;
import p.n63;
import java.lang.Object;
import p.u45;
import p.hu1;
import p.x54;
import p.zp5;
import p.au0;
import p.cx0;
import p.jc7;
import p.dx0;
import p.eb3;
import java.lang.IllegalStateException;
import java.lang.String;
import p.km1;
import java.lang.Class;
import p.en6;
import p.z54;
import p.wp5;
import p.ui3;
import p.aq5;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.lang.Boolean;
import java.util.Map;
import p.vv7;
import p.dv6;
import p.r;
import p.qv6;
import android.graphics.drawable.Drawable;

public final class qm1 extends ww6 implements ng2	// class@0023cb from classes.dex
{
    public final hu1 A;
    public final x54 B;
    public final zp5 C;
    public int v;
    public final sm1 w;
    public final n63 x;
    public final Object y;
    public final u45 z;

    public void qm1(sm1 p0,n63 p1,Object p2,u45 p3,hu1 p4,x54 p5,zp5 p6,au0 p7){
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
       qm1 p0 = new qm1(this.w, this.x, this.y, this.z, this.A, this.B, this.C, p1);
       return p0;
    }
    public final Object f(Object p0){
       qm1 tv;
       km1 a1;
       qv6 p0.g;
       aq5 value;
       Bitmap bitmap;
       dx0 a = dx0.a;
       if ((tv = this.v) != null) {
          if (tv == 1) {
             eb3.G(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          eb3.G(p0);
          this.v = 1;
          if ((p0 = sm1.b(this.w, this.x, this.y, this.z, this.A, this)) == a) {
             return a;
          }
       }
       sm1 c = this.w.c;
       c.getClass();
       qm1 tB = this.B;
       if (en6.k(this.x.t) && ((value = c.a.e.getValue()) != null && tB != null)) {
          km1 a2 = p0.a;
          if (a2 instanceof BitmapDrawable) {
          }else {
             a2 = null;
          }
          if (a2 != null && (bitmap = a2.getBitmap()) != null) {
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             linkedHashMa.put("coil#is_sampled", Boolean.valueOf(p0.b));
             if ((a1 = p0.d) != null) {
                linkedHashMa.put("coil#disk_cache_key", a1);
             }
             value.a.c(new x54(tB.a, vv7.V(tB.b)), bitmap, vv7.V(linkedHashMa));
             value = 1;
          label_009a :
             a1 = p0.a;
             qm1 tx = this.x;
             km1 c1 = p0.c;
             qm1 oqm1 = (c)? tB: null;
             km1 d = p0.d;
             km1 b = p0.b;
             p0 = this.C;
             boolean b1 = (p0 instanceof zp5 && p0.g != null)? true: false;
             p0.g = new qv6(a1, tx, c1, oqm1, d, b, b1);
             return p0.g;
          }
       }
       c = 0;
       goto label_009a ;
    }
}
