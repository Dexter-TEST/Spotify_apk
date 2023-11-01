package p.dg;
import android.view.Window$Callback;
import p.jg;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.view.MotionEvent;
import android.view.KeyEvent;
import p.do5;
import p.ig;
import android.view.accessibility.AccessibilityEvent;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import p.e64;
import p.u44;
import p.f67;
import android.content.Context;
import p.p67;
import java.lang.Class;
import java.util.List;
import android.view.SearchEvent;
import android.view.WindowManager$LayoutParams;
import android.view.ActionMode$Callback;
import android.os.Build$VERSION;
import p.gw6;
import p.fp7;
import p.ep7;
import p.dp7;
import p.oy6;
import p.b6;
import p.xf;
import p.kf;
import p.fk7;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import p.mt0;
import androidx.appcompat.widget.ActionBarContextView;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import p.ej4;
import android.util.DisplayMetrics;
import p.tf;
import androidx.appcompat.widget.ViewStubCompat;
import android.view.LayoutInflater;
import p.tq6;
import p.a6;
import p.wh7;
import p.gh7;
import p.wf;
import p.ik7;
import android.view.ViewParent;
import p.hh7;
import android.view.Window;
import java.lang.Runnable;

public final class dg implements Window$Callback	// class@001344 from classes.dex
{
    public final Window$Callback a;
    public u44 b;
    public boolean c;
    public boolean t;
    public boolean v;
    public final jg w;

