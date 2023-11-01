package p.lx3;
import p.nx3;
import p.nn4;
import p.ty;
import p.fd1;
import android.animation.Animator;
import android.animation.AnimatorSet;
import p.mn4;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.on4;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import java.lang.Object;
import p.an5;
import p.cu;
import p.mx3;
import android.view.View;
import p.ic;
import java.lang.Class;
import android.os.SystemClock;
import p.ce7;
import p.sp6;
import com.spotify.legacyglue.icons.SpotifyIconView;
import android.content.Context;
import android.content.res.ColorStateList;
import p.n6;
import com.spotify.litecomponents.nowplayingwidgets.RepeatButton;
import com.spotify.litecomponents.nowplayingwidgets.ShuffleButton;
import p.tk7;
import java.lang.String;
import p.vk7;
import p.vf;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import p.ry7;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.TextView;
import android.widget.FrameLayout;
import com.spotify.litelyrics.lyrics.fullscreen.views.LyricsFullscreenView;
import com.spotify.litelyrics.lyrics.fullscreen.views.LyricsFullscreenHeaderView;
import com.facebook.shimmer.ShimmerFrameLayout;
import android.widget.Button;
import p.g54;
import com.spotify.litelyrics.lyrics.views.LyricsNotTimesyncedIndicatorView;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import android.widget.SeekBar;
import p.hq0;
import android.view.ViewGroup$LayoutParams;
import p.hy3;
import p.co5;
import android.os.BaseBundle;
import android.os.Build$VERSION;
import android.view.Window;
import android.app.Activity;
import android.view.WindowInsets;
import p.w27;
import android.view.DisplayCutout;
import p.l55;
import p.q3;
import p.ix3;
import android.view.View$OnClickListener;
import p.kx3;
import android.widget.SeekBar$OnSeekBarChangeListener;
import p.xx3;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observable;
import p.vs3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import androidx.fragment.app.o;
import p.jx3;
import p.ek3;
import p.je2;
import android.content.res.Resources;
import java.lang.NullPointerException;
import androidx.fragment.app.f;
import p.sa6;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.u44;
import p.gy3;
import p.gu0;
import p.iz3;
import p.ay6;
import p.dk3;
import p.vj3;
import p.by3;
import p.il7;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.view.View$OnLayoutChangeListener;
import java.util.HashSet;
import p.sb4;
import p.o11;
import io.reactivex.rxjava3.core.Flowable;
import p.y82;
import p.es;
import p.rp;
import p.p72;
import p.bi5;
import p.xl6;
import p.i72;
import p.yf2;
import p.ox3;
import p.fn0;
import java.util.Arrays;

public class lx3 extends ty implements nx3, nn4	// class@001de0 from classes.dex
{
    public zg0 H;
    public Scheduler I;
    public es J;
    public o11 K;
    public hy3 L;
    public vf M;
    public g54 N;
    public pm6 O;
    public px3 P;
    public kw3 Q;
    public mx3 R;
    public ce7 S;
    public final fd1 T;
    public tk7 U;
    public AnimatorSet V;
    public static final int W;

