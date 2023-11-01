package p.nl7;
import p.i87;
import p.d02;
import android.view.ViewGroup;
import android.view.View;
import p.h87;
import java.lang.Object;
import p.vf;
import android.view.ViewGroupOverlay;
import p.g87;
import android.view.ViewParent;

public final class nl7 extends i87	// class@002002 from classes.dex
{
    public final ViewGroup a;
    public final View b;
    public final View c;
    public final d02 d;

    public void nl7(d02 p0,ViewGroup p1,View p2,View p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public final void a(h87 p0){
       this.c.setTag(R.id.save_overlay_view, null);
       new vf(this.a).b.remove(this.b);
       p0.w(this);
    }
    public final void b(){
       new vf(this.a).b.remove(this.b);
    }
    public final void c(){
       nl7 tb = this.b;
       if (tb.getParent() == null) {
          new vf(this.a).b.add(tb);
       }else {
          this.d.cancel();
       }
       return;
    }
}
