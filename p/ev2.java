package p.ev2;
import p.fv2;
import p.zg0;
import p.vz5;
import java.lang.Class;
import p.yz5;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import p.e06;
import android.content.Context;
import android.view.ViewGroup;
import p.tu2;
import java.lang.String;
import p.te5;
import p.jl;
import java.lang.CharSequence;
import p.wz5;
import p.xz5;
import p.tu6;
import p.o85;
import p.xj0;
import p.eo5;
import p.zz5;

public final class ev2 extends fv2	// class@001504 from classes.dex
{
    public final int e;

    public void ev2(zg0 p0,int p1){
       this.e = p1;
       if (p1 != 1) {
          super(vz5.class, p0);
          return;
       }else {
          super(yz5.class, p0);
          return;
       }
    }
    public final void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       switch (this.e){
           case 0:
           default:
             this.j(p0, p1, p2);
             return;
       }
       this.j(p0, p1, p2);
       return;
    }
    public final zk2 f(Context p0,ViewGroup p1,uu2 p2){
       switch (this.e){
           case 0:
           default:
             return this.n(p0, p1);
       }
       return this.n(p0, p1);
    }
    public final void h(e06 p0,ju2 p1){
       switch (this.e){
           case 0:
           default:
             tu6.g(p0, p1);
             return;
       }
       String str = p1.y().d();
       jl.h((te5.a(str) ^ 0x01), "title is missing");
       p0.setText(str);
       return;
    }
    public final e06 n(Context p0,ViewGroup p1){
       switch (this.e){
           case 0:
           default:
             zz5 ozz5 = new zz5(xj0.x0(p0, p1, R.layout.glue_listtile_2_image));
             eo5.P(ozz5);
             return ozz5;
       }
       vz5 ovz5 = new vz5(xj0.x0(p0, p1, R.layout.glue_listtile_1_image));
       eo5.P(ovz5);
       return ovz5;
    }
}
