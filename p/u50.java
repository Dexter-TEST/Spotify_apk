package p.u50;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import java.util.HashSet;
import android.app.Activity;
import android.os.Bundle;
import java.lang.String;
import java.util.Objects;
import p.t50;
import p.m60;
import android.content.Context;
import p.ob2;
import p.l60;
import java.lang.ref.Reference;
import java.lang.Class;
import java.lang.StringBuilder;
import p.ji5;
import p.hb6;
import p.ob6;
import android.content.Intent;
import android.net.Uri;
import p.x12;
import p.s50;
import java.lang.ref.WeakReference;
import p.c60;
import p.x45;
import p.ty6;
import p.a60;
import java.util.concurrent.ConcurrentHashMap;
import p.pb6;
import p.ib6;
import p.sb6;
import android.content.SharedPreferences;

public final class u50 implements Application$ActivityLifecycleCallbacks	// class@002843 from classes.dex
{
    public int a;
    public final HashSet b;

    public void u50(){
       super();
       this.a = 0;
       this.b = new HashSet();
    }
    public final void onActivityCreated(Activity p0,Bundle p1){
       t50 ot50;
       m60 c;
       Objects.toString(p0);
       if ((ot50 = t50.i()) == null) {
          return;
       }
       int i = 1;
       ot50.i = i;
       Context applicationC = p0.getApplicationContext();
       if ((c = m60.b().c) == null || !ob2.a(applicationC, c)) {
          i = 0;
       }
       if (i) {
          c = m60.b();
          if (c.c(c.c, p0, null)) {
             c.c = null;
          }
       }
       return;
    }
    public final void onActivityDestroyed(Activity p0){
       t50 ot50;
       m60 e;
       Objects.toString(p0);
       if ((ot50 = t50.i()) == null) {
          return;
       }
       if (ot50.h() == p0) {
          ot50.l.clear();
       }
       m60 om60 = m60.b();
       if ((e = om60.e) != null && e.equalsIgnoreCase(p0.getClass().getName())) {
          om60.a = false;
       }
       this.b.remove(p0.toString());
       return;
    }
    public final void onActivityPaused(Activity p0){
       ji5.a("onActivityPaused, activity = "+p0);
       t50.i();
    }
    public final void onActivityResumed(Activity p0){
       t50 ot50;
       Objects.toString(p0);
       if ((ot50 = t50.i()) == null) {
          return;
       }
       if (!t50.y) {
          ot50.i = 2;
          ot50.f.e(hb6.c);
          int i = (p0.getIntent() != null && ot50.j != true)? 1: 0;
          if (i) {
             ot50.q(p0.getIntent().getData(), p0);
             if (ot50.v.a == null && t50.D != null) {
                t50 b = ot50.b;
                if (b.e() != null && !b.e().equalsIgnoreCase("bnc_no_value")) {
                   if (ot50.n != null) {
                      ot50.s = true;
                   }else {
                      ot50.o();
                   }
                }
             }
          }
          ot50.p();
       }
       if (ot50.j == 3 && !t50.z) {
          s50 os50 = new s50(p0);
          os50.b = true;
          os50.a();
       }
       this.b.add(p0.toString());
       return;
    }
    public final void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public final void onActivityStarted(Activity p0){
       t50 ot50;
       Objects.toString(p0);
       if ((ot50 = t50.i()) == null) {
          return;
       }
       ot50.l = new WeakReference(p0);
       int i = 1;
       ot50.i = i;
       this.a = this.a + i;
       if ((ot50 = t50.i()) != null) {
          t50 b = ot50.b;
          t50 v = ot50.v;
          t50 c = ot50.c;
          if (v == null || (c == null || (c.a == null || (b == null || b.o() == null)))) {
             i = 0;
          }
          if (i && (!b.o().equals(c.a.c) && (ot50.n == null && v.a == null))) {
             ot50.n = c.a.v(p0, ot50);
          }
       }
       return;
    }
    public final void onActivityStopped(Activity p0){
       t50 ot50;
       Objects.toString(p0);
       if ((ot50 = t50.i()) == null) {
          return;
       }
       int i = 1;
       boolean i1 = this.a - i;
       this.a = i1;
       if (i1 < i) {
          i1 = false;
          ot50.t = i1;
          t50 b = ot50.b;
          b.e.a.clear();
          t50 d = ot50.d;
          if (ot50.j != 3) {
             pb6 opb6 = new pb6(d);
             if (ot50.k != null) {
                ot50.k(opb6);
             }else {
                opb6.j(null, null);
             }
             ot50.j = 3;
          }
          ot50.k = i1;
          b.w("bnc_external_intent_uri", null);
          ot50 = ot50.v;
          ot50.getClass();
          ot50.a = ji5.g(d).a.getBoolean("bnc_tracking_state", i1);
       }
       return;
    }
}
