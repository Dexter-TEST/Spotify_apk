package com.spotify.legacyglue.gluelib.patterns.prettylist.StickyRecyclerView$DynamicBottomPaddingLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import p.f65;
import java.lang.Object;
import p.pr5;
import p.vr5;
import p.hr5;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import p.ir5;
import p.zr5;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView;
import p.ur5;
import java.lang.Class;

public class StickyRecyclerView$DynamicBottomPaddingLinearLayoutManager extends LinearLayoutManager	// class@0008fb from classes.dex
{
    public int W;
    public boolean X;
    public f65 Y;

    public void StickyRecyclerView$DynamicBottomPaddingLinearLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.Y = new f65(this, p0, 3);
    }
    public final int E0(int p0,pr5 p1,vr5 p2){
       int i = 1;
       View view = this.H((this.I() - i));
       View view1 = this.H(0);
       if (view == null || view1 == null) {
          return super.E0(p0, p1, p2);
       }
       int i1 = (view.getLayoutParams().a.d() == (this.O() - i))? 1: 0;
       if (!view1.getLayoutParams().a.d() && view1.getTop() >= 0) {
          i = 0;
       }
       if (i1 && (p0 > 0 && i)) {
          return super.E0(Math.max(0, Math.min(p0, ((hr5.G(view) + view.getBottom()) - this.G))), p1, p2);
       }else {
          return super.E0(p0, p1, p2);
       }
    }
    public final void N0(RecyclerView p0,int p1){
       StickyRecyclerView$DynamicBottomPaddingLinearLayoutManager tY = this.Y;
       tY.a = p1;
       this.O0(tY);
    }
    public final int b1(){
       this.X = true;
       this.X = false;
       return super.b1();
    }
    public final int c1(){
       this.X = true;
       this.X = false;
       return super.c1();
    }
    public final int getPaddingBottom(){
       return super.getPaddingBottom();
    }
    public final void q0(pr5 p0,vr5 p1){
       super.q0(p0, p1);
       int i = this.I();
       int i2 = 0;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          View view = this.H(i1);
          view.getClass();
          i2 = i2 + view.getMeasuredHeight();
       }
       if (this.W != i2) {
          this.W = i2;
          super.q0(p0, p1);
       }
       return;
    }
}
