package com.spotify.liteplayer.player.npv.view.PeekScrollView;
import android.widget.ScrollView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.z95;
import p.ay6;
import p.wf2;
import p.p00;
import p.i72;
import io.reactivex.rxjava3.core.Flowable;
import p.j82;
import p.ba2;
import p.m92;
import p.yo0;
import p.ir2;
import p.r82;
import p.yf2;
import p.y95;
import p.f72;
import p.zv6;
import p.bn5;
import p.az5;
import p.vv7;
import android.content.res.TypedArray;
import android.widget.FrameLayout;
import com.spotify.liteplayer.player.npv.view.FullScreenLayout;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import p.x95;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import android.graphics.Rect;
import p.v46;
import java.lang.IllegalArgumentException;
import p.u46;

public final class PeekScrollView extends ScrollView	// class@00095b from classes.dex
{
    public final ay6 a;
    public final ay6 b;
    public final ay6 c;
    public final p00 t;
    public final m92 v;
    public int w;
    public u46 x;
    public final int y;

    public void PeekScrollView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       this.a = new ay6(new z95(this, 2));
       this.b = new ay6(new z95(this, 0));
       this.c = new ay6(new z95(this, 1));
       p00 op00 = new p00();
       this.t = op00;
       this.v = new m92(new j82(op00.g(), 2).s());
       r82 or82 = new r82(op00, ir2.O, 0);
       bn5[] uobn5Array = new bn5[]{new f72(0, new y95(0, this)),or82};
       m92 om92 = new m92(new j82(Flowable.b(uobn5Array).g(), 2).s());
       this.x = new az5();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, vv7.v, 0, 0);
       co5.l(typedArray, "obtainStyledAttributes\(s…efStyleAttr, defStyleRes\)");
       this.w = typedArray.getDimensionPixelSize(1, 0);
       this.y = typedArray.getResourceId(0, 0);
       typedArray.recycle();
    }
    public static final FrameLayout a(PeekScrollView p0){
       return p0.getPeekingWidgetContainer();
    }
    private final FullScreenLayout getFullscreenContainer(){
       Object value = this.b.getValue();
       co5.l(value, "<get-fullscreenContainer>\(...\)");
       return value;
    }
    private final FrameLayout getPeekingWidgetContainer(){
       Object value = this.c.getValue();
       co5.l(value, "<get-peekingWidgetContainer>\(...\)");
       return value;
    }
    private final LinearLayout getRootContainer(){
       Object value = this.a.getValue();
       co5.l(value, "<get-rootContainer>\(...\)");
       return value;
    }
    public final void addView(View p0){
       co5.o(p0, "child");
       this.b(p0, -1, null);
    }
    public final void addView(View p0,int p1){
       co5.o(p0, "child");
       this.b(p0, p1, null);
    }
    public final void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       co5.o(p0, "child");
       this.b(p0, p1, p2);
    }
    public final void addView(View p0,ViewGroup$LayoutParams p1){
       co5.o(p0, "child");
       this.b(p0, -1, p1);
    }
    public final void b(View p0,int p1,ViewGroup$LayoutParams p2){
       PeekScrollView ty;
       if (p0.getId() == 0x7f0a054e) {
          super.addView(p0, p1, p2);
       }else if(!this.getFullscreenContainer().getChildCount()){
          if (p2 == null) {
             this.getFullscreenContainer().addView(p0, 0);
          }else {
             this.getFullscreenContainer().addView(p0, 0, p2);
          }
       }else if(!this.getPeekingWidgetContainer().getChildCount()){
          if (p2 == null) {
             this.getPeekingWidgetContainer().addView(p0, 0);
          }else {
             this.getPeekingWidgetContainer().addView(p0, 0, p2);
          }
          if ((ty = this.y) != null && (p0 = p0.findViewById(ty)) != null) {
             p0.addOnLayoutChangeListener(new x95(this, 0));
          }
       }else {
          p1--;
          this.getRootContainer().addView(p0, p1, p2);
       }
       return;
    }
    public final void c(FrameLayout p0,int p1){
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       co5.j(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       int i = - p1;
       if (layoutParams.topMargin != i) {
          layoutParams.topMargin = i;
          p0.setLayoutParams(layoutParams);
       }
       this.getFullscreenContainer().setPadding(0, 0, 0, p1);
       return;
    }
    public final void d(){
       int i = this.getPeekingWidgetContainer().getHeight() - this.w;
       int i1 = Math.min(Math.min(i, (this.getHeight() - this.w)), i);
       this.x.t(this, i1);
    }
    public final boolean fitSystemWindows(Rect p0){
       boolean b;
       if (this.w == null || p0 == null) {
          return super.fitSystemWindows(p0);
       }
       if (this.getFitsSystemWindows()) {
          if (!(b = super.fitSystemWindows(p0)) && p0.bottom > null) {
             this.c(this.getPeekingWidgetContainer(), (this.w + p0.bottom));
          }
          return b;
       }else if(p0.bottom > null){
          this.c(this.getPeekingWidgetContainer(), (this.w + p0.bottom));
       }
       return super.fitSystemWindows(p0);
    }
    public final void onFinishInflate(){
       PeekScrollView ty;
       View view;
       super.onFinishInflate();
       if ((ty = this.y) != null && (view = this.getPeekingWidgetContainer().findViewById(ty)) != null) {
          view.addOnLayoutChangeListener(new x95(this, 1));
       }
       return;
    }
    public final void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       this.getFullscreenContainer().setMaxWidth(this.getMeasuredWidth());
       this.getFullscreenContainer().setMaxHeight(this.getMeasuredHeight());
    }
    public final void onScrollChanged(int p0,int p1,int p2,int p3){
       super.onScrollChanged(p0, p1, p2, p3);
       this.t.onNext(new v46(p1, p3));
    }
    public final void setPeekHeight(int p0){
       int i = (p0 >= 0)? 1: 0;
       if (i) {
          this.w = p0;
          this.c(this.getPeekingWidgetContainer(), p0);
          return;
       }else {
          throw new IllegalArgumentException("Peek height must be >=0".toString());
       }
    }
    public final void setScrollAnimation(u46 p0){
       co5.o(p0, "animation");
       this.x = p0;
    }
}
