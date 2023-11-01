package com.spotify.litesettings.settings.StorageLocationSettingsActivity;
import p.w53;
import p.fs5;
import p.fn0;
import p.an5;
import p.kk6;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import p.eo5;
import p.lt6;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.lm0;
import p.rm;
import p.ht6;
import p.g10;
import p.h10;
import java.lang.Object;
import android.util.SparseArray;
import p.vl2;
import p.yq5;
import android.view.View;
import p.n6;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.content.Intent;
import java.lang.String;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import androidx.appcompat.app.a;
import p.eq3;
import io.reactivex.rxjava3.core.Single;
import p.up0;
import p.yf2;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import p.it6;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.jt6;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ud4;
import p.kt6;
import io.reactivex.rxjava3.core.Completable;

public class StorageLocationSettingsActivity extends fs5 implements w53	// class@000968 from classes.dex
{
    public g54 S;
    public ac T;
    public final fn0 U;
    public final an5 V;
    public final kk6 W;
    public lt6 X;
    public lm0 Y;
    public vl2 Z;
    public boolean a0;
    public View b0;
    public TextView c0;
    public ProgressBar d0;
    public static final int e0;

    public void StorageLocationSettingsActivity(){
       super();
       this.U = new fn0();
       this.V = new an5();
       this.W = new kk6();
    }
    public final int C(){
       return 0x7f0d0026;
    }
    public final void D(Bundle p0,RecyclerView p1){
       Intent intent;
       eo5.q(this);
       this.X = this.S.r(this, lt6.class);
       lm0 olm0 = new lm0();
       this.Y = olm0;
       int i = 1;
       h10 oh10 = eo5.n(i, ht6.class, new rm(18), new rm(26));
       olm0.t.put(oh10.a, oh10);
       oh10 = eo5.n(2, ht6.class, new rm(19), new rm(26));
       this.Y.t.put(oh10.a, oh10);
       this.Y.y(this.V);
       this.Z = new vl2(this);
       p1.setAdapter(this.Y);
       this.b0 = n6.f(this, R.id.loading_group);
       this.c0 = n6.f(this, R.id.loading_title);
       ProgressBar progressBar = n6.f(this, R.id.loading_indicator);
       this.d0 = progressBar;
       progressBar.setMax(100);
       if ((intent = this.getIntent()) == null || !intent.getBooleanExtra("EXTRA_REQUIRED", false)) {
          i = false;
       }
       this.a0 = i;
       return;
    }
    public final vk7 b(){
       return wk7.Q;
    }
    public final v55 h(){
       return x55.e0;
    }
    public final void onStart(){
       super.onStart();
       StorageLocationSettingsActivity tX = this.X;
       StorageLocationSettingsActivity tU = this.U;
       tU.c(tX.t.c().repeatWhen(new up0(27, tX)).x().map(new it6(this, 0)).observeOn(id.a()).subscribe(new jt6(this, 0)));
       tU.c(this.X.v.a.startWithItem(ud4.d).hide().observeOn(id.a()).subscribe(new jt6(this, 1)));
       tU.c(this.V.cast(kt6.class).subscribe(new jt6(this, 2)));
       tU.c(this.W.flatMapCompletable(new it6(this, 1)).subscribe());
    }
    public final void onStop(){
       this.U.e();
       super.onStop();
    }
}
