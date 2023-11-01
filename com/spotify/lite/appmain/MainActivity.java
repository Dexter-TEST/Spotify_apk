package com.spotify.lite.appmain.MainActivity;
import p.jd2;
import p.aj1;
import p.kj5;
import androidx.appcompat.app.a;
import java.lang.Integer;
import java.lang.Object;
import p.w51;
import p.k73;
import p.dt5;
import p.fn0;
import p.e7;
import p.eu3;
import p.c7;
import p.z6;
import p.h7;
import androidx.activity.a;
import p.i7;
import p.sd2;
import p.kb3;
import p.ad6;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import java.util.ArrayList;
import androidx.fragment.app.a;
import java.lang.String;
import java.lang.IllegalArgumentException;
import p.tp2;
import java.lang.Class;
import p.qq2;
import p.cj5;
import p.o12;
import p.z60;
import android.content.Intent;
import p.sz3;
import p.fp6;
import android.app.Activity;
import p.wf2;
import p.aq6;
import p.td7;
import java.lang.Enum;
import com.spotify.allboarding.entrypoint.EntryPoint;
import android.content.Context;
import p.xj0;
import p.do3;
import p.u76;
import p.x33;
import p.eo3;
import p.ti2;
import android.os.Bundle;
import android.os.BaseBundle;
import p.d86;
import p.qn1;
import p.r7;
import p.ng1;
import p.b01;
import p.iu5;
import p.t7;
import java.lang.CharSequence;
import java.util.List;
import p.k07;
import p.em;
import p.sm;
import p.km;
import p.dm;
import p.xm;
import p.yd1;
import p.w53;
import p.vk7;
import p.xq7;
import com.spotify.messaging.quicksilverliteintegration.DisplayOrchestrator;
import java.util.HashSet;
import p.p97;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import p.k97;
import p.an5;
import p.k15;
import p.cz6;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter;
import p.i83;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter$NoOpPresenter;
import p.j83;
import p.eo5;
import androidx.fragment.app.k;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import androidx.constraintlayout.widget.Barrier;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p.sp6;
import android.graphics.drawable.StateListDrawable;
import p.tu6;
import p.ae2;
import p.co5;
import p.kz6;
import p.bm;
import p.bi5;
import io.reactivex.rxjava3.core.Observable;
import p.rz3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.pd2;
import java.util.concurrent.CopyOnWriteArrayList;
import p.od2;
import p.ej4;
import p.mp0;
import p.vk4;
import p.gy5;
import p.rj;
import p.i05;
import p.p45;
import p.su3;
import p.al5;
import p.pp;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import java.util.Objects;
import p.ha5;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.s36;
import p.rk0;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import p.ek3;
import androidx.activity.b;
import io.reactivex.rxjava3.core.Single;
import p.rp3;
import p.fx6;
import java.lang.NullPointerException;
import com.spotify.litecomponents.snackalog.a;
import p.ap6;
import p.wo6;
import p.ep6;
import android.os.Build$VERSION;
import p.n6;
import p.fp3;
import p.ym6;
import p.rz;

public class MainActivity extends a implements jd2, aj1, kj5	// class@00090f from classes.dex
{
    public final fn0 Q;
    public eo3 R;
    public ie2 S;
    public pm6 T;
    public a U;
    public ge2 V;
    public ac W;
    public al5 X;
    public jn3 Y;
    public xm3 Z;
    public j83 a0;
    public xq7 b0;
    public e60 c0;
    public fp3 d0;
    public rp3 e0;
    public final i7 f0;
    public kb3 g0;
    public ad6 h0;
    public final sd2 i0;
    public static final dt5 j0;

