package com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueScrollingViewBehavior;
import p.hj7;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import p.mj2;
import android.view.ViewGroup$LayoutParams;
import p.av0;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueHeaderAccessoryBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import p.ox7;
import p.xu0;
import android.view.View$MeasureSpec;
import p.b17;
import p.wh7;
import p.dh7;

public class GlueScrollingViewBehavior extends hj7	// class@0008f6 from classes.dex
{
    public View c;

    public void GlueScrollingViewBehavior(){
       super();
    }
    public void GlueScrollingViewBehavior(Context p0,AttributeSet p1){
       super(0);
    }
    public static View y(ArrayList p0){
       View view;
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          view = iterator.next();
          if (view instanceof mj2) {
             break ;
          }
       }
       return view;
    }
    public final boolean b(View p0,View p1){
       av0 layoutParams = p1.getLayoutParams();
       boolean b = (!p1 instanceof mj2 && !layoutParams.a instanceof GlueHeaderAccessoryBehavior)? false: true;
       return b;
    }
    public final boolean d(CoordinatorLayout p0,View p1,View p2){
       GlueScrollingViewBehavior tc;
       av0 a = p2.getLayoutParams().a;
       if (a instanceof HeaderBehavior) {
          if (p0.T != null) {
             this.x(a.w());
             return true;
          }else {
             int i = p2.getHeight() + a.w();
             int i1 = ((tc = this.c) != null)? tc.getMeasuredHeight() / 2: 0;
             this.x((i1 + i));
          }
       }
       return true;
    }
    public final boolean h(CoordinatorLayout p0,View p1,int p2){
       View view1;
       int paddingTop;
       xu0 oxu0;
       GlueScrollingViewBehavior tc;
       View view = GlueScrollingViewBehavior.y(p0.m(p1));
       int i = 0;
       if (p0.T != null) {
          if ((view1 = GlueScrollingViewBehavior.y(p0.m(p1))) != null) {
             i = view1.getMeasuredWidth();
          }
          if (ox7.y(p0)) {
             view1 = p0.getPaddingLeft();
             paddingTop = p0.getPaddingTop();
             p1.layout(view1, paddingTop, (p1.getMeasuredWidth() + view1), (p1.getMeasuredHeight() + paddingTop));
          }else {
             view1 = p0.getPaddingLeft() + i;
             paddingTop = p0.getPaddingTop();
             p1.layout(view1, paddingTop, (p1.getMeasuredWidth() + view1), (p1.getMeasuredHeight() + paddingTop));
          }
          this.u(p1);
          oxu0 = hj7.v(view);
          if (oxu0 instanceof HeaderBehavior) {
             this.x(oxu0.w());
          }
          return true;
       }else {
          super.h(p0, p1, p2);
          if (view != null) {
             oxu0 = hj7.v(view);
             if (oxu0 instanceof HeaderBehavior) {
                int i1 = view.getHeight() + oxu0.w();
                if ((tc = this.c) != null) {
                   i = tc.getMeasuredHeight() / 2;
                }
                this.x((i + i1));
             }
          }
          return true;
       }
    }
    public final boolean i(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       View view;
       int i;
       View view1;
       ViewGroup$LayoutParams height;
       View view3;
       ArrayList uArrayList = p0.m(p1);
       Iterator iterator = uArrayList.iterator();
       while (true) {
          if (iterator.hasNext()) {
             view = iterator.next();
             if (!view.getLayoutParams().a instanceof GlueHeaderAccessoryBehavior) {
                continue ;
             }
          }else {
             view = null;
          }
          this.c = view;
          i = 0;
          if (p0.T != null) {
             if ((view1 = GlueScrollingViewBehavior.y(p0.m(p1))) != null) {
                i = view1.getMeasuredWidth();
                break ;
             }
             break ;
          }else if((height = p1.getLayoutParams().height) != -1 && height != -2){
             if (uArrayList.isEmpty()) {
                return i;
             }else {
                View view2 = GlueScrollingViewBehavior.y(uArrayList);
                if ((view3 = view2) != null) {
                   if (dh7.b(view2)) {
                      p1.setFitsSystemWindows(true);
                   }
                   if (!(p4 = View$MeasureSpec.getSize(p4))) {
                      p4 = p0.getHeight();
                   }
                   p4 = p4 - (view2.getMeasuredHeight() - view3.getTotalScrollRange());
                   int i1 = (height == -1)? 0x40000000: Integer.MIN_VALUE;
                   p0.u(p1, p2, p3, View$MeasureSpec.makeMeasureSpec(p4, i1));
                   return true;
                }
             }
          }
          return i;
       }
       p1.measure(b17.s((((View$MeasureSpec.getSize(p2) - p0.getPaddingLeft()) - p0.getPaddingRight()) - i)), b17.s(((View$MeasureSpec.getSize(p4) - p0.getPaddingTop()) - p0.getPaddingBottom())));
       return true;
    }
}
