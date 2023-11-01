package p.fv2;
import p.sy2;
import java.lang.Class;
import p.nk2;
import java.lang.Enum;
import java.util.EnumSet;
import p.o96;
import p.zg0;
import p.c33;
import p.dc0;
import java.lang.Object;
import p.hc0;
import p.cc0;
import p.jc0;
import android.content.Context;
import p.au2;
import p.fc0;
import java.lang.String;
import p.r45;
import p.uw5;
import p.sp6;
import p.rv2;
import p.fo1;
import p.ec0;
import java.lang.EnumConstantNotPresentException;
import java.lang.StringBuilder;
import p.jl;
import android.graphics.Color;
import p.e06;
import p.ju2;
import p.uu2;
import p.tu2;
import p.hu2;
import p.j13;
import android.widget.ImageView;
import android.view.View;
import p.xe7;
import p.n6;
import android.graphics.drawable.Drawable;
import p.os0;
import android.content.res.Resources;
import p.xj0;
import p.lp6;
import android.graphics.drawable.LayerDrawable;
import java.lang.CharSequence;
import p.ry7;
import p.co5;
import java.util.Map;
import p.dv2;
import p.du2;
import p.sz5;
import p.p90;
import android.widget.TextView;
import p.qz5;
import p.tu6;
import p.k96;
import p.bt2;
import p.l96;
import p.bz2;
import p.ez2;
import p.vv7;
import p.mf0;
import p.dy1;
import p.lf0;
import android.net.Uri;
import p.hv5;
import p.wd5;
import p.av5;
import java.lang.IllegalStateException;
import p.t67;
import p.p77;
import p.he1;
import p.wp6;
import p.ox7;
import p.e07;
import java.lang.Throwable;

public abstract class fv2 extends sy2	// class@001644 from classes.dex
{
    public final Object d;