    public void lx3(){
       super();
       this.T = new fd1();
    }
    public final void C(Animator[] p0){
       lx3 tV;
       if ((tV = this.V) != null) {
          tV.cancel();
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       this.V = uAnimatorSet;
       uAnimatorSet.playTogether(p0);
       this.V.start();
       return;
    }
    public final void D(mn4 p0){
       this.requireActivity().S.onNext(p0);
    }
    public final void g(cu p0){
       int i2;
       cu c;
       int i5;
       lx3 tU;
       this.R.t.setEnabled(p0.y);
       boolean i = (int)p0.j;
       cu q = p0.q;
       int i1 = 0;
       cu l = p0.l;
       if (q != null) {
          i2 = 0;
          cu m = p0.m;
          if (m - i2) {
             this.H.getClass();
             long l1 = SystemClock.elapsedRealtime() - m;
             if ((l1 - i2) > 0 && (l1 - 0x7fffffff) < 0) {
                i2 = (int)((float)l1 * l);
             label_0038 :
                this.S.o(p0.p, i, ((int)p0.k + i2), l);
                mx3 d = this.R.d;
                sp6 x = (q != null)? sp6.X: sp6.Y;
                d.setIcon(x);
                this.R.d.setEnabled(p0.x);
                int i3 = (p0.A != null)? 0x7f050573: 0x7f050572;
                this.R.c.setColorStateList(n6.c(this.requireContext(), i3));
                this.R.e.setEnabled(p0.z);
                cu u = p0.u;
                this.R.b.setSelected(u);
                mx3 b = this.R.b;
                sp6 q1 = (u != null)? sp6.Q: sp6.P;
                b.setIcon(q1);
                this.R.b.setEnabled(p0.F);
                this.R.f.setSelected(p0.s);
                b = this.R.f;
                l = 1;
                i = (p0.D == null && p0.E == null)? false: true;
                b.setEnabled(i);
                this.R.f.setRepeatMode(p0.H);
                b = this.R.g;
                u = p0.r;
                boolean b1 = ((c = p0.C) != null && u != null)? true: false;
                b.setSelected(b1);
                this.R.g.setEnabled(c);
                b = this.R.g;
                i = (c != null && u != null)? true: false;
                b.setIsShuffling(i);
                q = p0.w;
                if ((u = p0.v) == null && q == null) {
                   i5 = 0;
                }
                mx3 b2 = this.R.b;
                int i4 = (l)? 8: 0;
                b2.setVisibility(i4);
                b2 = this.R.c;
                i4 = (l)? 8: 0;
                b2.setVisibility(i4);
                b2 = this.R.e;
                i4 = (l)? 8: 0;
                b2.setVisibility(i4);
                b2 = this.R.f;
                i4 = (l)? 8: 0;
                b2.setVisibility(i4);
                b2 = this.R.g;
                i5 = (l)? 8: 0;
                b2.setVisibility(i5);
                if (u == null && q == null) {
                   b = this.R.g;
                   i = (c != null)? 0: 8;
                   b.setVisibility(i);
                   b = this.R.b;
                   if (c != null) {
                      i1 = 8;
                   }
                   b.setVisibility(i1);
                }
                p0 = p0.d;
                if (this.M == null || ((tU = this.U) == null || !tU.a.equals(p0))) {
                   if ((tU = this.U) != null) {
                      this.M.t(tU);
                   }
                   if (!TextUtils.isEmpty(p0)) {
                      tk7 otk7 = new tk7(p0);
                      this.U = otk7;
                      this.M.s(otk7);
                   }else {
                      this.U = null;
                   }
                }
                return;
             }
          }
       }
       i2 = 0;
       goto label_0038 ;
    }
    public final void onAttach(Context p0){
       lx3 tU;
       super.onAttach(p0);
       if ((tU = this.U) != null) {
          this.M.s(tU);
       }
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view1;
       View view2;
       View view3;
       View view4;
       View view5;
       View view6;
       View view7;
       View view8;
       View view10;
       View view11;
       View view12;
       View view13;
       View view14;
       View view15;
       View view16;
       View view17;
       View view18;
       View view19;
       WindowInsets windowInsets;
       DisplayCutout uDisplayCuto;
       lx3 olx3 = this;
       boolean b = false;
       View view = p0.inflate(R.layout.lyrics_full_screen_view, p1, b);
       boolean i = 0x7f0a00c2;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a00c7;
          if ((view2 = ry7.q(view, i)) != null) {
             i = 0x7f0a00ca;
             if ((view3 = ry7.q(view, i)) != null) {
                i = 0x7f0a00cc;
                if ((view4 = ry7.q(view, i)) != null) {
                   i = 0x7f0a00cf;
                   if ((view5 = ry7.q(view, i)) != null) {
                      i = 0x7f0a00d4;
                      if ((view6 = ry7.q(view, i)) != null) {
                         i = 0x7f0a0138;
                         if ((view7 = ry7.q(view, i)) != null) {
                            i = 0x7f0a019a;
                            if ((view8 = ry7.q(view, i)) != null) {
                               i = 0x7f0a01c5;
                               if (ry7.q(view, i) != null) {
                                  View view9 = view;
                                  i = 0x7f0a0202;
                                  if ((view10 = ry7.q(view, i)) != null) {
                                     i = 0x7f0a0441;
                                     if ((view11 = ry7.q(view, i)) != null) {
                                        i = 0x7f0a044c;
                                        if ((view12 = ry7.q(view, i)) != null) {
                                           i = 0x7f0a0450;
                                           if ((view13 = ry7.q(view, i)) != null) {
                                              i = 0x7f0a0451;
                                              if ((view14 = ry7.q(view, i)) != null) {
                                                 i = 0x7f0a0452;
                                                 if ((view15 = ry7.q(view, i)) != null) {
                                                    i = 0x7f0a0454;
                                                    if ((view16 = ry7.q(view, i)) != null) {
                                                       g54 og54 = new g54(view16);
                                                       if ((view17 = ry7.q(view, R.id.lyrics_view)) != null) {
                                                          if ((view18 = ry7.q(view, R.id.position)) != null) {
                                                             if ((view19 = ry7.q(view, R.id.seekbar)) != null) {
                                                                mx3 view20 = new mx3(view9, view1, view2, view3, view4, view5, view6, view7, view8, view9, view10, view11, view12, view13, view14, view15, og54, view17, view18, view19);
                                                                olx3.R = view;
                                                                olx3.R.j.setLayoutParams(new hq0(-1, -1));
                                                                olx3.R.r.p0(olx3.L);
                                                                lx3 l = olx3.L;
                                                                mx3 r = olx3.R.r;
                                                                l.getClass();
                                                                co5.o(r, "viewBinder");
                                                                l.e = r;
                                                                mx3 r1 = olx3.R.r;
                                                                i = true;
                                                                r1.setVerticalFadingEdgeEnabled(i);
                                                                r1.setFadingEdgeLength(150);
                                                                olx3.R.r.setKeepScreenOn(i);
                                                                olx3.U = new tk7(this.requireArguments().getString("view_uri"));
                                                                r1 = olx3.R.k;
                                                                if (Build$VERSION.SDK_INT >= 28 && ((windowInsets = w27.e(this.requireActivity().getWindow().getDecorView())) != null && ((uDisplayCuto = l55.h(windowInsets)) != null && q3.C(uDisplayCuto) > r1.getPaddingTop()))) {
                                                                   r1.setPadding(r1.getPaddingLeft(), q3.C(uDisplayCuto), r1.getPaddingRight(), r1.getPaddingBottom());
                                                                }
                                                                olx3.R.k.setCloseClickListener(new ix3(olx3, b));
                                                                olx3.R.d.setOnClickListener(new ix3(olx3, 2));
                                                                olx3.R.c.setOnClickListener(new ix3(olx3, 3));
                                                                olx3.R.e.setOnClickListener(new ix3(olx3, 4));
                                                                olx3.R.f.setOnClickListener(new ix3(olx3, 5));
                                                                olx3.R.g.setOnClickListener(new ix3(olx3, 6));
                                                                olx3.R.b.setOnClickListener(new ix3(olx3, 7));
                                                                olx3.R.t.setOnSeekBarChangeListener(new kx3(olx3));
                                                                lx3 r2 = olx3.R;
                                                                olx3.S = new ce7(r2.t, r2.s, r2.i);
                                                                olx3.T.a(this.requireActivity().h0.observeOn(olx3.I).subscribe(new vs3(15, olx3)));
                                                                olx3.R.m.setOnClickListener(new ix3(olx3, i));
                                                                this.getParentFragmentManager().a0("lyrics_report_request_key", olx3, new jx3(olx3));
                                                                return olx3.R.a;
                                                             }else {
                                                                i = 0x7f0a057e;
                                                             }
                                                          }else {
                                                             i = 0x7f0a050c;
                                                          }
                                                       }else {
                                                          i = 0x7f0a0458;
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
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroyView(){
       gy3 b;
       gu0 b1;
       iz3 i;
       by3 j;
       super.onDestroyView();
       cd1.d(this.T.a.a, null);
       lx3 tL = this.L;
       tL.f.t();
       hy3 a = tL.a;
       a.f.t();
       if ((b = a.b) != null && ((b1 = b.b) != null && (i = b1.i) != null)) {
          i.c(a.g.getValue());
       }
       hy3 b2 = tL.b;
       b2.f.t();
       if ((j = b2.j) != null) {
          il7 a1 = j.a;
          a1.getViewTreeObserver().removeOnScrollChangedListener(j.c);
          a1.removeOnLayoutChangeListener(null);
       }
       return;
    }
    public final void onDetach(){
       lx3 tU;
       super.onDetach();
       if ((tU = this.U) != null) {
          this.M.t(tU);
       }
       return;
    }
    public final void onPause(){
       LyricsFullscreenView i;
       super.onPause();
       this.requireActivity().o0.remove(this);
       if ((i = this.R.j.I) != null) {
          i.end();
       }
       return;
    }
    public final void onResume(){
       on4 oon4 = this.requireActivity();
       oon4.o0.add(this);
       this.g(oon4.i0.c());
       super.onResume();
    }
    public final void onStart(){
       p72 op72;
       super.onStart();
       lx3 tK = this.K;
       tK.w = this.R.k;
       tK.t.a(tK.b.q(tK.v).subscribe(new vs3(16, tK)));
       tK = this.J;
       es f = tK.f;
       Disposable[] uDisposableA = new Disposable[]{new i72(op72, new xl6(4)).q(tK.d).subscribe(new ox3(tK, 0), new ox3(tK, 1))};
       es b = tK.b;
       b.getClass();
       op72 = new p72(b, new rp(8), 0);
       f.getClass();
       f.b.d(Arrays.copyOf(uDisposableA, 1));
    }
    public final void onStop(){
       this.K.q();
       lx3 tJ = this.J;
       tJ.f.t();
       tJ.g.t();
       super.onStop();
    }
}
