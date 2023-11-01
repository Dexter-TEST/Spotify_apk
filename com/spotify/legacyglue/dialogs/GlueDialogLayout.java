package com.spotify.legacyglue.dialogs.GlueDialogLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import p.uw5;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.View;
import p.xj0;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.widget.Button;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.widget.ScrollView;
import android.util.DisplayMetrics;
import java.lang.Math;
import android.view.ViewGroup;
import p.b17;
import android.view.View$MeasureSpec;

public class GlueDialogLayout extends LinearLayout	// class@0008e5 from classes.dex
{
    public Button A;
    public Button B;
    public boolean C;
    public final Paint D;
    public final int a;
    public final int b;
    public final int c;
    public final int t;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public ScrollView z;

    public void GlueDialogLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       Paint paint = new Paint(1);
       this.D = paint;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, uw5.v, 0, 0);
       this.a = typedArray.getDimensionPixelSize(6, xj0.e0(312.00f, this.getResources()));
       this.b = typedArray.getDimensionPixelSize(5, xj0.e0(520.00f, this.getResources()));
       this.c = typedArray.getDimensionPixelSize(4, xj0.e0(24.00f, this.getResources()));
       this.t = typedArray.getDimensionPixelSize(8, xj0.e0(24.00f, this.getResources()));
       this.v = typedArray.getDimensionPixelSize(3, xj0.e0(48.00f, this.getResources()));
       this.x = typedArray.getDimensionPixelSize(0, xj0.e0(48.00f, this.getResources()));
       this.y = typedArray.getDimensionPixelSize(1, xj0.e0(32.00f, this.getResources()));
       this.w = typedArray.getDimensionPixelSize(7, xj0.e0(40.00f, this.getResources()));
       LinearGradient -1 = new LinearGradient(0, 0, 0, 0x3f800000, 0, typedArray.getColor(2, -1), Shader$TileMode.CLAMP);
       paint.setShader(-1);
       typedArray.recycle();
    }
    public static int a(Button p0){
       if (p0.getVisibility() == 8) {
          return 0;
       }
       int measuredHeig = p0.getMeasuredHeight();
       if (p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
          measuredHeig = measuredHeig + (layoutParams.topMargin + layoutParams.bottomMargin);
       }
       return measuredHeig;
    }
    public final boolean drawChild(Canvas p0,View p1,long p2){
       if (this.C == null || p1 != this.z) {
          return super.drawChild(p0, p1, p2);
       }
       super.drawChild(p0, p1, p2);
       p0.save();
       GlueDialogLayout tv = this.v;
       p0.translate((float)p1.getLeft(), (float)(p1.getBottom() - tv));
       p0.scale(0x3f800000, (float)tv);
       p0.drawRect(0, 0, (float)p1.getMeasuredWidth(), 0x3f800000, this.D);
       p0.restore();
       return true;
    }
    public final void onFinishInflate(){
       super.onFinishInflate();
       this.z = this.findViewById(R.id.content);
       this.A = this.findViewById(R.id.button_positive);
       this.B = this.findViewById(R.id.button_negative);
    }
    public final void onMeasure(int p0,int p1){
       GlueDialogLayout z;
       int i6;
       GlueDialogLayout glueDialogLa = this;
       int i = p1;
       int i1 = Math.min((this.getResources().getDisplayMetrics().widthPixels - (glueDialogLa.c * 2)), glueDialogLa.a);
       if ((z = glueDialogLa.z) != null && z.getChildAt(0) != null) {
          int i2 = Math.min((this.getResources().getDisplayMetrics().heightPixels - (glueDialogLa.t * 2)), glueDialogLa.b);
          View childAt = glueDialogLa.z.getChildAt(0);
          childAt.measure(b17.s(((i1 - glueDialogLa.z.getPaddingLeft()) - glueDialogLa.z.getPaddingRight())), View$MeasureSpec.makeMeasureSpec(0, 0));
          int measuredHeig = childAt.getMeasuredHeight();
          z = glueDialogLa.A;
          GlueDialogLayout x = glueDialogLa.x;
          if (z.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
             z.getLayoutParams().topMargin = x;
          }
          ViewGroup viewGroup = this;
          int i3 = p0;
          int i4 = p1;
          viewGroup.measureChildWithMargins(glueDialogLa.A, i3, 0, i4, 0);
          viewGroup.measureChildWithMargins(glueDialogLa.B, i3, 0, i4, 0);
          int i5 = GlueDialogLayout.a(glueDialogLa.B);
          if ((i6 = (GlueDialogLayout.a(glueDialogLa.A) + measuredHeig) + i5) <= i2) {
             glueDialogLa.C = false;
             glueDialogLa.z.getLayoutParams().height = measuredHeig;
          }else {
             glueDialogLa.C = true;
             GlueDialogLayout a = glueDialogLa.A;
             GlueDialogLayout y = glueDialogLa.y;
             if (a.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                a.getLayoutParams().topMargin = y;
             }
             int i7 = x - y;
             glueDialogLa.z.getLayoutParams().height = (i2 - GlueDialogLayout.a(glueDialogLa.A)) - i5;
             if (((i6 - i2)) <= i7) {
                ViewGroup$LayoutParams layoutParams = glueDialogLa.z.getLayoutParams();
                layoutParams.height = layoutParams.height - i7;
             }
             z = glueDialogLa.z;
             z.setPadding(z.getPaddingLeft(), 0, glueDialogLa.z.getPaddingRight(), glueDialogLa.w);
          }
          super.onMeasure(b17.s(i1), i);
          return;
       }else {
          super.onMeasure(b17.s(i1), i);
          return;
       }
    }
}
