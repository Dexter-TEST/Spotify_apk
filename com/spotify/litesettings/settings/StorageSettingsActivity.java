package com.spotify.litesettings.settings.StorageSettingsActivity;
import p.ro0;
import p.w53;
import androidx.appcompat.app.a;
import p.fn0;
import p.an5;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import android.os.Bundle;
import android.app.Activity;
import p.eo5;
import androidx.fragment.app.k;
import android.view.View;
import android.view.ViewStub;
import java.lang.Class;
import java.lang.Object;
import p.wt6;
import java.lang.CharSequence;
import android.content.Context;
import android.widget.TextView;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.util.Collections;
import p.ut6;
import p.ej7;
import p.vi7;
import p.g54;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observable;
import p.i76;
import p.yf2;
import java.lang.Boolean;
import p.st6;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.rt6;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.kz6;
import p.ry7;
import io.reactivex.rxjava3.core.Completable;
import p.tt6;
import java.util.Objects;
import p.a01;
import p.ew0;

public class StorageSettingsActivity extends a implements ro0, w53	// class@000969 from classes.dex
{
    public g54 Q;
    public ac R;
    public fv1 S;
    public ut6 T;
    public final fn0 U;
    public final an5 V;
    public final an5 W;
    public View X;
    public wt6 Y;
    public wt6 Z;
    public TextView a0;
    public TextView b0;
    public TextView c0;
    public View d0;
    public View e0;
    public View f0;
    public View g0;
    public static final int h0;

    public void StorageSettingsActivity(){
       super();
       this.U = new fn0();
       this.V = new an5();
       this.W = new an5();
    }
    public final vk7 b(){
       return wk7.P;
    }
    public final v55 h(){
       return x55.d0;
    }
    public final void onCreate(Bundle p0){
       eo5.q(this);
       super.onCreate(p0);
       this.setContentView(R.layout.activity_storage_settings);
       ViewStub viewStub = this.findViewById(R.id.device_storage);
       this.S.getClass();
       viewStub.setLayoutResource(R.layout.storage_total);
       wt6 owt6 = new wt6(viewStub.inflate());
       this.Y = owt6;
       owt6.b.setText(this.getText(R.string.settings_storage_device_title));
       this.Y.i(R.color.blue);
       ViewStub viewStub1 = this.findViewById(R.id.external_storage);
       this.S.getClass();
       viewStub1.setLayoutResource(R.layout.storage_total);
       wt6 owt61 = new wt6(viewStub1.inflate());
       this.Z = owt61;
       owt61.i(R.color.green_dark);
       this.Z.a.setVisibility(8);
       this.a0 = this.findViewById(R.id.app_storage_cache_value);
       this.b0 = this.findViewById(R.id.app_storage_downloads_value);
       this.d0 = this.findViewById(R.id.app_storage_cache_clear);
       this.e0 = this.findViewById(R.id.app_storage_downloads_clear);
       View view = this.findViewById(R.id.app_storage_location);
       this.f0 = view;
       this.c0 = view.findViewById(R.id.text2);
       this.g0 = this.findViewById(R.id.storage_location_group);
       mj5 omj5 = oj5.c(this.f0);
       View[] viewArray = new View[]{this.f0.findViewById(0x1020014),this.c0};
       Collections.addAll(omj5.c, viewArray);
       omj5.a();
       this.T = this.Q.r(this, ut6.class);
       GlueToolbarLayout glueToolbarL = this.findViewById(R.id.toolbar);
       GlueToolbar glueToolbar = GlueToolbars.createGlueToolbar(glueToolbarL);
       glueToolbar.setTitle(this.getTitle());
       view = this.getLayoutInflater().inflate(R.layout.up_button, glueToolbarL, 0);
       this.X = view;
       glueToolbar.addView(ToolbarSide.START, view, R.id.action_close);
    }
    public final void onPause(){
       this.U.e();
       super.onPause();
    }
    public final void onResume(){
       super.onResume();
       StorageSettingsActivity tV = this.V;
       StorageSettingsActivity tW = this.W;
       StorageSettingsActivity tU = this.U;
       tU.c(Observable.merge(tV, tW).flatMap(new i76(26)).startWithItem(Boolean.TRUE).switchMap(new st6(this, 0)).observeOn(id.a()).subscribe(new rt6(this, 1)));
       tU.c(tV.flatMap(new st6(this, 1)).observeOn(id.a()).subscribe());
       tU.c(ry7.e(this.d0).subscribe(new rt6(this, 2)));
       tU.c(tW.flatMapCompletable(new st6(this, 2)).subscribe());
       tU.c(ry7.e(this.e0).subscribe(new rt6(this, 3)));
       tV = this.T;
       tV.getClass();
       tt6 tW1 = new tt6(tV, 2);
       Observable observable = tV.x.switchMap(tW1);
       tW = this.e0;
       Objects.requireNonNull(tW);
       tU.c(observable.observeOn(id.a()).subscribe(new a01(tW, 2)));
       tV = this.T;
       tU.c(tV.x.mergeWith(tV.w.e()).switchMapSingle(new tt6(tV, 0)).map(new i76(27)).observeOn(id.a()).subscribe(new rt6(this, 4)));
       tU.c(ry7.e(this.f0).subscribe(new rt6(this, 5)));
       tU.c(ry7.e(this.X).subscribe(new rt6(this, 0)));
    }
    public final void s(int p0){
       if (p0 == 0x7f0a0129) {
          this.V.onNext(Boolean.TRUE);
       }else if(p0 == 0x7f0a012a){
          this.W.onNext(Boolean.TRUE);
       }
       return;
    }
}
