package p.qm3;
import p.ir0;
import com.spotify.lite.app.LiteApplication;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import android.content.ContextWrapper;
import p.fp3;
import android.content.Context;
import p.uq7;
import p.ge6;
import p.t37;
import p.pl1;
import p.nx1;
import p.b7;
import java.util.Map;
import java.lang.Integer;
import p.h51;
import p.z35;
import com.spotify.remoteconfig.fetcher.worker.FetchPropertiesWorker;
import p.cr7;
import p.jr7;
import java.util.concurrent.TimeUnit;
import java.util.LinkedHashSet;
import android.os.Build$VERSION;
import java.util.Collection;
import java.util.Set;
import p.dj0;
import p.zq0;
import p.a45;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import p.j45;
import p.o94;
import com.spotify.lite.metadata.MetadataOfflineSyncBackgroundWork$MigrationWorker;
import p.co5;
import java.lang.Throwable;
import p.jl;
import com.spotify.lite.metadata.MetadataCleanUpBackgroundWork$CleanUpWorker;
import p.o11;
import p.w50;
import p.uo6;
import p.rn6;
import p.tn6;
import p.ic;
import java.lang.System;
import p.to6;
import p.ap6;
import p.zo6;
import p.wf2;
import p.fn0;
import p.v75;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Scheduler;
import p.hs0;
import p.mb;
import io.reactivex.rxjava3.disposables.Disposable;
import p.pb0;
import java.lang.Runnable;
import p.ce7;

public final class qm3 implements ir0	// class@0023cd from classes.dex
{
    public final int a;
    public final LiteApplication b;

    public void qm3(LiteApplication p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       uq7 ouq7;
       zq0 a2;
       z35 oz35;
       int i1;
       zq0 i2;
       uq7 ouq71;
       pb0 opb0;
       qm3 oqm3 = this;
       qm3 b = oqm3.b;
       switch (oqm3.a){
           case 0:
           default:
             b.getClass();
             int i = 0;
             String str = "MetadataCleanUpBackgroundWork";
             String str1 = "MetadataOfflineBackgroundSync";
             String str2 = "remote-config-fetch-delayed";
             if (p0.booleanValue()) {
                try{
                   ouq7 = uq7.y(b);
                }catch(java.lang.IllegalStateException e0){
                   Object[] objArray = new Object[i];
                   t37.a().getClass();
                   ge6.m(objArray);
                   ouq7 = null;
                }
                pl1 a = pl1.a;
                nx1 a1 = nx1.a;
                if (ouq7 != null) {
                   Object[] objArray1 = new Object[i];
                   t37.a().getClass();
                   ge6.a(objArray1);
                   b7 uob7 = new b7(7);
                   uob7.b.put("FETCH_TYPE", Integer.valueOf(3));
                   h51 oh51 = uob7.l();
                   z35 uob71 = new z35(FetchPropertiesWorker.class);
                   uob71.c.e = oh51;
                   oz35 = uob71.c((long)5, TimeUnit.SECONDS);
                   boolean b2 = false;
                   LinkedHashSet linkedHashSe1 = new LinkedHashSet();
                   int i3 = 2;
                   Set set = (Build$VERSION.SDK_INT >= 24)? dj0.F0(linkedHashSe1): a;
                   zq0 ozq0 = linkedHashSe1;
                   i2 = new zq0(i3, false, false, b2, false, -1, -1, set);
                   oz35.c.j = ozq0;
                   ouq7.w(str2, a1, Collections.singletonList(oz35.b(TimeUnit.MINUTES).a()));
                }
                a2 = o94.a;
                try{
                   oz35 = new z35(MetadataOfflineSyncBackgroundWork$MigrationWorker.class).c(10, TimeUnit.SECONDS);
                   zq0 a3 = o94.a;
                   co5.o(a3, "constraints");
                   oz35.c.j = a3;
                   uq7.y(b).w(str1, a1, Collections.singletonList(oz35.b(TimeUnit.MINUTES).a()));
                }catch(java.lang.IllegalStateException e0){
                   jl.f("Error fetching work manager", e0);
                }
                try{
                   ouq7 = uq7.y(b);
                   LinkedHashSet linkedHashSe = new LinkedHashSet();
                   z35 oz351 = new z35(MetadataCleanUpBackgroundWork$CleanUpWorker.class).c(30, TimeUnit.MINUTES);
                   if (Build$VERSION.SDK_INT >= 24) {
                      a = dj0.F0(linkedHashSe);
                   }
                   i2 = new zq0(1, false, false, true, false, -1, -1, a);
                   oz351.c.j = i;
                   ouq7.w(str, a1, Collections.singletonList(oz351.a()));
                }catch(java.lang.IllegalStateException e0){
                   jl.f("Error fetching work manager", e0);
                }
                LiteApplication j = b.J;
                o11 v = j.v;
                uo6 a4 = v.a;
                String str3 = null;
                String str4 = a4.g(uo6.c, str3);
                long l = a4.b(uo6.d, -1);
                if (!co5.c(str4, str3) && (l - -1)) {
                   v.b.getClass();
                   if (((System.currentTimeMillis() - l) - 0x493e0) < 0) {
                      i1 = 1;
                   label_017a :
                      String str5 = (i1)? str4: str3;
                      if (str5 != null) {
                         o11 b1 = j.b;
                         b1.getClass();
                         b1.a(new zo6(b1, str5));
                      }else {
                         j.w.c(j.t.b().subscribeOn(j.c).subscribe(new hs0(6, j), mb.v));
                      }
                   }
                }
                i1 = 0;
                goto label_017a ;
             }else {
                Object[] objArray2 = new Object[0];
                t37.a().getClass();
                try{
                   ge6.a(objArray2);
                   ouq71 = uq7.y(b);
                }catch(java.lang.IllegalStateException e0){
                   Object[] objArray3 = new Object[ouq71];
                   t37.a().getClass();
                   ge6.m(objArray3);
                   ouq71 = null;
                }
                if (ouq71 != null) {
                   ouq71.D.j(new pb0(ouq71, str2, true));
                }
                a2 = o94.a;
                try{
                   ouq7 = uq7.y(b);
                   opb0 = new pb0(ouq7, str1, true);
                   ouq7.D.j(opb0);
                }catch(java.lang.IllegalStateException e0){
                   jl.f("Error fetching work manager", e0);
                }
                try{
                   ouq7 = uq7.y(b);
                   opb0 = new pb0(ouq7, str, true);
                   ouq7.D.j(opb0);
                }catch(java.lang.IllegalStateException e0){
                   jl.f("Error fetching work manager", e0);
                }
                b.J.w.e();
             }
             return;
       }
       b.c.getClass();
       fp3.a(b, p0.booleanValue());
       return;
    }
}
