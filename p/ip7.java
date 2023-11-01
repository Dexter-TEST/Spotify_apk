package p.ip7;
import p.i5;
import p.do5;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.app.Activity;
import java.util.ArrayList;
import p.gp7;
import p.g54;
import java.lang.Object;
import android.view.Window;
import android.view.View;
import android.app.Dialog;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import p.wh7;
import p.gh7;
import p.p67;
import p.fk7;
import p.gk7;
import p.ik7;
import androidx.appcompat.widget.ActionBarContextView;
import p.hk7;
import java.lang.ref.Reference;
import android.view.ViewPropertyAnimator;
import p.c61;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ActionBarContainer;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.Class;
import android.content.res.Resources;
import p.ej4;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import java.lang.IllegalStateException;
import java.lang.String;
import p.jh7;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.view.ContextThemeWrapper;
import p.d56;
import p.ck7;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p.ek7;
import p.hh7;
import android.view.KeyEvent;
import p.hp7;
import android.view.KeyCharacterMap;
import p.e64;
import androidx.appcompat.widget.e;
import p.l64;
import p.tp2;
import java.lang.CharSequence;
import p.xf;
import p.b6;
import p.a6;

public final class ip7 extends do5 implements i5	// class@0019df from classes.dex
{
    public Context F;
    public Context G;
    public ActionBarOverlayLayout H;
    public ActionBarContainer I;
    public c61 J;
    public ActionBarContextView K;
    public final View L;
    public boolean M;
    public hp7 N;
    public hp7 O;
    public a6 P;
    public boolean Q;
    public final ArrayList R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public hk7 X;
    public boolean Y;
    public boolean Z;
    public final gp7 a0;
    public final gp7 b0;
    public final g54 c0;
    public static final AccelerateInterpolator d0;
    public static final DecelerateInterpolator e0;

