package p.o0;
import p.vt2;
import java.lang.Class;
import java.lang.Object;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import p.zk2;
import p.eo5;
import p.qz5;
import p.w02;
import p.vz5;
import p.tu2;
import java.lang.String;
import java.lang.CharSequence;
import p.wz5;
import p.yz5;
import p.a06;
import p.hu2;
import p.j13;
import p.au2;
import p.e06;
import android.widget.ImageView;
import p.co5;
import android.view.ViewGroup;
import android.content.Context;
import p.o85;
import p.xj0;
import p.zz5;
import p.sz5;

public abstract class o0 implements vt2	// class@002089 from classes.dex
{
    public final Class a;

    public void o0(Class p0){
       super();
       this.a = p0;
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       qz5 oqz5 = eo5.M(p0, this.a);
       switch (this.b){
           case 0:
             oqz5.setText(p1.y().d());
             break;
           default:
             qz5 oqz51 = oqz5;
             oqz51.setTitle(p1.y().d());
             oqz51.setSubtitle(p1.y().m());
       }
       j13 oj13 = p1.u().e();
       int i = 0x7f0705e8;
       if (oj13 != null) {
          i = oj13.b().c("imageRes", i);
       }
       oqz5.getImageView().setImageResource(i);
       co5.e(p0, p1, p2);
       return;
    }
    public final View c(ViewGroup p0,uu2 p1){
       vz5 ovz5;
       switch (this.b){
           case 0:
             ovz5 = new vz5(xj0.x0(p0.getContext(), p0, R.layout.glue_listtile_1_image));
             eo5.P(ovz5);
             break;
           default:
             ovz5 = new zz5(xj0.x0(p0.getContext(), p0, R.layout.glue_listtile_2_image));
             eo5.P(ovz5);
       }
       return ovz5.a;
    }
}
