package p.bw2;
import p.sy2;
import p.c33;
import p.ix;
import java.lang.Class;
import p.nk2;
import java.lang.Enum;
import java.util.EnumSet;
import p.e06;
import p.ju2;
import p.uu2;
import p.sz5;
import android.view.View;
import p.ry7;
import p.aw2;
import p.vz5;
import p.tu2;
import java.lang.String;
import p.te5;
import p.jl;
import java.lang.CharSequence;
import p.wz5;
import p.yz5;
import p.xz5;
import p.tu6;
import p.co5;
import java.util.Map;
import java.lang.Object;
import p.dv2;
import p.du2;
import p.hu2;
import p.j13;
import android.widget.ImageView;
import p.bz2;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import p.hv5;
import p.wd5;
import android.content.Context;
import p.ez2;
import p.au2;
import p.vv7;
import p.mf0;
import p.dy1;
import p.lf0;
import p.ex;
import p.fx;
import p.he1;
import p.wp6;
import p.ox7;
import p.e07;
import p.r45;
import p.uw5;
import p.sp6;
import com.spotify.legacyglue.icons.SpotifyIconView;
import p.mi;
import android.view.ViewGroup;
import p.o85;
import p.xj0;
import p.zk2;
import p.eo5;
import p.zz5;

public abstract class bw2 extends sy2	// class@001149 from classes.dex
{
    public final c33 d;
    public final ix e;

    public void bw2(c33 p0,ix p1,Class p2){
       super(EnumSet.of(nk2.y), p2, 1);
       this.d = p0;
       this.e = p1;
    }
    public final void g(e06 p0,ju2 p1,uu2 p2){
       String str;
       lf0 olf0;
       sz5 osz5 = p0;
       sz5 a = osz5.a;
       ry7.d(a);
       int i = 1;
       switch (this.f){
           case 0:
             str = p1.y().d();
             jl.h((te5.a(str) ^ i), "title is missing");
             p0.setText(str);
             break;
           default:
             tu6.g(p0, p1);
       }
       co5.e(a, p1, p2);
       str = "longClick";
       if (p1.m().containsKey(str)) {
          dv2 uodv2 = new dv2(p2.c);
          uodv2.c(str);
          uodv2.g(p1);
          uodv2.f(a);
          uodv2.e();
       }
       boolean b = (p1.u().e() != null)? true: false;
       jl.h(b, "main image is missing");
       ImageView imageView = p0.getImageView();
       j13 b1 = p1.u().e();
       bw2 td = this.d;
       c33 b2 = td.b;
       if (b1 != null) {
          Drawable uDrawable = td.a(b1.c(), bz2.c);
          b2.getClass();
          hv5 ohv5 = new hv5(b2, c33.d(b1.a()));
          ohv5.h(uDrawable);
          ohv5.b(uDrawable);
          Context context = imageView.getContext();
          if (ez2.c == vv7.A(b1.b().q("style"))) {
             switch (mf0.f.a){
                 case 23:
                   olf0 = new lf0(0x3f800000, 0);
                   break;
                 default:
                   olf0 = new lf0(0x3f800000, i);
             }
          }else {
             olf0 = null;
          }
          if ("verified".equals(b1.b().u("badge"))) {
             this.e.getClass();
             olf0 = new fx(context, new ex(context), olf0);
          }
          if (olf0 == null) {
             ohv5.e(imageView);
          }else {
             ohv5.f(ox7.M(imageView, olf0));
          }
       }else {
          b2.b(imageView);
          imageView.setImageDrawable(null);
       }
       r45 or45 = uw5.s(p1.b().u("accessoryRightIcon"));
       if (or45.c()) {
          SpotifyIconView spotifyIconV = mi.k(a.getContext(), or45.b());
          if (p1.m().containsKey("rightAccessoryClick")) {
             dv2 uodv21 = new dv2(p2.c);
             uodv21.c("rightAccessoryClick");
             uodv21.g(p1);
             uodv21.f(spotifyIconV);
             uodv21.d();
          }
          osz5.d(spotifyIconV);
       }else {
          osz5.d(null);
       }
       osz5.setActive(p1.b().y("active", 0));
       return;
    }
    public final e06 h(Context p0,ViewGroup p1){
       vz5 ovz5;
       switch (this.f){
           case 0:
             ovz5 = new vz5(xj0.x0(p0, p1, R.layout.glue_listtile_1_image));
             eo5.P(ovz5);
             break;
           default:
             ovz5 = new zz5(xj0.x0(p0, p1, R.layout.glue_listtile_2_image));
             eo5.P(ovz5);
       }
       return ovz5;
    }
}
