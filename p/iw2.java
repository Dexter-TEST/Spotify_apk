package p.iw2;
import p.sy2;
import p.nk2;
import java.lang.Enum;
import java.util.EnumSet;
import p.tz5;
import java.lang.Class;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import p.tu2;
import java.lang.String;
import p.jl;
import p.au2;
import java.lang.CharSequence;
import android.content.Context;
import android.view.ViewGroup;
import p.o85;
import p.xj0;
import p.eo5;

public final class iw2 extends sy2	// class@001a17 from classes.dex
{

    public void iw2(){
       super(EnumSet.of(nk2.y), tz5.class, 1);
    }
    public final void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       String str;
       boolean b = ((str = p1.y().e()) != null)? true: false;
       jl.h(b, "description not set");
       p0.a(p1.b().c("maxLines", Integer.MAX_VALUE));
       p0.setText(str);
       return;
    }
    public final zk2 f(Context p0,ViewGroup p1,uu2 p2){
       tz5 otz5 = new tz5(xj0.x0(p0, p1, R.layout.glue_listtile_1));
       otz5.a(Integer.MAX_VALUE);
       eo5.P(otz5);
       return otz5;
    }
}
