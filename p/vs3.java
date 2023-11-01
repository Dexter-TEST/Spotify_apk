package p.vs3;
import p.ir0;
import java.lang.Object;
import p.o11;
import p.n06;
import p.pm6;
import p.rv;
import p.ym6;
import p.xl;
import java.lang.String;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import p.xj0;
import p.yk4;
import p.ft0;
import p.rj2;
import p.vk4;
import p.zt;
import androidx.constraintlayout.widget.ConstraintLayout;
import p.t67;
import android.view.View;
import p.te5;
import android.text.SpannableString;
import java.lang.CharSequence;
import android.text.style.StyleSpan;
import android.text.style.ForegroundColorSpan;
import p.lj0;
import android.text.TextUtils;
import android.widget.TextView;
import com.spotify.legacyglue.icons.SpotifyIconView;
import android.content.res.ColorStateList;
import p.n6;
import p.sp6;
import android.widget.ProgressBar;
import p.ic;
import java.lang.Class;
import android.os.SystemClock;
import p.ce7;
import com.spotify.liteplayer.player.PlayerService;
import android.os.Parcelable;
import p.p54;
import p.r44;
import android.support.v4.media.session.PlaybackStateCompat;
import p.do5;
import android.app.Notification;
import p.of5;
import android.app.Service;
import p.gk4;
import android.os.Build$VERSION;
import p.su3;
import java.lang.Boolean;
import androidx.fragment.app.o;
import androidx.fragment.app.a;
import p.ru3;
import p.jl;
import p.an3;
import java.lang.Throwable;
import p.xu3;
import p.t00;
import p.cw0;
import p.t05;
import p.co5;
import p.uq7;
import p.nx1;
import p.z35;
import com.spotify.liteoffline.offline.OfflineNotificationWorker;
import p.a45;
import p.cr7;
import java.util.List;
import java.util.Collections;
import p.j45;
import p.i05;
import p.h05;
import p.g05;
import android.os.Bundle;
import android.os.BaseBundle;
import androidx.fragment.app.f;
import p.gy5;
import p.hr6;
import p.fy5;
import p.mp0;
import p.qr;
import p.lp0;
import android.view.View$OnClickListener;
import java.lang.Runnable;
import p.wu;
import p.r45;
import p.nt0;
import com.spotify.litelyrics.lyrics.fullscreen.views.LyricsFullscreenHeaderView;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p.ox7;
import p.wd5;
import android.net.Uri;
import p.hv5;
import android.widget.ImageView;
import p.lx3;
import p.vx3;
import p.rx3;
import p.qw3;
import p.mx3;
import p.kw3;
import com.spotify.litelyrics.lyrics.fullscreen.views.LyricsFullscreenView;
import p.g54;
import com.spotify.litelyrics.lyrics.views.LyricsNotTimesyncedIndicatorView;
import p.es;
import p.u44;
import p.nx3;
import io.reactivex.rxjava3.core.Observable;
import p.iz3;
import p.p87;
import p.px3;
import p.tm5;
import p.zc;
import p.q87;
import p.vj3;
import p.hy3;
import p.gy3;
import io.reactivex.rxjava3.core.Completable;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import p.ha5;
import p.b5;
import io.reactivex.rxjava3.disposables.Disposable;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import p.tu6;
import p.hn7;
import p.sx3;
import p.ux3;
import android.content.res.Resources$Theme;
import p.xw5;
import p.tx3;
import p.qx3;
import p.x37;
import p.lf5;
import p.yl6;
import p.fn0;
import p.cj5;
import p.p45;
import com.spotify.litenetwork.webapi.model.DialogConfigObject;
import p.o45;
import p.ab3;
import p.jp3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LitePageView;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.ac;
import com.spotify.liteinstrumentation.instrumentation.events.proto.RequestLatency;
import p.bv1;
import com.spotify.eventsender.eventsender.a;
import p.ia5;
import p.n56;
import p.vu1;
import com.spotify.eventsender.corebridge.EventSenderCoreBridgeImpl;
import p.bo3;
import p.aq6;
import java.lang.Enum;
import p.an5;
import p.xo7;
import p.vn7;
import p.ap6;
import p.xo6;
import p.wf2;
import p.pn3;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.spotify.lite.about.WebViewActivity;
import p.jc7;
import android.app.Activity;
import p.z33;
import p.b43;
import p.e43;
import p.au2;
import p.ui7;
import p.fj3;
import p.hs3;
import p.ym7;
import java.lang.StringBuilder;
import com.spotify.base.java.logging.Logger;
import p.xs3;
import p.op;
import p.rt3;
import p.bt3;
import p.az5;
import p.gk2;
import java.lang.Integer;

