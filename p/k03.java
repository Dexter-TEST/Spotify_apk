package p.k03;
import p.sy2;
import p.c33;
import java.lang.Class;
import p.nk2;
import java.lang.Enum;
import java.util.EnumSet;
import java.lang.Object;
import p.ic;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import p.qz5;
import android.view.View;
import p.jk7;
import p.ry7;
import p.co5;
import java.util.Map;
import p.dv2;
import p.du2;
import java.lang.String;
import p.e06;
import p.au2;
import android.widget.ImageView;
import p.zg0;
import p.p90;
import java.lang.CharSequence;
import android.widget.TextView;
import p.hu2;
import p.j13;
import p.bz2;
import p.b03;
import p.fo1;
import p.r45;
import p.c0;
import p.sp6;
import android.content.Context;
import com.spotify.legacyglue.icons.SpotifyIconView;
import p.mi;
import p.l03;
import p.lb0;

public abstract class k03 extends sy2	// class@001b7d from classes.dex
{
    public final c33 d;
    public final ic e;

    public void k03(c33 p0,Class p1){
       super(EnumSet.of(nk2.y), p1, 0);
       p0.getClass();
       this.d = p0;
       this.e = new ic();
    }
    public void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       this.h(p0, p1, p2);
    }
    public abstract void g(qz5 p0,ju2 p1);
    public final void h(qz5 p0,ju2 p1,uu2 p2){
       dv2 uodv2;
       au2 uoau2;
       sp6 u;
       this.g(p0, p1);
       ry7.d(p0.getView());
       co5.e(p0.getView(), p1, p2);
       String str = "longClick";
       if (p1.m().containsKey(str)) {
          uodv2 = new dv2(p2.c);
          uodv2.c(str);
          uodv2.g(p1);
          uodv2.f(p0.getView());
          uodv2.e();
       }
       if (p0 instanceof e06) {
          e06 uoe06 = p0;
          String str1 = "calendar";
          int i = 1;
          uodv2 = (p1.b().m(str1) != null)? 1: 0;
          if (uodv2) {
             p90 op90 = p90.a(uoe06.getImageView(), this.e);
             if ((uoau2 = p1.b().m(str1)) != null) {
                str1 = uoau2.b("month", "APR");
                op90.getClass();
                co5.o(str1, "monthString");
                String str2 = String.valueOf(uoau2.c("day_of_month", i));
                co5.o(str2, "dayString");
                op90.b.setText(str1);
                op90.c.setText(str2);
             }
          }else {
             ImageView imageView = uoe06.getImageView();
             j13 oj13 = p1.u().e();
             str1 = p1.u().d();
             bz2 c = bz2.c;
             k03 td = this.d;
             if (str1 != null) {
                td.getClass();
                c33.c(imageView, str1);
             }else {
                td.b(imageView, oj13, c);
             }
          }
       }
       Enum obj = p1.b().u("secondary_icon");
       fo1 a = b03.a;
       fo1 a1 = a.a;
       if (a1.isInstance(obj)) {
          obj = a1.cast(obj);
       }else if(obj instanceof String){
          r45 or45 = (obj != null)? a.b(obj): c0.a;
          u = or45.f();
       }else {
          u = null;
       }
       if (obj == null && p1.m().containsKey("rightAccessoryClick")) {
          u = sp6.U;
       }
       if (u != null) {
          SpotifyIconView spotifyIconV = mi.k(p0.getView().getContext(), u);
          spotifyIconV.setContentDescription(p1.b().q("accessoryContentDesc"));
          if (p1.m().containsKey("rightAccessoryClick")) {
             dv2 uodv21 = new dv2(p2.c);
             uodv21.c("rightAccessoryClick");
             uodv21.g(p1);
             uodv21.f(spotifyIconV);
             uodv21.d();
          }
          p0.d(spotifyIconV);
       }else {
          p0.d(null);
       }
       p0.setAppearsDisabled(p1.b().y("appearDisabled", false));
       return;
    }
}
