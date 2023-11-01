package p.t7;
import p.m65;
import p.fv1;
import p.fn0;
import java.lang.Boolean;
import java.lang.Object;
import p.t00;
import p.v55;
import p.x55;
import android.content.Context;
import androidx.fragment.app.Fragment;
import p.ej4;
import android.os.Bundle;
import androidx.fragment.app.k;
import p.w7;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.t67;
import p.q65;
import p.o11;
import p.wd5;
import com.spotify.litenetwork.webapi.model.LitePlaylistObject;
import p.p65;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.l95;
import android.widget.Button;
import java.util.Map;
import p.k95;
import android.util.AttributeSet;
import android.widget.TextView;
import p.hm1;
import p.bc2;
import java.lang.String;
import java.lang.CharSequence;
import p.co5;
import p.kz6;
import androidx.recyclerview.widget.RecyclerView;
import p.s7;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import p.am0;
import java.lang.Runnable;
import p.m5;
import p.et0;
import p.ry7;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import java.util.Objects;
import p.vs3;
import p.o06;
import p.up0;
import p.yf2;
import p.s36;
import p.bm;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import p.gk2;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import p.vo2;
import p.zk2;
import p.eo5;
import p.uo2;
import p.do5;
import p.n6;
import android.content.res.Resources;
import p.xj0;

public class t7 extends m65	// class@002719 from classes.dex
{
    public g54 E;
    public wd5 F;
    public pm6 G;
    public final fv1 H;
    public final fn0 I;
    public final t00 J;
    public final Object K;
    public t67 L;
    public w7 M;
    public q65 N;
    public o11 O;
    public Button P;
    public static final int Q;

    public void t7(){
       super();
       this.H = new fv1();
       this.I = new fn0();
       this.J = t00.b(Boolean.FALSE);
       this.K = new Object();
    }
    public final v55 h(){
       return x55.c;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       w7 ow7 = this.E.r(this.requireActivity(), w7.class);
       this.M = ow7;
       this.L = ow7.e();
       this.N = new q65();
       o11 oo11 = new o11(this.F, this.K);
       this.O = oo11;
       this.N.w(LitePlaylistObject.class, oo11);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Context uContext = this.requireContext();
       k95 ok95 = l95.c.get(Button.class);
       ok95.getClass();
       View view = ok95.a(uContext, null, R.attr.solarButtonPrimaryGreen);
       if (view instanceof TextView && !view instanceof hm1) {
          bc2.a(view, uContext);
       }
       this.P = view;
       view.setText(this.getString(R.string.add_to_playlist_create_playlist_button));
       return p0.inflate(R.layout.fragment_paging_list, p1, false);
    }
    public final void onStart(){
       super.onStart();
       m65 tx = this.x;
       co5.q(tx, "$this$scrollStateChanges");
       kz6 okz6 = new kz6(tx);
       Disposable uDisposable = okz6.subscribe(new s7(this, 0));
       t7 tI = this.I;
       tI.c(uDisposable);
       tI.c(et0.f(new am0(29, this)));
       tI.c(ry7.e(this.P).observeOn(id.a()).subscribe(new s7(this, 1)));
       t7 tO = this.O;
       Objects.requireNonNull(tO);
       vs3 ovs3 = new vs3(28, tO);
       o06 tO1 = new o06(ovs3, 0);
       t7 tN = this.N;
       Objects.requireNonNull(tN);
       tI.c(tO1.map(new up0(13, tN)).observeOn(s36.c).switchMapSingle(new up0(14, this)).observeOn(id.a()).subscribe(new s7(this, 2), new s7(this, 3)));
    }
    public final void onStop(){
       super.onStop();
       this.I.e();
    }
    public final q65 u(){
       return this.N;
    }
    public final t67 v(){
       return this.L;
    }
    public final Observable x(){
       return Observable.combineLatest(this.b, this.J, new bm(15));
    }
    public final void y(GlueHeaderLayout p0,gk2 p1,GlueToolbar p2){
       p1.setHeightFraction(0.16f);
       this.H.getClass();
       vo2 ovo2 = new vo2(LayoutInflater.from(p1.getContext()).inflate(R.layout.header_add_to_playlist, p1, false), 1);
       eo5.P(ovo2);
       do5.f(p1, ovo2);
       p1.setColor(n6.b(p1.getContext(), R.color.blue));
       p0.E(this.P, 1);
       p2.setTitle(this.getText(R.string.add_to_playlist_title));
       this.C = xj0.d0(16.00f, this.getResources());
    }
}