public final class vs3 implements ir0	// class@002a56 from classes.dex
{
    public final int a;
    public final Object b;

    public void vs3(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void accept(Object p0){
       vs3 b;
       b43 obj;
       int i5;
       lx3 q;
       Animator[] uAnimatorArr1;
       String str2;
       View view;
       int i6;
       h05 d;
       r44 or44;
       PlaybackStateCompat playbackStat;
       zt j1;
       int i7;
       SpannableString spannableStr;
       SpannableString spannableStr1;
       vs3 ovs3 = this;
       String str = "title";
       String str1 = "body";
       int i = 2;
       int i1 = 3;
       int i2 = 8;
       int i3 = 1;
       int i4 = 0;
       switch (ovs3.a){
           case 0:
             b = ovs3.b;
             op oop = p0;
             b.getClass();
             if (oop instanceof op && oop.a == rt3.c) {
                b.a.a();
                b.d.onNext(new az5());
             }
             return;
             break;
           case 1:
             b = ovs3.b;
             obj = p0;
             b.getClass();
             Object[] objArray = new Object[i4];
             Logger.e("Changing loading visibility -> "+obj, objArray);
             ym7 v = b.v;
             if (obj.booleanValue()) {
                i2 = 0;
             }
             v.setVisibility(i2);
             return;
             break;
           case 2:
             b = ovs3.b;
             b.getClass();
             Object[] objArray1 = new Object[i3];
             objArray1[i4] = p0.getMessage();
             b.a.b("Error running periodic scheduler: %s", objArray1);
             return;
           case 3:
             b = ovs3.b;
             obj = p0;
             b.getClass();
             if (!obj.b().y("lite:inProgress", i4)) {
                z33 b1 = b.b;
                if (obj.b().y("lite:error", i4)) {
                   b1.e();
                }else {
                   b1.d();
                }
             }
             return;
             break;
           case 4:
             ovs3.b.finish();
             return;
           case 5:
             ovs3.b.getClass();
             FirebaseCrashlytics.getInstance().recordException(p0);
             return;
           case 6:
             xo7 b2 = ovs3.b.B;
             b2.getClass();
             b2.a(new xo6(b2));
             return;
           case 7:
             b = ovs3.b;
             aq6 uoaq6 = p0;
             b.getClass();
             if ((i5 = uoaq6.b.ordinal()) != i3) {
                if (i5 != i1) {
                   if (i5 != 5) {
                      if (i5 != 16) {
                         if (i5 != 9 && i5 != 10) {
                            if (i5 != 51) {
                               if (i5 == 52) {
                                  b.p.onNext(uoaq6);
                               }
                            }else {
                               b.o.onNext(uoaq6);
                            }
                         }else {
                            b.k.onNext(uoaq6);
                         }
                      }else {
                         b.n.onNext(uoaq6);
                      }
                   }else {
                      b.j.onNext(uoaq6);
                   }
                }else {
                   b.m.onNext(uoaq6);
                }
             }else {
                b.l.onNext(uoaq6);
             }
             return;
             break;
           case 8:
             ovs3.b.c(p0);
             return;
           case 9:
             b = ovs3.b;
             Boolean uBoolean = p0;
             bv1 a = b.a;
             a uoa = uBoolean.booleanValue();
             if (a.d instanceof ia5) {
                a.h.b = uoa;
                if (a.i != null) {
                   a.a();
                }
             }
             a = b.a;
             a.h.c = uBoolean.booleanValue();
             uoa = a.d;
             _monitor_enter(uoa);
             if (!uoa.d.isDisposed()) {
                uoa.d.dispose();
             }
             _monitor_exit(uoa);
             a.d.a(a.b);
             b.a.h.d = uBoolean.booleanValue();
             b.a.h.e = uBoolean.booleanValue();
             b.a.h.a = uBoolean.booleanValue();
             b.b.setBlockingSendEnabled(uBoolean.booleanValue());
             return;
             break;
           case 10:
             ovs3.b.a.a(p0);
             return;
           case 11:
             b = ovs3.b;
             DialogConfigObject uDialogConfi = p0;
             if (b.getChildFragmentManager().D("pre-trial offboarding") == null) {
                Bundle uBundle = new Bundle();
                uBundle.putString("header", uDialogConfi.a);
                uBundle.putString(str1, uDialogConfi.b);
                uBundle.putString("primaryButton", uDialogConfi.c);
                uBundle.putString("secondaryButton", uDialogConfi.d);
                uBundle.putString("imageUri", uDialogConfi.e);
                o45 uDialogConfi1 = new o45();
                uDialogConfi1.setArguments(uBundle);
                uDialogConfi1.B(b.getChildFragmentManager(), "pre-trial offboarding");
                p45 b3 = b.b;
                b3.getClass();
                jp3 ojp3 = LitePageView.i();
                ojp3.d("enter");
                ojp3.c("lite/sevenday-trial/offboarding-dialog");
                ojp3.e("spotify:sevenday-trial:offboarding-dialog");
                b3.a.a(ojp3.build());
             }
             return;
             break;
           case 12:
             b = ovs3.b;
             b.startActivity(xj0.s(b.getContext(), p0));
             return;
           case 13:
             b = ovs3.b;
             b.getClass();
             if (p0.booleanValue()) {
                b.h.b(i);
                b.f = i4;
                b.e = i4;
                b.c.e();
                b.g.onNext(Boolean.FALSE);
             }
             return;
             break;
           case 14:
             b = ovs3.b;
             b.getClass();
             if (p0.booleanValue()) {
                b.a();
             }
             return;
             break;
           case 15:
             b = ovs3.b;
             rx3 orx3 = p0;
             b.getClass();
             if (orx3 instanceof rx3) {
                rx3 a1 = orx3.a;
                qw3 x = a1.x;
                b.Q = x;
                b.R.j.p(x.a);
                b.R.q.a.setTextColor(b.Q.b);
                lx3 j = b.J;
                j.g.t();
                j.h = a1;
                es uoes = j.a;
                iz3 oiz3 = v12;
                es uoes1 = uoes;
                iz3 oiz31 = new iz3(a1, 1, 1, p87.a, 0, 1, uoes.P.a.get().b(), j.c, 0, 0);
                uoes.L.a(oiz3);
                if ((q = uoes1.Q) != null) {
                   hy3 a2 = uoes1.L.a;
                   a2.getClass();
                   a2.c.onNext(new kw3(q.a, q.b, q.c));
                }
                j.g.s(j.a.R.r.getMinimumCharactersDisplayedCompletable().subscribe(new ha5(15, j)));
                Animator[] uAnimatorArr = new Animator[]{tu6.d(b.R.r),tu6.m(b.R.l),tu6.m(b.R.o),tu6.m(b.R.p),tu6.m(b.R.n),tu6.m(b.R.m),b.R.q.a.o(orx3.a)};
                b.C(uAnimatorArr);
                b.R.k.setReportLyricsClickListener(new hn7(b, i3, orx3));
             }else if(orx3 instanceof sx3){
                uAnimatorArr1 = new Animator[]{tu6.m(b.R.r),tu6.d(b.R.l),tu6.m(b.R.o),tu6.m(b.R.p),tu6.m(b.R.n),tu6.m(b.R.m),tu6.m(b.R.q.a)};
                b.C(uAnimatorArr1);
             }else if(orx3 instanceof ux3){
                b.R.p.setText(R.string.lyrics_error_no_lyrics);
                uAnimatorArr1 = new Animator[]{tu6.m(b.R.r),tu6.m(b.R.l),tu6.m(b.R.o),tu6.d(b.R.p),tu6.m(b.R.n),tu6.m(b.R.m),tu6.m(b.R.q.a)};
                b.C(uAnimatorArr1);
                b.R.j.p(xw5.b(b.getResources(), R.color.lyrics_background_default, b.getContext().getTheme()));
             }else if(orx3 instanceof tx3){
                b.R.p.setText(R.string.lyrics_error_no_connection);
                b.R.n.setText(R.string.lyrics_error_no_connection_description);
                uAnimatorArr1 = new Animator[]{tu6.m(b.R.r),tu6.m(b.R.l),tu6.d(b.R.o),tu6.d(b.R.p),tu6.d(b.R.n),tu6.m(b.R.m),tu6.m(b.R.q.a)};
                b.C(uAnimatorArr1);
                b.R.j.p(xw5.b(b.getResources(), R.color.lyrics_background_default, b.getContext().getTheme()));
             }else if(orx3 instanceof qx3){
                b.R.p.setText(R.string.lyrics_error_loading_failed);
                uAnimatorArr1 = new Animator[]{tu6.m(b.R.r),tu6.m(b.R.l),tu6.m(b.R.o),tu6.d(b.R.p),tu6.m(b.R.n),tu6.d(b.R.m),tu6.m(b.R.q.a)};
                b.C(uAnimatorArr1);
                b.R.j.p(xw5.b(b.getResources(), R.color.lyrics_background_default, b.getContext().getTheme()));
             }
             return;
             break;
           case 16:
             b = ovs3.b;
             b.getClass();
             nt0 ont0 = p0.g.f();
             Drawable uDrawable = ox7.a(b.w.getContext(), sp6.o0, Float.NaN, (float)xj0.e0(32.00f, b.w.getContext().getResources()));
             b.c.d(o11.class.getName());
             str2 = o11.p(ont0, "image_url");
             o11 c = b.c;
             Uri uri = (!TextUtils.isEmpty(str2))? Uri.parse(str2): Uri.EMPTY;
             c.getClass();
             hv5 ohv5 = new hv5(c, uri);
             ohv5.h(uDrawable);
             ohv5.b(uDrawable);
             ohv5.i(o11.class.getName());
             ohv5.e(b.w.getCoverArtImageView());
             o11 w = b.w;
             w.b.setText(o11.p(ont0, "artist_name"));
             w.c.setText(o11.p(ont0, str));
             return;
             break;
           case 17:
             b = ovs3.b;
             qr oqr = p0;
             if ((view = b.getView()) != null) {
                qr b4 = oqr.b;
                qr c1 = oqr.c;
                if (oqr.a != null && c1 == null) {
                   b.u(R.string.connection_state_connected, 0x7f0504e8);
                }else {
                   i6 = 0x7f0504bc;
                   if (b4 != null) {
                      b.u(R.string.connection_state_no_connection, i6);
                   }else if(c1 != null){
                      b.u(R.string.connection_state_forced_offline, i6);
                      b.t.setText(R.string.connection_state_action_go_online);
                      b.t.setVisibility(i4);
                      b.t.setOnClickListener(new lp0(b, i3));
                   }else {
                      b.u(R.string.connection_state_connecting, 0x7f05056d);
                   }
                }
                oqr = oqr.a;
                if (b4 != null && (oqr == null || c1 != null)) {
                   view.setVisibility(i4);
                }else if(!view.getVisibility()){
                   mp0 w1 = b.w;
                   long l = (oqr != null)? 3000: 0x2710;
                   view.postDelayed(w1, l);
                }
             }
             return;
             break;
           case 18:
             b = ovs3.b;
             b.getClass();
             p0.a(new fy5(b, i4), new fy5(b, i3));
             return;
           case 19:
             b = ovs3.b;
             h05 oh05 = p0;
             Fragment uFragment = b.getChildFragmentManager().D("offline error dialog");
             h05 e = oh05.e;
             e = (uFragment instanceof g05 && uFragment.requireArguments().getInt("returnCode") == e)? 1: 0;
             if (!e) {
                o childFragmen = b.getChildFragmentManager();
                childFragmen.getClass();
                a uoa1 = new a(childFragmen);
                if (uFragment != null) {
                   uoa1.j(uFragment);
                }
                str2 = b.getString(oh05.a);
                String str3 = b.getString(oh05.b);
                h05 c2 = oh05.c;
                String str4 = null;
                String str5 = (c2 == null)? str4: b.getString(c2);
                if ((d = oh05.d) != null) {
                   str4 = b.getString(d);
                }
                g05 og05 = new g05();
                Bundle uBundle1 = new Bundle();
                uBundle1.putString(str, str2);
                uBundle1.putString(str1, str3);
                uBundle1.putString("positiveButton", str5);
                uBundle1.putString("negativeButton", str4);
                uBundle1.putInt("returnCode", oh05.e);
                og05.setArguments(uBundle1);
                og05.E = i4;
                og05.F = i3;
                uoa1.g(i4, og05, "offline error dialog", i3);
                og05.D = i4;
                og05.z = uoa1.e(i4);
             }
             return;
             break;
           case 20:
             t05 a3 = ovs3.b.K.a;
             co5.o(a3, "context");
             uq7.y(a3).w("offline_worker", nx1.b, Collections.singletonList(new z35(OfflineNotificationWorker.class).a()));
             return;
           case 21:
             b = ovs3.b;
             Throwable throwable = p0;
             b.getClass();
             jl.q("Login error", throwable);
             b.d.onNext(new xu3(throwable));
             return;
           case 22:
             o childFragmen1 = ovs3.b.getChildFragmentManager();
             childFragmen1.getClass();
             a uoa2 = new a(childFragmen1);
             uoa2.g(i4, new ru3(), ru3.class.getSimpleName(), i3);
             uoa2.e(i4);
             jl.p("User has been abroad for more than 14 days.");
             return;
           case 23:
             b = ovs3.b;
             if ((or44 = b.b.d()) != null) {
                if ((playbackStat = or44.c()) == null || playbackStat.a == null) {
                   i4 = 1;
                }
                if (i4) {
                label_0231 :
                   b.stopSelf();
                   if (Build$VERSION.SDK_INT >= 24) {
                      b.stopForeground(i3);
                   }else {
                      b.stopForeground(i3);
                   }
                }else if(do5.K(or44.c())){
                   b.startForeground(R.id.player_notification, b.c.a(or44));
                }else {
                   b.t.a(R.id.player_notification, b.c.a(or44));
                }
             }else {
                goto label_0231 ;
             }
             return;
             break;
           case 24:
             b = ovs3.b;
             zt ozt = p0;
             ConstraintLayout uConstraintL = b.A.e();
             i6 = (ozt.i != null)? 0: 8;
             uConstraintL.setVisibility(i6);
             zt b5 = ozt.b;
             zt c3 = ozt.c;
             if (te5.a(b5) && te5.a(c3)) {
                str1 = "";
             }else {
                int i8 = 33;
                if (te5.a(c3)) {
                   spannableStr = new SpannableString(b5);
                   spannableStr.setSpan(new StyleSpan(i3), i4, spannableStr.length(), i8);
                }else {
                   int i9 = 200;
                   int i10 = -1;
                   if (te5.a(b5)) {
                      spannableStr1 = new SpannableString(c3);
                      spannableStr1.setSpan(new ForegroundColorSpan(lj0.h(i10, i9)), i4, spannableStr1.length(), i8);
                   }else {
                      Object[] objArray2 = new Object[i];
                      objArray2[i4] = b5;
                      objArray2[i3] = c3;
                      spannableStr = new SpannableString(String.format("%s • %s", objArray2));
                      spannableStr.setSpan(new StyleSpan(i3), i4, (b5.length() + i3), i8);
                      spannableStr.setSpan(new ForegroundColorSpan(lj0.h(i10, i9)), (b5.length() + i), spannableStr.length(), i8);
                   }
                }
                spannableStr1 = spannableStr;
             }
             if (!((TextUtils.isEmpty(str1) ^ i3))) {
                b.A.t.setText(b.getText(R.string.now_playing_bar_waiting_to_connect));
             }else if(!TextUtils.equals(b.A.t.getText(), str1)){
                b.A.t.setText(str1);
             }
             i5 = (ozt.p != null)? 0x7f0507cb: 0x7f0507ca;
             b.A.w.setColorStateList(n6.c(b.requireContext(), i5));
             b.A.x.setEnabled(ozt.n);
             t67 x1 = b.A.x;
             sp6 x2 = ((j1 = ozt.j) != null)? sp6.X: sp6.Y;
             x1.setIcon(x2);
             x1 = b.A.v;
             i = (ozt.o == null)? 8: 0;
             x1.setVisibility(i);
             zt h = ozt.h;
             b.A.v.setSelected(h);
             x1 = b.A.v;
             x2 = (h != null)? sp6.Q: sp6.P;
             x1.setIcon(x2);
             if (ozt.k == null && (ozt.l == null && ozt.m == null)) {
                b.A.c.setVisibility(i2);
                b.A.x.setAlpha(0x3f800000);
             }else {
                b.A.c.setVisibility(i4);
                b.A.x.setAlpha(0.40f);
             }
             i5 = (int)ozt.d;
             i1 = (int)ozt.e;
             h = ozt.f;
             if (j1 != null) {
                zt g = ozt.g;
                if (g) {
                   b.v.getClass();
                   long l1 = SystemClock.elapsedRealtime() - g;
                   if ((l1) > 0 && (l1 - 0x7fffffff) < 0) {
                      i7 = (int)((float)l1 * h);
                   label_01e6 :
                      b.B.o(i4, i5, (i1 + i7), h);
                      return;
                   }
                }
             }
             i7 = 0;
             goto label_01e6 ;
             break;
           case 25:
             ovs3.b.J.b(p0);
             return;
           case 26:
             b = ovs3.b;
             b.startActivity(xj0.s(b.getContext(), p0));
             return;
           case 27:
             ovs3.b.c(p0);
             return;
           case 28:
             ovs3.b.w = p0;
             return;
           default:
             ovs3.b.setColor(p0.intValue());
             return;
       }
    }
}
