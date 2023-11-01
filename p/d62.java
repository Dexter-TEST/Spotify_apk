package p.d62;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import p.lv1;
import android.content.res.TypedArray;
import p.wh7;
import android.view.View;
import p.eh7;
import java.lang.Integer;
import java.lang.Object;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import p.r14;
import android.view.View$MeasureSpec;
import com.google.android.material.chip.ChipGroup;
import java.lang.Math;

public abstract class d62 extends ViewGroup	// class@0012e7 from classes.dex
{
    public int a;
    public int b;
    public boolean c;
    public int t;

    public void d62(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f030107);
       this.c = false;
       TypedArray typedArray = p0.getTheme().obtainStyledAttributes(p1, lv1.q, false, false);
       this.a = typedArray.getDimensionPixelSize(1, false);
       this.b = typedArray.getDimensionPixelSize(false, false);
       typedArray.recycle();
    }
    public int getItemSpacing(){
       return this.b;
    }
    public int getLineSpacing(){
       return this.a;
    }
    public int getRowCount(){
       return this.t;
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i2;
       int i3;
       if (!this.getChildCount()) {
          this.t = 0;
          return;
       }else {
          this.t = 1;
          p4 = (eh7.d(this) == 1)? 1: 0;
          int paddingRight = (p4)? this.getPaddingRight(): this.getPaddingLeft();
          int paddingLeft = (p4)? this.getPaddingLeft(): this.getPaddingRight();
          int paddingTop = this.getPaddingTop();
          p3 = (p3 - p1) - paddingLeft;
          int i = paddingRight;
          p1 = paddingTop;
          paddingLeft = 0;
          while (paddingLeft < this.getChildCount()) {
             View childAt = this.getChildAt(paddingLeft);
             int i1 = 0x7f0a0551;
             if (childAt.getVisibility() == 8) {
                childAt.setTag(i1, Integer.valueOf(-1));
             }else {
                ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                   i2 = r14.c(layoutParams);
                   i3 = r14.b(layoutParams);
                }else {
                   i3 = 0;
                   i2 = 0;
                }
                int i4 = i + i2;
                int i5 = childAt.getMeasuredWidth() + i4;
                if (this.c == null && i5 > p3) {
                   p1 = this.a + paddingTop;
                   paddingTop = this.t + 1;
                   this.t = paddingTop;
                   i = paddingRight;
                }
                paddingTop = this.t - 1;
                childAt.setTag(i1, Integer.valueOf(paddingTop));
                paddingTop = i + i2;
                i1 = childAt.getMeasuredWidth() + paddingTop;
                i4 = childAt.getMeasuredHeight() + p1;
                if (p4) {
                   paddingTop = p3 - i1;
                   i1 = p3 - i;
                   i1 = i1 - i2;
                   childAt.layout(paddingTop, p1, i1, i4);
                }else {
                   childAt.layout(paddingTop, p1, i1, i4);
                }
                i2 = i2 + i3;
                paddingTop = childAt.getMeasuredWidth() + i2;
                paddingTop = paddingTop + this.b;
                i = i + paddingTop;
                paddingTop = i4;
             }
             paddingLeft = paddingLeft + 1;
          }
          return;
       }
    }
    public final void onMeasure(int p0,int p1){
       int i6;
       int i7;
       ViewGroup viewGroup = this;
       int size = View$MeasureSpec.getSize(p0);
       int mode = View$MeasureSpec.getMode(p0);
       int size1 = View$MeasureSpec.getSize(p1);
       int mode1 = View$MeasureSpec.getMode(p1);
       int i = 0x40000000;
       int i1 = (mode != Integer.MIN_VALUE && mode != i)? Integer.MAX_VALUE: size;
       int paddingLeft = this.getPaddingLeft();
       int paddingTop = this.getPaddingTop();
       i1 = i1 - this.getPaddingRight();
       int i2 = paddingTop;
       int i3 = 0;
       int i4 = 0;
       while (i3 < this.getChildCount()) {
          View childAt = viewGroup.getChildAt(i3);
          if (childAt.getVisibility() == 8) {
             int i5 = 0;
          }else {
             viewGroup.measureChild(childAt, p0, p1);
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                i7 = layoutParams.leftMargin + 0;
                i6 = layoutParams.rightMargin + 0;
             }else {
                i6 = 0;
                i7 = 0;
             }
             int i8 = paddingLeft + i7;
             if ((i = childAt.getMeasuredWidth() + i8) > i1 && viewGroup.c == null) {
                paddingLeft = this.getPaddingLeft();
                i2 = viewGroup.a + paddingTop;
             }
             i = paddingLeft + i7;
             paddingTop = childAt.getMeasuredWidth() + i;
             i = childAt.getMeasuredHeight() + i2;
             if (paddingTop > i4) {
                i4 = paddingTop;
             }
             i7 = i7 + i6;
             paddingTop = childAt.getMeasuredWidth() + i7;
             paddingTop = paddingTop + viewGroup.b;
             paddingTop = paddingTop + paddingLeft;
             paddingLeft = this.getChildCount() - 1;
             if (i3 == paddingLeft) {
                i4 = i4 + i6;
             }
             paddingLeft = paddingTop;
             paddingTop = i;
          }
          i3 = i3 + 1;
          i6 = Integer.MIN_VALUE;
       }
       i7 = this.getPaddingRight() + i4;
       i6 = this.getPaddingBottom() + paddingTop;
       if (mode != Integer.MIN_VALUE) {
          if (mode != 0x40000000) {
             size = i7;
          }
       }else {
          paddingLeft = 0x40000000;
          size = Math.min(i7, size);
       }
       if (mode1 != Integer.MIN_VALUE) {
          if (mode1 != 0x40000000) {
             size1 = i6;
          }
       }else {
          size1 = Math.min(i6, size1);
       }
       viewGroup.setMeasuredDimension(size, size1);
       return;
    }
    public void setItemSpacing(int p0){
       this.b = p0;
    }
    public void setLineSpacing(int p0){
       this.a = p0;
    }
    public void setSingleLine(boolean p0){
       this.c = p0;
    }
}
