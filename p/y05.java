package p.y05;
import p.xt2;
import p.nk2;
import java.lang.Enum;
import java.util.EnumSet;
import p.o05;
import android.content.Context;
import java.lang.Object;
import p.w05;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import p.xz5;
import java.lang.Class;
import p.zk2;
import p.eo5;
import p.e43;
import p.mi;
import p.d6;
import p.jk7;
import p.xy2;
import p.au2;
import java.lang.String;
import p.ry7;
import p.co5;
import p.tu2;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Map;
import p.sp6;
import com.spotify.legacyglue.icons.SpotifyIconView;
import p.dv2;
import p.du2;
import p.qz5;
import p.l03;
import p.lb0;
import java.util.AbstractCollection;
import android.graphics.drawable.Drawable;
import p.ie1;
import p.qd1;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import android.view.ViewGroup;
import p.o85;
import p.xj0;
import p.a06;

public final class y05 implements xt2	// class@002d24 from classes.dex
{
    public final w05 a;
    public static final EnumSet b;
    public static final EnumSet c;

    static {
       y05.b = EnumSet.of(nk2.y);
       y05.c = EnumSet.of(o05.z, o05.C, o05.B, o05.A, o05.b);
    }
    public void y05(Context p0){
       super();
       this.a = new w05(p0, 3);
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       o05 oo05;
       xz5 oxz5 = eo5.M(p0, xz5.class);
       oxz5.setActive(mi.J(p1));
       oxz5.getView().setEnabled((p1.b().y("disabled", false) ^ 1));
       ry7.d(oxz5.getView());
       co5.e(oxz5.getView(), p1, p2);
       oxz5.setTitle(p1.y().d());
       oxz5.setSubtitle(p1.y().m());
       eo5.a(p0.getContext(), oxz5.getSubtitleView(), p1.b().q("label"));
       View view = null;
       sp6 u = (p1.m().containsKey("rightAccessoryClick"))? sp6.U: view;
       if (u != null) {
          SpotifyIconView spotifyIconV = mi.k(oxz5.getView().getContext(), u);
          if (p1.m().containsKey("rightAccessoryClick")) {
             dv2 uodv2 = new dv2(p2.c);
             uodv2.c("rightAccessoryClick");
             uodv2.g(p1);
             uodv2.f(spotifyIconV);
             uodv2.d();
          }
          oxz5.d(spotifyIconV);
       }else {
          oxz5.d(view);
       }
       oxz5.setAppearsDisabled(p1.b().y("appearDisabled", false));
       if ((oo05 = p1.b().u("availability")) != null && !y05.c.contains(oo05)) {
          qd1 oqd1 = ie1.a(p0.getContext(), oxz5.getSubtitleView(), this.a);
          int i = oo05.ordinal();
          int i1 = 3;
          if (i) {
             if (i != 2) {
                if (i != i1 && (i != 4 && (i != 5 && i != 6))) {
                   throw new IllegalArgumentException("invalid state, "+oo05);
                }else {
                   oqd1.a(1);
                }
             }else {
                oqd1.a(2);
             }
          }else {
             oqd1.a(i1);
          }
       }else {
          ie1.c(oxz5.getSubtitleView());
       }
       return;
    }
    public final View c(ViewGroup p0,uu2 p1){
       o85 oo85 = xj0.x0(p0.getContext(), p0, R.layout.glue_listtile_2);
       eo5.P(new a06(oo85));
       return oo85;
    }
    public final EnumSet d(){
       return y05.b;
    }
}
