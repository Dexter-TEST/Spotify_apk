package p.cy2;
import p.sy2;
import java.lang.Class;
import p.nk2;
import java.lang.Enum;
import java.util.EnumSet;
import p.o96;
import p.c33;
import java.lang.Object;
import p.dc0;
import p.ju2;
import p.uu2;
import p.hc0;
import android.widget.ImageView;
import p.jc0;
import p.hu2;
import p.j13;
import p.bz2;
import p.au2;
import java.lang.String;
import p.zx2;
import p.yx2;
import p.r45;
import p.fo1;
import p.cc0;
import android.view.View;
import p.ry7;
import p.co5;
import java.util.Map;
import p.dv2;
import p.du2;
import p.k96;
import p.bt2;
import p.tu2;
import p.l96;
import p.p33;

public abstract class cy2 extends sy2	// class@00129e from classes.dex
{
    public final Object d;

    public void cy2(Class p0){
       super(EnumSet.of(nk2.c), p0, 0);
       this.d = new o96();
    }
    public void cy2(c33 p0,Class p1){
       super(EnumSet.of(nk2.b, nk2.t), p1, 0);
       p0.getClass();
       this.d = p0;
    }
    public final void g(dc0 p0,ju2 p1,uu2 p2){
       hc0 a = p0.a;
       this.d.b(a.getImageView(), p1.u().e(), bz2.t);
       zx2 ozx2 = p1.b().u("textLayout");
       if (ozx2 instanceof zx2) {
       }else if(ozx2 instanceof String){
          ozx2 = yx2.a.b(ozx2.toString()).e(zx2.c);
       }else {
          ozx2 = zx2.c;
       }
       a.setTextLayout(ozx2.b);
       ry7.d(a);
       co5.e(a, p1, p2);
       if (p1.m().containsKey("longClick")) {
          dv2 uodv2 = new dv2(p2.c);
          uodv2.c("longClick");
          uodv2.g(p1);
          uodv2.f(a);
          uodv2.e();
       }
       return;
    }
    public final void h(k96 p0,ju2 p1,uu2 p2,bt2 p3){
       p0.c = p1.y().d();
       p0.a();
       l96 a = p0.a;
       boolean b = false;
       if (a != null) {
          if (p1.D() != null) {
             b = true;
          }
          p0.v = b;
          a.setClickable(b);
          p0.a();
          co5.e(a, p1, p2);
       }else {
          p0.v = b;
          a.setClickable(b);
          p0.a();
       }
       p1.y().j();
       return;
    }
}
