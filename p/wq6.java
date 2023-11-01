package p.wq6;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnKeyListener;
import p.s64;
import android.content.Context;
import android.view.View;
import p.e64;
import p.lc0;
import java.lang.Object;
import p.mc0;
import android.view.LayoutInflater;
import p.b64;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.Math;
import p.a74;
import p.c74;
import p.wl3;
import p.b74;
import android.widget.PopupWindow;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnAttachStateChangeListener;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.CharSequence;
import android.widget.ListView;
import android.widget.ListAdapter;
import java.lang.IllegalStateException;
import java.lang.String;
import p.ue1;
import p.ev6;
import p.v64;
import p.wh7;
import p.eh7;
import android.view.Gravity;
import android.view.KeyEvent;

public final class wq6 extends s64 implements PopupWindow$OnDismissListener, View$OnKeyListener	// class@002b8a from classes.dex
{
    public final lc0 A;
    public final mc0 B;
    public PopupWindow$OnDismissListener C;
    public View D;
    public View E;
    public b74 F;
    public ViewTreeObserver G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final Context b;
    public final e64 c;
    public final b64 t;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final a74 z;

    public void wq6(int p0,int p1,Context p2,View p3,e64 p4,boolean p5){
       super();
       this.A = new lc0(1, this);
       this.B = new mc0(1, this);
       this.K = 0;
       this.b = p2;
       this.c = p4;
       this.v = p5;
       this.t = new b64(p4, LayoutInflater.from(p2), p5, 0x7f0d0013);
       this.x = p0;
       this.y = p1;
       Resources resources = p2.getResources();
       this.w = Math.max((resources.getDisplayMetrics().widthPixels / 2), resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
       this.D = p3;
       this.z = new a74(p2, p0, p1);
       p4.b(this, p2);
    }
    public final boolean a(){
       boolean b = (this.H == null && this.z.a())? true: false;
       return b;
    }
    public final void b(e64 p0,boolean p1){
       wq6 tF;
       if (p0 != this.c) {
          return;
       }
       this.dismiss();
       if ((tF = this.F) != null) {
          tF.b(p0, p1);
       }
       return;
    }
    public final void c(){
       wq6 tD;
       s64 ta;
       TextView textView;
       boolean b = true;
       if (this.a()) {
       }else if(this.H == null && (tD = this.D) != null){
          this.E = tD;
          tD = this.z;
          tD.P.setOnDismissListener(this);
          tD.G = this;
          tD.O = b;
          wl3 p = tD.P;
          p.setFocusable(b);
          wq6 tE = this.E;
          int i = (this.G == null)? 1: 0;
          ViewTreeObserver viewTreeObse = tE.getViewTreeObserver();
          this.G = viewTreeObse;
          if (i) {
             viewTreeObse.addOnGlobalLayoutListener(this.A);
          }
          tE.addOnAttachStateChangeListener(this.B);
          tD.F = tE;
          tD.C = this.K;
          wq6 tb = this.b;
          wq6 tt = this.t;
          if (this.I == null) {
             this.J = s64.m(tt, tb, this.w);
             this.I = b;
          }
          tD.r(this.J);
          p.setInputMethodMode(2);
          Rect rect = ((ta = this.a) != null)? new Rect(ta): null;
          tD.N = rect;
          tD.c();
          p = tD.c;
          p.setOnKeyListener(this);
          if (this.L != null) {
             wq6 tc = this.c;
             if (tc.m != null) {
                FrameLayout uFrameLayout = LayoutInflater.from(tb).inflate(R.layout.abc_popup_menu_header_item_layout, p, false);
                if ((textView = uFrameLayout.findViewById(0x1020016)) != null) {
                   textView.setText(tc.m);
                }
                uFrameLayout.setEnabled(false);
                p.addHeaderView(uFrameLayout, null, false);
             }
          }
          tD.p(tt);
          tD.c();
       }else {
          b = 0;
       }
       if (b) {
          return;
       }else {
          throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
       }
    }
    public final void d(){
       wq6 tt;
       this.I = false;
       if ((tt = this.t) != null) {
          tt.notifyDataSetChanged();
       }
       return;
    }
    public final void dismiss(){
       if (this.a()) {
          this.z.dismiss();
       }
       return;
    }
    public final ue1 e(){
       return this.z.c;
    }
    public final boolean f(ev6 p0){
       v64 j;
       if (p0.hasVisibleItems()) {
          v64 v0 = new v64(this.x, this.y, this.b, this.E, p0, this.v);
          wq6 tF = this.F;
          v0.i = tF;
          if ((j = v0.j) != null) {
             j.j(tF);
          }
          int b = s64.u(p0);
          v0.h = b;
          if ((j = v0.j) != null) {
             j.o(b);
          }
          v0.k = this.C;
          this.C = null;
          this.c.c(false);
          tF = this.z;
          wl3 w = tF.w;
          b = tF.l();
          if (((Gravity.getAbsoluteGravity(this.K, eh7.d(this.D)) & 0x07)) == 5) {
             w = w + this.D.getWidth();
          }
          if (!v0.b()) {
             if (v0.f == null) {
                wq6 tF1 = 0;
             label_0070 :
                if (i) {
                   if ((tF1 = this.F) != null) {
                      tF1.p(p0);
                   }
                   return true;
                }
             }else {
                v0.d(w, b, true, true);
             }
          }
          int i = 1;
          goto label_0070 ;
       }
       return false;
    }
    public final boolean i(){
       return false;
    }
    public final void j(b74 p0){
       this.F = p0;
    }
    public final void l(e64 p0){
    }
    public final void n(View p0){
       this.D = p0;
    }
    public final void o(boolean p0){
       this.t.c = p0;
    }
    public final void onDismiss(){
       wq6 tG;
       this.H = true;
       this.c.c(true);
       if ((tG = this.G) != null) {
          if (!tG.isAlive()) {
             this.G = this.E.getViewTreeObserver();
          }
          this.G.removeGlobalOnLayoutListener(this.A);
          this.G = null;
       }
       this.E.removeOnAttachStateChangeListener(this.B);
       if ((tG = this.C) != null) {
          tG.onDismiss();
       }
       return;
    }
    public final boolean onKey(View p0,int p1,KeyEvent p2){
       if (p2.getAction() != 1 || p1 != 82) {
          return false;
       }
       this.dismiss();
       return true;
    }
    public final void p(int p0){
       this.K = p0;
    }
    public final void q(int p0){
       this.z.w = p0;
    }
    public final void r(PopupWindow$OnDismissListener p0){
       this.C = p0;
    }
    public final void s(boolean p0){
       this.L = p0;
    }
    public final void t(int p0){
       this.z.h(p0);
    }
}
