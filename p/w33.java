package p.w33;
import p.ir0;
import p.x33;
import java.lang.Object;
import p.jc7;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.et0;
import p.b43;
import p.nq5;
import com.spotify.hubs.liteintegration.HubsView;
import p.ju2;
import java.lang.String;
import p.tu2;
import java.lang.CharSequence;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import android.content.Context;
import android.content.Intent;
import p.xj0;

public final class w33 implements ir0	// class@002aba from classes.dex
{
    public final int a;
    public final x33 b;

    public void w33(x33 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       w33 tb = this.b;
       switch (this.a){
           case 0:
             tb.y.b.d(p0);
             ju2 oju2 = p0.e();
             x33 w = tb.w;
             p0 = (oju2 == null)? p0.d(): oju2.y().d();
             w.setTitle(p0);
             return;
             break;
           case 1:
           default:
             tb.startActivity(xj0.s(tb.getContext(), p0));
             return;
       }
       et0.d(tb.getActivity());
       return;
    }
}
