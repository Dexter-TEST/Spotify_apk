package p.z0;
import p.ir0;
import p.c1;
import java.lang.Object;
import p.b43;
import com.spotify.hubs.liteintegration.HubsView;
import java.lang.String;
import java.lang.CharSequence;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import p.jc7;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.et0;
import java.lang.Boolean;
import p.aj1;
import com.spotify.lite.appmain.MainActivity;
import java.lang.Integer;
import p.i77;
import p.rv;
import p.ym6;
import java.lang.Class;
import p.aq6;
import p.td7;
import java.lang.Enum;
import android.content.Context;
import android.content.Intent;
import p.xj0;
import java.lang.StringBuilder;

public final class z0 implements ir0	// class@002e66 from classes.dex
{
    public final int a;
    public final c1 b;

    public void z0(c1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       aq6 uoaq6;
       int i;
       z0 tb = this.b;
       switch (this.a){
           case 0:
             tb.c.c(rv.a(p0.intValue()).l());
             return;
           case 1:
             p0 = tb.getActivity();
             if (p0 instanceof aj1 && !p0.H()) {
                p0.C();
             }
             return;
             break;
           case 2:
             et0.d(tb.getActivity());
             return;
           case 3:
             tb.F.d(p0);
             c1 d = tb.D;
             p0 = (p0 == null)? "": p0.d();
             d.setTitle(p0);
             return;
             break;
           default:
             tb.getClass();
             if ((uoaq6 = td7.d(p0)) != null) {
                if ((i = uoaq6.b.ordinal()) != 1 && i != 3) {
                   tb.startActivity(xj0.s(tb.requireContext(), p0).putExtra("EXTRA_PLAYLIST_URI", tb.B));
                }else {
                   tb.startActivity(xj0.s(tb.requireContext(), "spotify:internal:assisted-curation-drill-down:"+p0).putExtra("EXTRA_PLAYLIST_URI", tb.B));
                }
             }
             return;
       }
    }
}
