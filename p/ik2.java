package p.ik2;
import p.gk2;
import p.gp2;
import java.lang.Object;
import java.lang.Class;
import p.zk2;
import android.view.View;
import p.jk7;
import android.view.ViewGroup$LayoutParams;
import p.fk2;
import java.lang.Math;
import p.py;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;

public final class ik2	// class@0019ad from classes.dex
{
    public final gk2 a;
    public hk2 b;
    public GlueToolbar c;
    public bk2 d;

    public void ik2(gk2 p0,gp2 p1){
       super();
       p0.getClass();
       this.a = p0;
       this.d = p1;
    }
    public static void a(float p0,zk2 p1){
       fk2 layoutParams;
       if (p1 != null && ((layoutParams = p1.getView().getLayoutParams()) != null && (layoutParams = layoutParams.c) != null)) {
          layoutParams.getClass();
          p0 = Math.max(0, ((p0 * 4.00f) - 0x3f800000)) / 3.00f;
          if ((Math.abs((layoutParams.a - p0)) - 0x3c23d70a) >= 0) {
             layoutParams.a = p0;
             layoutParams.b.setTitleAlpha(p0);
          }
       }
       return;
    }
}
