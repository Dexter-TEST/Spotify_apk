package p.s7;
import p.ir0;
import p.t7;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import p.i77;
import p.rv;
import p.ym6;
import com.spotify.litenetwork.webapi.model.LitePlaylistObject;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import p.et0;
import java.lang.NullPointerException;
import p.jc7;
import android.content.Context;
import p.aq6;
import p.m65;
import java.lang.StringBuilder;
import android.content.Intent;
import p.xj0;
import java.lang.Integer;
import p.wd5;
import p.lc1;
import android.os.Message;
import android.os.Handler;
import java.lang.IllegalArgumentException;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Boolean;
import p.t00;

public final class s7 implements ir0	// class@0025d6 from classes.dex
{
    public final int a;
    public final t7 b;

    public void s7(t7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       t7 k;
       int i = 0;
       s7 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             k = tb.K;
             String str = "tag == null";
             if (!p0.intValue()) {
                p0 = tb.F;
                if (k != null) {
                   p0 = p0.d.h;
                   p0.sendMessage(p0.obtainMessage(12, k));
                }else {
                   p0.getClass();
                   throw new IllegalArgumentException(str);
                }
             }else {
                p0 = tb.F;
                if (k != null) {
                   p0 = p0.d.h;
                   p0.sendMessage(p0.obtainMessage(11, k));
                }else {
                   p0.getClass();
                   throw new IllegalArgumentException(str);
                }
             }
             return;
             break;
           case 1:
             tb.startActivity(xj0.s(tb.requireContext(), "spotify:internal:create-playlist:"+tb.w().toString()));
             et0.d(tb.getActivity());
             return;
           case 2:
             k = tb.G;
             Object[] objArray = new Object[]{p0.b};
             p0 = tb.getString(R.string.add_to_playlist_track_added_toast, objArray);
             i77 oi77 = new i77(10);
             if (p0 == null) {
                throw new NullPointerException("Null infoText");
             }
             oi77.a = p0;
             k.c(oi77.l());
             et0.d(tb.getActivity());
             return;
             break;
           case 3:
             tb.getClass();
             Object[] objArray1 = new Object[i];
             Logger.c(p0, "Error adding to playlist", objArray1);
             tb.G.c(rv.a(R.string.add_to_playlist_failed).l());
             return;
           default:
             tb.J.onNext(Boolean.TRUE);
             return;
       }
    }
}
