package com.spotify.liteplayer.player.npv.NowPlayingActivity;
import p.xk4;
import p.kj5;
import p.ul6;
import p.on4;
import p.xx3;
import androidx.appcompat.app.a;
import p.nq5;
import java.lang.Integer;
import p.au;
import p.fn0;
import p.an5;
import java.util.HashSet;
import p.x55;
import p.nm4;
import java.lang.Object;
import p.gm4;
import p.hm4;
import p.gn4;
import p.hn4;
import p.tk7;
import p.ym4;
import java.lang.String;
import p.jn4;
import p.kn4;
import p.ln4;
import p.en4;
import java.lang.StringBuilder;
import p.jl;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter;
import java.lang.Class;
import p.i83;
import java.lang.Enum;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter$NoOpPresenter;
import p.j83;
import android.os.Bundle;
import android.app.Activity;
import p.eo5;
import androidx.fragment.app.k;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import androidx.fragment.app.FragmentContainerView;
import com.spotify.liteplayer.player.npv.view.FullScreenLayout;
import android.widget.ProgressBar;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.litecomponents.nowplayingwidgets.RepeatButton;
import com.spotify.litecomponents.nowplayingwidgets.ShuffleButton;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import android.widget.SeekBar;
import p.qk4;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.LinearLayout;
import com.spotify.liteplayer.player.npv.view.PeekScrollView;
import p.t67;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.util.Collections;
import p.ce7;
import p.fh5;
import android.view.Window;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.content.Context;
import p.xw5;
import android.graphics.drawable.Drawable;
import p.pw5;
import android.util.TypedValue;
import p.ox7;
import p.kk4;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.bl4;
import p.jl4;
import p.wl4;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.vl4;
import p.fm4;
import p.em4;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.cm4;
import p.b5;
import p.bm4;
import p.zl4;
import p.dm4;
import p.xl4;
import p.yl4;
import p.ol4;
import p.cl4;
import p.ql4;
import p.sl4;
import p.dl4;
import p.am4;
import p.rl4;
import p.nl4;
import p.tl4;
import p.ul4;
import p.pl4;
import io.reactivex.rxjava3.core.ObservableSource;
import p.kf6;
import p.rf5;
import p.p54;
import io.reactivex.rxjava3.core.Observable;
import p.s02;
import p.mk4;
import p.yf2;
import p.v05;
import p.ir0;
import p.we6;
import p.wp3;
import p.nv1;
import com.spotify.mobius.rx3.RxEventSources;
import p.up0;
import p.bm;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import p.mi;
import p.xk5;
import p.ms3;
import p.qb4;
import p.in0;
import p.bu;
import java.lang.Long;
import java.lang.Float;
import java.lang.Boolean;
import p.mo;
import p.cu;
import p.sb4;
import p.is7;
import p.s81;
import p.ae2;
import androidx.fragment.app.a;
import androidx.fragment.app.o;
import p.mp0;
import androidx.fragment.app.Fragment;
import p.zo3;
import p.px3;
import p.tm5;
import p.zc;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import com.spotify.litelyrics.lyrics.views.TouchBlockingFrameLayout;
import p.g54;
import com.spotify.litelyrics.lyrics.views.LyricsNotTimesyncedIndicatorView;
import android.widget.Button;
import p.ad6;
import com.spotify.litelyrics.lyrics.widget.LyricsWidgetPresenter;
import androidx.activity.a;
import p.dk3;
import p.fk3;
import p.ok4;
import p.r82;
import io.reactivex.rxjava3.core.Flowable;
import p.i72;
import p.lk4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.co5;
import p.kz6;
import p.pk4;
import p.tp2;
import java.lang.NullPointerException;
import p.sd2;
import p.ek3;
import p.k15;
import androidx.activity.b;
import p.vk7;
import p.ll4;
import com.spotify.litecomponents.snackalog.a;
import p.ym6;
import p.rz;

