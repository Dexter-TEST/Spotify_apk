package com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueHeaderAccessoryBehavior;
import p.hj7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p.mj2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p.xu0;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import p.jj7;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;

public class GlueHeaderAccessoryBehavior extends hj7	// class@0008f3 from classes.dex
{

    public void GlueHeaderAccessoryBehavior(){
       super();
    }
    public void GlueHeaderAccessoryBehavior(Context p0,AttributeSet p1){
       super(0);
    }
    public final boolean b(View p0,View p1){
       return p1 instanceof mj2;
    }
    public final boolean d(CoordinatorLayout p0,View p1,View p2){
       xu0 oxu0 = hj7.v(p2);
       if (!oxu0 instanceof HeaderBehavior) {
          return false;
       }
       this.x((p2.getHeight() + oxu0.w()));
       return true;
    }
    public final boolean h(CoordinatorLayout p0,View p1,int p2){
       View view1;
       p2 = p0.getPaddingTop();
       int i = (p0.getMeasuredWidth() / 2) - (p1.getMeasuredWidth() / 2);
       p1.layout(i, (p2 - (p1.getMeasuredHeight() / 2)), (p1.getMeasuredWidth() + i), ((p1.getMeasuredHeight() / 2) + p2));
       this.u(p1);
       Iterator iterator = p0.m(p1).iterator();
       while (true) {
          if (iterator.hasNext()) {
             View view = iterator.next();
             if (view instanceof mj2) {
                hj7 ta = this.a;
                ta.e = view.getMeasuredHeight() - view.getTotalScrollRange();
                ta.f = Integer.MAX_VALUE;
                ta.g = true;
             }
          }
          if ((view1 = p0.D()) != null) {
             xu0 oxu0 = hj7.v(view1);
             if (oxu0 instanceof HeaderBehavior) {
                this.x((view1.getHeight() + oxu0.w()));
                break ;
             }
          }
          break ;
       }
       return true;
    }
}
