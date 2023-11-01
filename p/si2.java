package p.si2;
import p.ir0;
import p.ti2;
import java.lang.Object;
import p.b43;
import com.spotify.hubs.liteintegration.HubsView;
import p.ju2;
import p.tu2;
import java.lang.String;
import java.lang.CharSequence;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import p.jc7;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.et0;
import android.content.Context;
import android.content.Intent;
import p.xj0;

public final class si2 implements ir0	// class@002633 from classes.dex
{
    public final int a;
    public final ti2 b;

    public void si2(ti2 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       si2 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             tb.y.d(p0);
             p0 = p0.e();
             ti2 w = tb.w;
             p0 = (p0 == null)? "": p0.y().d();
             w.setTitle(p0);
             return;
             break;
           default:
             tb.startActivity(xj0.s(tb.getContext(), p0));
             return;
       }
       et0.d(tb.getActivity());
       return;
    }
}
