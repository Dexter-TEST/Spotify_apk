package p.df1;
import p.im1;
import com.google.android.material.textfield.TextInputLayout;
import p.ze1;
import p.i86;
import java.lang.Object;
import p.af1;
import p.eg0;
import p.fg0;
import android.widget.AutoCompleteTextView;
import java.lang.Class;
import java.lang.System;
import android.view.View;
import android.content.res.Resources;
import android.content.Context;
import p.q24;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import p.k8;
import android.view.View$OnClickListener;
import java.util.AbstractCollection;
import android.animation.ValueAnimator;
import p.je;
import android.animation.TimeInterpolator;
import p.af6;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p.g5;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.lang.String;
import android.view.accessibility.AccessibilityManager;
import p.ad6;
import p.d0;
import p.bd6;
import p.ox7;
import android.content.res.ColorStateList;
import p.p24;
import android.graphics.Rect;

public final class df1 extends im1	// class@001334 from classes.dex
{
    public final ze1 e;
    public final i86 f;
    public final af1 g;
    public final eg0 h;
    public final fg0 i;
    public boolean j;
    public boolean k;
    public long l;
    public StateListDrawable m;
    public q24 n;
    public AccessibilityManager o;
    public ValueAnimator p;
    public ValueAnimator q;

    public void df1(TextInputLayout p0,int p1){
       super(p0, p1);
       this.e = new ze1(this, 0);
       this.f = new i86(2, this);
       this.g = new af1(this, p0);
       this.h = new eg0(this, 1);
       this.i = new fg0(this, 1);
       this.j = false;
       this.k = false;
       this.l = Long.MAX_VALUE;
    }
    public static void d(df1 p0,AutoCompleteTextView p1){
       if (p1 == null) {
          p0.getClass();
       }else {
          p0.getClass();
          long l = System.currentTimeMillis() - p0.l;
          l = ((l) >= 0 && (l - 300) <= 0)? 0: 1;
          if (l) {
             p0.j = false;
          }
          if (p0.j == null) {
             p0.f((p0.k ^ 1));
             if (p0.k != null) {
                p1.requestFocus();
                p1.showDropDown();
             }else {
                p1.dismissDropDown();
             }
          }else {
             p0.j = false;
          }
       }
       return;
    }
    public final void a(){
       im1 td;
       im1 tb = this.b;
       float f = (float)tb.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
       StateListDrawable float f1 = (float)tb.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
       int dimensionPix = tb.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
       q24 oq24 = this.e(f, f, f1, dimensionPix);
       q24 oq241 = this.e(0, f, f1, dimensionPix);
       this.n = oq24;
       f1 = new StateListDrawable();
       this.m = f1;
       int[] ointArray = new int[]{0x10100aa};
       int i = 0;
       f1.addState(ointArray, oq24);
       ointArray = new int[i];
       this.m.addState(ointArray, oq241);
       if ((td = this.d) == null) {
          td = 0x7f0705c4;
       }
       im1 ta = this.a;
       ta.setEndIconDrawable(td);
       ta.setEndIconContentDescription(ta.getResources().getText(R.string.exposed_dropdown_menu_content_description));
       ta.setEndIconOnClickListener(new k8(5, this));
       df1 th = this.h;
       ta.w0.add(th);
       if (ta.v != null) {
          th.a(ta);
       }
       ta.A0.add(this.i);
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       LinearInterpolator a = je.a;
       valueAnimato.setInterpolator(a);
       valueAnimato.setDuration((long)67);
       valueAnimato.addUpdateListener(new af6(4, this));
       this.q = valueAnimato;
       ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
       valueAnimato1.setInterpolator(a);
       valueAnimato1.setDuration((long)50);
       valueAnimato1.addUpdateListener(new af6(4, this));
       this.p = valueAnimato1;
       valueAnimato1.addListener(new g5(5, this));
       this.o = tb.getSystemService("accessibility");
       return;
    }
    public final boolean b(int p0){
       boolean b = (p0)? true: false;
       return b;
    }
    public final q24 e(float p0,float p1,float p2,int p3){
       ad6 uoad6 = new ad6(0);
       uoad6.e = new d0(p0);
       uoad6.f = new d0(p0);
       uoad6.h = new d0(p1);
       uoad6.g = new d0(p1);
       im1 tb = this.b;
       q24 oq24 = new q24();
       oq24.i(tb);
       oq24.k(ColorStateList.valueOf(ox7.G(R.attr.colorSurface, tb, q24.class.getSimpleName())));
       oq24.j(p2);
       oq24.setShapeAppearanceModel(new bd6(uoad6));
       q24 a = oq24.a;
       if (a.h == null) {
          a.h = new Rect();
       }
       oq24.a.h.set(0, p3, 0, p3);
       oq24.invalidateSelf();
       return oq24;
    }
    public final void f(boolean p0){
       if (this.k != p0) {
          this.k = p0;
          this.q.cancel();
          this.p.start();
       }
       return;
    }
}
