package com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import p.oy;
import android.graphics.Paint;
import android.os.Handler;
import p.em0;
import java.lang.Object;
import p.m02;
import android.graphics.Rect;
import p.xe7;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import p.xj0;
import java.lang.Class;
import p.ox7;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.PathInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import p.g5;
import android.animation.Animator$AnimatorListener;
import p.hr5;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Runnable;
import android.graphics.Canvas;
import p.b17;
import android.view.MotionEvent;
import android.view.ViewParent;
import p.wh7;
import p.dh7;
import java.util.ArrayList;
import p.mr5;

public class RecyclerViewFastScroller extends View	// class@000903 from classes.dex
{
    public boolean A;
    public final Handler B;
    public final em0 C;
    public final m02 D;
    public final Rect E;
    public int F;
    public ObjectAnimator G;
    public RecyclerView a;
    public final Drawable b;
    public final int c;
    public final int t;
    public boolean v;
    public final int w;
    public LinearLayoutManager x;
    public final oy y;
    public final Paint z;

    public void RecyclerViewFastScroller(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0304d1);
       this.y = new oy(this);
       Paint paint = new Paint();
       this.z = paint;
       this.B = new Handler();
       this.C = new em0(25, this);
       this.D = new m02(5, this);
       this.E = new Rect();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, xe7.C, R.attr.pasteRecyclerFastScrollerStyle, 0);
       Drawable drawable = typedArray.getDrawable(2);
       this.b = drawable;
       this.c = typedArray.getDimensionPixelSize(3, xj0.e0(72.00f, this.getResources()));
       this.t = typedArray.getDimensionPixelSize(4, xj0.e0(32.00f, this.getResources()));
       this.w = typedArray.getInt(0, 1000);
       typedArray.recycle();
       drawable.getClass();
       paint.setColor(typedArray.getColor(1, 0));
       this.setVisibility(4);
    }
    public final void a(){
       int i = (ox7.y(this))? - this.getMeasuredWidth(): this.getMeasuredWidth();
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[2];
       propertyValu[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0});
       float[] uofloatArray = new float[]{(float)i};
       propertyValu[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray);
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this, propertyValu);
       this.G = objectAnimat;
       objectAnimat.setDuration(200);
       this.G.setInterpolator(xj0.w0(this.a.getContext()));
       this.G.addListener(new g5(7, this));
       this.G.start();
       return;
    }
    public final void b(){
       if (!this.a.getLayoutManager() instanceof LinearLayoutManager) {
          throw new IllegalStateException("Must be instance of LinearLayoutManager!");
       }
       this.x = this.a.getLayoutManager();
       return;
    }
    public final void c(){
       RecyclerViewFastScroller tB = this.B;
       RecyclerViewFastScroller tC = this.C;
       tB.removeCallbacks(tC);
       tB.postDelayed(tC, (long)this.w);
    }
    public final void onDetachedFromWindow(){
       this.B.removeCallbacks(this.C);
       super.onDetachedFromWindow();
    }
    public final void onDraw(Canvas p0){
       int i3;
       int i4;
       RecyclerViewFastScroller ty = this.y;
       p0.drawRect(ty.b, this.z);
       RecyclerViewFastScroller tb = this.b;
       RecyclerViewFastScroller tE = this.E;
       tb.getPadding(tE);
       oy c = ty.c;
       int i = c.centerY();
       int i1 = i - (tb.getIntrinsicHeight() / 2);
       int i2 = (tb.getIntrinsicHeight() / 2) + i;
       if (ox7.y(this)) {
          i3 = c.left + tE.right;
          i4 = tb.getIntrinsicWidth() + i3;
       }else {
          Rect right = tE.right;
          i = (c.right - tb.getIntrinsicWidth()) - right;
          i4 = c.right - right;
          i3 = i;
       }
       tb.setBounds(i3, i1, i4, i2);
       tb.draw(p0);
       return;
    }
    public final void onMeasure(int p0,int p1){
       super.onMeasure(b17.s(this.t), p1);
       p0 = this.getMeasuredWidth();
       RecyclerViewFastScroller ty = this.y;
       ty.b.set(0, 0, p0, this.getMeasuredHeight());
       ty.c.set(0, 0, p0, this.c);
       ty.c();
    }
    public final boolean onTouchEvent(MotionEvent p0){
       int[] ointArray;
       int i;
       RecyclerViewFastScroller tb = this.b;
       RecyclerViewFastScroller ty = this.y;
       if (this.A != null && (!p0.getAction() && ty.c.contains((int)p0.getX(), (int)p0.getY()))) {
          this.v = true;
          this.getParent().requestDisallowInterceptTouchEvent(true);
          ointArray = new int[true];
          ointArray[0] = 0x10100a7;
          tb.setState(ointArray);
          this.c();
          return true;
       }else if(p0.getAction() == 2 && this.v != null){
          this.c();
          ty.getClass();
          ty.b(((p0.getY() - ((float)ty.c.height() / 2.00f)) / (float)ty.b.height()));
          this.b();
          if (i = (int)((float)this.x.O() * ty.a)) {
             this.x.D0(i);
          }else {
             this.x.r1(i, (- this.F));
          }
          dh7.k(this);
          return true;
       }else if(this.v != null && (p0.getAction() == 1 && p0.getAction() != 3)){
          this.c();
          ointArray = new int[0];
          tb.setState(ointArray);
          this.getParent().requestDisallowInterceptTouchEvent(0);
          this.v = false;
          return true;
       }else {
          return super.onTouchEvent(p0);
       }
    }
    public void setEnabled(boolean p0){
       super.setEnabled(p0);
       if (!p0) {
          RecyclerViewFastScroller tA = this.A;
          this.A = false;
          this.B.removeCallbacks(this.C);
          if (tA != null) {
             this.a();
          }
       }
       return;
    }
    public void setFirstItemDecorationHeight(int p0){
       this.F = p0;
    }
    public void setRecyclerView(RecyclerView p0){
       RecyclerView a0;
       RecyclerViewFastScroller ta = this.a;
       RecyclerViewFastScroller tD = this.D;
       if (ta != null) {
          if ((a0 = ta.A0) != null) {
             a0.remove(tD);
          }
          this.x = null;
       }
       this.a = p0;
       if (p0 != null) {
          p0.i(tD);
       }
       return;
    }
}
