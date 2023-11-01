package p.ng1;
import p.m65;
import p.fv1;
import java.lang.Boolean;
import java.lang.Object;
import p.t00;
import p.fn0;
import p.q65;
import com.spotify.webapi.service.models.Entity;
import java.lang.String;
import p.wk7;
import p.tk7;
import p.vk7;
import p.ab3;
import java.lang.Class;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import p.en6;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.i77;
import p.rv;
import p.ym6;
import p.v55;
import p.x55;
import android.content.Context;
import androidx.fragment.app.Fragment;
import p.ej4;
import android.os.Bundle;
import p.rg1;
import p.ej7;
import p.vi7;
import p.g54;
import p.aq6;
import java.lang.Enum;
import p.t67;
import p.j65;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.t63;
import p.pg1;
import p.qg1;
import p.nq5;
import p.eo1;
import p.go1;
import p.sp6;
import p.wd5;
import com.spotify.webapi.service.models.Track;
import p.p65;
import com.spotify.webapi.service.models.Episode;
import com.spotify.webapi.service.models.EpisodeSimple;
import p.og1;
import p.co5;
import p.kz6;
import androidx.recyclerview.widget.RecyclerView;
import p.ig1;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import p.jg1;
import java.lang.Runnable;
import p.m5;
import p.et0;
import p.s02;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.tp2;
import p.rm;
import p.yf2;
import p.s36;
import p.kg1;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.Objects;
import p.vs3;
import android.view.View;
import p.md3;
import p.er5;
import java.util.ArrayList;
import p.jd3;
import android.animation.ValueAnimator;
import p.zr5;
import p.kd3;
import android.view.VelocityTracker;
import p.ld3;
import android.content.res.Resources;
import android.view.ViewConfiguration;
import p.b7;
import p.bm;
import p.w00;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import p.gk2;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import p.vo2;
import p.zk2;
import p.eo5;
import p.uo2;
import p.do5;

public class ng1 extends m65	// class@001fcf from classes.dex
{
    public g54 E;
    public ac F;
    public wd5 G;
    public pm6 H;
    public final fv1 I;
    public final t00 J;
    public final Object K;
    public t67 L;
    public go1 M;
    public go1 N;
    public md3 O;
    public og1 P;
    public final fn0 Q;
    public final fn0 R;
    public rg1 S;
    public t67 T;
    public q65 U;
    public vo2 V;
    public static final int W;