    public void fv2(Class p0){
       super(EnumSet.of(nk2.c), p0, 1);
       this.d = new o96();
    }
    public void fv2(Class p0,zg0 p1){
       super(EnumSet.of(nk2.y), p0, 1);
       this.d = p1;
    }
    public void fv2(EnumSet p0,c33 p1){
       super(p0, dc0.class, 1);
       p1.getClass();
       this.d = p1;
    }
    public void fv2(c33 p0,Class p1){
       super(EnumSet.of(nk2.b, nk2.t), p1, 1);
       p0.getClass();
       this.d = p0;
    }
    public static hc0 g(hc0 p0){
       p0.a.setTextLayout(cc0.b);
       return p0;
    }
    public static fc0 l(Context p0,au2 p1){
       sp6 osp6;
       Enum uEnum;
       int i;
       String str = "";
       if ((osp6 = uw5.s(p1.b("accessoryIcon", str)).f()) == null) {
          return null;
       }
       String str1 = p1.q("accessorySize");
       try{
          fo1 a = rv2.a;
          if ((uEnum = a.a(str1)) != null) {
          }else {
             throw new EnumConstantNotPresentException(a.a, str1);
          }
       }catch(java.lang.Exception e0){
          jl.d("Failed to parse size: "+str1);
          uEnum = ec0.c;
       }
       String str2 = p1.b("accessoryColor", str);
       try{
          i = Color.parseColor(str2);
       }catch(java.lang.Exception e0){
          jl.d("Failed to parse color: "+i);
          i = 0xffff0000;
       }
       return new fc0(p0, i, uEnum, e0);
    }
    public abstract void h(e06 p0,ju2 p1);
    public void i(dc0 p0,ju2 p1,uu2 p2){
       Drawable uDrawable;
       ju2 oju2 = p1;
       uu2 ouu2 = p2;
       String str = p1.y().d();
       j13 oj13 = p1.u().e();
       int i = 1;
       boolean b = (oj13 != null)? true: false;
       Object[] objArray = new Object[i];
       objArray[0] = p1.c();
       jl.i(b, "main image missing, id=%s", objArray);
       hc0 a = p0.a;
       this.m(a.getImageView(), oj13);
       Context context = a.getContext();
       String str1 = xe7.J(p1.b().q("titleBadge"));
       if (p1.b().y("isFresh", 0)) {
          uDrawable = os0.b(context, R.drawable.glue_freshness_badge);
       }else if(str1.equals("shuffle")){
          lp6 olp6 = new lp6(context, sp6.i0, (float)xj0.e0(12.00f, context.getResources()));
          olp6.b(0xff000000);
          Drawable[] uDrawableArr = new Drawable[]{os0.b(context, R.drawable.bg_glue_shuffle_badge),olp6};
          LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
          int i1 = xj0.e0(2.00f, context.getResources());
          LayerDrawable layerDrawabl1 = layerDrawabl;
          LayerDrawable layerDrawabl2 = layerDrawabl;
          layerDrawabl1.setLayerInset(1, i1, 0, i1, 0);
          uDrawable = layerDrawabl2;
       }else {
          uDrawable = null;
       }
       if (uDrawable == null) {
          a.setTitle(str);
       }else {
          a.setTitle(xe7.T(str, uDrawable));
       }
       ry7.d(a);
       a.setAccessoryDrawable(fv2.l(a.getContext(), p1.b()));
       co5.e(a, oju2, ouu2);
       if (p1.m().containsKey("longClick")) {
          dv2 uodv2 = new dv2(ouu2.c);
          uodv2.c("longClick");
          uodv2.g(oju2);
          uodv2.f(a);
          uodv2.e();
       }
       return;
    }
    public final void j(e06 p0,ju2 p1,uu2 p2){
       au2 uoau2;
       sz5 osz5 = p0;
       sz5 a = osz5.a;
       ry7.d(a);
       this.h(p0, p1);
       co5.e(a, p1, p2);
       String str = "longClick";
       if (p1.m().containsKey(str)) {
          dv2 uodv2 = new dv2(p2.c);
          uodv2.c(str);
          uodv2.g(p1);
          uodv2.f(a);
          uodv2.e();
       }
       fv2 td = this.d;
       str = "calendar";
       int i = 1;
       boolean b = (p1.b().m(str) != null)? true: false;
       jl.h(b, "calendar data is missing!");
       p90 op90 = p90.a(p0.getImageView(), td);
       if ((uoau2 = p1.b().m(str)) != null) {
          str = uoau2.b("month", "APR");
          op90.getClass();
          co5.o(str, "monthString");
          String str1 = String.valueOf(uoau2.c("dayOfMonth", i));
          co5.o(str1, "dayString");
          op90.b.setText(str);
          op90.c.setText(str1);
       }
       tu6.f(p0, p1, p2);
       osz5.setActive(p1.b().y("active", false));
       return;
    }
    public void k(k96 p0,ju2 p1,uu2 p2,bt2 p3){
       p0.c = p1.y().d();
       p0.a();
    }
    public final void m(ImageView p0,j13 p1){
       int i;
       t67 w;
       fv2 td = this.d;
       c33 b = td.b;
       he1 ohe1 = null;
       if (p1 != null && b != null) {
          try{
             Drawable uDrawable = td.a(p1.c(), bz2.t);
             String str = "style";
             ez2 uoez2 = p1.b().u(str);
             if (uoez2 instanceof ez2) {
             }else {
                uoez2 = vv7.A(p1.b().q(str));
             }
             if (uoez2 == ez2.c) {
                float f = 0x3f800000;
                switch (mf0.f.a){
                    case 23:
                      ohe1 = new lf0(f, 0);
                      break;
                    default:
                      ohe1 = new lf0(f, true);
                }
             }
             td.getClass();
             hv5 ohv5 = new hv5(b, c33.d(p1.a()));
             hv5 b1 = ohv5.b;
             b1.b(2048, 2048);
             if (b1.d == null && b1.c == null) {
                throw new IllegalStateException("onlyScaleDown can not be applied without resize");
             }else {
                b1.e = true;
                ohv5.h(uDrawable);
                ohv5.b(uDrawable);
                if ((i = uoez2.ordinal()) != 2) {
                   w = (i != 3)? td.e.w: td.e.v;
                }else {
                   w = td.e.t;
                }
                b1.c(w);
                if (ohe1 == null) {
                   ohv5.e(p0);
                }else {
                   ohv5.f(ox7.M(p0, ohe1));
                }
             }
          }catch(java.lang.Exception e9){
             jl.f("Image can not be loaded "+p1.a(), e9);
          }
       }else if(b != null){
          b.b(p0);
       }
       p0.setImageDrawable(ohe1);
       return;
    }
}
