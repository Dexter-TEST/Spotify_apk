package p.if;
import android.view.View;
import java.lang.Object;
import p.ng;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import p.e57;
import p.wh7;
import android.content.res.ColorStateList;
import p.jh7;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import android.content.Context;
import p.ej4;
import p.p86;
import android.content.res.TypedArray;
import p.mw5;
import p.ne1;
import p.dh7;

public final class if	// class@001986 from classes.dex
{
    public final View a;
    public final ng b;
    public int c;
    public e57 d;
    public e57 e;
    public e57 f;

    public void if(View p0){
       super();
       this.c = -1;
       this.a = p0;
       this.b = ng.a();
    }
    public final void a(){
       Drawable background;
       if tf;
       ColorStateList uColorStateL;
       PorterDuff$Mode mode;
       if ta = this.a;
       if ((background = ta.getBackground()) != null) {
          int sDK_INT = Build$VERSION.SDK_INT;
          boolean b = true;
          boolean b1 = false;
          int i = 21;
          if (sDK_INT > i) {
             if (this.d != null) {
             label_0017 :
                sDK_INT = 1;
             label_001a :
                if (sDK_INT) {
                   if (this.f == null) {
                      this.f = new e57();
                   }
                   tf = this.f;
                   tf.c = null;
                   tf.b = b1;
                   tf.d = null;
                   tf.a = b1;
                   if ((uColorStateL = jh7.g(ta)) != null) {
                      tf.b = b;
                      tf.c = uColorStateL;
                   }
                   if ((mode = jh7.h(ta)) != null) {
                      tf.a = b;
                      tf.d = mode;
                   }
                   if (tf.b == null && tf.a == null) {
                      b = false;
                   }else {
                      ng.e(background, tf, ta.getDrawableState());
                   }
                   if (b) {
                      return;
                   }
                }
                if ((tf = this.e) != null) {
                   ng.e(background, tf, ta.getDrawableState());
                }else if((tf = this.d) != null){
                   ng.e(background, tf, ta.getDrawableState());
                }
             }
          }else if(sDK_INT == i){
             goto label_0017 ;
          }
          tf = 0;
          goto label_001a ;
       }
       return;
    }
    public final ColorStateList b(){
       if te;
       e57 c = ((te = this.e) != null)? te.c: null;
       return c;
    }
    public final PorterDuff$Mode c(){
       if te;
       e57 d = ((te = this.e) != null)? te.d: null;
       return d;
    }
    public final void d(AttributeSet p0,int p1){
       if ta = this.a;
       int[] d0 = ej4.d0;
       p86 op86 = p86.m(ta.getContext(), p0, d0, p1);
       if ta1 = this.a;
       wh7.n(ta1, ta1.getContext(), d0, p0, op86.b, p1);
       int i = 0;
       int i1 = -1;
       if (op86.l(i)) {
          this.c = op86.i(i, i1);
          if tb = this.b;
          _monitor_enter(tb);
          ColorStateList uColorStateL = tb.a.i(ta.getContext(), this.c);
          _monitor_exit(tb);
          if (uColorStateL != null) {
             this.g(uColorStateL);
          }
       }
       if (op86.l(1)) {
          wh7.q(ta, op86.b(1));
       }
       int i2 = 2;
       if (op86.l(i2)) {
          jh7.r(ta, ne1.c(op86.h(i2, i1), null));
          if (Build$VERSION.SDK_INT == 21) {
             Drawable background = ta.getBackground();
             if (jh7.g(ta) != null || jh7.h(ta) != null) {
                i = 1;
             }
             if (background != null && i) {
                if (background.isStateful()) {
                   background.setState(ta.getDrawableState());
                }
                dh7.q(ta, background);
             }
          }
       }
       op86.o();
       return;
    }
    public final void e(){
       this.c = -1;
       this.g(null);
       this.a();
    }
    public final void f(int p0){
       if tb;
       ColorStateList uColorStateL;
       this.c = p0;
       if ((tb = this.b) != null) {
          _monitor_enter(tb);
          uColorStateL = tb.a.i(this.a.getContext(), p0);
          _monitor_exit(tb);
       }else {
          uColorStateL = null;
       }
       this.g(uColorStateL);
       this.a();
       return;
    }
    public final void g(ColorStateList p0){
       if (p0 != null) {
          if (this.d == null) {
             this.d = new e57();
          }
          if td = this.d;
          td.c = p0;
          td.b = true;
       }else {
          this.d = null;
       }
       this.a();
       return;
    }
    public final void h(ColorStateList p0){
       if (this.e == null) {
          this.e = new e57();
       }
       if te = this.e;
       te.c = p0;
       te.b = true;
       this.a();
       return;
    }
    public final void i(PorterDuff$Mode p0){
       if (this.e == null) {
          this.e = new e57();
       }
       if te = this.e;
       te.d = p0;
       te.a = true;
       this.a();
       return;
    }
}
