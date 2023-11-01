package p.x05;
import p.xt2;
import p.nk2;
import java.lang.Enum;
import java.util.EnumSet;
import p.o05;
import android.content.Context;
import p.wd5;
import p.p77;
import java.lang.Object;
import p.w05;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import p.yz5;
import java.lang.Class;
import p.zk2;
import p.eo5;
import p.sz5;
import p.ry7;
import p.co5;
import p.zz5;
import android.widget.ImageView;
import com.spotify.hubs.liteintegration.util.LiteImageUtil;
import p.tu2;
import java.lang.String;
import p.a06;
import java.lang.CharSequence;
import p.au2;
import java.util.AbstractCollection;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import p.ie1;
import p.qd1;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import android.view.ViewGroup;
import p.o85;
import p.xj0;

public final class x05 implements xt2	// class@002be2 from classes.dex
{
    public final w05 a;
    public final wd5 b;
    public final p77 c;
    public static final EnumSet d;
    public static final EnumSet e;

    static {
       x05.d = EnumSet.of(nk2.y);
       x05.e = EnumSet.of(o05.z, o05.C, o05.B, o05.A);
    }
    public void x05(Context p0,wd5 p1,p77 p2){
       super();
       this.a = new w05(p0, 0);
       this.b = p1;
       this.c = p2;
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       int i;
       yz5 oyz5 = eo5.M(p0, yz5.class);
       sz5 a = oyz5.a;
       ry7.d(a);
       co5.e(a, p1, p2);
       LiteImageUtil.loadIntoRow(this.b, this.c, oyz5.v, p1);
       oyz5.setTitle(p1.y().d());
       oyz5.setSubtitle(p1.y().m());
       o05 oo05 = p1.b().u("availability");
       a06 t = oyz5.t;
       if (oo05 != null && !x05.e.contains(oo05)) {
          qd1 oqd1 = ie1.a(p0.getContext(), t, this.a);
          if (i = oo05.ordinal()) {
             switch (i){
                 case 2:
                   oqd1.a(2);
                   break;
                 case 3:
                 case 5:
                 case 6:
                 case 7:
                 case 4:
                   oqd1.a(1);
                   break;
                 default:
                   throw new IllegalArgumentException("invalid state, "+oo05);
             }
          }else {
             oqd1.a(3);
          }
       }else {
          ie1.c(t);
       }
       return;
    }
    public final View c(ViewGroup p0,uu2 p1){
       o85 oo85 = xj0.x0(p0.getContext(), p0, R.layout.glue_listtile_2_image);
       eo5.P(new zz5(oo85));
       return oo85;
    }
    public final EnumSet d(){
       return x05.d;
    }
}
