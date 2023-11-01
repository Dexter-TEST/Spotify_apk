package p.by2;
import p.cy2;
import p.c33;
import p.ic0;
import p.dc0;
import java.lang.Class;
import p.hc0;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import java.lang.CharSequence;
import p.eo5;
import p.jc0;
import android.content.Context;
import android.view.ViewGroup;
import p.gc0;
import p.kc0;
import java.lang.Object;
import android.text.TextUtils;
import p.tu2;
import java.lang.String;
import p.au2;

public final class by2 extends cy2	// class@00115b from classes.dex
{
    public final int e;

    public void by2(c33 p0,int p1){
       this.e = p1;
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                super(p0, dc0.class);
                return;
             }else {
                super(p0, ic0.class);
                return;
             }
          }else {
             super(p0, ic0.class);
             return;
          }
       }else {
          super(p0, hc0.class);
          return;
       }
    }
    public final void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       switch (this.e){
           case 0:
             this.g(p0, p1, p2);
             return;
           case 1:
             this.g(p0, p1, p2);
             p0.a.setTitle(eo5.m(p1));
             return;
           case 2:
             this.i(p0, p1, p2, p3);
             return;
           default:
             this.i(p0, p1, p2, p3);
             return;
       }
    }
    public final zk2 f(Context p0,ViewGroup p1,uu2 p2){
       hc0 ohc0;
       gc0 c = gc0.c;
       gc0 t = gc0.t;
       by2 te = this.e;
       switch (te){
           case 0:
             kc0.b.a.getClass();
             ohc0 = new hc0(new jc0(p0), gc0.a);
             eo5.P(ohc0);
             return ohc0;
           case 1:
             kc0.b.a.getClass();
             ohc0 = new hc0(new jc0(p0), gc0.b);
             eo5.P(ohc0);
             return ohc0;
           case 2:
             switch (te){
                 case 2:
                   kc0.b.a.getClass();
                   ohc0 = new hc0(new jc0(p0), t);
                   eo5.P(ohc0);
                   break;
                 default:
                   kc0.b.a.getClass();
                   ohc0 = new hc0(new jc0(p0), c);
                   eo5.P(ohc0);
             }
             return ohc0;
             break;
           default:
             switch (te){
                 case 2:
                   kc0.b.a.getClass();
                   ohc0 = new hc0(new jc0(p0), t);
                   eo5.P(ohc0);
                   break;
                 default:
                   kc0.b.a.getClass();
                   ohc0 = new hc0(new jc0(p0), c);
                   eo5.P(ohc0);
             }
             return ohc0;
       }
    }
    public final void i(ic0 p0,ju2 p1,uu2 p2,bt2 p3){
       hc0 a;
       switch (this.e){
           case 2:
           default:
             this.g(p0, p1, p2);
             a = p0.a;
             a.setTitle(eo5.m(p1));
             CharSequence uCharSequenc = eo5.l(p1);
             if (TextUtils.isEmpty(uCharSequenc)) {
                uCharSequenc = eo5.y(p1.y().e(), p1.b().y("glue:descriptionAsHtml", false));
             }
             a.setSubtitle(uCharSequenc);
             return;
       }
       this.g(p0, p1, p2);
       a = p0.a;
       a.setTitle(eo5.m(p1));
       a.setSubtitle(eo5.l(p1));
       return;
    }
}
