package com.spotify.legacyglue.viewgroup.AspectRatioView;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p.is7;
import android.content.res.TypedArray;
import java.lang.IllegalStateException;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import p.b17;
import android.view.View$MeasureSpec;
import java.lang.Object;
import com.spotify.base.java.logging.Logger;
import java.lang.Math;

public class AspectRatioView extends ViewGroup	// class@000905 from classes.dex
{
    public float a;
    public boolean b;
    public boolean c;
    public boolean t;
    public int v;
    public int w;

    public void AspectRatioView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = 0x3f800000;
       this.setWillNotDraw(true);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, is7.C);
       this.a = typedArray.getFraction(2, true, true, this.a);
       this.b = typedArray.getBoolean(true, this.b);
       this.c = typedArray.getBoolean(0, this.c);
       this.t = typedArray.getBoolean(5, this.t);
       this.v = typedArray.getDimensionPixelSize(4, this.v);
       this.w = typedArray.getDimensionPixelSize(3, this.w);
       typedArray.recycle();
    }
    public final void addView(View p0){
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("AspectRatioView can host only one direct child.");
       }
       super.addView(p0);
       return;
    }
    public final void addView(View p0,int p1){
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("AspectRatioView can host only one direct child.");
       }
       super.addView(p0, p1);
       return;
    }
    public final void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("AspectRatioView can host only one direct child.");
       }
       super.addView(p0, p1, p2);
       return;
    }
    public final void addView(View p0,ViewGroup$LayoutParams p1){
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("AspectRatioView can host only one direct child.");
       }
       super.addView(p0, p1);
       return;
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int paddingTop = this.getPaddingTop();
       p1 = this.getPaddingLeft();
       p2 = this.getChildCount();
       for (p3 = 0; p3 < p2; p3++) {
          View childAt = this.getChildAt(p3);
          int i = childAt.getMeasuredWidth() + p1;
          int i1 = childAt.getMeasuredHeight() + paddingTop;
          childAt.layout(p1, paddingTop, i, i1);
       }
       return;
    }
    public final void onMeasure(int p0,int p1){
       View childAt;
       ViewGroup$LayoutParams width;
       int i1;
       int size;
       int i3;
       int i = 0;
       if ((childAt = this.getChildAt(i)) != null && childAt.getLayoutParams() != null) {
          ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
          width = layoutParams.width;
          i1 = 1;
          int i2 = (width >= null)? 1: 0;
          if (i2) {
             i2 = (layoutParams.height >= null)? 1: 0;
             if (i2) {
                throw new IllegalStateException("Child supplied to AspectRatioView cannot have both dimensions set to exact");
             }
          }
          width = (width >= null)? 1: 0;
          if (width) {
             if (!b17.q(p0)) {
                size = View$MeasureSpec.getSize(layoutParams.width);
                i3 = 0;
             }else {
                throw new IllegalStateException("Both child and AspectRatioView have exact width dimension.");
             }
          }else if(layoutParams.height >= null){
             i3 = 1;
          }else {
             i3 = 0;
          }
          if (i3) {
             if (!b17.q(p1)) {
                i3 = View$MeasureSpec.getSize(layoutParams.height);
                size = 0;
             }else {
                throw new IllegalStateException("Both child and AspectRatioView have exact height dimension.");
             }
          }else {
          label_006a :
             size = 0;
             i3 = 0;
             i1 = 0;
          }
       }else {
          goto label_006a ;
       }
       if (!i1) {
          size = View.getDefaultSize(this.getSuggestedMinimumWidth(), p0);
          i3 = View.getDefaultSize(this.getSuggestedMinimumHeight(), p1);
       }
       if (!size && !i3) {
          Object[] objArray = new Object[i];
          Logger.i("With both width and height set to zero, it is impossible to calculate and enforce aspect ratio.", objArray);
          super.onMeasure(p0, p1);
          return;
       }else {
          int i4 = this.getPaddingRight() + this.getPaddingLeft();
          int i5 = this.getPaddingBottom() + this.getPaddingTop();
          if (size && !b17.q(p1)) {
             if (i3 && !b17.q(p0)) {
                if ((((float)size / (float)i3) - this.a) > 0) {
                   if (this.t == null || (View$MeasureSpec.getMode(p1) != 0x40000000 || this.c == null)) {
                      i3 = Math.round(((float)(size - this.v) / this.a));
                   }
                }else if(this.t != null && (View$MeasureSpec.getMode(p0) == 0x40000000 && this.b != null)){
                   size = Math.round(((float)(i3 - this.w) * this.a));
                }
             }else {
                i3 = Math.max(i3, (Math.round(((float)size / this.a)) + this.w));
             }
          }else {
             size = Math.max(size, (Math.round(((float)i3 * this.a)) + this.v));
          }
          if (i1) {
             size = size + i4;
             i3 = i3 + i5;
          }
          this.setMeasuredDimension(b17.s(size), b17.s(i3));
          this.measureChildren(Math.max(i, b17.s(size)), Math.max(i, b17.s(i3)));
          return;
       }
    }
    public void setAllowTaller(boolean p0){
       this.c = p0;
    }
    public void setAllowWider(boolean p0){
       this.b = p0;
    }
    public void setAspectRatio(float p0){
       this.a = p0;
    }
    public void setExtraHeight(int p0){
       this.w = p0;
    }
    public void setExtraWidth(int p0){
       this.v = p0;
    }
    public void setRespectExactMeasures(boolean p0){
       this.t = p0;
    }
}
