package com.spotify.litesettings.settings.AudioSettingsActivity;
import p.w53;
import p.fs5;
import p.fn0;
import p.lm0;
import p.an5;
import p.f7;
import p.po;
import p.c7;
import p.z6;
import p.h7;
import androidx.activity.a;
import p.i7;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import p.eo5;
import android.content.pm.PackageManager;
import android.content.Context;
import java.lang.Class;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import android.content.ComponentName;
import p.h10;
import android.util.SparseArray;
import p.gg1;
import p.n4;
import p.up0;
import p.rm;
import p.xz5;
import p.g10;
import p.u01;
import p.yq5;
import p.qo5;
import p.rf5;
import p.p54;
import io.reactivex.rxjava3.core.Observable;
import p.we6;
import p.wp3;
import p.tn6;
import p.ko1;
import p.fx6;
import p.yf2;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yg2;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.mg1;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Completable;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;

public class AudioSettingsActivity extends fs5 implements w53	// class@00095d from classes.dex
{
    public final fn0 S;
    public final lm0 T;
    public final an5 U;
    public boolean V;
    public final i7 W;
    public qo5 X;
    public static final int Y;

    public void AudioSettingsActivity(){
       super();
       this.S = new fn0();
       this.T = new lm0();
       this.U = new an5();
       this.W = this.registerForActivityResult(new f7(), new po());
    }
    public final void D(Bundle p0,RecyclerView p1){
       eo5.q(this);
       this.X.getClass();
       Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
       int i = 0;
       intent.putExtra("android.media.extra.CONTENT_TYPE", i);
       intent.putExtra("android.media.extra.AUDIO_SESSION", i);
       int i1 = 1;
       if (intent.resolveActivity(this.getPackageManager()) != null) {
          i = true;
       }
       this.V = i;
       h10 oh10 = eo5.u(R.layout.audio_quality_header);
       AudioSettingsActivity tT = this.T;
       tT.t.put(oh10.a, oh10);
       gg1 a = gg1.A;
       n4 h10 oh101 = eo5.n(i1, xz5.class, new up0(11, new n4(3, a)), new rm(20));
       lm0 t = tT.t;
       t.put(oh101.a, oh101);
       oh101 = eo5.u(R.layout.divider);
       t.put(oh101.a, oh101);
       oh101 = eo5.u(R.layout.data_warning);
       t.put(oh101.a, oh101);
       oh101 = eo5.O(2);
       t.put(oh101.a, oh101);
       oh101 = eo5.N(3, new n4(4, a));
       t.put(oh101.a, oh101);
       oh101 = new n4(6, a);
       oh10 = eo5.n(4, u01.class, oh101, new rm(23));
       t.put(oh10.a, oh10);
       oh10 = eo5.O(5);
       t.put(oh10.a, oh10);
       oh10 = eo5.O(6);
       t.put(oh10.a, oh10);
       oh10 = eo5.O(7);
       t.put(oh10.a, oh10);
       AudioSettingsActivity tU = this.U;
       tT.y(tU);
       p1.setAdapter(tT);
       AudioSettingsActivity tX = this.X;
       qo5 a1 = tX.a;
       a1 = tX.a;
       a1 = tX.a;
       a1 = tX.a;
       qo5 a2 = tX.a;
       AudioSettingsActivity tS = this.S;
       tS.c(Observable.combineLatest(tX.b.g(), tX.a.a(), a1.f.r(a1.a), a1.j.r(a1.a).map(new fx6(25)).distinctUntilChanged(), a1.k.r(a1.a), a1.l.r(a1.a), a2.m.r(a2.a), new rm(16)).observeOn(id.a()).subscribe(new mg1(3, this)));
       tS.c(tU.flatMapCompletable(new up0(21, this)).subscribe());
       return;
    }
    public final vk7 b(){
       return wk7.J;
    }
    public final v55 h(){
       return x55.X;
    }
    public final void onDestroy(){
       super.onDestroy();
       this.S.dispose();
    }
}
