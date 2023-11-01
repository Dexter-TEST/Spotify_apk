package p.py6;
import java.lang.String;
import p.es3;
import android.content.Context;
import java.lang.Object;
import android.content.ComponentName;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.lang.Class;
import p.jr7;
import android.app.job.JobInfo;
import android.os.PersistableBundle;
import android.os.BaseBundle;
import android.app.job.JobInfo$Builder;
import p.zq0;
import android.os.Build$VERSION;
import android.net.NetworkRequest$Builder;
import android.net.NetworkRequest;
import p.l55;
import p.en6;
import p.kg4;
import java.lang.System;
import java.lang.Math;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p.yq0;
import android.app.job.JobInfo$TriggerContentUri;
import android.net.Uri;
import p.aq3;
import p.rr0;

public final class py6	// class@0022f8 from classes.dex
{
    public final ComponentName a;

    static {
       es3.d("SystemJobInfoConverter");
    }
    public void py6(Context p0){
       super();
       this.a = new ComponentName(p0.getApplicationContext(), SystemJobService.class);
    }
    public final JobInfo a(jr7 p0,int p1){
       int i2;
       int i3;
       jr7 j = p0.j;
       PersistableBundle persistableB = new PersistableBundle();
       persistableB.putString("EXTRA_WORK_SPEC_ID", p0.a);
       persistableB.putInt("EXTRA_WORK_SPEC_GENERATION", p0.t);
       persistableB.putBoolean("EXTRA_IS_PERIODIC", p0.c());
       zq0 c = j.c;
       JobInfo$Builder uBuilder = new JobInfo$Builder(p1, this.a).setRequiresCharging(j.b).setRequiresDeviceIdle(c).setExtras(persistableB);
       int sDK_INT = Build$VERSION.SDK_INT;
       boolean b = false;
       int i = 24;
       zq0 a = j.a;
       if (sDK_INT >= 30 && a == 6) {
          l55.m(uBuilder, new NetworkRequest$Builder().addCapability(25).build());
       }else if(i2 = en6.A(a)){
          if (i2 != 1) {
             if (i2 != 2) {
                i3 = 3;
                if (i2 != i3) {
                   i3 = 4;
                   if (i2 == i3 && sDK_INT >= 26) {
                   label_0081 :
                      uBuilder.setRequiredNetworkType(i3);
                   }
                }else if(sDK_INT >= i){
                   goto label_0081 ;
                }
                kg4.y(a);
                es3.c().getClass();
             }else {
                i3 = 2;
                goto label_0081 ;
             }
          }
          i3 = 1;
          goto label_0081 ;
       }else {
          i3 = 0;
          goto label_0081 ;
       }
       if (c == null) {
          int i1 = (p0.l == 2)? 0: 1;
          uBuilder.setBackoffCriteria(p0.m, i1);
       }
       long l = Math.max((p0.a() - System.currentTimeMillis()), 0);
       if (sDK_INT <= 28) {
          uBuilder.setMinimumLatency(l);
       }else if((l) > 0){
          uBuilder.setMinimumLatency(l);
       }else if(p0.q == null){
          l55.l(uBuilder);
       }
       if (sDK_INT >= i) {
          zq0 h = j.h;
          if ((h.isEmpty() ^ 1)) {
             Iterator iterator = h.iterator();
             while (iterator.hasNext()) {
                yq0 oyq0 = iterator.next();
                uBuilder.addTriggerContentUri(new JobInfo$TriggerContentUri(oyq0.a, oyq0.b));
             }
             uBuilder.setTriggerContentUpdateDelay(j.f);
             uBuilder.setTriggerContentMaxDelay(j.g);
          }
       }
       uBuilder.setPersisted(b);
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 26) {
          aq3.v(uBuilder, j.d);
          aq3.D(uBuilder, j.e);
       }
       j = (p0.k > null)? 1: 0;
       if ((l) > 0) {
          b = true;
       }
       if (sDK_INT >= 31 && (p0.q != null && (!j && !b))) {
          rr0.h(uBuilder);
       }
       return uBuilder.build();
    }
}