    public void ng1(){
       super();
       this.I = new fv1();
       this.J = t00.b(Boolean.FALSE);
       this.K = new Object();
       this.Q = new fn0();
       this.R = new fn0();
    }
    public final void A(int p0,int p1,int p2){
       String str;
       wk7 s = ((str = this.U.x(p0).uri()) == null)? wk7.S: new tk7(str);
       ng1 tF = this.F;
       tF.getClass();
       wo3 owo3 = LiteInteraction.l();
       owo3.f("lite/edit-playlist");
       owo3.h(this.b().a);
       owo3.g(s.a());
       owo3.d(en6.f(p1));
       owo3.c(en6.e(p2));
       tF.a.a(owo3.build());
       return;
    }
    public final void B(int p0,Throwable p1){
       Object[] objArray = new Object[0];
       Logger.c(p1, "Error editing playlist", objArray);
       this.H.c(rv.a(p0).l());
    }
    public final v55 h(){
       return x55.H;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       t67 ot67;
       super.onCreate(p0);
       rg1 org1 = this.E.r(this, rg1.class);
       this.S = org1;
       Context uContext = this.requireContext();
       aq6 uoaq6 = this.w();
       int i = uoaq6.b.ordinal();
       rg1 t = org1.t;
       rg1 y = org1.y;
       if (i != 9 && i != 10) {
          ot67 = (i != 64)? new t67(new fv1(), y): new t67(new t63(uoaq6, t, new pg1(uContext), 11), y);
       }else {
          ot67 = new t67(new qg1(org1, new nq5(uoaq6, t, new eo1(5))), y);
       }
       this.T = ot67;
       this.L = new t67(11);
       ng1 tK = this.K;
       this.M = new go1(this.G, tK, 1);
       this.N = new go1(this.G, tK, 0);
       q65 oq65 = new q65();
       this.U = oq65;
       oq65.w(Track.class, this.M);
       this.U.w(Episode.class, this.N);
       this.U.w(EpisodeSimple.class, this.N);
       this.P = new og1(this.U);
       return;
    }
    public final void onStart(){
       super.onStart();
       m65 tx = this.x;
       co5.q(tx, "$this$scrollStateChanges");
       kz6 okz6 = new kz6(tx);
       Disposable uDisposable = okz6.subscribe(new ig1(this, 0));
       ng1 tQ = this.Q;
       tQ.c(uDisposable);
       tQ.c(et0.f(new jg1(0, this)));
       tQ.c(this.T.x.hide().compose(new s02(7)).observeOn(id.a()).subscribe(new ig1(this, 1)));
       m65 tt = this.t;
       Objects.requireNonNull(tt);
       tQ.c(tp2.i(17, this.T.x.hide().compose(new s02(8))).map(new rm(17)).observeOn(s36.c).map(new kg1(this, 0)).onErrorResumeWith(Observable.empty()).observeOn(id.a()).subscribe(new vs3(29, tt)));
    }
    public final void onStop(){
       this.Q.e();
       this.R.e();
       super.onStop();
    }
    public final void onViewCreated(View p0,Bundle p1){
       md3 q;
       RecyclerView t;
       super.onViewCreated(p0, p1);
       md3 omd3 = new md3(this.P);
       this.O = omd3;
       m65 tx = this.x;
       if ((q = omd3.q) == tx) {
       }else {
          int i = -1;
          md3 z = omd3.z;
          if (q != null) {
             q.b0(omd3);
             q = omd3.q;
             q.H.remove(z);
             if (q.I == z) {
                q.I = null;
             }
             if ((t = omd3.q.T) != null) {
                t.remove(omd3);
             }
             q = omd3.p;
             for (int i1 = q.size() + i; i1 >= 0; i1 = i1 - 1) {
                jd3 ojd3 = q.get(0);
                ojd3.g.cancel();
                omd3.m.a(ojd3.e);
             }
             q.clear();
             omd3.v = null;
             omd3.w = i;
             if ((q = omd3.s) != null) {
                q.recycle();
                omd3.s = null;
             }
             if ((q = omd3.y) != null) {
                q.a = false;
                omd3.y = null;
             }
             if (omd3.x != null) {
                omd3.x = null;
             }
          }
          omd3.q = tx;
          if (tx != null) {
             Resources resources = tx.getResources();
             omd3.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
             omd3.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
             ViewConfiguration.get(omd3.q.getContext()).getScaledTouchSlop();
             omd3.q.h(omd3, i);
             omd3.q.H.add(z);
             md3 q1 = omd3.q;
             if (q1.T == null) {
                q1.T = new ArrayList();
             }
             q1.T.add(omd3);
             omd3.y = new ld3(omd3);
             omd3.x = new b7(omd3.q.getContext(), omd3.y, 0);
          }
       }
       return;
    }
    public final q65 u(){
       return this.U;
    }
    public final t67 v(){
       return this.T;
    }
    public final Observable x(){
       return Observable.combineLatest(this.b, this.J, new bm(16));
    }
    public final void y(GlueHeaderLayout p0,gk2 p1,GlueToolbar p2){
       this.I.getClass();
       vo2 ovo2 = new vo2(LayoutInflater.from(p1.getContext()).inflate(R.layout.header_edit_playlist, p1, false), 1);
       eo5.P(ovo2);
       this.V = ovo2;
       p1.setHeightFraction(0.16f);
       do5.f(p1, this.V);
    }
}
