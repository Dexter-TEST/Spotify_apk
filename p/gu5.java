package p.gu5;
import p.ir0;
import p.iu5;
import java.lang.Object;
import p.jc7;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.et0;
import p.l51;
import p.z4;
import android.view.View;
import com.spotify.webapi.service.models.Playlist;
import java.lang.Throwable;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import com.spotify.webapi.service.models.PlaylistBase;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Class;
import p.i77;
import p.rv;
import p.ym6;
import android.widget.EditText;
import p.xe7;

public final class gu5 implements ir0	// class@001780 from classes.dex
{
    public final int a;
    public final iu5 b;

    public void gu5(iu5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       z4 b;
       int i = 0x7f1202d7;
       String str = "Error renaming playlist";
       int i1 = 8;
       gu5 tb = this.b;
       switch (this.a){
           case 0:
             iu5 w = tb.w;
             if (p0.a != null) {
                i1 = 0;
             }
             w.setVisibility(i1);
             if ((b = p0.b) != null) {
                p0 = new Object[0];
                Logger.c(b, str, p0);
                tb.c.c(rv.a(i).l());
             }else if(p0.a == null){
                tb.c.c(rv.a(R.string.rename_playlist_successful).l());
                et0.d(tb.getActivity());
             }
             return;
             break;
           case 1:
             tb.getClass();
             Object[] objArray = new Object[0];
             Logger.c(p0, str, objArray);
             tb.c.c(rv.a(i).l());
             return;
           case 2:
             iu5 w1 = tb.w;
             if (p0.a != null) {
                i1 = 0;
             }
             w1.setVisibility(i1);
             l51 c = p0.c;
             if ((p0 = p0.b) != null) {
                Object[] objArray1 = new Object[0];
                Logger.j(p0, "Problem loading playlist name", objArray1);
             }else if(c != null){
                p0 = c.name;
                tb.A = p0;
                tb.t.setText(p0);
             }
             return;
             break;
           case 3:
             et0.d(tb.getActivity());
             return;
           case 4:
             et0.d(tb.getActivity());
             return;
           default:
             xe7.B(tb.t);
             return;
       }
    }
}
