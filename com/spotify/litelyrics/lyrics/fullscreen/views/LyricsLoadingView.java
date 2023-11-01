package com.spotify.litelyrics.lyrics.fullscreen.views.LyricsLoadingView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Double;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import p.b17;
import android.view.View$MeasureSpec;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public final class LyricsLoadingView extends LinearLayout	// class@00093b from classes.dex
{
    public final Double[] a;

    public void LyricsLoadingView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       Double[] uDoubleArray = new Double[8];
       uDoubleArray[0] = Double.valueOf(0x3fd999999999999a);
       Double uDouble = Double.valueOf(0x3feccccccccccccd);
       uDoubleArray[1] = uDouble;
       uDoubleArray[2] = Double.valueOf(0x3ff0000000000000);
       Double uDouble1 = Double.valueOf(0x3fe6666666666666);
       uDoubleArray[3] = uDouble1;
       uDoubleArray[4] = uDouble;
       uDoubleArray[5] = Double.valueOf(0x3fe3333333333333);
       uDoubleArray[6] = uDouble1;
       uDoubleArray[7] = Double.valueOf(0x3fe0000000000000);
       this.a = uDoubleArray;
       this.setOrientation(1);
    }
    public final int a(int p0){
       LyricsLoadingView ta = this.a;
       return (int)(ta[(p0 % ta.length)].doubleValue() * (double)((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()));
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int measuredHeig;
       if (p0) {
          if (!this.getChildCount()) {
             View view = LayoutInflater.from(this.getContext()).inflate(R.layout.lyrics_loading_view_line, this, false);
             co5.l(view, "from\(context\)\n        .i…g_view_line, this, false\)");
             view.measure(b17.s(this.a(false)), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), Integer.MIN_VALUE));
             LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(view.getLayoutParams());
             layoutParams.width = this.a(false);
             this.addViewInLayout(view, false, layoutParams);
          }
          int i = (!(measuredHeig = this.getChildAt(false).getMeasuredHeight()))? 0: this.getMeasuredHeight() / measuredHeig;
          if (this.getChildCount() > i) {
             this.removeViewsInLayout(i, (this.getChildCount() - i));
          }else if(this.getChildCount() < i){
             for (measuredHeig = this.getChildCount(); measuredHeig < i; measuredHeig = measuredHeig + 1) {
                View view1 = LayoutInflater.from(this.getContext()).inflate(R.layout.lyrics_loading_view_line, this, false);
                co5.l(view1, "from\(context\)\n        .i…g_view_line, this, false\)");
                view1.measure(b17.s(this.a(measuredHeig)), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), Integer.MIN_VALUE));
                LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(view1.getLayoutParams());
                layoutParams1.width = this.a(measuredHeig);
                this.addViewInLayout(view1, -1, layoutParams1);
             }
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
}
