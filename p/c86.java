package p.c86;
import p.ir0;
import p.d86;
import java.lang.Object;
import p.jc7;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.et0;
import p.b43;
import com.spotify.hubs.liteintegration.HubsView;
import java.lang.String;
import java.lang.CharSequence;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import android.content.Context;
import android.content.Intent;
import p.xj0;

public final class c86 implements ir0	// class@0011ba from classes.dex
{
    public final int a;
    public final d86 b;

    public void c86(d86 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       c86 tb = this.b;
       switch (this.a){
           case 0:
             tb.z.d(p0);
             tb.x.setTitle(p0.d());
             return;
           case 1:
             et0.d(tb.getActivity());
             return;
           default:
             tb.startActivity(xj0.s(tb.getContext(), p0));
             return;
       }
    }
}
