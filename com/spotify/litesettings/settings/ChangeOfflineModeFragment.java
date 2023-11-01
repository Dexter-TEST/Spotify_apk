package com.spotify.litesettings.settings.ChangeOfflineModeFragment;
import androidx.fragment.app.Fragment;
import p.fn0;
import p.lm0;
import p.an5;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import p.ce0;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.gg1;
import p.n4;
import p.up0;
import java.lang.Object;
import p.rm;
import p.xz5;
import p.g10;
import p.h10;
import p.eo5;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.wp3;
import p.tn6;
import io.reactivex.rxjava3.core.Observable;
import p.ko1;
import p.bm;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import p.i76;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.xd0;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.zd0;
import androidx.recyclerview.widget.RecyclerView;
import p.yq5;

public class ChangeOfflineModeFragment extends Fragment	// class@000961 from classes.dex
{
    public g54 a;
    public final fn0 b;
    public final lm0 c;
    public final an5 t;
    public ce0 v;
    public static final int w;

    public void ChangeOfflineModeFragment(){
       super();
       this.b = new fn0();
       this.c = new lm0();
       this.t = new an5();
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.v = this.a.r(this, ce0.class);
       h10 oh10 = eo5.n(1, xz5.class, new up0(11, new n4(3, gg1.A)), new rm(20));
       ChangeOfflineModeFragment tc = this.c;
       tc.t.put(oh10.a, oh10);
       tc.y(this.t);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return p0.inflate(R.layout.fragment_change_offline_mode, p1, false);
    }
    public final void onStart(){
       super.onStart();
       ce0 t = this.v.t;
       ChangeOfflineModeFragment tb = this.b;
       tb.c(Observable.combineLatest(t.g.r(t.a), t.h.r(t.a), new bm(18)).map(new i76(19)).observeOn(id.a()).subscribe(new xd0(this, 0)));
       tb.c(this.t.observeOn(id.a()).ofType(zd0.class).map(new i76(18)).flatMapSingle(new up0(23, this)).observeOn(id.a()).subscribe(new xd0(this, 1)));
    }
    public final void onStop(){
       super.onStop();
       this.b.e();
    }
    public final void onViewCreated(View p0,Bundle p1){
       p0.findViewById(R.id.recycler_view).setAdapter(this.c);
    }
}
