package com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import p.hd5;
import p.a21;
import p.bc;
import p.an5;
import p.kf6;
import p.t63;
import p.lj2;
import android.app.Dialog;
import android.content.Intent;
import androidx.fragment.app.k;
import java.lang.String;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import java.lang.Object;
import com.spotify.base.java.logging.Logger;
import p.hc5;
import p.ec5;
import android.os.Bundle;
import android.app.Activity;
import p.rd5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import p.n6;
import android.view.ViewGroup;
import p.gb0;
import p.k10;
import p.o17;
import p.vl2;
import p.z45;
import p.a70;
import p.pd5;
import java.lang.Class;
import p.hi7;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import p.co5;
import p.ir2;
import p.yf2;
import p.mf1;
import p.ab0;
import android.content.ClipboardManager;
import io.reactivex.rxjava3.core.Observable;
import p.up0;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import p.nt6;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import io.reactivex.rxjava3.core.ObservableSource;
import p.mg1;
import p.ha5;
import p.o11;
import p.nt;
import p.ad5;
import p.pp;
import p.bm;
import p.uv1;
import p.xe7;
import p.rm;
import p.jd5;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.cd5;
import p.wa5;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.dd5;
import p.zg0;
import p.bb5;
import p.dl4;
import p.xa5;
import p.sb5;
import p.bd5;
import p.mp;
import p.db5;
import p.ed5;
import p.ub5;
import p.s81;
import p.tb5;
import p.ab5;
import p.eb5;
import p.za5;
import p.uc5;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.hb5;
import p.b5;
import p.nb5;
import p.pb5;
import p.ob5;
import p.qb5;
import p.rb5;
import p.kb5;
import p.jb5;
import p.gb5;
import p.ya5;
import p.cb5;
import p.ib5;
import p.zc5;
import p.lb5;
import p.ir0;
import p.mb5;
import p.fb5;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import p.mi;
import p.nv1;
import com.spotify.mobius.rx3.RxEventSources;
import p.ms3;
import p.qb4;
import p.ad6;
import p.ko1;
import java.util.List;
import java.util.Collections;
import p.or;
import p.es;
import p.g;
import p.eu;
import java.lang.Boolean;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import com.spotify.login.signupapi.services.model.ConfigurationResponse$Companion;
import java.lang.Integer;
import p.nr;
import p.pv;
import p.ei2;
import p.kt;
import p.nu;
import p.sb4;
import p.is7;
import p.nd5;
import p.dn7;
import androidx.appcompat.app.a;
import p.sd2;
import androidx.activity.a;
import p.ek3;
import p.k15;
import androidx.activity.b;
import java.lang.NullPointerException;
import p.ic;
import java.lang.System;
import p.qc5;
import p.ym6;
import p.rz;

public class PhoneNumberSignupActivity extends a21 implements hd5	// class@00096a from classes.dex
{
    public mp R;
    public zg0 S;
    public pm6 T;
    public gg1 U;
    public InternetMonitor V;
    public ur6 W;
    public qf6 X;
    public final an5 Y;
    public sb4 Z;
    public rd5 a0;
    public vl2 b0;
    public gb0 c0;
    public k10 d0;
    public o17 e0;
    public z45 f0;
    public mm6 g0;
    public kf6 h0;
    public static final bc i0;

