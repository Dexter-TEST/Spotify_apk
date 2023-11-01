package p.hk5;
import p.ap0;
import p.ik5;
import p.hr0;
import java.lang.Object;
import p.nb1;
import p.ob1;
import p.vf;
import p.bv;
import p.lv1;
import p.gk5;
import java.lang.String;
import p.te5;
import android.content.Context;
import android.view.View;
import java.lang.CharSequence;
import android.widget.Toast;
import p.yj5;
import p.vc1;

public final class hk5 implements ap0	// class@00186d from classes.dex
{
    public final int a;
    public Object b;
    public final Object c;
    public final xo0 t;

    public void hk5(ik5 p0,hr0 p1){
       this.a = 0;
       this.t = p0;
       this.c = p1;
       super();
    }
    public void hk5(nb1 p0,ob1 p1,vf p2){
       this.a = 1;
       this.t = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void accept(Object p0){
       switch (this.a){
           case 0:
             break;
           default:
             this.b.accept(p0);
             return;
       }
       if (!p0.b.equals(this.b)) {
          bv b = p0.b;
          b.C(new gk5(this, 0), new gk5(this, 1), new gk5(this, 2));
          this.b = b;
       }
       p0 = p0.d;
       if (!te5.a(p0)) {
          Toast.makeText(this.t.getContext(), p0, 1).show();
          this.c.accept(new yj5());
       }
       return;
    }
    public final void dispose(){
       switch (this.a){
           case 0:
           default:
             this.c.dispose();
             return;
       }
       return;
    }
}