    static {
       ip7.d0 = new AccelerateInterpolator();
       ip7.e0 = new DecelerateInterpolator();
    }
    public void ip7(Activity p0,boolean p1){
       super();
       ArrayList uArrayList = new ArrayList();
       this.R = new ArrayList();
       this.S = 0;
       this.T = true;
       this.W = true;
       this.a0 = new gp7(this, 0);
       this.b0 = new gp7(this, true);
       this.c0 = new g54(this);
       View decorView = p0.getWindow().getDecorView();
       this.E0(decorView);
       if (!p1) {
          this.L = decorView.findViewById(0x1020002);
       }
       return;
    }
    public void ip7(Dialog p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.R = new ArrayList();
       this.S = 0;
       this.T = true;
       this.W = true;
       this.a0 = new gp7(this, 0);
       this.b0 = new gp7(this, true);
       this.c0 = new g54(this);
       this.E0(p0.getWindow().getDecorView());
    }
    public final void D0(boolean p0){
       ip7 tH;
       ip7 tJ;
       fk7 uofk7;
       fk7 uofk71;
       View view;
       ip7 tH1;
       boolean b = false;
       if (p0) {
          if (this.V == null) {
             boolean b1 = true;
             this.V = b1;
             if ((tH = this.H) != null) {
                tH.setShowingForActionMode(b1);
             }
             this.G0(b);
          }
       }else if(this.V != null){
          this.V = b;
          if ((tH1 = this.H) != null) {
             tH1.setShowingForActionMode(b);
          }
          this.G0(b);
       }
       int i = 4;
       int i1 = 8;
       if (gh7.c(this.I)) {
          if (p0) {
             tJ = this.J;
             uofk7 = wh7.a(tJ.a);
             uofk7.a(0);
             uofk7.c(100);
             uofk7.d(new gk7(tJ, i));
             uofk71 = this.K.l(b, 200);
          }else {
             tJ = this.J;
             uofk7 = wh7.a(tJ.a);
             uofk7.a(0x3f800000);
             uofk7.c(200);
             uofk7.d(new gk7(tJ, b));
             fk7 uofk72 = uofk7;
             uofk7 = this.K.l(i1, 100);
             uofk71 = uofk72;
          }
          hk7 ohk7 = new hk7();
          hk7 a = ohk7.a;
          a.add(uofk7);
          long duration = ((view = uofk7.a.get()) != null)? view.animate().getDuration(): 0;
          if ((view = uofk71.a.get()) != null) {
             view.animate().setStartDelay(duration);
          }
          a.add(uofk71);
          ohk7.b();
       }else if(p0){
          this.J.a.setVisibility(i);
          this.K.setVisibility(b);
       }else {
          this.J.a.setVisibility(b);
          this.K.setVisibility(i1);
       }
       return;
    }
    public final void E0(View p0){
       ip7 tJ;
       int dimensionPix;
       String simpleName;
       ActionBarOverlayLayout uActionBarOv = p0.findViewById(R.id.decor_content_parent);
       this.H = uActionBarOv;
       if (uActionBarOv != null) {
          uActionBarOv.setActionBarVisibilityCallback(this);
       }
       View view = p0.findViewById(R.id.action_bar);
       if (view instanceof c61) {
       }else if(view instanceof Toolbar){
          view = view.getWrapper();
       }else if(view != null){
          simpleName = view.getClass().getSimpleName();
       }else {
          simpleName = "null";
       }
       throw new IllegalStateException("Can\'t make a decor toolbar out of ".concat(simpleName));
       this.J = view;
       this.K = p0.findViewById(R.id.action_context_bar);
       ActionBarContainer uActionBarCo = p0.findViewById(R.id.action_bar_container);
       this.I = uActionBarCo;
       if ((tJ = this.J) != null && (this.K != null && uActionBarCo != null)) {
          Context uContext = tJ.a();
          this.F = uContext;
          boolean b = true;
          int i = 0;
          tJ = ((this.J.b & 0x04))? 1: 0;
          if (tJ) {
             this.M = b;
          }
          int i1 = (uContext.getApplicationInfo().targetSdkVersion < 14)? 1: 0;
          this.J.getClass();
          this.F0(uContext.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
          TypedArray typedArray = this.F.obtainStyledAttributes(null, ej4.D, R.attr.actionBarStyle, i);
          if (typedArray.getBoolean(14, i)) {
             tJ = this.H;
             if (tJ.y != null) {
                this.Z = b;
                tJ.setHideOnContentScrollEnabled(b);
             }else {
                throw new IllegalStateException("Action bar must be in overlay mode \(Window.FEATURE_OVERLAY_ACTION_BAR\) to enable hide on content scroll");
             }
          }
          if (dimensionPix = typedArray.getDimensionPixelSize(12, i)) {
             jh7.s(this.I, (float)dimensionPix);
          }
          typedArray.recycle();
          return;
       }else {
          throw new IllegalStateException(ip7.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
       }
    }
    public final Context F(){
       if (this.G == null) {
          TypedValue typedValue = new TypedValue();
          this.F.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
          this.G = ((typedValue = typedValue.resourceId) != null)? new ContextThemeWrapper(this.F, typedValue): this.F;
       }
       return this.G;
    }
    public final void F0(boolean p0){
       d56 uod56 = null;
       if (!p0) {
          this.J.getClass();
          this.I.setTabContainer(uod56);
       }else {
          this.I.setTabContainer(uod56);
          this.J.getClass();
       }
       this.J.getClass();
       this.J.a.setCollapsible(false);
       this.H.setHasNonEmbeddedTabs(false);
       return;
    }
    public final void G0(boolean p0){
       ip7 tb0;
       int[] ointArray;
       View view;
       hk7 e;
       ip7 tH;
       View view1;
       ip7 tU = this.U;
       boolean b = true;
       int i = 0;
       tU = (this.V != null || tU == null)? 1: 0;
       ValueAnimator$AnimatorUpdateListener uAnimatorUpd = null;
       ip7 tL = this.L;
       int i1 = 2;
       ip7 tc0 = this.c0;
       float f = 0x3f800000;
       if (tU) {
          if (this.W == null) {
             this.W = b;
             if ((tU = this.X) != null) {
                tU.a();
             }
             this.I.setVisibility(i);
             tb0 = this.b0;
             if (this.S == null && (this.Y != null && !p0)) {
                this.I.setTranslationY(0);
                float f1 = (float)(- this.I.getHeight());
                if (p0) {
                   ointArray = new int[i1]{0,0};
                   this.I.getLocationInWindow(ointArray);
                   f1 = f1 - (float)ointArray[b];
                }
                this.I.setTranslationY(f1);
                hk7 ohk7 = new hk7();
                fk7 uofk7 = wh7.a(this.I);
                uofk7.e(0);
                if ((view = uofk7.a.get()) != null) {
                   if (tc0 != null) {
                      uAnimatorUpd = new ck7(tc0, view);
                   }
                   ek7.a(view.animate(), uAnimatorUpd);
                }
                hk7 a = ohk7.a;
                if (ohk7.e == null) {
                   a.add(uofk7);
                }
                if (this.T != null && tL != null) {
                   tL.setTranslationY(f1);
                   fk7 uofk71 = wh7.a(tL);
                   uofk71.e(0);
                   if (ohk7.e == null) {
                      a.add(uofk71);
                   }
                }
                DecelerateInterpolator e0 = ip7.e0;
                if ((e = ohk7.e) == null) {
                   ohk7.c = e0;
                }
                if (e == null) {
                   ohk7.b = 250;
                }
                if (e == null) {
                   ohk7.d = tb0;
                }
                this.X = ohk7;
                ohk7.b();
             }else {
                this.I.setAlpha(f);
                this.I.setTranslationY(0);
                if (this.T != null && tL != null) {
                   tL.setTranslationY(0);
                }
                tb0.a();
             }
             if ((tH = this.H) != null) {
                hh7.c(tH);
             }
          }
       }else if(this.W != null){
          this.W = i;
          if ((tU = this.X) != null) {
             tU.a();
          }
          tb0 = this.a0;
          if (this.S == null && (this.Y != null && !p0)) {
             this.I.setAlpha(f);
             this.I.setTransitioning(b);
             hk7 ohk71 = new hk7();
             f = (float)(- this.I.getHeight());
             if (p0) {
                ointArray = new int[i1]{0,0};
                this.I.getLocationInWindow(ointArray);
                f = f - (float)ointArray[b];
             }
             fk7 uofk72 = wh7.a(this.I);
             uofk72.e(f);
             if ((view1 = uofk72.a.get()) != null) {
                if (tc0 != null) {
                   uAnimatorUpd = new ck7(tc0, view1);
                }
                ek7.a(view1.animate(), uAnimatorUpd);
             }
             hk7 a1 = ohk71.a;
             if (ohk71.e == null) {
                a1.add(uofk72);
             }
             if (this.T != null && tL != null) {
                uofk72 = wh7.a(tL);
                uofk72.e(f);
                if (ohk71.e == null) {
                   a1.add(uofk72);
                }
             }
             AccelerateInterpolator d0 = ip7.d0;
             if ((e = ohk71.e) == null) {
                ohk71.c = d0;
             }
             if (e == null) {
                ohk71.b = 250;
             }
             if (e == null) {
                ohk71.d = tb0;
             }
             this.X = ohk71;
             ohk71.b();
          }else {
             tb0.a();
          }
       }
       return;
    }
    public final void Q(){
       this.F0(this.F.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }
    public final boolean S(int p0,KeyEvent p1){
       ip7 tN;
       hp7 t;
       if ((tN = this.N) == null) {
          return false;
       }
       if ((t = tN.t) == null) {
          return false;
       }
       int deviceId = (p1 != null)? p1.getDeviceId(): -1;
       boolean b = true;
       if (KeyCharacterMap.load(deviceId).getKeyboardType() == b) {
          b = false;
       }
       t.setQwertyMode(b);
       return t.performShortcut(p0, p1, false);
    }
    public final boolean j(){
       ip7 tJ;
       Toolbar g01;
       if ((tJ = this.J) != null) {
          Toolbar g0 = ((g0 = tJ.a.g0) != null && g0.b != null)? 1: 0;
          if (g0) {
             l64 ol64 = ((g01 = tJ.a.g0) == null)? null: g01.b;
             if (ol64 != null) {
                ol64.collapseActionView();
             }
             return true;
          }
       }
       return false;
    }
    public final void p(boolean p0){
       if (p0 == this.Q) {
          return;
       }
       this.Q = p0;
       ip7 tR = this.R;
       if (tR.size() <= 0) {
          return;
       }
       tp2.v(tR.get(0));
       throw null;
    }
    public final void p0(boolean p0){
       if (this.M == null) {
          int i = 4;
          int i1 = (p0)? 4: 0;
          ip7 tJ = this.J;
          this.M = true;
          tJ.b(((i1 & i) | (tJ.b & 0xfb)));
       }
       return;
    }
    public final void q0(boolean p0){
       ip7 tX;
       this.Y = p0;
       if (!p0 && (tX = this.X) != null) {
          tX.a();
       }
       return;
    }
    public final void r0(CharSequence p0){
       ip7 tJ = this.J;
       if (tJ.g == null) {
          tJ.h = p0;
          if ((tJ.b & 0x08)) {
             p67 a = tJ.a;
             a.setTitle(p0);
             if (tJ.g != null) {
                wh7.p(a.getRootView(), p0);
             }
          }
       }
       return;
    }
    public final b6 t0(xf p0){
       ip7 tN;
       if ((tN = this.N) != null) {
          tN.a();
       }
       this.H.setHideOnContentScrollEnabled(false);
       this.K.e();
       hp7 ohp7 = new hp7(this, this.K.getContext(), p0);
       hp7 t = ohp7.t;
       t.w();
       t.v();
       if (ohp7.v.e(ohp7, t)) {
          this.N = ohp7;
          ohp7.g();
          this.K.c(ohp7);
          this.D0(true);
          return ohp7;
       }else {
          return null;
       }
    }
    public final int v(){
       return this.J.b;
    }
}
