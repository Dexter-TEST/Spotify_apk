package p.qz;
import android.widget.FrameLayout;
import p.pz;
import android.content.Context;
import android.util.AttributeSet;
import p.b17;
import android.view.View;
import p.lv1;
import android.content.res.TypedArray;
import p.wh7;
import p.jh7;
import android.content.res.ColorStateList;
import p.ry7;
import android.graphics.PorterDuff$Mode;
import p.xe7;
import android.view.View$OnTouchListener;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import p.eb3;
import p.ce1;
import p.dh7;
import p.vf;
import android.os.Build$VERSION;
import p.rz;
import android.view.WindowInsets;
import android.graphics.Insets;
import p.jy6;
import p.u3;
import java.lang.Class;
import java.lang.Object;
import p.hh7;
import p.qm6;
import p.mz;
import p.om6;
import java.lang.ref.Reference;
import p.em0;
import java.lang.Runnable;
import android.os.Handler;
import p.uv1;
import p.oz;
import android.view.View$MeasureSpec;
import p.nz;
import android.view.View$OnClickListener;

public abstract class qz extends FrameLayout	// class@002449 from classes.dex
{
    public oz a;
    public nz b;
    public int c;
    public final float t;
    public final float v;
    public final int w;
    public final int x;
    public ColorStateList y;
    public PorterDuff$Mode z;
    public static final pz A;

    static {
       qz.A = new pz();
    }
    public void qz(Context p0,AttributeSet p1){
       Drawable uDrawable;
       int i = 0;
       super(b17.D(p0, p1, i, i), p1);
       p0 = this.getContext();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, lv1.G);
       int i1 = 6;
       if (typedArray.hasValue(i1)) {
          jh7.s(this, (float)typedArray.getDimensionPixelSize(i1, i));
       }
       this.c = typedArray.getInt(2, i);
       this.t = typedArray.getFloat(3, 0x3f800000);
       this.setBackgroundTintList(ry7.x(p0, typedArray, 4));
       this.setBackgroundTintMode(xe7.R(typedArray.getInt(5, -1), PorterDuff$Mode.SRC_IN));
       this.v = typedArray.getFloat(1, 0x3f800000);
       this.w = typedArray.getDimensionPixelSize(i, -1);
       this.x = typedArray.getDimensionPixelSize(7, -1);
       typedArray.recycle();
       this.setOnTouchListener(qz.A);
       this.setFocusable(1);
       if (this.getBackground() == null) {
          GradientDrawable gradientDraw = new GradientDrawable();
          gradientDraw.setShape(i);
          gradientDraw.setCornerRadius(this.getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius));
          gradientDraw.setColor(ry7.M(ry7.w(this, R.attr.colorSurface), this.getBackgroundOverlayColorAlpha(), ry7.w(this, R.attr.colorOnSurface)));
          if (this.y != null) {
             uDrawable = eb3.L(gradientDraw);
             ce1.h(uDrawable, this.y);
          }else {
             uDrawable = eb3.L(gradientDraw);
          }
          dh7.q(this, uDrawable);
       }
       return;
    }
    public float getActionTextColorAlpha(){
       return this.v;
    }
    public int getAnimationMode(){
       return this.c;
    }
    public float getBackgroundOverlayColorAlpha(){
       return this.t;
    }
    public int getMaxInlineActionWidth(){
       return this.x;
    }
    public int getMaxWidth(){
       return this.w;
    }
    public final void onAttachedToWindow(){
       qz tb;
       WindowInsets rootWindowIn;
       super.onAttachedToWindow();
       if ((tb = this.b) != null) {
          if (Build$VERSION.SDK_INT >= 29) {
             if ((rootWindowIn = tb.b.c.getRootWindowInsets()) != null) {
                tb.b.k = u3.C(jy6.x(rootWindowIn));
                tb.b.e();
             }
          }else {
             tb.getClass();
          }
       }
       hh7.c(this);
       return;
    }
    public final void onDetachedFromWindow(){
       qz tb;
       super.onDetachedFromWindow();
       if ((tb = this.b) != null) {
          vf b = tb.b;
          b.getClass();
          qm6 oqm6 = qm6.b();
          rz n = b.n;
          qm6 a = oqm6.a;
          _monitor_enter(a);
          int i = 1;
          if (!oqm6.c(n)) {
             if ((oqm6 = oqm6.d) != null) {
                n = (n != null && oqm6.a.get() == n)? 1: 0;
                if (n) {
                   n = 1;
                label_0039 :
                   if (!n) {
                      i = 0;
                   }
                }
             }
             n = 0;
             goto label_0039 ;
          }
          _monitor_exit(a);
          if (i) {
             rz.o.post(new em0(17, tb));
          }
       }
       return;
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       qz ta;
       super.onLayout(p0, p1, p2, p3, p4);
       if ((ta = this.a) != null) {
          ta.b.c.setOnLayoutChangeListener(null);
          ta.b.d();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       qz tw;
       super.onMeasure(p0, p1);
       if ((tw = this.w) > null && this.getMeasuredWidth() > tw) {
          super.onMeasure(View$MeasureSpec.makeMeasureSpec(tw, 0x40000000), p1);
       }
       return;
    }
    public void setAnimationMode(int p0){
       this.c = p0;
    }
    public void setBackground(Drawable p0){
       this.setBackgroundDrawable(p0);
    }
    public void setBackgroundDrawable(Drawable p0){
       if (p0 != null && this.y != null) {
          p0 = eb3.L(p0.mutate());
          ce1.h(p0, this.y);
          ce1.i(p0, this.z);
       }
       super.setBackgroundDrawable(p0);
       return;
    }
    public void setBackgroundTintList(ColorStateList p0){
       this.y = p0;
       if (this.getBackground() != null) {
          Drawable uDrawable = eb3.L(this.getBackground().mutate());
          ce1.h(uDrawable, p0);
          ce1.i(uDrawable, this.z);
          if (uDrawable != this.getBackground()) {
             super.setBackgroundDrawable(uDrawable);
          }
       }
       return;
    }
    public void setBackgroundTintMode(PorterDuff$Mode p0){
       this.z = p0;
       if (this.getBackground() != null) {
          Drawable uDrawable = eb3.L(this.getBackground().mutate());
          ce1.i(uDrawable, p0);
          if (uDrawable != this.getBackground()) {
             super.setBackgroundDrawable(uDrawable);
          }
       }
       return;
    }
    public void setOnAttachStateChangeListener(nz p0){
       this.b = p0;
    }
    public void setOnClickListener(View$OnClickListener p0){
       View$OnTouchListener onTouchListe = (p0 != null)? null: qz.A;
       this.setOnTouchListener(onTouchListe);
       super.setOnClickListener(p0);
       return;
    }
    public void setOnLayoutChangeListener(oz p0){
       this.a = p0;
    }
}