public class NowPlayingActivity extends a implements xk4, kj5, ul6, on4, xx3	// class@000959 from classes.dex
{
    public final fn0 Q;
    public final an5 R;
    public final an5 S;
    public jl4 T;
    public kf6 U;
    public ll4 V;
    public zg0 W;
    public j83 X;
    public eo3 Y;
    public Scheduler Z;
    public xq7 a0;
    public a b0;
    public pm6 c0;
    public LyricsWidgetPresenter d0;
    public zo3 e0;
    public px3 f0;
    public o11 g0;
    public tv4 h0;
    public sb4 i0;
    public qk4 j0;
    public ce7 k0;
    public fh5 l0;
    public Drawable m0;
    public tk7 n0;
    public final HashSet o0;
    public static final au p0;

    static {
       nq5 onq5 = new nq5(10);
       onq5.a = Integer.valueOf(-12303292);
       onq5.b = Integer.valueOf(-1);
       onq5.c = Integer.valueOf(-1);
       NowPlayingActivity.p0 = onq5.a();
    }
    public void NowPlayingActivity(){
       super();
       this.Q = new fn0();
       this.R = new an5();
       this.S = new an5();
       this.o0 = new HashSet();
    }
    public final void C(int p0){
       NowPlayingActivity tn0;
       x55 o = x55.O;
       NowPlayingActivity tR = this.R;
       if (p0 == 0x7f0a004f) {
          tR.onNext(new nm4(o));
       }else if(p0 == 0x7f0a003a){
          tR.onNext(new gm4());
       }else if(p0 == 0x7f0a003b){
          tR.onNext(new hm4());
       }else if(p0 == 0x7f0a0060){
          tR.onNext(new gn4());
       }else if(p0 == 0x7f0a0061){
          tR.onNext(new hn4(o));
       }else if(p0 == 0x7f0a005b){
          String str = ((tn0 = this.n0) == null)? "": tn0.a;
          tR.onNext(new ym4(str));
       }else if(p0 == 0x7f0a0062){
          tR.onNext(new jn4());
       }else if(p0 == 0x7f0a0063){
          tR.onNext(new kn4());
       }else if(p0 == 0x7f0a0064){
          tR.onNext(new ln4(o));
       }else if(p0 == 0x7f0a005c){
          tR.onNext(new en4());
       }else {
          jl.d("Unsupported menu action, "+p0);
       }
       return;
    }
    public final InAppMessagingPresenter c(FormatType p0){
       int i;
       InAppMessagingPresenter$NoOpPresenter noOpPresente;
       NowPlayingActivity tX = this.X;
       tX.getClass();
       if ((i = i83.a[p0.ordinal()]) != 1) {
          noOpPresente = (i != 2)? new InAppMessagingPresenter$NoOpPresenter(): tX.l;
       }else {
          noOpPresente = tX.k;
       }
       return noOpPresente;
    }
    public final void onCreate(Bundle p0){
       View view2;
       View view3;
       View view4;
       View view5;
       View view6;
       View view7;
       View view8;
       View view9;
       View view10;
       View view11;
       View view12;
       View view13;
       View view14;
       View view15;
       View view16;
       View view18;
       View view19;
       View view20;
       View view21;
       View view22;
       View view23;
       View view24;
       View view25;
       View view26;
       View view27;
       View view28;
       View view29;
       View view30;
       t67 view3;
       NowPlayingActivity j0;
       LyricsWidgetPresenter l;
       int i2;
       a uoa = this;
       eo5.q(this);
       super.onCreate(p0);
       View view = this.getLayoutInflater().inflate(R.layout.now_playing_activity_container, null, false);
       View view1 = ry7.q(view, R.id.container_fragment_connectivity_state);
       String str = "Missing required view with ID: ";
       if (view1 != null) {
          if ((view2 = ry7.q(view, R.id.fullscreen_container)) != null) {
             if ((view3 = ry7.q(view, R.id.now_playing_view)) != null) {
                int i = 0x7f0a00b6;
                if ((view4 = ry7.q(view3, i)) != null) {
                   i = 0x7f0a00bb;
                   if ((view5 = ry7.q(view3, i)) != null) {
                      i = 0x7f0a00bc;
                      if ((view6 = ry7.q(view3, i)) != null) {
                         i = 0x7f0a00c2;
                         if ((view7 = ry7.q(view3, i)) != null) {
                            i = 0x7f0a00c3;
                            if ((view8 = ry7.q(view3, i)) != null) {
                               i = 0x7f0a00c7;
                               if ((view9 = ry7.q(view3, i)) != null) {
                                  i = 0x7f0a00ca;
                                  if ((view10 = ry7.q(view3, i)) != null) {
                                     i = 0x7f0a00cc;
                                     if ((view11 = ry7.q(view3, i)) != null) {
                                        i = 0x7f0a00cf;
                                        if ((view12 = ry7.q(view3, i)) != null) {
                                           i = 0x7f0a00d2;
                                           if ((view13 = ry7.q(view3, i)) != null) {
                                              i = 0x7f0a00d3;
                                              if ((view14 = ry7.q(view3, i)) != null) {
                                                 i = 0x7f0a00d4;
                                                 if ((view15 = ry7.q(view3, i)) != null) {
                                                    i = 0x7f0a00e4;
                                                    if ((view16 = ry7.q(view3, i)) != null) {
                                                       View view17 = ry7.q(view3, R.id.content);
                                                       i = 0x7f0a0143;
                                                       if ((view18 = ry7.q(view3, i)) != null) {
                                                          i = 0x7f0a0144;
                                                          if ((view19 = ry7.q(view3, i)) != null) {
                                                             i = 0x7f0a014c;
                                                             if ((view20 = ry7.q(view3, i)) != null) {
                                                                i = 0x7f0a019a;
                                                                if ((view21 = ry7.q(view3, i)) != null) {
                                                                   i = 0x7f0a01c5;
                                                                   if ((view22 = ry7.q(view3, i)) != null) {
                                                                      i = 0x7f0a0206;
                                                                      if ((view23 = ry7.q(view3, i)) != null) {
                                                                         i = 0x7f0a0400;
                                                                         if ((view24 = ry7.q(view3, i)) != null) {
                                                                            i = 0x7f0a050c;
                                                                            if ((view25 = ry7.q(view3, i)) != null) {
                                                                               i = 0x7f0a057e;
                                                                               if ((view26 = ry7.q(view3, i)) != null) {
                                                                                  i = 0x7f0a05ef;
                                                                                  if ((view27 = ry7.q(view3, i)) != null) {
                                                                                     i = 0x7f0a05f4;
                                                                                     if ((view28 = ry7.q(view3, i)) != null) {
                                                                                        i = 0x7f0a062e;
                                                                                        if ((view29 = ry7.q(view3, i)) != null) {
                                                                                           qk4 v37 = new qk4(view3, view4, view5, view6, view7, view8, view9, view10, view11, view12, view13, view14, view15, view16, view17, view18, view19, view20, view21, view22, view23, view24, view25, view26, view27, view28, view29);
                                                                                           if ((view30 = ry7.q(view, R.id.peeking_widget_container)) != null) {
                                                                                              if ((view4 = ry7.q(view, R.id.root_container)) != null) {
                                                                                                 if ((view5 = ry7.q(view, R.id.scroll_container)) != null) {
                                                                                                    view3 = new t67(view, view1, view2, v37, view30, view4, view5, 8);
                                                                                                    uoa.setContentView(view3.e());
                                                                                                    t67 v = view3.v;
                                                                                                    uoa.j0 = v;
                                                                                                    v.v.setSelected(true);
                                                                                                    uoa.j0.v.setSingleLine(true);
                                                                                                    uoa.j0.u.setSelected(true);
                                                                                                    uoa.j0.u.setSingleLine(true);
                                                                                                    mj5 omj5 = oj5.c(uoa.j0.p);
                                                                                                    View[] viewArray = new View[]{j0.p,j0.q};
                                                                                                    j0 = uoa.j0;
                                                                                                    Collections.addAll(omj5.c, viewArray);
                                                                                                    omj5.a();
                                                                                                    omj5 = oj5.c(uoa.j0.q);
                                                                                                    viewArray = new View[]{j0.p,j0.q};
                                                                                                    j0 = uoa.j0;
                                                                                                    Collections.addAll(omj5.c, viewArray);
                                                                                                    omj5.a();
                                                                                                    omj5 = oj5.c(uoa.j0.v);
                                                                                                    viewArray = new View[true];
                                                                                                    viewArray[0] = uoa.j0.v;
                                                                                                    Collections.addAll(omj5.c, viewArray);
                                                                                                    omj5.a();
                                                                                                    omj5 = oj5.c(uoa.j0.u);
                                                                                                    viewArray = new View[true];
                                                                                                    viewArray[0] = uoa.j0.u;
                                                                                                    Collections.addAll(omj5.c, viewArray);
                                                                                                    omj5.a();
                                                                                                    omj5 = oj5.b(uoa.j0.w);
                                                                                                    viewArray = new View[true];
                                                                                                    viewArray[0] = uoa.j0.w;
                                                                                                    Collections.addAll(omj5.d, viewArray);
                                                                                                    omj5.a();
                                                                                                    NowPlayingActivity bu j01 = uoa.j0;
                                                                                                    uoa.k0 = new ce7(j01.A, j01.s, j01.r);
                                                                                                    uoa.l0 = new fh5(this.getWindow().getDecorView());
                                                                                                    omj5 = oj5.a(uoa.j0.t);
                                                                                                    viewArray = new View[true];
                                                                                                    viewArray[0] = uoa.j0.t;
                                                                                                    Collections.addAll(omj5.c, viewArray);
                                                                                                    omj5.a();
                                                                                                    Drawable uDrawable = pw5.a(this.getResources(), R.drawable.encore_icon_track, this.getTheme());
                                                                                                    uoa.m0 = uDrawable;
                                                                                                    TypedValue typedValue = ((typedValue = ox7.F(uoa, R.attr.baseTextSubdued)) != null)? typedValue.data: -7829368;
                                                                                                    uDrawable.setTint(typedValue);
                                                                                                    NowPlayingActivity t = uoa.T;
                                                                                                    t.getClass();
                                                                                                    RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
                                                                                                    subtypeEffec.g(wl4.class, new bl4(t, false));
                                                                                                    subtypeEffec.g(vl4.class, new bl4(t, 2));
                                                                                                    subtypeEffec.g(fm4.class, new bl4(t, 3));
                                                                                                    subtypeEffec.g(em4.class, new bl4(t, 4));
                                                                                                    subtypeEffec.b(cm4.class, new kk4(uoa, false), id.a());
                                                                                                    subtypeEffec.b(bm4.class, new kk4(uoa, true), id.a());
                                                                                                    subtypeEffec.g(zl4.class, new bl4(t, 5));
                                                                                                    subtypeEffec.g(dm4.class, new bl4(t, 6));
                                                                                                    subtypeEffec.g(xl4.class, new bl4(t, 7));
                                                                                                    subtypeEffec.g(yl4.class, new bl4(t, 8));
                                                                                                    subtypeEffec.g(ol4.class, new bl4(t, 9));
                                                                                                    subtypeEffec.g(ql4.class, new cl4(uoa, 5));
                                                                                                    subtypeEffec.g(sl4.class, new cl4(uoa, false));
                                                                                                    subtypeEffec.g(am4.class, new dl4(t, false, uoa));
                                                                                                    subtypeEffec.g(rl4.class, new cl4(uoa, true));
                                                                                                    bl4 typedValue1 = new bl4(t, true);
                                                                                                    subtypeEffec.g(nl4.class, typedValue1);
                                                                                                    subtypeEffec.g(tl4.class, new cl4(uoa, 2));
                                                                                                    subtypeEffec.g(ul4.class, new cl4(uoa, 3));
                                                                                                    subtypeEffec.g(pl4.class, new cl4(uoa, 4));
                                                                                                    ObservableTransformer observableTr = subtypeEffec.h();
                                                                                                    j01 = uoa.U;
                                                                                                    ObservableSource[] observableSo = new ObservableSource[]{j01.b.f().distinctUntilChanged().compose(new s02(4)).map(new mk4(7)),j01.b.c().flatMap(new mk4(18)).doOnSubscribe(new v05(16)).map(new mk4(8)),j01.b.c().flatMap(new mk4(17)).doOnSubscribe(new v05(15)).debounce(new mk4(9)).map(new mk4(10)),j01.b.e().map(new mk4(11)),j01.b.g().map(new mk4(12)),j01.c.a().map(new mk4(13))};
                                                                                                    up0 j02 = new up0(true, uoa);
                                                                                                    lb4 olb4 = mi.A(new bm(3), RxConnectables.a(observableTr)).c(RxEventSources.a(observableSo)).b(j02).a(j02);
                                                                                                    qb4[] oqb4Array = new qb4[true];
                                                                                                    oqb4Array[0] = uoa.V;
                                                                                                    j01 = new bu();
                                                                                                    j01.a = "";
                                                                                                    j01.b = "";
                                                                                                    j01.c = Integer.valueOf(false);
                                                                                                    j01.d = "";
                                                                                                    j01.e = "";
                                                                                                    j01.f = "";
                                                                                                    j01.g = "";
                                                                                                    j01.h = "";
                                                                                                    j01.i = "";
                                                                                                    j01.j = Long.valueOf(0);
                                                                                                    j01.k = Long.valueOf(0);
                                                                                                    j01.l = Float.valueOf(0);
                                                                                                    j01.m = Long.valueOf(0);
                                                                                                    Boolean fALSE = Boolean.FALSE;
                                                                                                    j01.p = fALSE;
                                                                                                    j01.q = fALSE;
                                                                                                    j01.r = fALSE;
                                                                                                    j01.s = fALSE;
                                                                                                    j01.t = fALSE;
                                                                                                    j01.u = fALSE;
                                                                                                    j01.v = fALSE;
                                                                                                    j01.w = fALSE;
                                                                                                    j01.x = fALSE;
                                                                                                    j01.y = fALSE;
                                                                                                    j01.z = fALSE;
                                                                                                    j01.A = fALSE;
                                                                                                    j01.B = fALSE;
                                                                                                    j01.C = fALSE;
                                                                                                    j01.D = fALSE;
                                                                                                    j01.E = fALSE;
                                                                                                    j01.F = fALSE;
                                                                                                    j01.H = Integer.valueOf(-1);
                                                                                                    j01.G = fALSE;
                                                                                                    j01.I = mo.v;
                                                                                                    sb4 osb4 = is7.l(olb4.e(in0.g(ms3.h("NPV"), oqb4Array)), j01.a());
                                                                                                    uoa.i0 = osb4;
                                                                                                    osb4.a(RxConnectables.a(new s81(7, uoa)));
                                                                                                    ae2 uoae2 = this.y();
                                                                                                    uoae2.getClass();
                                                                                                    a j011 = new a(uoae2);
                                                                                                    uoa.Y.getClass();
                                                                                                    j011.g(R.id.container_fragment_connectivity_state, new mp0(), null, true);
                                                                                                    j011.e(false);
                                                                                                    if ((uoa.X.h = uoa.j0.y) && uoa.f0.a.get().a()) {
                                                                                                       view = this.getLayoutInflater().inflate(R.layout.lyrics_widget, null, false);
                                                                                                       int i1 = 0x7f0a0441;
                                                                                                       if ((view10 = ry7.q(view, i1)) != null) {
                                                                                                          i1 = 0x7f0a044e;
                                                                                                          if ((view11 = ry7.q(view, i1)) != null) {
                                                                                                             i1 = 0x7f0a044f;
                                                                                                             if ((view12 = ry7.q(view, i1)) != null) {
                                                                                                                i1 = 0x7f0a0450;
                                                                                                                if ((view13 = ry7.q(view, i1)) != null) {
                                                                                                                   i1 = 0x7f0a0452;
                                                                                                                   if ((view14 = ry7.q(view, i1)) != null) {
                                                                                                                      i1 = 0x7f0a0454;
                                                                                                                      if ((view2 = ry7.q(view, i1)) != null) {
                                                                                                                         g54 og54 = new g54(view2);
                                                                                                                         if ((view16 = ry7.q(view, R.id.lyrics_promotion_banner_button)) != null) {
                                                                                                                            if ((view17 = ry7.q(view, R.id.lyrics_promotion_banner_text)) != null) {
                                                                                                                               if ((view18 = ry7.q(view, R.id.lyrics_widget_button)) != null) {
                                                                                                                                  if ((view19 = ry7.q(view, R.id.lyrics_widget_container)) != null) {
                                                                                                                                     if ((view20 = ry7.q(view, R.id.lyrics_widget_header)) != null) {
                                                                                                                                        ad6 str1 = new ad6(view, view10, view11, view12, view13, view14, og54, view16, view17, view18, view19, view20);
                                                                                                                                        view3.y.addView(str.a);
                                                                                                                                        t = uoa.d0;
                                                                                                                                        t.getClass();
                                                                                                                                        t.L = str;
                                                                                                                                        uoa.t.a(uoa.d0);
                                                                                                                                        PeekScrollView v1 = view3.y.v;
                                                                                                                                        v1.getClass();
                                                                                                                                        j01 = uoa.Q;
                                                                                                                                        j01.c(new r82(v1, new ok4(str, false), false).g().subscribe(new lk4(uoa, true)));
                                                                                                                                        v1 = view3.y.v;
                                                                                                                                        ok4 ook4 = new ok4(str, true);
                                                                                                                                        v1.getClass();
                                                                                                                                        j01.c(new r82(v1, ook4, false).g().subscribe(new lk4(uoa, 2)));
                                                                                                                                        if ((l = uoa.d0.L) != null) {
                                                                                                                                           ad6 l1 = l.l;
                                                                                                                                           co5.l(l1, "views.lyricsWidgetHeader");
                                                                                                                                           j01.c(ry7.e(l1).subscribe(new pk4(view3, false)));
                                                                                                                                           Observable observable = uoa.d0.N.hide();
                                                                                                                                           co5.l(observable, "widgetVisibilityChanges.hide\(\)");
                                                                                                                                           j01.c(tp2.i(4, observable.distinctUntilChanged()).subscribe(new pk4(view3, true)));
                                                                                                                                        }else {
                                                                                                                                           co5.N("views");
                                                                                                                                           throw null;
                                                                                                                                        }
                                                                                                                                     }else {
                                                                                                                                        i1 = 0x7f0a045b;
                                                                                                                                     }
                                                                                                                                  }else {
                                                                                                                                     i1 = 0x7f0a045a;
                                                                                                                                  }
                                                                                                                               }else {
                                                                                                                                  i1 = 0x7f0a0459;
                                                                                                                               }
                                                                                                                            }else {
                                                                                                                               i1 = 0x7f0a0456;
                                                                                                                            }
                                                                                                                         }else {
                                                                                                                            i1 = 0x7f0a0455;
                                                                                                                         }
                                                                                                                      }
                                                                                                                   }
                                                                                                                }
                                                                                                             }
                                                                                                          }
                                                                                                       }
                                                                                                       throw new NullPointerException(str.concat(view.getResources().getResourceName(i1)));
                                                                                                    }
                                                                                                    uoa.x.a(uoa, new sd2(8, uoa, true));
                                                                                                    return;
                                                                                                 }else {
                                                                                                    i2 = 0x7f0a055e;
                                                                                                 }
                                                                                              }else {
                                                                                                 i2 = 0x7f0a054e;
                                                                                              }
                                                                                           }else {
                                                                                              i2 = 0x7f0a04f8;
                                                                                           }
                                                                                        }
                                                                                     }
                                                                                  }
                                                                               }
                                                                            }
                                                                         }
                                                                      }
                                                                   }
                                                                }
                                                             }
                                                          }
                                                       }
                                                    }
                                                 }
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }
                throw new NullPointerException(str.concat(view3.getResources().getResourceName(i)));
             }else {
                i2 = 0x7f0a04ca;
             }
          }else {
             i2 = 0x7f0a01df;
          }
       }else {
          i2 = 0x7f0a0134;
       }
       throw new NullPointerException(str.concat(view.getResources().getResourceName(i2)));
    }
    public final void onDestroy(){
       this.i0.b();
       super.onDestroy();
    }
    public final void onPause(){
       NowPlayingActivity tn0;
       super.onPause();
       if ((tn0 = this.n0) != null) {
          this.V.j(tn0);
       }
       this.X.b();
       return;
    }
    public final void onResume(){
       NowPlayingActivity tn0;
       super.onResume();
       if ((tn0 = this.n0) != null) {
          this.V.i(tn0);
       }
       this.X.c();
       return;
    }
    public final void onStart(){
       super.onStart();
       this.i0.f();
       this.b0.a(this);
    }
    public final void onStop(){
       ym6 f;
       super.onStop();
       if ((f = this.c0.f) != null) {
          f.a(3);
       }
       this.i0.g();
       return;
    }
}
