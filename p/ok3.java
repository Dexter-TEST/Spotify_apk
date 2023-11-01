package p.ok3;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import p.ej4;
import p.p86;
import android.content.res.TypedArray;
import android.view.View;
import p.wh7;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import p.nk3;
import android.graphics.Canvas;
import java.lang.RuntimeException;
import java.lang.String;
import android.widget.LinearLayout$LayoutParams;
import p.bl7;
import android.view.accessibility.AccessibilityEvent;
import java.lang.CharSequence;
import android.view.accessibility.AccessibilityRecord;
import android.view.accessibility.AccessibilityNodeInfo;
import p.eh7;
import android.view.Gravity;
import android.view.View$MeasureSpec;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public abstract class ok3 extends ViewGroup	// class@002139 from classes.dex
{
    public int[] A;
    public Drawable B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean a;
    public int b;
    public int c;
    public int t;
    public int v;
    public int w;
    public float x;
    public boolean y;
    public int[] z;

    public void ok3(Context p0,AttributeSet p1,int p2){
       boolean i;
       super(p0, p1, p2);
       this.a = true;
       this.b = -1;
       this.c = 0;
       this.v = 0x800033;
       int[] q = ej4.Q;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, q, p2, 0);
       p86 op86 = new p86(p0, typedArray);
       wh7.n(this, p0, q, p1, typedArray, p2);
       if ((i = op86.h(true, -1)) >= 0) {
          this.setOrientation(i);
       }
       if ((i = op86.h(0, -1)) >= 0) {
          this.setGravity(i);
       }
       if (!(i = op86.a(2, true))) {
          this.setBaselineAligned(i);
       }
       this.x = typedArray.getFloat(4, 0xbf800000);
       this.b = op86.h(3, -1);
       this.y = op86.a(7, 0);
       this.setDividerDrawable(op86.e(5));
       this.E = op86.h(8, 0);
       this.F = op86.d(6, 0);
       op86.o();
       return;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof nk3;
    }
    public final void d(Canvas p0,int p1){
       this.B.setBounds((this.getPaddingLeft() + this.F), p1, ((this.getWidth() - this.getPaddingRight()) - this.F), (this.D + p1));
       this.B.draw(p0);
    }
    public final void e(Canvas p0,int p1){
       this.B.setBounds(p1, (this.getPaddingTop() + this.F), (this.C + p1), ((this.getHeight() - this.getPaddingBottom()) - this.F));
       this.B.draw(p0);
    }
    public nk3 f(){
       ok3 tt;
       if ((tt = this.t) == null) {
          return new nk3(-2);
       }
       if (tt == 1) {
          return new nk3(-1);
       }
       return null;
    }
    public nk3 g(AttributeSet p0){
       return new nk3(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return this.f();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.g(p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return this.h(p0);
    }
    public int getBaseline(){
       int i1;
       if (this.b < null) {
          return super.getBaseline();
       }
       ok3 tb = this.b;
       if (this.getChildCount() <= tb) {
          throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
       }
       View childAt = this.getChildAt(tb);
       int baseline = childAt.getBaseline();
       int i = -1;
       if (baseline == i) {
          if (this.b == null) {
             return i;
          }else {
             throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline.");
          }
       }else {
          ok3 tc = this.c;
          if (this.t == 1 && (i1 = this.v & 0x70) != 48) {
             if (i1 != 16) {
                if (i1 == 80) {
                   tc = ((this.getBottom() - this.getTop()) - this.getPaddingBottom()) - this.w;
                }
             }else {
                tc = tc + (((((this.getBottom() - this.getTop()) - this.getPaddingTop()) - this.getPaddingBottom()) - this.w) / 2);
             }
          }
          return ((tc + childAt.getLayoutParams().topMargin) + baseline);
       }
    }
    public int getBaselineAlignedChildIndex(){
       return this.b;
    }
    public Drawable getDividerDrawable(){
       return this.B;
    }
    public int getDividerPadding(){
       return this.F;
    }
    public int getDividerWidth(){
       return this.C;
    }
    public int getGravity(){
       return this.v;
    }
    public int getOrientation(){
       return this.t;
    }
    public int getShowDividers(){
       return this.E;
    }
    public int getVirtualChildCount(){
       return this.getChildCount();
    }
    public float getWeightSum(){
       return this.x;
    }
    public nk3 h(ViewGroup$LayoutParams p0){
       return new nk3(p0);
    }
    public final boolean i(int p0){
       boolean b = false;
       if (!p0) {
          if ((this.E & 1)) {
             b = true;
          }
          return b;
       }else if(p0 == this.getChildCount()){
          if ((this.E & 0x04)) {
             b = true;
          }
          return b;
       }else if((this.E & 0x02)){
          p0 = p0 - 1;
          while (p0 >= 0) {
             if (this.getChildAt(p0).getVisibility() != 8) {
                b = true;
                break ;
             }
             p0--;
          }
       }
       return b;
    }
    public final void onDraw(Canvas p0){
       int virtualChild;
       View childAt;
       boolean i2;
       View childAt1;
       View childAt2;
       int i3;
       ok3 tC;
       if (this.B == null) {
          return;
       }
       int i = 8;
       int i1 = 0;
       if (this.t == 1) {
          virtualChild = this.getVirtualChildCount();
          while (i1 < virtualChild) {
             if ((childAt = this.getChildAt(i1)) != null && (childAt.getVisibility() != i && this.i(i1))) {
                i2 = childAt.getTop() - childAt.getLayoutParams().topMargin;
                i2 = i2 - this.D;
                this.d(p0, i2);
             }
             i1 = i1 + 1;
          }
          if (this.i(virtualChild)) {
             virtualChild = ((childAt1 = this.getChildAt((virtualChild - 1))) == null)? (this.getHeight() - this.getPaddingBottom()) - this.D: childAt1.getBottom() + childAt1.getLayoutParams().bottomMargin;
             this.d(p0, virtualChild);
          }
       }else {
          virtualChild = this.getVirtualChildCount();
          i2 = bl7.a(this);
          while (i1 < virtualChild) {
             if ((childAt2 = this.getChildAt(i1)) != null && (childAt2.getVisibility() != i && this.i(i1))) {
                nk3 layoutParams = childAt2.getLayoutParams();
                if (i2) {
                   i3 = childAt2.getRight() + layoutParams.rightMargin;
                }else {
                   i3 = childAt2.getLeft() - layoutParams.leftMargin;
                   i3 = i3 - this.C;
                }
                this.e(p0, i3);
             }
             i1 = i1 + 1;
          }
          if (this.i(virtualChild)) {
             if ((childAt1 = this.getChildAt((virtualChild - 1))) == null) {
                if (i2) {
                   virtualChild = this.getPaddingLeft();
                }else {
                   virtualChild = this.getWidth() - this.getPaddingRight();
                   tC = this.C;
                label_00d6 :
                   virtualChild = virtualChild - tC;
                }
             }else {
                nk3 layoutParams1 = childAt1.getLayoutParams();
                if (i2) {
                   virtualChild = childAt1.getLeft() - layoutParams1.leftMargin;
                   tC = this.C;
                   goto label_00d6 ;
                }else {
                   virtualChild = childAt1.getRight() + layoutParams1.rightMargin;
                }
             }
             this.e(p0, virtualChild);
          }
       }
       return;
    }
    public final void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       super.onInitializeAccessibilityEvent(p0);
       p0.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo p0){
       super.onInitializeAccessibilityNodeInfo(p0);
       p0.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int paddingLeft;
       int i7;
       ok3 v;
       View childAt;
       int measuredHeig;
       LinearLayout$LayoutParams gravity;
       int i10;
       View childAt1;
       int i13;
       LinearLayout$LayoutParams gravity1;
       int i14;
       ok3 ook3 = this;
       int i = 80;
       int i1 = 16;
       int i2 = 8;
       int i3 = 5;
       int i4 = 0x800007;
       int i5 = 2;
       int i6 = 1;
       if (ook3.t == i6) {
          paddingLeft = this.getPaddingLeft();
          i7 = p3 - p1;
          int i8 = i7 - this.getPaddingRight();
          i7 = (i7 - paddingLeft) - this.getPaddingRight();
          int virtualChild = this.getVirtualChildCount();
          v = ook3.v;
          int i9 = v & 0x70;
          i4 = i4 & v;
          if (i9 != i1) {
             i = (i9 != i)? this.getPaddingTop(): ((this.getPaddingTop() + p4) - p2) - ook3.w;
          }else {
             i = this.getPaddingTop() + (((p4 - p2) - ook3.w) / i5);
          }
          i1 = 0;
          while (i1 < virtualChild) {
             if ((childAt = ook3.getChildAt(i1)) == null) {
                i = i + 0;
             }else if(childAt.getVisibility() != i2){
                i9 = childAt.getMeasuredWidth();
                measuredHeig = childAt.getMeasuredHeight();
                ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                if ((gravity = layoutParams.gravity) < null) {
                   gravity = i4;
                }
                if ((i5 = Gravity.getAbsoluteGravity(gravity, eh7.d(this)) & 0x07) != i6) {
                   if (i5 != i3) {
                      i5 = layoutParams.leftMargin + paddingLeft;
                   label_0098 :
                      if (ook3.i(i1)) {
                         i = i + ook3.D;
                      }
                      i = i + layoutParams.topMargin;
                      i10 = i + 0;
                      i9 = i9 + i5;
                      i3 = measuredHeig + i10;
                      childAt.layout(i5, i10, i9, i3);
                      measuredHeig = measuredHeig + layoutParams.bottomMargin;
                      measuredHeig = measuredHeig + 0;
                      measuredHeig = measuredHeig + i;
                      i1 = i1 + 0;
                      i = measuredHeig;
                   }else {
                      i5 = i8 - i9;
                      gravity = layoutParams.rightMargin;
                   }
                }else {
                   i5 = i7 - i9;
                   i5 = i5 / 2;
                   i5 = i5 + paddingLeft;
                   i5 = i5 + layoutParams.leftMargin;
                   gravity = layoutParams.rightMargin;
                }
                i5 = i5 - gravity;
                goto label_0098 ;
             }
             i1 = i1 + i6;
             i2 = 8;
             i3 = 5;
             i5 = 2;
          }
       }else {
          paddingLeft = bl7.a(this);
          i2 = this.getPaddingTop();
          i3 = p4 - p2;
          i5 = i3 - this.getPaddingBottom();
          i3 = (i3 - i2) - this.getPaddingBottom();
          i10 = this.getVirtualChildCount();
          ok3 v1 = ook3.v;
          i4 = i4 & v1;
          i7 = v1 & 0x70;
          ok3 a = ook3.a;
          ok3 z = ook3.z;
          v = ook3.A;
          if ((i4 = Gravity.getAbsoluteGravity(i4, eh7.d(this))) != i6) {
             i4 = (i4 != 5)? this.getPaddingLeft(): ((this.getPaddingLeft() + p3) - p1) - ook3.w;
          }else {
             i4 = this.getPaddingLeft() + (((p3 - p1) - ook3.w) / 2);
          }
          if (paddingLeft) {
             paddingLeft = i10 - 1;
             measuredHeig = -1;
          }else {
             paddingLeft = 0;
             measuredHeig = 1;
          }
          int i11 = i4;
          i4 = 0;
          while (i4 < i10) {
             int i12 = measuredHeig * i4;
             i6 = i12 + paddingLeft;
             if ((childAt1 = ook3.getChildAt(i6)) == null) {
                i11 = i11 + 0;
             }else if(childAt1.getVisibility() != 8){
                i1 = childAt1.getMeasuredWidth();
                int measuredHeig1 = childAt1.getMeasuredHeight();
                ViewGroup$LayoutParams layoutParams1 = childAt1.getLayoutParams();
                if (a != null) {
                   p2 = paddingLeft;
                   p4 = i10;
                   if (layoutParams1.height != -1) {
                      i10 = childAt1.getBaseline();
                   label_015c :
                      if ((gravity1 = layoutParams1.gravity) < null) {
                         gravity1 = i7;
                      }
                      paddingLeft = gravity1 & 0x70;
                      i13 = i7;
                      if (paddingLeft != 16) {
                         if (paddingLeft != 48) {
                            if (paddingLeft != 80) {
                               paddingLeft = i2;
                               v1 = -1;
                            }else {
                               paddingLeft = i5 - measuredHeig1;
                               paddingLeft = paddingLeft - layoutParams1.bottomMargin;
                               if (i10 != -1) {
                                  i14 = childAt1.getMeasuredHeight() - i10;
                                  int i15 = v[2] - i14;
                                  paddingLeft = paddingLeft - i15;
                               }
                            }
                         }else {
                            paddingLeft = layoutParams1.topMargin + i2;
                            if (i10 != -1) {
                               i14 = z[1] - i10;
                               paddingLeft = i14 + paddingLeft;
                            }
                         }
                      }else {
                         paddingLeft = i3 - measuredHeig1;
                         paddingLeft = paddingLeft / 2;
                         paddingLeft = paddingLeft + i2;
                         paddingLeft = paddingLeft + layoutParams1.topMargin;
                         paddingLeft = paddingLeft - layoutParams1.bottomMargin;
                      }
                      if (ook3.i(i6)) {
                         i11 = i11 + ook3.C;
                      }
                      i11 = i11 + layoutParams1.leftMargin;
                      i10 = i11 + 0;
                      i6 = i1 + i10;
                      i7 = measuredHeig1 + paddingLeft;
                      childAt1.layout(i10, paddingLeft, i6, i7);
                      i1 = i1 + layoutParams1.rightMargin;
                      i1 = i1 + 0;
                      i11 = i1 + i11;
                      i4 = i4 + 0;
                   label_012c :
                      i = 1;
                      i4 = i4 + i;
                      paddingLeft = p2;
                      i10 = p4;
                      i7 = i13;
                      i6 = 1;
                   }
                }else {
                   p2 = paddingLeft;
                   p4 = i10;
                }
                i10 = -1;
                goto label_015c ;
             }
             p2 = paddingLeft;
             p4 = i10;
             i13 = i7;
             paddingLeft = 0;
             goto label_012c ;
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int virtualChild;
       int mode;
       int mode1;
       ok3 b;
       int i11;
       int i12;
       float f;
       int i15;
       int i16;
       View childAt;
       int i17;
       ok3 ook31;
       int i18;
       int i19;
       int i20;
       int i21;
       ok3 w;
       int i22;
       ViewGroup$LayoutParams layoutParams1;
       ok3 w1;
       ok3 w2;
       View childAt1;
       nk3 layoutParams2;
       ok3 w3;
       ok3 x;
       View childAt2;
       LinearLayout$LayoutParams weight1;
       int i23;
       ok3 w4;
       int i24;
       View childAt3;
       ViewGroup$LayoutParams layoutParams4;
       LinearLayout$LayoutParams height;
       int[] ointArray;
       View childAt4;
       int i26;
       ok3 ook32;
       ok3 ook33;
       ViewGroup$LayoutParams layoutParams6;
       int i27;
       int i28;
       int i29;
       LinearLayout$LayoutParams gravity;
       ok3 w5;
       View childAt5;
       View childAt6;
       float f6;
       LinearLayout$LayoutParams gravity1;
       ok3 ook3 = this;
       int i = p0;
       int i1 = p1;
       int i2 = -2;
       int i3 = Integer.MIN_VALUE;
       int i4 = 8;
       int i5 = 0;
       int i6 = 0x40000000;
       int i7 = 0;
       if (ook3.t == 1) {
          ook3.w = i7;
          virtualChild = this.getVirtualChildCount();
          mode = View$MeasureSpec.getMode(p0);
          mode1 = View$MeasureSpec.getMode(p1);
          b = ook3.b;
          ok3 y = ook3.y;
          int i8 = 0;
          int i9 = 0;
          int i10 = 0;
          i11 = 0;
          i12 = 0;
          int i13 = 0;
          f = 0;
          int i14 = 0;
          i15 = 1;
          i16 = 0;
          while (true) {
             if (i8 < virtualChild) {
                if ((childAt = ook3.getChildAt(i8)) == null) {
                   i17 = ook3.w + i7;
                   ook3.w = i17;
                }else if(childAt.getVisibility() == i4){
                   i8 = i8 + 0;
                }else if(ook3.i(i8)){
                   i17 = ook3.w + ook3.D;
                   ook3.w = i17;
                }
                ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                LinearLayout$LayoutParams weight = layoutParams.weight;
                f = f + weight;
                if (mode1 == i6 && (layoutParams.height == null && (i5 - weight) > 0)) {
                   w = ook3.w;
                   i4 = layoutParams.topMargin + w;
                   i4 = i4 + layoutParams.bottomMargin;
                   ook3.w = Math.max(w, i4);
                   ook31 = b;
                   i18 = mode1;
                   i22 = mode;
                   i20 = virtualChild;
                   layoutParams1 = layoutParams;
                   w = 1;
                   i21 = 1;
                }else if(layoutParams.height == null && (i5 - weight) > 0){
                   layoutParams.height = i2;
                   i4 = 0;
                }else {
                   i4 = Integer.MIN_VALUE;
                }
                w = 0;
                w1 = (!(i5 - f))? ook3.w: 0;
                ook31 = b;
                i18 = mode1;
                i22 = mode;
                i20 = virtualChild;
                layoutParams1 = layoutParams;
                this.measureChildWithMargins(childAt, p0, w, p1, w1);
                if (i4 != i3) {
                   layoutParams1.height = i4;
                }
                i19 = childAt.getMeasuredHeight();
                w2 = ook3.w;
                mode = w2 + i19;
                mode = mode + layoutParams1.topMargin;
                mode = mode + layoutParams1.bottomMargin;
                mode = mode + 0;
                ook3.w = Math.max(w2, mode);
                if (y != null) {
                   i11 = Math.max(i19, i11);
                }else {
                   i7 = i11;
                }
                i17 = i14;
                if (ook31 >= null) {
                   i19 = i8 + 1;
                   if (ook31 == i19) {
                      ook3.c = ook3.w;
                   }
                }
                if (i8 < ook31 && (0 - layoutParams1.weight) > 0) {
                   throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex.");
                }else if((i19 = i22) != 0x40000000 && layoutParams1.width == -1){
                   layoutParams = 1;
                   i16 = 1;
                }else {
                   layoutParams = 0;
                }
                mode1 = layoutParams1.leftMargin + layoutParams1.rightMargin;
                mode = childAt.getMeasuredWidth() + mode1;
                virtualChild = Math.max(i13, mode);
                i4 = View.combineMeasuredStates(i10, childAt.getMeasuredState());
                i3 = (i15 && layoutParams1.width == -1)? 1: 0;
                if ((0 - layoutParams1.weight) > 0) {
                   if (!layoutParams) {
                      mode1 = mode;
                   }
                   i12 = Math.max(i12, mode1);
                }else {
                   i5 = i12;
                   if (!layoutParams) {
                      mode1 = mode;
                   }
                   i9 = Math.max(i9, mode1);
                   i12 = i5;
                }
                i8 = i8 + 0;
                i13 = virtualChild;
                i14 = w;
                i15 = i3;
             label_0164 :
                i8 = i8 + 1;
                mode = i19;
                b = ook31;
                i10 = i4;
                mode1 = i18;
                virtualChild = i20;
                i7 = 0;
                i2 = -2;
                i3 = Integer.MIN_VALUE;
                i4 = 8;
                i5 = 0;
                i6 = 0x40000000;
                ook31 = b;
                i18 = mode1;
                i19 = mode;
                i20 = virtualChild;
                i4 = i10;
                i21 = 1;
                goto label_0164 ;
             }else {
                i18 = mode1;
                i19 = mode;
                mode = i9;
                i6 = i10;
                i7 = i11;
                i5 = i12;
                virtualChild = i13;
                i2 = virtualChild;
                if (ook3.w > null && ook3.i(i2)) {
                   ook3.w = ook3.w + ook3.D;
                }
                mode1 = i18;
                if (y != null && (mode1 == Integer.MIN_VALUE && mode1)) {
                   i17 = 0;
                   ook3.w = i17;
                   i3 = 0;
                   while (i3 < i2) {
                      if ((childAt1 = ook3.getChildAt(i3)) == null) {
                         i4 = ook3.w + i17;
                         ook3.w = i4;
                      }else if(childAt1.getVisibility() == 8){
                         i3 = i3 + 0;
                      }else {
                         layoutParams2 = childAt1.getLayoutParams();
                         w3 = ook3.w;
                         i11 = w3 + i7;
                         i11 = i11 + layoutParams2.topMargin;
                         i11 = i11 + layoutParams2.bottomMargin;
                         i8 = i11 + 0;
                         ook3.w = Math.max(w3, i8);
                      }
                      i3 = i3 + 1;
                      i17 = 0;
                   }
                }
                i4 = (this.getPaddingBottom() + this.getPaddingTop()) + ook3.w;
                ook3.w = i4;
                i17 = View.resolveSizeAndState(Math.max(i4, this.getSuggestedMinimumHeight()), i1, 0);
                i3 = (0xffffff & i17) - ook3.w;
                if (!i14 && (!i3 && (0 - f) > 0)) {
                   mode = Math.max(mode, i5);
                   if (y != null && mode1 != 0x40000000) {
                      mode1 = 0;
                      while (mode1 < i2) {
                         if ((childAt2 = ook3.getChildAt(mode1)) != null && (childAt2.getVisibility() != 8 && (0 - childAt2.getLayoutParams().weight) > 0)) {
                            i4 = 0x40000000;
                            childAt2.measure(View$MeasureSpec.makeMeasureSpec(childAt2.getMeasuredWidth(), i4), View$MeasureSpec.makeMeasureSpec(i7, i4));
                         }
                         mode1 = mode1 + 1;
                      }
                   }
                }else {
                   x = ook3.x;
                   if ((0 - x) > 0) {
                      f = x;
                   }
                   ook3.w = 0;
                   i7 = 0;
                   while (i7 < i2) {
                      childAt2 = ook3.getChildAt(i7);
                      if (childAt2.getVisibility() == 8) {
                         i18 = mode1;
                      }else {
                         nk3 layoutParams3 = childAt2.getLayoutParams();
                         weight1 = layoutParams3.weight;
                         if ((0 - weight1) > 0) {
                            float f1 = (float)i3 * weight1;
                            f1 = f1 / f;
                            i5 = (int)f1;
                            f = f - weight1;
                            i3 = i3 - i5;
                            i23 = this.getPaddingRight() + this.getPaddingLeft();
                            i23 = i23 + layoutParams3.leftMargin;
                            i8 = i23 + layoutParams3.rightMargin;
                            i23 = i3;
                            i3 = ViewGroup.getChildMeasureSpec(i, i8, layoutParams3.width);
                            if (layoutParams3.height == null) {
                               i8 = 0x40000000;
                               if (mode1 == i8) {
                                  if (i5 <= 0) {
                                     i5 = 0;
                                  }
                                  childAt2.measure(i3, View$MeasureSpec.makeMeasureSpec(i5, i8));
                               label_02c7 :
                                  i3 = childAt2.getMeasuredState() & 0xff00;
                                  i6 = View.combineMeasuredStates(i6, i3);
                                  i3 = i23;
                               }
                            }else {
                               i8 = 0x40000000;
                            }
                            if ((i5 = childAt2.getMeasuredHeight() + i5) < 0) {
                               i5 = 0;
                            }
                            childAt2.measure(i3, View$MeasureSpec.makeMeasureSpec(i5, i8));
                            goto label_02c7 ;
                         }
                         i8 = layoutParams3.leftMargin + layoutParams3.rightMargin;
                         i5 = childAt2.getMeasuredWidth() + i8;
                         virtualChild = Math.max(virtualChild, i5);
                         i18 = mode1;
                         if (i19 != 0x40000000) {
                            i23 = virtualChild;
                            virtualChild = -1;
                            if (layoutParams3.width == virtualChild) {
                               w2 = 1;
                            label_02f4 :
                               if (!w2) {
                                  i8 = i5;
                               }
                               mode1 = Math.max(mode, i8);
                               mode = (i15 && layoutParams3.width == virtualChild)? 1: 0;
                               w4 = ook3.w;
                               i9 = childAt2.getMeasuredHeight() + w4;
                               i24 = i9 + layoutParams3.topMargin;
                               i24 = i24 + layoutParams3.bottomMargin;
                               i24 = i24 + 0;
                               ook3.w = Math.max(w4, i24);
                               i15 = mode;
                               virtualChild = i23;
                               mode = mode1;
                            }
                         }else {
                            i23 = virtualChild;
                            w4 = -1;
                         }
                         w2 = 0;
                         goto label_02f4 ;
                      }
                      i7 = i7 + 1;
                      mode1 = i18;
                   }
                   ook3.w = (this.getPaddingBottom() + this.getPaddingTop()) + ook3.w;
                }
                i13 = virtualChild;
                if (i15 || i19 == 0x40000000) {
                   mode = i13;
                }
                ook3.setMeasuredDimension(View.resolveSizeAndState(Math.max(((this.getPaddingRight() + this.getPaddingLeft()) + mode), this.getSuggestedMinimumWidth()), i, i6), i17);
                if (i16) {
                   i = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000);
                   i24 = 0;
                   while (i24 < i2) {
                      childAt3 = ook3.getChildAt(i24);
                      if (childAt3.getVisibility() != 8) {
                         layoutParams4 = childAt3.getLayoutParams();
                         if (layoutParams4.width == -1) {
                            height = layoutParams4.height;
                            layoutParams4.height = childAt3.getMeasuredHeight();
                            this.measureChildWithMargins(childAt3, i, 0, p1, 0);
                            layoutParams4.height = height;
                         }
                      }
                      i24 = i24 + 1;
                   }
                }
             }
          }
       }else {
          ook3.w = 0;
          i24 = this.getVirtualChildCount();
          i2 = View$MeasureSpec.getMode(p0);
          i3 = View$MeasureSpec.getMode(p1);
          i4 = 4;
          if (ook3.z == null || ook3.A == null) {
             ointArray = new int[i4];
             ook3.z = ointArray;
             ointArray = new int[i4];
             ook3.A = ointArray;
          }
          ok3 z = ook3.z;
          ok3 a = ook3.A;
          i6 = 3;
          z[i6] = -1;
          z[2] = -1;
          z[1] = -1;
          mode1 = 0;
          z[mode1] = -1;
          a[i6] = -1;
          a[2] = -1;
          a[1] = -1;
          a[mode1] = -1;
          x = ook3.a;
          w = ook3.y;
          i11 = (i2 == 0x40000000)? 1: 0;
          ointArray = 0;
          float f2 = 0;
          mode = 0;
          virtualChild = 0;
          i4 = 0;
          i6 = 0;
          i12 = 1;
          f = 0;
          i15 = 0;
          int i25 = 0;
          while (virtualChild < i24) {
             if ((childAt4 = ook3.getChildAt(virtualChild)) == null) {
                i1 = ook3.w + 0;
                ook3.w = i1;
                i16 = ointArray;
                i26 = mode;
             }else {
                i16 = ointArray;
                i26 = mode;
                if (childAt4.getVisibility() == 8) {
                   virtualChild = virtualChild + 0;
                }else if(ook3.i(virtualChild)){
                   i19 = ook3.w + ook3.C;
                   ook3.w = i19;
                }
                ViewGroup$LayoutParams layoutParams5 = childAt4.getLayoutParams();
                LinearLayout$LayoutParams weight2 = layoutParams5.weight;
                float f3 = f2 + weight2;
                if (i2 == 0x40000000 && (layoutParams5.width == null && (0 - weight2) > 0)) {
                   if (i11) {
                      i22 = virtualChild;
                      mode1 = layoutParams5.leftMargin + layoutParams5.rightMargin;
                      mode1 = mode1 + ook3.w;
                      ook3.w = mode1;
                   }else {
                      i22 = virtualChild;
                      b = ook3.w;
                      mode1 = layoutParams5.leftMargin + b;
                      mode1 = mode1 + layoutParams5.rightMargin;
                      ook3.w = Math.max(b, mode1);
                   }
                   if (x != null) {
                      childAt4.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
                      layoutParams6 = layoutParams5;
                      i27 = i16;
                      i28 = i26;
                      i16 = i22;
                      ook33 = w;
                      ook32 = x;
                   }else {
                      layoutParams6 = layoutParams5;
                      i27 = i16;
                      i28 = i26;
                      i16 = i22;
                      weight2 = 0x40000000;
                      ook33 = w;
                      ook32 = x;
                      layoutParams2 = 1;
                   label_04fe :
                      if (i3 != weight2 && layoutParams6.height == -1) {
                         x = 1;
                         i15 = 1;
                      }else {
                         x = 0;
                      }
                      i19 = layoutParams6.topMargin + layoutParams6.bottomMargin;
                      mode = childAt4.getMeasuredHeight() + i19;
                      i29 = i19;
                      i27 = View.combineMeasuredStates(i27, childAt4.getMeasuredState());
                      if (ook32 != null && (virtualChild = childAt4.getBaseline()) != -1) {
                         if ((gravity = layoutParams6.gravity) < null) {
                            gravity = ook3.v;
                         }
                         i1 = gravity & 0x70;
                         i1 = i1 >> 4;
                         i1 = i1 & 0xfe;
                         i1 = i1 >> 1;
                         i20 = i27;
                         z[i1] = Math.max(z[i1], virtualChild);
                         virtualChild = mode - virtualChild;
                         a[i1] = Math.max(a[i1], virtualChild);
                      }else {
                         i20 = i27;
                      }
                      i19 = Math.max(i25, mode);
                      w4 = (i12 && layoutParams6.height == -1)? 1: 0;
                      if ((0 - layoutParams6.weight) > 0) {
                         if (x) {
                            mode = i29;
                         }
                         mode = Math.max(i28, mode);
                      }else {
                         i1 = i28;
                         if (x) {
                            mode = i29;
                         }
                         i6 = Math.max(i6, mode);
                         mode = i1;
                      }
                      mode1 = i16 + 0;
                      i25 = i19;
                      i12 = w4;
                      i29 = i17;
                      i19 = i20;
                      virtualChild = mode1;
                      f2 = f3;
                   label_058c :
                      virtualChild = virtualChild + 1;
                      w = ook33;
                      x = ook32;
                   }
                }else {
                   i22 = virtualChild;
                   if (layoutParams5.width == null) {
                      layoutParams6 = 0;
                      if ((layoutParams6 - weight2) > 0) {
                         layoutParams5.width = -2;
                         w4 = 0;
                      label_0496 :
                         ok3 ook34 = (!(layoutParams6 - f3))? ook3.w: 0;
                         i27 = i16;
                         ViewGroup$LayoutParams layoutParams7 = layoutParams5;
                         i28 = i26;
                         i16 = i22;
                         ook33 = w;
                         ook32 = x;
                         this.measureChildWithMargins(childAt4, p0, ook34, p1, 0);
                         if ((i19 = w4) != Integer.MIN_VALUE) {
                            layoutParams6 = layoutParams7;
                            layoutParams6.width = i19;
                         }else {
                            layoutParams6 = layoutParams7;
                         }
                         i19 = childAt4.getMeasuredWidth();
                         if (i11) {
                            virtualChild = layoutParams6.leftMargin + i19;
                            virtualChild = virtualChild + layoutParams6.rightMargin;
                            virtualChild = virtualChild + 0;
                            virtualChild = virtualChild + ook3.w;
                            ook3.w = virtualChild;
                         }else {
                            w5 = ook3.w;
                            virtualChild = w5 + i19;
                            virtualChild = virtualChild + layoutParams6.leftMargin;
                            virtualChild = virtualChild + layoutParams6.rightMargin;
                            virtualChild = virtualChild + 0;
                            ook3.w = Math.max(w5, virtualChild);
                         }
                         if (ook33 != null) {
                            i4 = Math.max(i19, i4);
                         }
                      }
                   }else {
                      layoutParams6 = 0;
                   }
                   w4 = Integer.MIN_VALUE;
                   goto label_0496 ;
                }
                i17 = f;
                weight2 = 0x40000000;
                goto label_04fe ;
             }
             ook32 = x;
             i19 = i16;
             mode = i26;
             ook33 = w;
             goto label_058c ;
          }
          i1 = mode;
          ook33 = w;
          ook32 = x;
          virtualChild = i25;
          if (ook3.w > null && ook3.i(i24)) {
             ook3.w = ook3.w + ook3.C;
          }
          mode = z[1];
          layoutParams2 = -1;
          i16 = ointArray;
          if (mode == layoutParams2 && (z[0] == layoutParams2 && z[2] == layoutParams2)) {
             i19 = 3;
             if (z[i19] == layoutParams2) {
                i25 = virtualChild;
                i18 = i3;
             label_05fa :
                if (ook33 != null && (i2 == Integer.MIN_VALUE && i2)) {
                   i19 = 0;
                   ook3.w = i19;
                   i7 = 0;
                   while (i7 < i24) {
                      if ((childAt5 = ook3.getChildAt(i7)) == null) {
                         mode = ook3.w + i19;
                         ook3.w = mode;
                      }else if(childAt5.getVisibility() == 8){
                         i7 = i7 + 0;
                      }else {
                         nk3 layoutParams8 = childAt5.getLayoutParams();
                         if (i11) {
                            virtualChild = layoutParams8.leftMargin + i4;
                            virtualChild = virtualChild + layoutParams8.rightMargin;
                            virtualChild = virtualChild + 0;
                            virtualChild = virtualChild + ook3.w;
                            ook3.w = virtualChild;
                         }else {
                            w5 = ook3.w;
                            virtualChild = w5 + i4;
                            virtualChild = virtualChild + layoutParams8.leftMargin;
                            virtualChild = virtualChild + layoutParams8.rightMargin;
                            virtualChild = virtualChild + 0;
                            ook3.w = Math.max(w5, virtualChild);
                         }
                      }
                      i7 = i7 + 1;
                      i19 = 0;
                   }
                }
                virtualChild = (this.getPaddingRight() + this.getPaddingLeft()) + ook3.w;
                ook3.w = virtualChild;
                i19 = View.resolveSizeAndState(Math.max(virtualChild, this.getSuggestedMinimumWidth()), i, 0);
                mode = (0xffffff & i19) - ook3.w;
                if (!f && (!mode && (0 - f2) > 0)) {
                   mode1 = Math.max(i6, i1);
                   if (ook33 != null && i2 != 0x40000000) {
                      i7 = 0;
                      while (i7 < i24) {
                         if ((childAt5 = ook3.getChildAt(i7)) != null && (childAt5.getVisibility() != 8 && (0 - childAt5.getLayoutParams().weight) > 0)) {
                            i17 = 0x40000000;
                            childAt5.measure(View$MeasureSpec.makeMeasureSpec(i4, i17), View$MeasureSpec.makeMeasureSpec(childAt5.getMeasuredHeight(), i17));
                         }
                         i7 = i7 + 1;
                      }
                   }
                   i17 = p1;
                   i6 = mode1;
                   mode1 = i16;
                   i4 = i18;
                }else {
                   w = ook3.x;
                   if ((0 - w) > 0) {
                      f2 = w;
                   }
                   z[3] = -1;
                   z[2] = -1;
                   z[1] = -1;
                   z[0] = -1;
                   a[3] = -1;
                   a[2] = -1;
                   a[1] = -1;
                   a[0] = -1;
                   ook3.w = 0;
                   i17 = mode;
                   i7 = -1;
                   i1 = 0;
                   float f4 = f2;
                   mode1 = i16;
                   while (i1 < i24) {
                      if ((childAt6 = ook3.getChildAt(i1)) != null && childAt6.getVisibility() != 8) {
                         nk3 layoutParams9 = childAt6.getLayoutParams();
                         height = layoutParams9.weight;
                         if ((0 - height) > 0) {
                            float f5 = (float)i17 * height;
                            f5 = f5 / f4;
                            i = (int)f5;
                            f4 = f4 - height;
                            i17 = i17 - i;
                            i29 = this.getPaddingBottom() + this.getPaddingTop();
                            i29 = i29 + layoutParams9.topMargin;
                            i4 = i29 + layoutParams9.bottomMargin;
                            f = f4;
                            i16 = i17;
                            mode = ViewGroup.getChildMeasureSpec(p1, i4, layoutParams9.height);
                            if (layoutParams9.width == null) {
                               i4 = 0x40000000;
                               if (i2 == i4) {
                                  if (i <= 0) {
                                     i = 0;
                                  }
                                  childAt6.measure(View$MeasureSpec.makeMeasureSpec(i, i4), mode);
                               label_074c :
                                  mode = childAt6.getMeasuredState() & 0xff000000;
                                  mode1 = View.combineMeasuredStates(mode1, mode);
                                  f4 = f;
                                  i = i16;
                               }
                            }else {
                               i4 = 0x40000000;
                            }
                            if ((i = childAt6.getMeasuredWidth() + i) < 0) {
                               i = 0;
                            }
                            childAt6.measure(View$MeasureSpec.makeMeasureSpec(i, i4), mode);
                            goto label_074c ;
                         }else {
                            i = i17;
                            i17 = p1;
                         }
                         if (i11) {
                            i16 = mode1;
                            i29 = childAt6.getMeasuredWidth() + layoutParams9.leftMargin;
                            i29 = i29 + layoutParams9.rightMargin;
                            i29 = i29 + 0;
                            i4 = i29 + ook3.w;
                            ook3.w = i4;
                            f6 = f4;
                         }else {
                            i16 = mode1;
                            w3 = ook3.w;
                            i29 = childAt6.getMeasuredWidth() + w3;
                            i29 = i29 + layoutParams9.leftMargin;
                            i29 = i29 + layoutParams9.rightMargin;
                            f6 = f4;
                            mode = i29 + 0;
                            ook3.w = Math.max(w3, mode);
                         }
                         layoutParams6 = ((i4 = i18) != 0x40000000 && layoutParams9.height == -1)? 1: 0;
                         i29 = i;
                         mode = layoutParams9.topMargin + layoutParams9.bottomMargin;
                         i = childAt6.getMeasuredHeight() + mode;
                         i7 = Math.max(i7, i);
                         if (!layoutParams6) {
                            mode = i;
                         }
                         mode1 = Math.max(i6, mode);
                         if (i12) {
                            w1 = -1;
                            if (layoutParams9.height == w1) {
                               f4 = 1;
                            label_07ca :
                               if (ook32 != null && (i3 = childAt6.getBaseline()) != w1) {
                                  if ((gravity1 = layoutParams9.gravity) < null) {
                                     gravity1 = ook3.v;
                                  }
                                  virtualChild = gravity1 & 0x70;
                                  virtualChild = virtualChild >> 4;
                                  virtualChild = virtualChild & 0xfe;
                                  virtualChild = virtualChild >> 1;
                                  z[virtualChild] = Math.max(z[virtualChild], i3);
                                  i = i - i3;
                                  a[virtualChild] = Math.max(a[virtualChild], i);
                               }else {
                                  int i30 = -2;
                               }
                               i6 = mode1;
                               i12 = f4;
                               i = i29;
                               mode1 = i16;
                               f4 = f6;
                            }
                         }else {
                            w1 = -1;
                         }
                         f4 = 0;
                         goto label_07ca ;
                      }else {
                         i = i17;
                         i4 = i18;
                         i17 = p1;
                      }
                      i1 = i1 + 1;
                      i17 = i;
                      i18 = i4;
                      i = p0;
                   }
                   i17 = p1;
                   i4 = i18;
                   ook3.w = (this.getPaddingRight() + this.getPaddingLeft()) + ook3.w;
                   mode = z[1];
                   gravity1 = -1;
                   if (mode == gravity1 && (z[0] == gravity1 && z[2] == gravity1)) {
                      i = 3;
                      if (z[i] == gravity1) {
                         i25 = i7;
                      }
                   }else {
                      i = 3;
                   }
                   i1 = 0;
                   i25 = Math.max(i7, (Math.max(a[i], Math.max(a[i1], Math.max(a[1], a[2]))) + Math.max(z[i], Math.max(z[i1], Math.max(mode, z[2])))));
                label_086f :
                   if (i12 || i4 == 0x40000000) {
                      i6 = i25;
                   }
                   ook3.setMeasuredDimension((i19 | (0xff000000 & mode1)), View.resolveSizeAndState(Math.max(((this.getPaddingBottom() + this.getPaddingTop()) + i6), this.getSuggestedMinimumHeight()), i17, (mode1 << 16)));
                   if (i15) {
                      i = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000);
                      while (i1 < i24) {
                         childAt3 = ook3.getChildAt(i1);
                         if (childAt3.getVisibility() != 8) {
                            layoutParams4 = childAt3.getLayoutParams();
                            if (layoutParams4.height == -1) {
                               weight1 = layoutParams4.width;
                               layoutParams4.width = childAt3.getMeasuredWidth();
                               this.measureChildWithMargins(childAt3, p0, 0, i, 0);
                               layoutParams4.width = weight1;
                            }
                         }else {
                            height = -1;
                         }
                         i1 = i1 + 1;
                      }
                   }
                }
                i1 = 0;
                goto label_086f ;
             }
          }else {
             i19 = 3;
          }
          i18 = i3;
          i25 = Math.max(virtualChild, (Math.max(a[3], Math.max(a[0], Math.max(a[1], a[2]))) + Math.max(z[i19], Math.max(z[0], Math.max(mode, z[2])))));
          goto label_05fa ;
       }
       return;
    }
    public void setBaselineAligned(boolean p0){
       this.a = p0;
    }
    public void setBaselineAlignedChildIndex(int p0){
       if (p0 < 0 || p0 >= this.getChildCount()) {
          throw new IllegalArgumentException("base aligned child index out of range \(0, "+this.getChildCount()+"\)");
       }
       this.b = p0;
       return;
    }
    public void setDividerDrawable(Drawable p0){
       if (p0 == this.B) {
          return;
       }
       this.B = p0;
       boolean b = false;
       if (p0 != null) {
          this.C = p0.getIntrinsicWidth();
          this.D = p0.getIntrinsicHeight();
       }else {
          this.C = b;
          this.D = b;
       }
       if (p0 == null) {
          b = true;
       }
       this.setWillNotDraw(b);
       this.requestLayout();
       return;
    }
    public void setDividerPadding(int p0){
       this.F = p0;
    }
    public void setGravity(int p0){
       if (this.v != p0) {
          if (!((0x800007 & p0))) {
             p0 = p0 | 0x800003;
          }
          if (!((p0 & 0x70))) {
             p0 = p0 | 0x30;
          }
          this.v = p0;
          this.requestLayout();
       }
       return;
    }
    public void setHorizontalGravity(int p0){
       p0 = p0 & 0x800007;
       ok3 tv = this.v;
       if (((0x800007 & tv)) != p0) {
          this.v = p0 | (-8388616 & tv);
          this.requestLayout();
       }
       return;
    }
    public void setMeasureWithLargestChildEnabled(boolean p0){
       this.y = p0;
    }
    public void setOrientation(int p0){
       if (this.t != p0) {
          this.t = p0;
          this.requestLayout();
       }
       return;
    }
    public void setShowDividers(int p0){
       if (p0 != this.E) {
          this.requestLayout();
       }
       this.E = p0;
       return;
    }
    public void setVerticalGravity(int p0){
       p0 = p0 & 0x70;
       ok3 tv = this.v;
       if (((tv & 0x70)) != p0) {
          this.v = p0 | (tv & 0x8f);
          this.requestLayout();
       }
       return;
    }
    public void setWeightSum(float p0){
       this.x = Math.max(0, p0);
    }
    public final boolean shouldDelayChildPressedState(){
       return false;
    }
}
