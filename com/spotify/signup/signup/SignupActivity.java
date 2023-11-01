package com.spotify.signup.signup.SignupActivity;
import p.a21;
import p.an5;
import java.lang.Boolean;
import java.lang.Object;
import android.os.Bundle;
import p.uh6;
import android.content.Context;
import android.view.LayoutInflater;
import android.app.Activity;
import android.view.View;
import p.n6;
import android.view.ViewGroup;
import p.k10;
import p.o17;
import p.px3;
import p.qf7;
import p.qf6;
import p.o11;
import p.nt;
import p.ad5;
import p.pp;
import p.bm;
import p.uv1;
import p.xe7;
import p.jd5;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.dh6;
import p.vf6;
import java.lang.Class;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.ki1;
import p.wf6;
import p.ag6;
import p.ch6;
import p.jg6;
import p.hg6;
import p.ig6;
import p.eh6;
import p.mp;
import p.yf6;
import p.zf6;
import p.ah6;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.xf6;
import p.b5;
import p.eg6;
import p.bh6;
import p.fg6;
import p.ir0;
import p.gg6;
import p.cg6;
import p.dg6;
import p.bg6;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import p.mi;
import io.reactivex.rxjava3.core.ObservableSource;
import p.a05;
import p.yf2;
import io.reactivex.rxjava3.core.Observable;
import p.hm6;
import java.util.concurrent.TimeUnit;
import p.nv1;
import com.spotify.mobius.rx3.RxEventSources;
import java.lang.String;
import p.ms3;
import p.qb4;
import p.tr7;
import p.ko1;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import com.spotify.login.signupapi.services.model.ConfigurationResponse$Companion;
import java.lang.Integer;
import p.nr;
import p.pv;
import p.ei2;
import p.kt;
import p.j8;
import p.ws;
import p.lq5;
import p.g85;
import p.k85;
import java.util.Map;
import java.util.Collections;
import p.hu;
import p.mv;
import p.sb4;
import p.is7;
import android.content.Intent;
import p.nh6;
import p.zq7;
import p.jj5;
import p.ft;
import p.of6;
import p.pf6;
import android.view.View$OnClickListener;
import java.lang.NullPointerException;
import androidx.appcompat.app.a;

public class SignupActivity extends a21	// class@000c2b from classes.dex
{
    public sb4 R;
    public uh6 S;
    public final an5 T;
    public k10 U;
    public o17 V;
    public s01 W;
    public mp X;
    public zg0 Y;
    public qf6 Z;
    public static final int a0;

