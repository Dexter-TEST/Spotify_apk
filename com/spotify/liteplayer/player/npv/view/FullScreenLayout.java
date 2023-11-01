package com.spotify.liteplayer.player.npv.view.FullScreenLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.view.View;
import java.lang.Math;
import android.view.View$MeasureSpec;

public final class FullScreenLayout extends FrameLayout	// class@00095a from classes.dex
{
    public int a;
    public int b;

    public void FullScreenLayout(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       this.a = Integer.MAX_VALUE;
       this.b = Integer.MAX_VALUE;
    }
    public final int getMaxHeight(){
       return this.b;
    }
    public final int getMaxWidth(){
       return this.a;
    }
    public final void onMeasure(int p0,int p1){
       int i = Math.max(Math.min(this.b, this.getRootView().getHeight()), View$MeasureSpec.getSize(p1));
       int i1 = Math.max(Math.min(this.a, this.getRootView().getWidth()), View$MeasureSpec.getSize(p0));
       p0 = (!View$MeasureSpec.getMode(p0))? View$MeasureSpec.makeMeasureSpec(i1, 0x40000000): View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(p0), 0x40000000);
       p1 = (!View$MeasureSpec.getMode(p1))? View$MeasureSpec.makeMeasureSpec(i, 0x40000000): View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(p1), 0x40000000);
       super.onMeasure(p0, p1);
       return;
    }
    public final void setMaxHeight(int p0){
       this.b = p0;
       this.requestLayout();
    }
    public final void setMaxWidth(int p0){
       this.a = p0;
       this.requestLayout();
    }
}
