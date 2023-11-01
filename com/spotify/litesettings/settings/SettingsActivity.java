package com.spotify.litesettings.settings.SettingsActivity;
import p.ro0;
import p.w53;
import p.fs5;
import p.fn0;
import p.lm0;
import p.an5;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import p.eo5;
import android.view.View;
import java.lang.String;
import p.fj3;
import p.gj3;
import p.yc6;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.yq5;
import p.dr5;
import p.q71;
import p.qm0;
import android.content.Context;
import p.sp6;
import p.lp6;
import android.content.res.Resources;
import androidx.appcompat.app.a;
import p.xj0;
import p.pm0;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import p.og7;
import p.gg1;
import p.n4;
import p.h10;
import java.lang.Object;
import android.util.SparseArray;
import p.rm;
import p.vz5;
import p.g10;
import p.mm0;
import java.util.List;
import java.util.Arrays;
import p.nm3;
import p.kq3;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import androidx.activity.a;
import com.spotify.litecomponents.snackalog.a;
import p.up0;
import p.bi5;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.sc6;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ti4;
import p.ox7;
import p.s02;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.zo0;
import p.tv4;
import p.eq3;
import io.reactivex.rxjava3.core.Single;
import p.yf2;
import io.reactivex.rxjava3.core.Flowable;
import p.i76;
import p.wp3;
import p.p54;
import p.tn6;
import p.ko1;
import p.bm;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import p.al5;
import p.pg2;
import p.s36;
import p.co3;
import p.rp3;
import p.fx6;
import p.ym6;
import p.rz;
import java.util.Objects;
import p.jg1;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.jk0;
import p.km3;
import p.ab0;

public class SettingsActivity extends fs5 implements ro0, w53	// class@000966 from classes.dex
{
    public an1 S;
    public gj3 T;
    public g54 U;
    public a V;
    public pm6 W;
    public w12 X;
    public final fn0 Y;
    public final lm0 Z;
    public final an5 a0;
    public fj3 b0;
    public yc6 c0;
    public pm0 d0;
    public pm0 e0;
    public qm0 f0;
    public qm0 g0;
    public qm0 h0;
    public qm0 i0;
    public qm0 j0;
    public qm0 k0;
    public qm0 l0;
    public qm0 m0;
    public qm0 n0;
    public qm0 o0;
    public qm0 p0;
    public static final int q0;

