package p.pq2;
import p.ir0;
import p.qq2;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import p.xj0;
import p.b43;
import p.oy6;
import com.spotify.hubs.liteintegration.HubsView;
import android.widget.TextView;
import p.au2;
import p.r45;
import p.rp;
import p.jg2;
import java.lang.CharSequence;
import p.jc7;

public final class pq2 implements ir0	// class@0022ae from classes.dex
{
    public final int a;
    public final qq2 b;

    public void pq2(qq2 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       pq2 tb = this.b;
       switch (this.a){
           case 0:
             tb.y.t.d(p0);
             tb.y.c.setText(r45.a(p0.b().m("topbar")).g(new rp(22)).e(""));
             return;
           case 1:
             tb.startActivity(xj0.s(tb.getContext(), p0));
             return;
           default:
             tb.startActivity(xj0.z0(tb.getContext(), "spotify.intent.action.SETTINGS"));
             return;
       }
    }
}
