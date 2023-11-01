package p.bz6;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.Object;
import android.graphics.RectF;
import p.yy6;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p.wh7;
import p.dh7;
import p.ye;
import android.animation.ValueAnimator;
import p.je;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p.gz;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.graphics.Canvas;
import p.eb3;
import android.os.Build$VERSION;
import android.graphics.PorterDuff$Mode;
import p.ce1;
import android.graphics.ColorFilter;
import android.content.res.ColorStateList;
import android.view.View$MeasureSpec;
import java.lang.Math;
import p.xe7;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;

public final class bz6 extends LinearLayout	// class@001167 from classes.dex
{
    public ValueAnimator a;
    public int b;
    public float c;
    public int t;
    public final TabLayout v;
    public static final int w;

    public void bz6(TabLayout p0,Context p1){
       this.v = p0;
       super(p1);
       this.b = -1;
       this.t = -1;
       this.setWillNotDraw(false);
    }
    public final void a(){
       bz6 tv = this.v;
       TabLayout c = tv.C;
       tv.W.getClass();
       RectF rectF = yy6.s(tv, this.getChildAt(this.b));
       c.setBounds((int)rectF.left, c.getBounds().top, (int)rectF.right, c.getBounds().bottom);
    }
    public final void b(int p0){
       bz6 tv = this.v;
       Rect bounds = tv.C.getBounds();
       tv.C.setBounds(bounds.left, 0, bounds.right, p0);
       this.requestLayout();
    }
    public final void c(View p0,View p1,float p2){
       int i = (p0 != null && p0.getWidth() > 0)? 1: 0;
       if (i) {
          bz6 tv = this.v;
          tv.W.B(tv, p0, p1, p2, tv.C);
       }else {
          bz6 tv1 = this.v;
          TabLayout c = tv1.C;
          c.setBounds(-1, c.getBounds().top, -1, tv1.C.getBounds().bottom);
       }
       dh7.k(this);
       return;
    }
    public final void d(int p0,boolean p1,int p2){
       View childAt1;
       View childAt = this.getChildAt(this.b);
       if ((childAt1 = this.getChildAt(p0)) == null) {
          this.a();
          return;
       }else {
          ye oye = new ye(this, childAt, childAt1, 1);
          if (p1) {
             ValueAnimator valueAnimato = new ValueAnimator();
             this.a = valueAnimato;
             valueAnimato.setInterpolator(je.b);
             valueAnimato.setDuration((long)p2);
             valueAnimato.setFloatValues(new float[2]{0,0x3f800000});
             valueAnimato.addUpdateListener(oye);
             valueAnimato.addListener(new gz(p0, 2, this));
             valueAnimato.start();
          }else {
             this.a.removeAllUpdateListeners();
             this.a.addUpdateListener(oye);
          }
          return;
       }
    }
    public final void draw(Canvas p0){
       int i;
       TabLayout p;
       int i2;
       bz6 tv = this.v;
       if ((i = tv.C.getBounds().height()) < 0) {
          i = tv.C.getIntrinsicHeight();
       }
       if ((p = tv.P) != null) {
          int i1 = 2;
          if (p != 1) {
             i2 = 0;
             if (p != i1) {
                i = (p != 3)? 0: this.getHeight();
             }
          }else {
             i2 = (this.getHeight() - i) / 2;
             i = (this.getHeight() + i) / 2;
          }
       }else {
          i2 = this.getHeight() - i;
          i = this.getHeight();
       }
       if (tv.C.getBounds().width() > 0) {
          Rect bounds = tv.C.getBounds();
          tv.C.setBounds(bounds.left, i2, bounds.right, i);
          TabLayout c = tv.C;
          if (tv.D != null) {
             c = eb3.L(c);
             if (Build$VERSION.SDK_INT == 21) {
                c.setColorFilter(tv.D, PorterDuff$Mode.SRC_IN);
             }else {
                ce1.g(c, tv.D);
             }
          }else if(Build$VERSION.SDK_INT == 21){
             c.setColorFilter(null);
          }else {
             ce1.h(c, null);
          }
          c.draw(p0);
       }
       super.draw(p0);
       return;
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       bz6 ta;
       super.onLayout(p0, p1, p2, p3, p4);
       if ((ta = this.a) != null && ta.isRunning()) {
          this.d(this.b, false, -1);
       }else {
          this.a();
       }
       return;
    }
    public final void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (View$MeasureSpec.getMode(p0) != 0x40000000) {
          return;
       }
       bz6 tv = this.v;
       int i = 2;
       int i1 = 1;
       if (tv.N == i1 || tv.Q == i) {
          int childCount = this.getChildCount();
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          while (i3 < childCount) {
             View childAt = this.getChildAt(i3);
             if (!childAt.getVisibility()) {
                i4 = Math.max(i4, childAt.getMeasuredWidth());
             }
             i3 = i3 + 1;
          }
          if (i4 <= 0) {
             return;
          }else if(((i4 * childCount)) <= (this.getMeasuredWidth() - ((int)xe7.q(this.getContext(), 16) * 2))){
             tv = 0;
             while (i2 < childCount) {
                LinearLayout$LayoutParams layoutParams = this.getChildAt(i2).getLayoutParams();
                if (layoutParams.width != i4 || (0 - layoutParams.weight)) {
                   layoutParams.width = i4;
                   layoutParams.weight = 0;
                   tv = 1;
                }
                i2 = i2 + 1;
             }
             i1 = tv;
          }else {
             tv.N = i2;
             tv.l(i2);
          }
          if (i1) {
             super.onMeasure(p0, p1);
          }
       }
       return;
    }
    public final void onRtlPropertiesChanged(int p0){
       super.onRtlPropertiesChanged(p0);
       if (Build$VERSION.SDK_INT < 23 && this.t != p0) {
          this.requestLayout();
          this.t = p0;
       }
       return;
    }
}