    public void SignupActivity(){
       super();
       this.T = new an5();
    }
    public final void onBackPressed(){
       this.T.onNext(Boolean.TRUE);
    }
    public final void onCreate(Bundle p0){
       Map map;
       ConfigurationResponse default;
       Activity uActivity = this;
       super.onCreate(p0);
       uActivity.S = new uh6(LayoutInflater.from(this), n6.f(uActivity, 0x1020002));
       uActivity.U = new k10();
       uActivity.V = new o17(uActivity);
       px3 opx3 = new px3(uActivity);
       SignupActivity x = uActivity.X;
       SignupActivity z = uActivity.Z;
       qf7 oqf7 = new qf7(z);
       SignupActivity w = uActivity.W;
       o11 oo11 = nt.a();
       oo11.t = new ad5(14);
       oo11.c = new ad5(15);
       oo11.v = new pp(9);
       oo11.b = new bm(14);
       oo11.w = xe7.G(new ad5(16));
       oo11 = nt.a();
       oo11.t = new ad5(23);
       oo11.c = new ad5(24);
       oo11.v = new pp(12);
       oo11.b = new bm(17);
       oo11.w = xe7.G(new ad5(25));
       oo11 = nt.a();
       oo11.t = new ad5(20);
       oo11.c = new ad5(21);
       oo11.v = new pp(11);
       oo11.b = new bm(16);
       oo11.w = xe7.G(new ad5(22));
       oo11 = nt.a();
       oo11.t = new ad5(17);
       oo11.c = new ad5(18);
       oo11.v = new pp(10);
       oo11.b = new bm(15);
       oo11.w = xe7.G(new ad5(19));
       jd5 v7 = new jd5(oo11.i(), oo11.i(), oo11.i(), oo11.i(), 1);
       RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
       subtypeEffec.g(vf6.class, new dh6(2, opx3));
       subtypeEffec.g(wf6.class, new ki1(oqf7, 3));
       ki1 v71 = new ki1(oqf7, 2);
       subtypeEffec.g(ag6.class, v71);
       subtypeEffec.g(jg6.class, new ch6(z, 0));
       subtypeEffec.g(hg6.class, new ch6(z, 1));
       ch6 oqf71 = new ch6(z, 2);
       subtypeEffec.g(ig6.class, oqf71);
       subtypeEffec.g(yf6.class, new eh6(x, 0));
       eh6 ko1 z1 = new eh6(x, 1);
       subtypeEffec.g(zf6.class, z1);
       subtypeEffec.b(xf6.class, new ah6(opx3, 0), id.a());
       subtypeEffec.b(eg6.class, new ah6(opx3, 1), id.a());
       subtypeEffec.d(fg6.class, new bh6(0, opx3), id.a());
       subtypeEffec.d(gg6.class, new bh6(2, opx3), id.a());
       subtypeEffec.g(cg6.class, new dh6(1, w));
       subtypeEffec.g(dg6.class, new dh6(0, w));
       bh6 x1 = new bh6(1, opx3);
       subtypeEffec.c(bg6.class, x1);
       ObservableSource[] observableSo = new ObservableSource[]{uActivity.T.map(new a05(22)),w.d.timeout(3000, TimeUnit.MILLISECONDS).onErrorResumeNext(new a05(23)).map(new a05(24))};
       lb4 olb4 = mi.A(v7, RxConnectables.a(subtypeEffec.h())).c(RxEventSources.a(observableSo)).d(new bm(8)).e(ms3.i("SignupFeature"));
       tr7 otr7 = new tr7();
       z1 = new ko1(14);
       Boolean fALSE = Boolean.FALSE;
       z1.c = fALSE;
       ConfigurationResponse$Companion companion = ConfigurationResponse.Companion;
       z1.t = Integer.valueOf(companion.getDefault().getMinimumAge());
       otr7.a = z1.g();
       pv z11 = new pv(1);
       z11.a = ei2.a;
       z11.b = fALSE;
       z11.c = fALSE;
       z11.d = fALSE;
       z11.e = fALSE;
       otr7.b = z11.b();
       otr7.c = ws.c().f();
       lq5 olq5 = new lq5(13);
       olq5.b = "";
       olq5.j(new g85());
       if ((map = Collections.emptyMap()) == null) {
          throw new NullPointerException("Null validatedPasswordStates");
       }
       olq5.v = map;
       olq5.t = fALSE;
       otr7.t = olq5.g();
       otr7.w = fALSE;
       otr7.v = Integer.valueOf(0);
       if ((default = companion.getDefault()) == null) {
          throw new NullPointerException("Null signupConfiguration");
       }
       otr7.y = default;
       otr7.x = fALSE;
       otr7.A = null;
       uActivity.R = is7.l(olb4, otr7.a());
       String stringExtra = this.getIntent().getStringExtra("EXTRA_FB_CREDENTIALS_USER_ID");
       String stringExtra1 = this.getIntent().getStringExtra("EXTRA_FB_CREDENTIALS_TOKEN");
       String stringExtra2 = this.getIntent().getStringExtra("EXTRA_FB_CREDENTIALS_USERNAME");
       String stringExtra3 = this.getIntent().getStringExtra("EXTRA_FB_CREDENTIALS_EMAIL");
       nh6 onh6 = uActivity.R.c();
       if (stringExtra != null && (stringExtra1 != null && (stringExtra2 != null && stringExtra3 != null))) {
          onh6.getClass();
          zq7 ozq7 = new zq7(14);
          ozq7.a = stringExtra;
          ozq7.b = stringExtra1;
          ozq7.c = stringExtra2;
          ozq7.t = new jj5(stringExtra3);
          otr7 = new tr7(onh6);
          otr7.A = ozq7.b();
          mv omv = otr7.a();
          if (!stringExtra3.isEmpty()) {
             j8 oj8 = ws.c();
             oj8.b = stringExtra3;
             tr7 otr71 = new tr7(omv);
             otr71.c = oj8.f();
             omv = otr71.a();
          }
          onh6 = omv;
       }
       uActivity.R.e(onh6);
       uActivity.R.a(new of6(uActivity));
       uActivity.S.z.setOnClickListener(new pf6(uActivity));
       return;
    }
    public final void onDestroy(){
       this.R.b();
       super.onDestroy();
    }
    public final void onStart(){
       super.onStart();
       this.R.f();
    }
    public final void onStop(){
       super.onStop();
       this.R.g();
    }
}