    public void SettingsActivity(){
       super();
       this.Y = new fn0();
       this.Z = new lm0();
       this.a0 = new an5();
    }
    public final void D(Bundle p0,RecyclerView p1){
       eo5.q(this);
       fj3 uofj3 = this.T.a(p1, "spotify:settings", p0);
       this.b0 = uofj3;
       _monitor_enter(uofj3);
       uofj3.f = "lite/settings";
       _monitor_exit(uofj3);
       this.c0 = this.U.r(this, yc6.class);
       SettingsActivity tZ = this.Z;
       p1.setAdapter(tZ);
       q71 itemAnimator = p1.getItemAnimator();
       boolean b = false;
       if (itemAnimator != null) {
          itemAnimator.g = b;
       }
       this.h0 = this.E(R.string.settings_cellular);
       this.i0 = this.E(R.string.settings_storage);
       this.j0 = this.E(R.string.settings_audio_quality);
       this.k0 = this.E(R.string.settings_explicit_content);
       this.l0 = this.E(R.string.settings_account);
       this.m0 = this.E(R.string.settings_about);
       this.n0 = this.E(R.string.settings_offline);
       qm0 oqm0 = this.E(R.string.settings_private);
       this.p0 = oqm0;
       oqm0.e = this.getString(R.string.settings_private_subtitle);
       this.d0 = new pm0(this.getString(R.string.settings_try_spotify_music), new lp6(this, sp6.m0, (float)xj0.e0(24.00f, this.getResources())));
       this.e0 = new pm0(this.getString(R.string.settings_logout), og7.a(this.getResources(), R.drawable.icn_log_out, this.getTheme()));
       oqm0 = this.E(R.string.settings_debug);
       this.f0 = oqm0;
       oqm0.e = this.getString(R.string.settings_debug_description);
       oqm0 = this.E(R.string.settings_feedback);
       this.g0 = oqm0;
       oqm0.e = this.getString(R.string.settings_feedback_description);
       oqm0 = this.E(R.string.settings_inapp);
       this.o0 = oqm0;
       oqm0.e = this.getString(R.string.settings_inapp_subtitle);
       gg1 ogg1 = new gg1();
       h10 oh10 = eo5.N(1, new n4(4, ogg1));
       tZ.t.put(oh10.a, oh10);
       n4 oh101 = new n4(5, ogg1);
       h10 oh102 = eo5.n(2, vz5.class, oh101, new rm(21));
       tZ.t.put(oh102.a, oh102);
       oh10 = eo5.u(R.layout.divider);
       tZ.t.put(oh10.a, oh10);
       mm0[] omm0Array = new mm0[10];
       omm0Array[b] = this.h0;
       omm0Array[1] = this.i0;
       omm0Array[2] = this.n0;
       omm0Array[3] = this.p0;
       omm0Array[4] = this.k0;
       omm0Array[5] = this.l0;
       omm0Array[6] = this.m0;
       omm0Array[7] = eo5.v(R.layout.divider, 1);
       omm0Array[8] = this.d0;
       omm0Array[9] = this.e0;
       tZ.z(Arrays.asList(omm0Array));
       Object[] objArray = new Object[]{"1.9.0.49155"};
       this.c0.x.getClass();
       tZ.e = this.getString(R.string.settings_about_description, objArray);
       return;
    }
    public final qm0 E(int p0){
       return new qm0(1, this.getString(p0));
    }
    public final vk7 b(){
       return wk7.G;
    }
    public final v55 h(){
       return x55.U;
    }
    public final void onDestroy(){
       this.Y.dispose();
       this.b0.a();
       super.onDestroy();
    }
    public final void onSaveInstanceState(Bundle p0){
       super.onSaveInstanceState(p0);
       this.b0.h(p0);
    }
    public final void onStart(){
       super.onStart();
       this.V.a(this);
       SettingsActivity ta0 = this.a0;
       this.Z.y(ta0);
       SettingsActivity tY = this.Y;
       tY.c(ta0.filter(new up0(5, this)).observeOn(id.a()).subscribe(new sc6(this, 7)));
       tY.c(ta0.subscribe(new sc6(this, 8)));
       zo0 ozo0 = ox7.C(this.c0.v.a()).compose(new s02(9)).replay(1);
       ozo0.getClass();
       tv4 otv4 = new tv4(ozo0);
       SettingsActivity tc0 = this.c0;
       ozo0 = ox7.C(tc0.w.c().repeatWhen(new up0(24, tc0)).x().map(new i76(24))).compose(new s02(10)).replay(1);
       ozo0.getClass();
       tv4 otv41 = new tv4(ozo0);
       ozo0 = ox7.C(this.c0.t.a()).compose(new s02(11)).replay(1);
       ozo0.getClass();
       tv4 otv42 = new tv4(ozo0);
       ozo0 = ox7.C(this.c0.A.g().map(new i76(22)).distinctUntilChanged()).compose(new s02(12)).replay(1);
       ozo0.getClass();
       tv4 otv43 = new tv4(ozo0);
       yc6 t = this.c0.t;
       ozo0 = ox7.C(t.d.r(t.a)).compose(new s02(13)).replay(1);
       ozo0.getClass();
       tv4 otv44 = new tv4(ozo0);
       tY.c(otv4.observeOn(id.a()).subscribe(new sc6(this, 9)));
       tY.c(otv41.observeOn(id.a()).subscribe(new sc6(this, 10)));
       tY.c(Observable.combineLatest(otv42, otv43, new bm(19)).observeOn(id.a()).subscribe(new sc6(this, 0)));
       tY.c(otv44.observeOn(id.a()).subscribe(new sc6(this, 1)));
       tY.c(this.c0.z.d.distinctUntilChanged().map(new i76(23)).distinctUntilChanged().observeOn(id.a()).subscribe(new sc6(this, 2)));
       tY.c(this.c0.z.c.distinctUntilChanged().map(new i76(21)).observeOn(id.a()).subscribe(new sc6(this, 3)));
       tY.c(Observable.combineLatest(otv4, otv42, otv41, new rm(17)).subscribeOn(s36.b).doOnError(new sc6(this, 4)).subscribe(new sc6(this, 5)));
       tY.c(this.X.j.a().map(new fx6(11)).observeOn(id.a()).subscribe(new sc6(this, 6)));
    }
    public final void onStop(){
       ym6 f;
       this.Z.y(null);
       this.Y.e();
       if ((f = this.W.f) != null) {
          f.a(3);
       }
       super.onStop();
       return;
    }
    public final void s(int p0){
       if (p0 == 0x7f0a012b) {
          SettingsActivity tc0 = this.c0;
          yc6 b = tc0.B;
          Objects.requireNonNull(b);
          this.Y.c(ox7.B(Completable.j(new jg1(1, b)).c(tc0.y.c(false))).filter(new ab0(3)).observeOn(id.a()).subscribe());
       }
       return;
    }
}