    public void dg(jg p0,Window$Callback p1){
       this.w = p0;
       super();
       if (p1 == null) {
          throw new IllegalArgumentException("Window callback may not be null");
       }
       this.a = p1;
       return;
    }
    public final void a(Window$Callback p0){
       this.c = true;
       p0.onContentChanged();
       this.c = false;
    }
    public final boolean b(MotionEvent p0){
       return this.a.dispatchGenericMotionEvent(p0);
    }
    public final boolean c(KeyEvent p0){
       return this.a.dispatchKeyEvent(p0);
    }
    public final boolean d(KeyEvent p0){
       return this.a.dispatchKeyShortcutEvent(p0);
    }
    public final boolean dispatchGenericMotionEvent(MotionEvent p0){
       return this.b(p0);
    }
    public final boolean dispatchKeyEvent(KeyEvent p0){
       if (this.t != null) {
          return this.a.dispatchKeyEvent(p0);
       }
       boolean b = (!this.w.u(p0) && !this.c(p0))? false: true;
       return b;
    }
    public final boolean dispatchKeyShortcutEvent(KeyEvent p0){
       jg f;
       boolean i;
       jg e0;
       jg e01;
       boolean b = true;
       if (!this.d(p0)) {
          int keyCode = p0.getKeyCode();
          dg tw = this.w;
          tw.C();
          if ((f = tw.F) == null || !f.S(keyCode, p0)) {
             if ((e0 = tw.e0) != null && tw.G(e0, p0.getKeyCode(), p0)) {
                if ((e01 = tw.e0) != null) {
                   e01.l = b;
                }
             }else if(tw.e0 == null){
                ig oig = tw.A(0);
                tw.H(oig, p0);
                i = tw.G(oig, p0.getKeyCode(), p0);
                oig.k = false;
                if (!i) {
                }
             }else {
             }
          }
          i = 1;
          if (!i) {
             b = false;
          }
       }
       return b;
    }
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent p0){
       return this.e(p0);
    }
    public final boolean dispatchTouchEvent(MotionEvent p0){
       return this.f(p0);
    }
    public final boolean dispatchTrackballEvent(MotionEvent p0){
       return this.g(p0);
    }
    public final boolean e(AccessibilityEvent p0){
       return this.a.dispatchPopulateAccessibilityEvent(p0);
    }
    public final boolean f(MotionEvent p0){
       return this.a.dispatchTouchEvent(p0);
    }
    public final boolean g(MotionEvent p0){
       return this.a.dispatchTrackballEvent(p0);
    }
    public final void h(ActionMode p0){
       this.a.onActionModeFinished(p0);
    }
    public final void i(ActionMode p0){
       this.a.onActionModeStarted(p0);
    }
    public final void j(){
       this.a.onAttachedToWindow();
    }
    public final boolean k(int p0,Menu p1){
       return this.a.onCreatePanelMenu(p0, p1);
    }
    public final View l(int p0){
       return this.a.onCreatePanelView(p0);
    }
    public final void m(){
       this.a.onDetachedFromWindow();
    }
    public final boolean n(int p0,MenuItem p1){
       return this.a.onMenuItemSelected(p0, p1);
    }
    public final boolean o(int p0,Menu p1){
       return this.a.onMenuOpened(p0, p1);
    }
    public final void onActionModeFinished(ActionMode p0){
       this.h(p0);
    }
    public final void onActionModeStarted(ActionMode p0){
       this.i(p0);
    }
    public final void onAttachedToWindow(){
       this.j();
    }
    public final void onContentChanged(){
       if (this.c != null) {
          this.a.onContentChanged();
       }
       return;
    }
    public final boolean onCreatePanelMenu(int p0,Menu p1){
       if (!p0 && !p1 instanceof e64) {
          return false;
       }
       return this.k(p0, p1);
    }
    public final View onCreatePanelView(int p0){
       dg tb;
       if ((tb = this.b) != null) {
          View view = (!p0)? new View(tb.b.F.a()): null;
          if (view != null) {
             return view;
          }
       }
       return this.l(p0);
    }
    public final void onDetachedFromWindow(){
       this.m();
    }
    public final boolean onMenuItemSelected(int p0,MenuItem p1){
       return this.n(p0, p1);
    }
    public final boolean onMenuOpened(int p0,Menu p1){
       jg f;
       this.o(p0, p1);
       dg tw = this.w;
       if (p0 == 108) {
          tw.C();
          if ((f = tw.F) != null) {
             f.p(true);
          }
       }else {
          tw.getClass();
       }
       return true;
    }
    public final void onPanelClosed(int p0,Menu p1){
       jg f;
       if (this.v != null) {
          this.a.onPanelClosed(p0, p1);
          return;
       }else {
          this.p(p0, p1);
          dg tw = this.w;
          if (p0 == 108) {
             tw.C();
             if ((f = tw.F) != null) {
                f.p(false);
             }
          }else if(!p0){
             ig oig = tw.A(p0);
             if (oig.m != null) {
                tw.s(oig, false);
             }
          }else {
             tw.getClass();
          }
          return;
       }
    }
    public final void onPointerCaptureChanged(boolean p0){
       this.q(p0);
    }
    public final boolean onPreparePanel(int p0,View p1,Menu p2){
       dg tb;
       int i = (p2 instanceof e64)? p2: 0;
       if (!p0 && !i) {
          return false;
       }else if(i){
          i.x = true;
       }
       if ((tb = this.b) != null && !p0) {
          u44 b = tb.b;
          if (b.I == null) {
             b.F.l = true;
             b.I = true;
          }
       }
       boolean b1 = this.r(p0, p1, p2);
       if (i) {
          i.x = false;
       }
       return b1;
    }
    public final void onProvideKeyboardShortcuts(List p0,Menu p1,int p2){
       ig h;
       if ((h = this.w.A(0).h) != null) {
          this.s(p0, h, p2);
       }else {
          this.s(p0, p1, p2);
       }
       return;
    }
    public final boolean onSearchRequested(){
       return this.t();
    }
    public final boolean onSearchRequested(SearchEvent p0){
       return this.u(p0);
    }
    public final void onWindowAttributesChanged(WindowManager$LayoutParams p0){
       this.v(p0);
    }
    public final void onWindowFocusChanged(boolean p0){
       this.w(p0);
    }
    public final ActionMode onWindowStartingActionMode(ActionMode$Callback p0){
       if (Build$VERSION.SDK_INT >= 23) {
          return null;
       }
       if (this.w.Q != null) {
          return this.z(p0);
       }
       return this.x(p0);
    }
    public final ActionMode onWindowStartingActionMode(ActionMode$Callback p0,int p1){
       if (this.w.Q != null && !p1) {
          return this.z(p0);
       }
       return this.y(p0, p1);
    }
    public final void p(int p0,Menu p1){
       this.a.onPanelClosed(p0, p1);
    }
    public final void q(boolean p0){
       fp7.a(this.a, p0);
    }
    public final boolean r(int p0,View p1,Menu p2){
       return this.a.onPreparePanel(p0, p1, p2);
    }
    public final void s(List p0,Menu p1,int p2){
       ep7.a(this.a, p0, p1, p2);
    }
    public final boolean t(){
       return this.a.onSearchRequested();
    }
    public final boolean u(SearchEvent p0){
       return dp7.a(this.a, p0);
    }
    public final void v(WindowManager$LayoutParams p0){
       this.a.onWindowAttributesChanged(p0);
    }
    public final void w(boolean p0){
       this.a.onWindowFocusChanged(p0);
    }
    public final ActionMode x(ActionMode$Callback p0){
       return this.a.onWindowStartingActionMode(p0);
    }
    public final ActionMode y(ActionMode$Callback p0,int p1){
       return dp7.b(this.a, p0, p1);
    }
    public final gw6 z(ActionMode$Callback p0){
       jg l;
       ViewStubCompat viewStubComp;
       jg f2;
       dg tw = this.w;
       oy6 ooy6 = new oy6(tw.B, p0);
       if ((l = tw.L) != null) {
          l.a();
       }
       xf oxf = new xf(tw, ooy6);
       tw.C();
       jg f = tw.F;
       jg e = tw.E;
       if (f != null) {
          b6 uob6 = f.t0(oxf);
          tw.L = uob6;
          if (uob6 != null && e != null) {
             e.p();
          }
       }
       if (tw.L == null) {
          if ((f = tw.P) != null) {
             f.b();
          }
          if ((f = tw.L) != null) {
             f.a();
          }
          try{
             if (e != null && tw.i0 == null) {
                e.t();
             }
             int i = 0;
             if (tw.M == null) {
                jg b = tw.B;
                if (tw.a0 != null) {
                   TypedValue typedValue = new TypedValue();
                   Resources$Theme theme = b.getTheme();
                   theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                   if (typedValue.resourceId != null) {
                      Resources$Theme theme1 = b.getResources().newTheme();
                      theme1.setTo(theme);
                      theme1.applyStyle(typedValue.resourceId, true);
                      mt0 omt0 = new mt0(b, i);
                      omt0.getTheme().setTo(theme1);
                      b = omt0;
                   }
                   tw.M = new ActionBarContextView(b, null);
                   PopupWindow omt01 = new PopupWindow(b, null, 0x7f03001c);
                   tw.N = omt01;
                   ej4.N0(omt01, 2);
                   tw.N.setContentView(tw.M);
                   tw.N.setWidth(-1);
                   b.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                   tw.M.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, b.getResources().getDisplayMetrics()));
                   tw.N.setHeight(-2);
                   tw.O = new tf(tw, true);
                }else if((viewStubComp = tw.S.findViewById(R.id.action_mode_bar_stub)) != null){
                   tw.C();
                   Context uContext = ((f2 = tw.F) != null)? f2.F(): null;
                   if (uContext != null) {
                      b = uContext;
                   }
                   viewStubComp.setLayoutInflater(LayoutInflater.from(b));
                   tw.M = viewStubComp.a();
                }
             }
             if (tw.M != null) {
                if ((f = tw.P) != null) {
                   f.b();
                }
                tw.M.e();
                tq6 otq6 = new tq6(tw.M.getContext(), tw.M, oxf);
                if (oxf.e(otq6, otq6.y)) {
                   otq6.g();
                   tw.M.c(otq6);
                   tw.L = otq6;
                   oxf = (tw.R != null && ((l = tw.S) != null && gh7.c(l)))? 1: 0;
                   float f1 = 0x3f800000;
                   if (oxf) {
                      tw.M.setAlpha(0);
                      fk7 uofk7 = wh7.a(tw.M);
                      uofk7.a(f1);
                      tw.P = uofk7;
                      uofk7.d(new wf(true, tw));
                   }else {
                      tw.M.setAlpha(f1);
                      tw.M.setVisibility(i);
                      if (tw.M.getParent() instanceof View) {
                         hh7.c(tw.M.getParent());
                      }
                   }
                   if (tw.N != null) {
                      tw.C.getDecorView().post(tw.O);
                   }
                }else {
                   tw.L = null;
                }
             }
             if (tw.L != null && e != null) {
                e.p();
             }
             tw.J();
             tw.L = tw.L;
          }catch(java.lang.AbstractMethodError e0){
          }
       }
       tw.J();
       if ((l = tw.L) != null) {
          return e0.l(l);
       }else {
          return null;
       }
    }
}
