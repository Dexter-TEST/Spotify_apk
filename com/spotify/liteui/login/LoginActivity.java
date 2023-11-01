package com.spotify.liteui.login.LoginActivity;
import p.gv3;
import androidx.appcompat.app.a;
import p.ab0;
import android.content.Intent;
import androidx.fragment.app.k;
import p.sb4;
import android.os.Bundle;
import android.app.Activity;
import p.eo5;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import p.es;
import android.widget.ScrollView;
import p.hv3;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.s81;
import java.lang.Object;
import p.mt3;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.ev3;
import p.nt3;
import p.lt3;
import p.cv3;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.jt3;
import p.b5;
import p.kt3;
import p.qt3;
import p.pt3;
import p.mg1;
import p.ot3;
import p.ir0;
import p.bm;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import p.mi;
import java.lang.String;
import p.ms3;
import p.qb4;
import p.i77;
import p.ou3;
import java.lang.Boolean;
import p.st;
import android.os.Parcelable;
import p.f;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import android.content.Context;
import java.lang.CharSequence;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import p.co5;
import p.k37;
import p.l94;
import p.yf2;
import io.reactivex.rxjava3.core.Observable;
import p.kz6;
import p.xb;
import p.zf2;
import p.f37;
import p.ap5;
import p.bi5;
import io.reactivex.rxjava3.core.ObservableSource;
import p.hm6;
import java.util.List;
import java.util.Arrays;
import java.lang.Iterable;
import p.dl4;
import android.content.res.Resources;
import java.lang.NullPointerException;
import androidx.activity.a;

public class LoginActivity extends a implements gv3	// class@000973 from classes.dex
{
    public g54 Q;
    public s01 R;
    public sb4 S;
    public es T;
    public Toast U;
    public static final ab0 V;

    static {
       LoginActivity.V = new ab0(24);
    }
    public void LoginActivity(){
       super();
    }
    public final void onActivityResult(int p0,int p1,Intent p2){
       super.onActivityResult(p0, p1, p2);
       if (!this.S.d()) {
          this.S.f();
       }
       return;
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
       f parcelable;
       a uoa = this;
       Bundle uBundle = p0;
       eo5.q(this);
       super.onCreate(p0);
       View view = this.getLayoutInflater().inflate(R.layout.login_activity, null, false);
       int i = 0x7f0a00c5;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a00d0;
          if ((view2 = ry7.q(view, i)) != null) {
             i = 0x7f0a040a;
             if ((view3 = ry7.q(view, i)) != null) {
                i = 0x7f0a040c;
                if ((view4 = ry7.q(view, i)) != null) {
                   i = 0x7f0a041d;
                   if ((view5 = ry7.q(view, i)) != null) {
                      i = 0x7f0a041e;
                      if ((view6 = ry7.q(view, i)) != null) {
                         i = 0x7f0a041f;
                         if ((view7 = ry7.q(view, i)) != null) {
                            i = 0x7f0a0636;
                            if ((view8 = ry7.q(view, i)) != null) {
                               es i1 = new es(view, view1, view2, view3, view4, view5, view6, view7, view8);
                               uoa.T = i;
                               uoa.setContentView(i.a);
                               RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
                               subtypeEffec.g(mt3.class, new s81(13, uoa.Q.r(uoa, hv3.class)));
                               subtypeEffec.g(nt3.class, new ev3(uoa, false));
                               subtypeEffec.g(lt3.class, new ev3(uoa, 1));
                               subtypeEffec.b(jt3.class, new cv3(uoa, false), id.a());
                               subtypeEffec.b(kt3.class, new cv3(uoa, 1), id.a());
                               subtypeEffec.b(qt3.class, new cv3(uoa, 2), id.a());
                               subtypeEffec.b(pt3.class, new cv3(uoa, 3), id.a());
                               subtypeEffec.d(ot3.class, new mg1(16, uoa), id.a());
                               ObservableTransformer observableTr = subtypeEffec.h();
                               int i2 = 6;
                               k37 i77 subtypeEffec1 = new i77();
                               subtypeEffec1.a = ou3.a;
                               subtypeEffec1.b = "";
                               subtypeEffec1.c = "";
                               Boolean fALSE = Boolean.FALSE;
                               subtypeEffec1.d = fALSE;
                               subtypeEffec1.e = fALSE;
                               subtypeEffec1.f = fALSE;
                               uoa.S = mi.g(mi.A(new bm(11), RxConnectables.a(observableTr)).e(ms3.i("Login")).d(new bm(i2)), subtypeEffec1.j());
                               if (uBundle && (parcelable = uBundle.getParcelable("LOGIN_MODEL")) != null) {
                                  uoa.S.e(parcelable);
                               }
                               GlueToolbar glueToolbar = GlueToolbars.createGlueToolbar(uoa.T.i);
                               glueToolbar.setTitle(uoa.getString(R.string.header_login));
                               view = this.getLayoutInflater().inflate(R.layout.up_button, uoa.T.i, false);
                               glueToolbar.addView(ToolbarSide.START, view, R.id.action_close);
                               es d = uoa.T.d;
                               co5.q(d, "$this$textChanges");
                               k37 fALSE1 = new k37(d, 1);
                               Observable observable = fALSE1.map(new l94(4));
                               es e = uoa.T.e;
                               co5.q(e, "$this$textChanges");
                               subtypeEffec1 = new k37(e, 1);
                               Observable[] observableAr = new Observable[7];
                               observableAr[0] = observable;
                               observableAr[1] = subtypeEffec1.map(new l94(5));
                               observableAr[2] = Observable.merge(ry7.e(uoa.T.b), ap5.m(uoa.T.e, xb.a).filter(LoginActivity.V)).map(new l94(i2));
                               observableAr[3] = uoa.R.f.flatMapMaybe(new l94(7)).map(new l94(8));
                               observableAr[4] = uoa.R.d.map(new l94(9));
                               kz6 okz6 = ry7.e(view);
                               observableAr[5] = okz6.map(new l94(10));
                               observableAr[6] = ry7.e(uoa.T.c).map(new l94(11));
                               uoa.S.a(RxConnectables.a(new dl4(uoa, 5, Observable.merge(Arrays.asList(observableAr)))));
                               return;
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
    public final void onDestroy(){
       this.S.b();
       super.onDestroy();
    }
    public final void onSaveInstanceState(Bundle p0){
       super.onSaveInstanceState(p0);
       p0.putParcelable("LOGIN_MODEL", this.S.c());
    }
    public final void onStart(){
       super.onStart();
       if (!this.S.d()) {
          this.S.f();
       }
       return;
    }
    public final void onStop(){
       this.S.g();
       super.onStop();
    }
}
