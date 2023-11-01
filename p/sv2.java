package p.sv2;
import p.fv2;
import p.c33;
import p.nk2;
import p.dc0;
import java.lang.Class;
import p.hc0;
import java.lang.Enum;
import java.util.EnumSet;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import p.hu2;
import p.j13;
import java.lang.Object;
import java.lang.String;
import p.jl;
import android.widget.ImageView;
import p.jc0;
import android.view.View;
import p.ry7;
import android.content.Context;
import p.au2;
import p.fc0;
import p.co5;
import java.util.Map;
import p.dv2;
import p.du2;
import android.view.ViewGroup;
import p.kc0;
import p.gc0;
import p.eo5;

public final class sv2 extends fv2	// class@0026a6 from classes.dex
{
    public final int e;

    public void sv2(c33 p0,int p1){
       this.e = p1;
       nk2 a = nk2.a;
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                super(p0, dc0.class);
                return;
             }else {
                super(p0, hc0.class);
                return;
             }
          }else {
             super(EnumSet.of(a), p0);
             return;
          }
       }else {
          super(EnumSet.of(a), p0);
          return;
       }
    }
    public final void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       sv2 te = this.e;
       switch (te){
           case 0:
             super.i(p0, p1, p2);
             return;
           case 1:
             super.i(p0, p1, p2);
             return;
           case 2:
             switch (te){
                 case 2:
                   j13 oj13 = p1.u().e();
                   int i = 1;
                   int i1 = 0;
                   boolean b = (oj13 != null)? true: false;
                   Object[] objArray = new Object[i];
                   objArray[i1] = p1.c();
                   jl.i(b, "main image missing, id=%s", objArray);
                   hc0 a = p0.a;
                   this.m(a.getImageView(), oj13);
                   ry7.d(a);
                   a.setAccessoryDrawable(fv2.l(a.getContext(), p1.b()));
                   co5.e(a, p1, p2);
                   if (p1.m().containsKey("longClick")) {
                      dv2 uodv2 = new dv2(p2.c);
                      uodv2.c("longClick");
                      uodv2.g(p1);
                      uodv2.f(a);
                      uodv2.e();
                   }
                   break;
                 default:
                   super.i(p0, p1, p2);
             }
             return;
             break;
           default:
             super.i(p0, p1, p2);
             return;
       }
    }
    public final zk2 f(Context p0,ViewGroup p1,uu2 p2){
       switch (this.e){
           case 0:
             return this.n(p0);
           case 1:
             return this.n(p0);
           case 2:
             return this.n(p0);
           default:
             kc0.b.a.getClass();
             hc0 ohc0 = new hc0(new jc0(p0), gc0.b);
             eo5.P(ohc0);
             fv2.g(ohc0);
             return ohc0;
       }
    }
    public final void i(dc0 p0,ju2 p1,uu2 p2){
       throw null;
    }
    public final dc0 n(Context p0){
       hc0 ohc0;
       switch (this.e){
           case 0:
             kc0.b.a.getClass();
             ohc0 = new hc0(new jc0(p0), gc0.x);
             eo5.P(ohc0);
             fv2.g(ohc0);
             return ohc0;
           case 1:
             kc0.b.a.getClass();
             ohc0 = new hc0(new jc0(p0), gc0.v);
             eo5.P(ohc0);
             fv2.g(ohc0);
             return ohc0;
           default:
             kc0.b.a.getClass();
             ohc0 = new hc0(new jc0(p0), gc0.w);
             eo5.P(ohc0);
             fv2.g(ohc0);
             return ohc0;
       }
    }
}
