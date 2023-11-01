package p.nn1;
import p.b5;
import p.qn1;
import java.lang.Object;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.String;
import android.content.Intent;
import p.xj0;
import p.i77;
import p.rv;
import p.ym6;
import androidx.fragment.app.k;
import p.et0;

public final class nn1 implements b5	// class@00200e from classes.dex
{
    public final int a;
    public final qn1 b;

    public void nn1(qn1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       nn1 tb = this.b;
       switch (this.a){
           case 0:
             tb.startActivity(xj0.z0(tb.requireContext(), "spotify.intent.action.NOW_PLAYING"));
             return;
           case 1:
             tb.startActivity(xj0.z0(tb.requireContext(), "spotify.intent.action.OFFLINE_MODE_SETTINGS"));
             return;
           case 2:
             tb.startActivity(xj0.z0(tb.requireContext(), "spotify.intent.action.EXPLICIT_CONTENT_SETTINGS"));
             return;
           default:
             tb.t.c(rv.a(R.string.entity_snackbar_playlist_deleted).l());
             et0.d(tb.getActivity());
             return;
       }
    }
}
