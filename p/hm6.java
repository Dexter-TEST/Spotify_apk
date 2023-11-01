package p.hm6;
import p.s01;
import android.content.Context;
import p.dl2;
import p.a7;
import p.xk2;
import p.im6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.an5;
import p.g7;
import p.gm6;
import p.c7;
import p.z6;
import p.h7;
import p.hl2;
import p.uv5;
import p.kb3;
import p.ve;
import com.google.android.gms.common.api.Status;
import android.content.IntentSender;
import android.app.PendingIntent;
import p.lb3;
import p.ab3;
import java.lang.Boolean;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.jl;
import com.google.android.gms.auth.api.credentials.Credential;
import p.p01;
import p.q01;
import p.a28;
import p.ej5;
import android.net.Uri;
import java.util.List;
import java.lang.Class;
import p.vo;
import p.fl2;
import p.w51;
import p.fv7;
import p.pt7;
import p.o2;
import p.jv7;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p.oi;
import p.em6;
import p.o07;
import java.util.concurrent.Executor;
import p.n25;
import p.f25;

public final class hm6 implements s01	// class@001880 from classes.dex
{
    public final dl2 a;
    public final xk2 b;
    public final im6 c;
    public final an5 d;
    public final an5 e;
    public final an5 f;
    public Credential g;
    public final h7 h;
    public final h7 i;
    public final h7 j;

    public void hm6(Context p0,dl2 p1,a7 p2,xk2 p3,im6 p4){
       co5.o(p0, "context");
       co5.o(p2, "activityResultCaller");
       co5.o(p3, "smartLockDialog");
       super();
       this.a = p1;
       this.b = p3;
       this.c = p4;
       this.d = new an5();
       this.e = new an5();
       this.f = new an5();
       h7 oh7 = p2.registerForActivityResult(new g7(), new gm6(this, 2));
       co5.l(oh7, "activityResultCaller.reg…alsResolutionResult\n    \)");
       this.h = oh7;
       oh7 = p2.registerForActivityResult(new g7(), new gm6(this, 0));
       co5.l(oh7, "activityResultCaller.reg…alsResolutionResult\n    \)");
       this.i = oh7;
       oh7 = p2.registerForActivityResult(new g7(), new gm6(this, 1));
       co5.l(oh7, "activityResultCaller.reg…ntsResolutionResult\n    \)");
       this.j = oh7;
       hl2.c.d(p0);
    }
    public static final void a(hm6 p0,uv5 p1){
       String str = "save";
       hm6 c = p0.c;
       try{
          IntentSender intentSender = p1.a.t.getIntentSender();
          co5.l(intentSender, "exception.resolution.intentSender");
          p0.h.a(new kb3(intentSender).d());
       }catch(android.content.IntentSender$SendIntentException e6){
          if (c) {
             c.a.d(str, "failed");
          }
          p0.d.onNext(Boolean.FALSE);
          jl.q("Failed to start smartlock save credentials resolution", e6);
       }catch(java.lang.IllegalStateException e6){
          if (c) {
             c.a.d(str, "failed");
          }
          p0.d.onNext(Boolean.FALSE);
          Object[] objArray = new Object[0];
          Logger.c(e6, "Activity for result is no longer registered", objArray);
       }
       return;
    }
    public final void b(Credential p0,int p1){
       hm6 ta;
       Credential w;
       Credential v = (p0 != null)? p0.v: null;
       p01 a = p01.a;
       if (p0 != null) {
          Credential a1 = p0.a;
          co5.l(a1, "id");
          int i = 1;
          int i1 = (!a1.length())? 1: 0;
          if (!i1 && ((w = p0.w) == null || co5.c(w, ""))) {
             if (v != null && v.length()) {
                i = 0;
             }
             if (!i) {
                a = new q01(a1, v, p1);
             }
          }
       }
       hm6 tc = this.c;
       if (a instanceof p01) {
          if (tc != null) {
             tc.a.d("load", "empty");
          }
          if (p0 != null && (ta = this.a) != null) {
             ta.a(p0);
          }
       }else if(tc != null){
          tc.a.d("load", "succeeded");
       }
       this.g = p0;
       this.e.onNext(a);
       return;
    }
    public final void c(String p0,String p1){
       Credential p0;
       hm6 ta;
       co5.o(p0, "username");
       co5.o(p1, "password");
       ej5 uoej5 = new ej5(p0);
       uoej5.e = p1;
       p0 = new Credential(uoej5.a, uoej5.b, uoej5.c, uoej5.d, p1, uoej5.f, uoej5.g, uoej5.h);
       if ((ta = this.a) == null) {
          this.d.onNext(Boolean.FALSE);
       }else {
          dl2 a = ta.a;
          a.getClass();
          vo.c.getClass();
          fl2 h = a.h;
          w51.l(h, "client must not be null");
          fv7 uoej51 = new fv7(h, p0, 0);
          h.b.d(1, uoej51);
          a28 uoa28 = oi.m(uoej51);
          co5.l(uoa28, "client.save\(credential\)");
          mt7 a1 = o07.a;
          uoa28.c(a1, new em6(this));
          uoa28.b(a1, new em6(this));
       }
       return;
    }
}