    static {
       Integer integer = Integer.valueOf(0);
       Integer integer1 = Integer.valueOf(1);
       Integer integer2 = Integer.valueOf(2);
       Integer integer3 = Integer.valueOf(3);
       w51.f("spotify:home", integer);
       w51.f("spotify:find", integer1);
       w51.f("spotify:favorites", integer2);
       w51.f("spotify:collection", integer2);
       w51.f("spotify:premium", integer3);
       Object[] objArray = new Object[10];
       objArray[0] = "spotify:home";
       objArray[1] = integer;
       objArray[2] = "spotify:find";
       objArray[3] = integer1;
       objArray[4] = "spotify:favorites";
       objArray[5] = integer2;
       objArray[6] = "spotify:collection";
       objArray[7] = integer2;
       objArray[8] = "spotify:premium";
       objArray[9] = integer3;
       MainActivity.j0 = dt5.k(5, objArray, null);
    }
    public void MainActivity(){
       super();
       this.Q = new fn0();
       this.f0 = this.registerForActivityResult(new e7(0), new eu3(1, this));
       this.i0 = new sd2(4, this, 0);
    }
    public final void C(){
       a s;
       if (!this.g0.f()) {
          MainActivity tg0 = this.g0;
          Fragment uFragment = this.D(this.h0.l.getSelectedTabPosition());
          int selectedTabP = this.h0.l.getSelectedTabPosition();
          o oo = tg0.l(selectedTabP);
          o d = oo.d;
          int i = 0;
          int i1 = (d != null)? d.size(): 0;
          if (i1 > 0) {
             if ((s = oo.d.get(i).s) >= null) {
                oo.P(null, s, 1);
             }else {
                throw new IllegalArgumentException(tp2.k("Bad id: ", s));
             }
          }
          tg0.c.G(uFragment, selectedTabP);
       }
       return;
    }
    public final Fragment D(int p0){
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   this.R.getClass();
                   return new qq2();
                }else {
                   this.R.getClass();
                   return new cj5();
                }
             }else {
                this.R.getClass();
                return new o12();
             }
          }else {
             this.R.getClass();
             return new z60();
          }
       }else {
          this.R.getClass();
          return new qq2();
       }
    }
    public final void E(Intent p0){
       String dataString;
       Intent intent;
       Integer integer;
       aq6 uoaq61;
       int i1;
       Bundle uBundle;
       aq6 t;
       String str;
       qn1 oqn1;
       Bundle uBundle2;
       r7 or7;
       Bundle uBundle3;
       String stringExtra;
       String str2;
       boolean b = true;
       this.c0.e(this, p0, new sz3(), b);
       if ((dataString = p0.getDataString()) == null) {
          return;
       }
       aq6 uoaq6 = td7.d(dataString);
       int i = 14;
       Fragment uFragment = null;
       if (uoaq6 == null || uoaq6.b.ordinal() != i) {
       label_004f :
          intent = uFragment;
       }else {
          str = "spotify.intent.action.ALLBOARDING";
          if (dataString.equals("spotify:internal:taste-onboarding")) {
             intent = EntryPoint.putEntryPointToIntent(xj0.z0(this, str), EntryPoint.DEFAULT);
          }else if(dataString.equals("spotify:internal:taste-onboarding-update")){
             intent = EntryPoint.putEntryPointToIntent(xj0.z0(this, str), EntryPoint.LIBRARY_ADD_ARTISTS);
          }else {
             goto label_004f ;
          }
       }
       if (intent != null) {
          this.startActivity(intent);
          return;
       }else if((integer = MainActivity.j0.get(dataString)) != null){
          this.I(integer.intValue());
          return;
       }else {
          MainActivity tS = this.S;
          tS.getClass();
          do3 a = tS.a;
          if (dataString.equals("spotify:search")) {
             a.getClass();
             uFragment = new u76();
          }else if((uoaq61 = td7.d(dataString)) == null){
             if (dataString.startsWith("spotify:")) {
                a.getClass();
                uFragment = eo3.a(dataString);
             }
          }else if((i1 = uoaq61.b.ordinal()) != b){
             int i2 = 16;
             if (i1 != i) {
                if (i1 != i2 && (i1 != 64 && i1 != 3)) {
                   if (i1 != 4) {
                      if (i1 != 5 && (i1 != 51 && i1 != 52)) {
                         switch (i1){
                             case 8:
                               a.getClass();
                               uFragment = new ti2();
                               uBundle = new Bundle();
                               uBundle.putString("spotify.fragment.argument.URI", dataString);
                               uFragment.setArguments(uBundle);
                               break;
                             case 9:
                             case 10:
                               break;
                             default:
                               a.getClass();
                               uFragment = eo3.a(dataString);
                         }
                      }
                   }else {
                      a.getClass();
                      String[] stringArray = ((t = uoaq61.t) != null)? t.split(":"): uFragment;
                      if (stringArray != null && stringArray.length == 2) {
                         uFragment = new d86();
                         Bundle uBundle1 = new Bundle();
                         uBundle1.putString("spotify.fragment.argument.TYPE", stringArray[0]);
                         uBundle1.putString("spotify.fragment.argument.QUERY", stringArray[b]);
                         uFragment.setArguments(uBundle1);
                      }
                   }
                }
             }else {
                str = dataString.substring(17);
                if (str.startsWith("tracks-list:")) {
                   a.getClass();
                   oqn1 = new qn1();
                   uBundle2 = new Bundle();
                   uBundle2.putString("spotify.fragment.argument.URI", dataString);
                   oqn1.setArguments(uBundle2);
                }else if(str.startsWith("add-to-playlist:")){
                   a.getClass();
                   or7 = new r7();
                   uBundle3 = new Bundle();
                   uBundle3.putString("spotify.fragment.argument.URI", str.substring(i2));
                   or7.setArguments(uBundle3);
                }else if(str.startsWith("edit-playlist:")){
                   a.getClass();
                   or7 = new ng1();
                   uBundle3 = new Bundle();
                   uBundle3.putString("spotify.fragment.argument.URI", str.substring(i));
                   or7.setArguments(uBundle3);
                }else if(str.equals("create-playlist")){
                   a.getClass();
                   oqn1 = new b01();
                }else if(str.startsWith("create-playlist:")){
                   a.getClass();
                   or7 = new b01();
                   uBundle3 = new Bundle();
                   uBundle3.putString("spotify.fragment.argument.TRACK_URI", str.substring(i2));
                   or7.setArguments(uBundle3);
                }else if(str.startsWith("rename-playlist:")){
                   a.getClass();
                   or7 = new iu5();
                   uBundle3 = new Bundle();
                   uBundle3.putString("spotify.fragment.argument.URI", str.substring(i2));
                   or7.setArguments(uBundle3);
                }else if(str.startsWith("select-add-to-playlist:")){
                   a.getClass();
                   or7 = new t7();
                   uBundle3 = new Bundle();
                   uBundle3.putString("spotify.fragment.argument.URI", str.substring(23));
                   or7.setArguments(uBundle3);
                }else if(str.startsWith("assisted-curation:")){
                   List list = do3.b.b(str.substring(18));
                   if ((stringExtra = p0.getStringExtra("EXTRA_PLAYLIST_URI")) != null && list.size() == 2) {
                      String str1 = list.get(0);
                      str2 = list.get(b);
                      a.getClass();
                      uBundle3 = new Bundle();
                      uBundle3.putString("spotify.fragment.argument.PLAYLIST_URI", stringExtra);
                      str1.getClass();
                      uBundle3.putString("spotify.fragment.argument.SPACE_ID", str1);
                      str2.getClass();
                      uBundle3.putString("spotify.fragment.argument.URI", str2);
                      oqn1 = new em();
                      oqn1.setArguments(uBundle3);
                   }else if(uFragment == null){
                      a.getClass();
                      uFragment = eo3.a(dataString);
                   }
                }else if(str.startsWith("assisted-curation-search:")){
                   stringExtra = str.substring(25);
                   a.getClass();
                   uBundle2 = new Bundle();
                   stringExtra.getClass();
                   uBundle2.putString("spotify.fragment.argument.PLAYLIST_URI", stringExtra);
                   oqn1 = new sm();
                   oqn1.setArguments(uBundle2);
                }else if(str.startsWith("assisted-curation-view:")){
                   a.getClass();
                   uBundle2 = new Bundle();
                   uBundle2.putString("spotify.fragment.argument.PLAYLIST_URI", str.substring(23));
                   oqn1 = new km();
                   oqn1.setArguments(uBundle2);
                }else if(str.startsWith("assisted-curation-drill-down:")){
                   if ((stringExtra = p0.getStringExtra("EXTRA_PLAYLIST_URI")) == null) {
                   }else {
                      str2 = str.substring(29);
                      a.getClass();
                      uBundle3 = new Bundle();
                      uBundle3.putString("spotify.fragment.argument.PLAYLIST_URI", stringExtra);
                      str2.getClass();
                      uBundle3.putString("spotify.fragment.argument.URI", str2);
                      oqn1 = new dm();
                      oqn1.setArguments(uBundle3);
                   }
                }else if(str.startsWith("assisted-curation-see-more:")){
                   if ((stringExtra = p0.getStringExtra("EXTRA_PLAYLIST_URI")) == null) {
                   }else {
                      str2 = str.substring(27);
                      a.getClass();
                      uBundle3 = new Bundle();
                      uBundle3.putString("spotify.fragment.argument.PLAYLIST_URI", stringExtra);
                      str2.getClass();
                      uBundle3.putString("spotify.fragment.argument.URI", str2);
                      oqn1 = new xm();
                      oqn1.setArguments(uBundle3);
                   }
                }else if(str.equals("downloaded-episodes")){
                   a.getClass();
                   oqn1 = new yd1();
                }else {
                }
                uFragment = or7;
                uFragment = oqn1;
             }
          }
          a.getClass();
          uFragment = new qn1();
          uBundle = new Bundle();
          uBundle.putString("spotify.fragment.argument.URI", dataString);
          uFragment.setArguments(uBundle);
          if (uFragment == null) {
             return;
          }else {
             this.g0.j(uFragment, this.h0.l.getSelectedTabPosition());
             return;
          }
       }
    }
    public final boolean F(Fragment p0){
       boolean b;
       this.R.getClass();
       if (!p0 instanceof qq2) {
          this.R.getClass();
          if (!p0 instanceof z60) {
             this.R.getClass();
             if (!p0 instanceof o12) {
                this.R.getClass();
                if (!p0 instanceof cj5) {
                   b = false;
                label_0028 :
                   return b;
                }
             }
          }
       }
       b = true;
       goto label_0028 ;
    }
    public final void G(Fragment p0,int p1){
       this.I(p1);
       if (p0 instanceof w53) {
          MainActivity tb0 = this.b0;
          String str = p0.b().a();
          if (tb0.b.c.isEmpty()) {
             xq7 c = tb0.c;
             c.getClass();
             c.a.onNext(new k97(TriggerType.URI, str));
          }
       }
       this.i0.b((this.F(p0) ^ 0x01));
       return;
    }
    public final boolean H(){
       boolean b;
       MainActivity tg0 = this.g0;
       o oo = tg0.l(this.h0.l.getSelectedTabPosition());
       Fragment uFragment = oo.C(R.id.tab_fragment_container);
       int i = 1;
       if (uFragment != null) {
          km okm = km.class;
          if (okm.equals(uFragment.getClass())) {
          label_004a :
             if (uFragment != null) {
                i = 0;
             }
             b = i;
          }else if(b = oo.P("stack:".concat(okm.getName()), -1, 0)){
             kb3 c = tg0.c;
             c.i0.b((c.F(uFragment) ^ i));
          }
       }else {
          goto label_004a ;
       }
       return b;
    }
    public final void I(int p0){
       cz6 uocz6;
       cz6 f;
       if ((uocz6 = this.h0.l.f(p0)) != null) {
          if ((f = uocz6.f) != null) {
             int selectedTabP = ((selectedTabP = f.getSelectedTabPosition()) != -1 && selectedTabP == uocz6.d)? 1: 0;
             if (!selectedTabP) {
                uocz6.a();
             }
          }else {
             throw new IllegalArgumentException("Tab not attached to a TabLayout");
          }
       }
       return;
    }
    public final InAppMessagingPresenter c(FormatType p0){
       int i;
       InAppMessagingPresenter$NoOpPresenter noOpPresente;
       MainActivity ta0 = this.a0;
       ta0.getClass();
       if ((i = i83.a[p0.ordinal()]) != 1) {
          noOpPresente = (i != 2)? new InAppMessagingPresenter$NoOpPresenter(): ta0.l;
       }else {
          noOpPresente = ta0.k;
       }
       return noOpPresente;
    }
    public final void onCreate(Bundle p0){
       View view1;
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
       int intx;
       a uoa = this;
       BaseBundle uBaseBundle = p0;
       eo5.q(this);
       super.onCreate(p0);
       ViewGroup viewGroup = null;
       boolean b = false;
       View view = this.getLayoutInflater().inflate(R.layout.main_activity, viewGroup, b);
       int i = 0x7f0a0096;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a00a2;
          if ((view2 = ry7.q(view, i)) != null) {
             i = 0x7f0a0133;
             if ((view3 = ry7.q(view, i)) != null) {
                i = 0x7f0a0134;
                if ((view4 = ry7.q(view, i)) != null) {
                   if ((view5 = ry7.q(view, R.id.container_fragment_now_playing_bar)) != null) {
                      if ((view6 = ry7.q(view, R.id.container_fragment_retry_bar)) != null) {
                         if ((view7 = ry7.q(view, R.id.content)) != null) {
                            if ((view8 = ry7.q(view, R.id.in_app_message_banner_container)) != null) {
                               if ((view9 = ry7.q(view, R.id.in_app_message_container)) != null) {
                                  if ((view10 = ry7.q(view, R.id.separator)) != null) {
                                     if ((view11 = ry7.q(view, R.id.tabs)) != null) {
                                        ad6 uoad6 = v8;
                                        ad6 uoad61 = v8;
                                        int i1 = 0x7f0a0136;
                                        uoad6 = new ad6(view, view1, view2, view3, view4, view5, view6, view7, view8, view9, view10, view11);
                                        uoa.h0 = uoad61;
                                        uoa.setContentView(uoad61.a);
                                        uoad61 = uoa.h0.l;
                                        cz6 uocz6 = uoad61.g();
                                        uocz6.d(R.string.tab_home);
                                        uocz6.b(R.string.tab_home_content_description);
                                        uocz6.c(tu6.x(uoa, sp6.R, sp6.S));
                                        uoad61.a(uocz6, b);
                                        uoad61 = uoa.h0.l;
                                        uocz6 = uoad61.g();
                                        uocz6.d(R.string.tab_search);
                                        uocz6.b(R.string.tab_search_content_description);
                                        uocz6.c(tu6.x(uoa, sp6.f0, sp6.g0));
                                        uoad61.a(uocz6, b);
                                        uoad61 = uoa.h0.l;
                                        uocz6 = uoad61.g();
                                        uocz6.d(R.string.tab_favorites);
                                        uocz6.b(R.string.tab_favorites_content_description);
                                        uocz6.c(tu6.x(uoa, sp6.P, sp6.Q));
                                        uoad61.a(uocz6, b);
                                        uoa.g0 = new kb3(uoa, this.y());
                                        uoad61 = uoa.h0.l;
                                        co5.q(uoad61, "$this$selectionEvents");
                                        kz6 uocz61 = new kz6(uoad61);
                                        Observable observable = uocz61.filter(new bm(5));
                                        MainActivity q = uoa.Q;
                                        q.c(observable.subscribe(new rz3(uoa, b)));
                                        this.y().m.a.add(new od2(uoa.V));
                                        if (!uBaseBundle) {
                                           uoa.I(b);
                                        }else {
                                           MainActivity g0 = uoa.g0;
                                           g0.getClass();
                                           int i2 = -1;
                                           if ((intx = uBaseBundle.getInt("fragmentBackStack#position", i2)) != i2) {
                                              g0.c.G(g0.l(intx).C(R.id.tab_fragment_container), intx);
                                           }
                                        }
                                        if (!uBaseBundle) {
                                           ae2 uoae2 = this.y();
                                           uoae2.getClass();
                                           a uoa1 = new a(uoae2);
                                           uoa.R.getClass();
                                           uoa1.g(i, new mp0(), viewGroup, 1);
                                           uoa.R.getClass();
                                           uoa1.g(R.id.container_fragment_now_playing_bar, new vk4(), viewGroup, 1);
                                           uoa.R.getClass();
                                           uoa1.g(i1, new gy5(), viewGroup, 1);
                                           uoa.R.getClass();
                                           uoa1.g(b, new rj(), "app rater", 1);
                                           uoa.R.getClass();
                                           uoa1.g(b, new i05(), "offline error", 1);
                                           uoa.R.getClass();
                                           uoa1.g(b, new p45(), "opt-in-trial", 1);
                                           uoa.R.getClass();
                                           uoa1.g(b, new su3(), "login region error", 1);
                                           uoa1.e(b);
                                        }
                                        uoa.E(this.getIntent());
                                        q.c(uoa.X.d.distinctUntilChanged().map(new pp(18)).distinctUntilChanged().observeOn(id.a()).subscribe(new rz3(uoa, 1)));
                                        MainActivity y = uoa.Y;
                                        Objects.requireNonNull(y);
                                        Scheduler c = s36.c;
                                        q.c(Completable.i(new ha5(2, y)).p(c).subscribe());
                                        y = uoa.Z;
                                        Objects.requireNonNull(y);
                                        q.c(Completable.i(new ha5(3, y)).p(c).subscribe());
                                        y = uoa.a0;
                                        MainActivity h0 = uoa.h0;
                                        y.h = h0.j;
                                        y.i = h0.i;
                                        y.j = this.getResources().getDisplayMetrics().density;
                                        uoa.x.a(uoa, uoa.i0);
                                        q.c(uoa.e0.a().map(new fx6(12)).subscribe(new rz3(uoa, 2)));
                                        return;
                                     }else {
                                        i = 0x7f0a05fc;
                                     }
                                  }else {
                                     i = 0x7f0a0584;
                                  }
                               }else {
                                  i = 0x7f0a0400;
                               }
                            }else {
                               i = 0x7f0a03ff;
                            }
                         }else {
                            i = 0x7f0a0138;
                         }
                      }else {
                         i = 0x7f0a0136;
                      }
                   }else {
                      i = 0x7f0a0135;
                   }
                }
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroy(){
       this.Q.dispose();
       super.onDestroy();
    }
    public final void onNewIntent(Intent p0){
       super.onNewIntent(p0);
       this.E(p0);
    }
    public final void onPause(){
       super.onPause();
       this.a0.b();
    }
    public final void onResume(){
       super.onResume();
       this.a0.c();
    }
    public final void onSaveInstanceState(Bundle p0){
       super.onSaveInstanceState(p0);
       p0.putInt("fragmentBackStack#position", this.g0.b);
    }
    public final void onStart(){
       super.onStart();
       this.U.a(this);
       MainActivity tc0 = this.c0;
       tc0.getClass();
       fp6 a = tc0.a;
       a.getClass();
       a.a(new wo6(a, this, null, this.getIntent()));
       if (Build$VERSION.SDK_INT >= 33) {
          String str = "android.permission.POST_NOTIFICATIONS";
          if (!n6.a(this, str)) {
             this.Q.c(this.d0.c.distinctUntilChanged().subscribe(new rz3(this, 3)));
          }else {
             this.f0.a(str);
          }
       }
       return;
    }
    public final void onStop(){
       ym6 f;
       super.onStop();
       if ((f = this.T.f) != null) {
          f.a(3);
       }
       return;
    }
}
