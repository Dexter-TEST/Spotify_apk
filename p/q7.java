package p.q7;
import p.ir0;
import p.r7;
import java.lang.Object;
import p.l51;
import p.z4;
import android.view.View;
import java.lang.Throwable;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import java.util.List;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import android.content.Intent;
import p.xj0;
import androidx.fragment.app.k;
import p.et0;
import java.lang.Class;

public final class q7 implements ir0	// class@00234b from classes.dex
{
    public final int a;
    public final r7 b;

    public void q7(r7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       z4 b;
       q7 tb = this.b;
       int i = 0;
       switch (this.a){
           case 0:
             break;
           default:
             tb.getClass();
             Object[] objArray1 = new Object[i];
             Logger.c(p0, "Error resolving playlists", objArray1);
             tb.u();
             return;
       }
       r7 t = tb.t;
       int i1 = (p0.a != null)? 0: 8;
       t.setVisibility(i1);
       if (p0.a == null) {
          if ((b = p0.b) != null) {
             Object[] objArray = new Object[i];
             Logger.j(b, "Problem resolving playlists", objArray);
          }
          if ((p0 = p0.c) != null && !p0.isEmpty()) {
             tb.u();
          }else {
             tb.startActivity(xj0.s(tb.requireContext(), "spotify:internal:create-playlist:"+tb.v));
             et0.d(tb.getActivity());
          }
       }
       return;
    }
}
