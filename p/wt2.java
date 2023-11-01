package p.wt2;
import p.xt2;
import p.vt2;
import java.lang.Object;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import java.lang.Class;
import p.ut2;
import android.view.ViewGroup;

public abstract class wt2 implements xt2, vt2	// class@002ba0 from classes.dex
{

    public void wt2(){
       super();
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       p0 = p0.getTag(R.id.hub_framework_view_holder_tag);
       p0.getClass();
       p0.a(p1, p2, p3);
    }
    public final View c(ViewGroup p0,uu2 p1){
       ut2 out2 = this.e(p0, p1);
       out2.getClass();
       ut2 a = out2.a;
       a.setTag(R.id.hub_framework_view_holder_tag, out2);
       return a;
    }
    public abstract ut2 e(ViewGroup p0,uu2 p1);
}