    static {
       PhoneNumberSignupActivity.i0 = new bc(16);
    }
    public void PhoneNumberSignupActivity(){
       super();
       this.Y = new an5();
    }
    public final void C(){
       PhoneNumberSignupActivity th0;
       if ((th0 = this.h0) != null) {
          th0.b.b.cancel();
          this.h0 = null;
       }
       return;
    }
    public final void onActivityResult(int p0,int p1,Intent p2){
       Credential parcelableEx;
       super.onActivityResult(p0, p1, p2);
       if (p0 == 1234) {
          PhoneNumberSignupActivity tY = this.Y;
          if (p1 == -1 && p2 != null) {
             if ((parcelableEx = p2.getParcelableExtra("com.google.android.gms.credentials.Credential")) == null) {
                Object[] objArray = new Object[0];
                Logger.i("Hint request failed, missing credential", objArray);
                tY.onNext(new hc5());
             }else {
                tY.onNext(new ec5(parcelableEx.a));
             }
          }else {
             tY.onNext(new hc5());
          }
       }
       return;
    }
    public final void onCreate(Bundle p0){
       ClipboardManager systemServic;
       List list;
       ConfigurationResponse default;
       nd5 parcelable;
       Activity uActivity = this;
       Bundle uBundle = p0;
       super.onCreate(p0);
       boolean b = "spotify.intent.action.LOGIN_OTP".equals(this.getIntent().getAction());
       rd5 ord5 = new rd5(LayoutInflater.from(this), n6.f(uActivity, 0x1020002));
       uActivity.a0 = ord5;
       ord5.f(b);
       uActivity.c0 = new gb0();
       uActivity.d0 = new k10();
       uActivity.e0 = new o17(uActivity);
       vl2 ord51 = new vl2(uActivity);
       uActivity.b0 = ord51;
       int i = 1;
       uActivity.f0 = new z45(ord51, new a70(this.getApplicationContext(), i));
       PhoneNumberSignupActivity x = uActivity.X;
       PhoneNumberSignupActivity w = uActivity.W;
       w.getClass();
       int i1 = 4;
       Single single = Single.fromCallable(new hi7(i1, w));
       co5.l(single, "get\(\) = Single.fromCalla…shi, CALLING_CODES_XML\) }");
       single = single.map(ir2.P);
       co5.l(single, "list\n            .map { …        map\n            }");
       int i2 = 6;
       single = single.map(new mf1(i2, uActivity));
       co5.l(single, "context: Context\): Singl…ontext, callingCodeMap\) }");
       single = single.map(new ab0(21));
       PhoneNumberSignupActivity r = uActivity.R;
       Observable observable = ((systemServic = uActivity.getSystemService("clipboard")) == null)? Observable.empty(): Observable.create(new up0(i1, systemServic)).flatMapMaybe(new nt6(uActivity, i));
       PhoneNumberSignupActivity a0 = uActivity.a0;
       PhoneNumberSignupActivity s = uActivity.S;
       o11 oo11 = nt.a();
       oo11.t = new ad5(9);
       oo11.c = new ad5(10);
       oo11.v = new pp(0);
       oo11.b = new bm(9);
       oo11.w = xe7.G(new ad5(11));
       o11 oo111 = nt.a();
       oo111.t = new ad5(i2);
       oo111.c = new ad5(7);
       oo111.v = new rm(29);
       oo111.b = new bm(8);
       oo111.w = xe7.G(new ad5(8));
       o11 jd5 oo112 = nt.a();
       oo112.t = new ad5(0);
       oo112.c = new ad5(1);
       oo112.v = new rm(27);
       oo112.b = new bm(i2);
       oo112.w = xe7.G(new ad5(2));
       oo112 = nt.a();
       oo112.t = new ad5(3);
       oo112.c = new ad5(4);
       oo112.v = new rm(28);
       oo112.b = new bm(7);
       oo112.w = xe7.G(new ad5(5));
       oo112 = new jd5(oo11.i(), oo111.i(), oo112.i(), oo112.i(), 0);
       RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
       subtypeEffec.g(wa5.class, new cd5(uActivity, 0));
       subtypeEffec.g(bb5.class, new dd5(a0, new mg1(12, uActivity), new ha5(24, uActivity), s));
       dl4 i3 = new dl4(uActivity, 2, a0);
       subtypeEffec.g(xa5.class, i3);
       subtypeEffec.g(sb5.class, new dl4(x, 1, single));
       subtypeEffec.g(db5.class, new bd5(r, s, 0));
       subtypeEffec.g(ub5.class, new ed5(r, 0));
       subtypeEffec.g(tb5.class, new s81(9, x));
       subtypeEffec.g(ab5.class, new ed5(r, 1));
       subtypeEffec.g(eb5.class, new bd5(r, s, 1));
       subtypeEffec.g(za5.class, new cd5(uActivity, 1));
       subtypeEffec.b(hb5.class, new uc5(uActivity, 0), id.a());
       subtypeEffec.b(nb5.class, new uc5(uActivity, 3), id.a());
       subtypeEffec.b(pb5.class, new uc5(uActivity, 4), id.a());
       subtypeEffec.b(ob5.class, new uc5(uActivity, 5), id.a());
       subtypeEffec.b(qb5.class, new uc5(uActivity, 6), id.a());
       subtypeEffec.b(rb5.class, new uc5(uActivity, 7), id.a());
       subtypeEffec.b(kb5.class, new uc5(uActivity, 8), id.a());
       subtypeEffec.b(jb5.class, new uc5(uActivity, 9), id.a());
       subtypeEffec.b(gb5.class, new uc5(uActivity, 10), id.a());
       subtypeEffec.b(ya5.class, new uc5(uActivity, 11), id.a());
       subtypeEffec.b(cb5.class, new uc5(uActivity, 1), id.a());
       subtypeEffec.b(ib5.class, new uc5(uActivity, 2), id.a());
       subtypeEffec.d(lb5.class, new zc5(uActivity, 0), id.a());
       subtypeEffec.d(mb5.class, new zc5(uActivity, 1), id.a());
       subtypeEffec.c(fb5.class, new zc5(uActivity, 2));
       ObservableSource[] observableSo = new ObservableSource[]{Observable.merge(observable.map(new ab0(5)), uActivity.V.getPermanentOfflineState().map(new ab0(i2)), uActivity.Y.hide())};
       lb4 olb4 = mi.A(oo112, RxConnectables.a(subtypeEffec.h())).c(RxEventSources.a(observableSo)).d(new bm(4)).e(ms3.i("PhoneNumberSignup"));
       ad6 uoad6 = new ad6(4);
       ko1 oko1 = new ko1(12, 0);
       oko1.b = null;
       oko1.c = null;
       if ((list = Collections.emptyList()) != null) {
          oko1.t = list;
          uoad6.a = oko1.h();
          uoad6.f(g.c().b());
          oko1 = new ko1(14);
          Boolean fALSE = Boolean.FALSE;
          oko1.c = fALSE;
          ConfigurationResponse$Companion companion = ConfigurationResponse.Companion;
          oko1.t = Integer.valueOf(companion.getDefault().getMinimumAge());
          uoad6.c = oko1.g();
          pv oko11 = new pv(1);
          oko11.a = ei2.a;
          oko11.b = fALSE;
          oko11.c = fALSE;
          oko11.d = fALSE;
          oko11.e = fALSE;
          uoad6.d = oko11.b();
          if ((default = companion.getDefault()) != null) {
             uoad6.e = default;
             uoad6.f = null;
             uoad6.g = Integer.valueOf(0);
             uoad6.h = fALSE;
             uoad6.i = fALSE;
             uoad6.j = fALSE;
             uoad6.k = fALSE;
             uoad6.l = fALSE;
             uoad6.k = Boolean.valueOf(b);
             uActivity.Z = is7.l(olb4, uoad6.a());
             if (uBundle && (parcelable = uBundle.getParcelable("PHONE_NUMBER_SIGNUP_MODEL")) != null) {
                uActivity.Z.e(parcelable);
             }
             uActivity.Z.a(new dn7(uActivity, 1));
             uActivity.x.a(uActivity, new sd2(10, uActivity, 1));
             return;
          }else {
             throw new NullPointerException("Null signupConfiguration");
          }
       }else {
          throw new NullPointerException("Null callingCodes");
       }
    }
    public final void onDestroy(){
       this.Z.b();
       super.onDestroy();
    }
    public final void onSaveInstanceState(Bundle p0){
       super.onSaveInstanceState(p0);
       p0.putParcelable("PHONE_NUMBER_SIGNUP_MODEL", this.Z.c());
    }
    public final void onStart(){
       super.onStart();
       this.Z.f();
       this.S.getClass();
       this.Y.onNext(new qc5(System.currentTimeMillis()));
    }
    public final void onStop(){
       ym6 f;
       PhoneNumberSignupActivity tg0;
       if ((f = this.T.f) != null) {
          f.a(3);
       }
       if ((tg0 = this.g0) != null) {
          tg0.a(3);
       }
       this.Z.g();
       super.onStop();
       return;
    }
}
