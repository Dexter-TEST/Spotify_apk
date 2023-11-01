package p.q33;
import p.y46;
import java.lang.Object;
import p.qn1;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import p.ti2;
import p.qq2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import p.ry7;
import p.oy6;
import android.widget.TextView;
import android.view.View;
import com.spotify.hubs.liteintegration.HubsView;
import p.x33;

public final class q33 implements y46	// class@002323 from classes.dex
{
    public final int a;
    public final Object b;

    public void q33(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(float p0){
       HubsView w;
       qn1 h;
       q33 tb = this.b;
       switch (this.a){
           case 0:
             if ((w = tb.w) != null) {
                w.a(p0);
             }
             return;
             break;
           case 1:
             p0 = (- p0) * (float)ry7.u(tb.getContext());
             tb.y.c.setTranslationY(p0);
             tb.y.v.setTranslationY(p0);
             return;
           case 2:
             tb.setTitleAlpha(p0);
             return;
           case 3:
             tb.w.setTitleAlpha(p0);
             return;
           case 4:
             if ((h = tb.H) != null) {
                h.setTitleAlpha(p0);
             }
             return;
             break;
           default:
             tb.w.setTitleAlpha(p0);
             return;
       }
    }
}
