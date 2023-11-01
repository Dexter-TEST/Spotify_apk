package com.spotify.litesettings.settings.StorageLocationMissingActivity;
import p.w53;
import androidx.appcompat.app.a;
import p.fn0;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import android.os.Bundle;
import android.app.Activity;
import p.eo5;
import androidx.fragment.app.k;
import p.bt6;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import android.view.View;
import p.n6;
import android.os.Build$VERSION;
import p.at6;
import android.window.OnBackInvokedDispatcher;
import android.window.OnBackInvokedCallback;
import p.eq3;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import p.up0;
import java.lang.Object;
import p.yf2;
import p.i76;
import p.r82;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.ab0;
import p.bi5;
import p.zs6;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.kz6;
import p.ry7;
import io.reactivex.rxjava3.core.Completable;

public class StorageLocationMissingActivity extends a implements w53	// class@000967 from classes.dex
{
    public g54 Q;
    public final fn0 R;
    public bt6 S;
    public View T;
    public View U;
    public static final int V;

    public void StorageLocationMissingActivity(){
       super();
       this.R = new fn0();
    }
    public final vk7 b(){
       return wk7.R;
    }
    public final v55 h(){
       return x55.f0;
    }
    public final void onBackPressed(){
    }
    public final void onCreate(Bundle p0){
       eo5.q(this);
       super.onCreate(p0);
       this.setContentView(R.layout.activity_storage_missing);
       this.S = this.Q.r(this, bt6.class);
       this.T = n6.f(this, R.id.retry_button);
       this.U = n6.f(this, R.id.change_location_button);
       if (Build$VERSION.SDK_INT >= 33) {
          this.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new at6());
       }
       return;
    }
    public final void onPause(){
       this.R.e();
       super.onPause();
    }
    public final void onResume(){
       super.onResume();
       StorageLocationMissingActivity tS = this.S;
       bt6 v = tS.v;
       Flowable uFlowable = v.b().repeatWhen(new up0(26, Flowable.p(v.d(), tS.t.toFlowable(BackpressureStrategy.c))));
       uFlowable.getClass();
       StorageLocationMissingActivity tR = this.R;
       tR.c(new r82(uFlowable, new i76(25), 0).x().observeOn(id.a()).filter(new ab0(4)).subscribe(new zs6(this, 0)));
       tR.c(ry7.e(this.T).flatMapCompletable(new up0(25, this)).subscribe());
       tR.c(ry7.e(this.U).subscribe(new zs6(this, 1)));
    }
}
