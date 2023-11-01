package p.sy2;
import p.xt2;
import java.util.EnumSet;
import java.lang.Class;
import java.lang.Object;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import p.zk2;
import p.eo5;
import p.d6;
import p.mi;
import p.jk7;
import p.xy2;
import p.au2;
import java.lang.String;
import android.view.ViewGroup;
import android.content.Context;

public abstract class sy2 implements xt2	// class@0026c1 from classes.dex
{
    public final int a;
    public final Class b;
    public final EnumSet c;

    public void sy2(EnumSet p0,Class p1,int p2){
       this.a = p2;
       if (p2 != 1) {
          super();
          p0.getClass();
          this.c = p0;
          p1.getClass();
          this.b = p1;
          return;
       }else {
          super();
          p0.getClass();
          this.c = p0;
          p1.getClass();
          this.b = p1;
          return;
       }
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       sy2 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             this.e(eo5.M(p0, tb), p1, p2, p3);
             return;
       }
       zk2 ozk2 = eo5.M(p0, tb);
       this.e(ozk2, p1, p2, p3);
       if (ozk2 instanceof d6) {
          ozk2.setActive(mi.J(p1));
       }
       ozk2.getView().setEnabled((p1.b().y("disabled", false) ^ 0x01));
       return;
    }
    public final View c(ViewGroup p0,uu2 p1){
       switch (this.a){
           case 0:
           default:
             return this.f(p0.getContext(), p0, p1).getView();
       }
       return this.f(p0.getContext(), p0, p1).getView();
    }
    public final EnumSet d(){
       return this.c;
    }
    public abstract void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3);
    public abstract zk2 f(Context p0,ViewGroup p1,uu2 p2);
}
