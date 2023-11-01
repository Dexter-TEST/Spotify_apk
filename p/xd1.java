package p.xd1;
import p.gr0;
import p.yd1;
import java.lang.Object;
import p.dc4;
import p.lq5;
import com.spotify.hubs.liteintegration.HubsView;
import p.b43;
import p.bc4;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.et0;

public final class xd1 implements gr0	// class@002c53 from classes.dex
{
    public final int a;
    public final yd1 b;

    public void xd1(yd1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       xd1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             et0.d(tb.getActivity());
             return;
       }
       tb.B.t.d(p0.a);
       return;
    }
}
