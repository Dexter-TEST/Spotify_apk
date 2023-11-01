package p.ax7;
import p.ux7;
import android.content.Context;
import p.xy7;
import p.ey7;
import p.hy7;
import p.iy7;
import p.lx7;
import p.lz7;
import p.jd;
import java.lang.String;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import p.fv1;
import p.cx7;
import com.google.android.play.core.assetpacks.zzbn;
import android.os.Parcelable;
import android.app.PendingIntent;
import java.lang.Class;
import p.jy7;
import java.util.concurrent.Executor;
import p.ka0;
import java.lang.Runnable;
import p.t5;

public final class ax7 extends ux7	// class@001012 from classes.dex
{
    public final xy7 g;
    public final ey7 h;
    public final hy7 i;
    public final lx7 j;
    public final iy7 k;
    public final hy7 l;
    public final hy7 m;
    public final lz7 n;
    public final Handler o;

    public void ax7(Context p0,xy7 p1,ey7 p2,hy7 p3,iy7 p4,lx7 p5,hy7 p6,hy7 p7,lz7 p8){
       super(new jd("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), p0);
       this.o = new Handler(Looper.getMainLooper());
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.k = p4;
       this.j = p5;
       this.l = p6;
       this.m = p7;
       this.n = p8;
    }
    public final void a(Context p0,Intent p1){
       ArrayList stringArrayL;
       Object[] objArray;
       Bundle bundleExtra = p1.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
       ux7 ta = this.a;
       int i = 0;
       if (bundleExtra != null) {
          if ((stringArrayL = bundleExtra.getStringArrayList("pack_names")) != null) {
             int i1 = 1;
             if (stringArrayL.size() == i1) {
                zzbn ozzbn = zzbn.b(bundleExtra, stringArrayL.get(i), this.k, this.n, fv1.B);
                Object[] objArray1 = new Object[i1];
                objArray1[i] = ozzbn;
                ta.a("ListenerRegistryBroadcastReceiver.onReceive: %s", objArray1);
                if (bundleExtra.getParcelable("confirmation_intent") != null) {
                   this.j.getClass();
                }
                ka0 v6 = new ka0(this, bundleExtra, ozzbn, 11, 0);
                this.m.c().execute(v6);
                this.l.c().execute(new t5(this, bundleExtra, 27));
                return;
             }
          }
          objArray = new Object[i];
          ta.c("Corrupt bundle received from broadcast.", objArray);
          return;
       }else {
          objArray = new Object[i];
          ta.c("Empty bundle received from broadcast.", objArray);
          return;
       }
    }
}
