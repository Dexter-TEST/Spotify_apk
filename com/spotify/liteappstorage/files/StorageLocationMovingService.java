package com.spotify.liteappstorage.files.StorageLocationMovingService;
import android.app.Service;
import p.fn0;
import p.gt6;
import android.os.Build$VERSION;
import android.content.Intent;
import android.os.IBinder;
import p.eo5;
import p.r8;
import p.ic;
import java.lang.Class;
import java.lang.Object;
import java.lang.System;
import android.content.Context;
import android.app.Notification;
import java.lang.String;
import p.xe7;
import java.lang.StringBuilder;
import p.jl;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import p.eq3;
import io.reactivex.rxjava3.core.Single;
import p.jr3;
import java.util.concurrent.Callable;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Objects;
import p.dq3;
import p.bq3;
import p.yf2;
import p.up0;
import io.reactivex.rxjava3.core.SingleSource;
import p.w00;
import p.fx6;
import io.reactivex.rxjava3.core.Observable;
import p.vk5;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.rk0;
import io.reactivex.rxjava3.core.CompletableSource;
import p.et6;
import p.id;
import p.dt6;
import p.ft6;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ct6;
import p.jk0;
import p.ha5;
import p.b5;

public class StorageLocationMovingService extends Service	// class@000922 from classes.dex
{
    public zg0 a;
    public mt6 b;
    public pd4 c;
    public tn6 t;
    public final fn0 v;
    public final gt6 w;
    public r8 x;
    public static final int y;

    public void StorageLocationMovingService(){
       super();
       this.v = new fn0();
       this.w = new gt6();
    }
    public final void a(){
       if (Build$VERSION.SDK_INT >= 24) {
          this.stopForeground(1);
       }else {
          this.stopForeground(1);
       }
       this.stopSelf();
       return;
    }
    public final IBinder onBind(Intent p0){
       return this.w;
    }
    public final void onCreate(){
       eo5.r(this);
       super.onCreate();
       this.a.getClass();
       r8 or8 = new r8(this, System.currentTimeMillis());
       this.x = or8;
       this.startForeground(R.id.storage_notification, or8.b(0));
    }
    public final void onDestroy(){
       super.onDestroy();
       this.v.e();
    }
    public final int onStartCommand(Intent p0,int p1,int p2){
       String str = xe7.J(p0.getAction());
       StorageLocationMovingService tv = this.v;
       if (!str.equals("spotify.intent.action.STORAGE_FINALIZE_SERVICE")) {
          if (!str.equals("spotify.intent.action.STORAGE_MOVE_SERVICE")) {
             jl.d("Invalid action, \""+p0.getAction()+'"');
             this.a();
          }else {
             str = p0.getStringExtra("EXTRA_FILE_PATH");
             if (TextUtils.isEmpty(str)) {
                jl.d("Invalid path");
                this.a();
             }else {
                StorageLocationMovingService tb = this.b;
                tb.getClass();
                Scheduler c = s36.c;
                eq3 e = tb.e;
                Objects.requireNonNull(e);
                tv.c(Single.zip(this.b.b(), Single.fromCallable(new jr3(tb, 1, new File(str))).subscribeOn(c).observeOn(c).map(new dq3(e, 1)), new up0(false, this)).flatMapObservable(new fx6(22)).concatWith(Completable.j(new vk5(this, str, p0.getBooleanExtra("EXTRA_INTERNAL", false), 1)).p(c)).concatWith(Completable.j(new et6(this, false)).p(id.a())).concatWith(Completable.j(new et6(this, 1)).p(id.a())).subscribe(new dt6(this, 1), new ft6(this, false, str)));
             }
          }
       }else {
          tv.c(this.b.b().flatMapCompletable(new ct6(this, false)).c(Completable.j(new et6(this, 2)).p(s36.c)).subscribe(new ha5(12, this), new dt6(this, false)));
       }
       return 2;
    }
}
