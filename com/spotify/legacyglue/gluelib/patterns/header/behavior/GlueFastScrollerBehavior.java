package com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueFastScrollerBehavior;
import p.hj7;
import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import java.lang.Runnable;
import android.os.Handler;
import p.ox7;
import android.view.View$MeasureSpec;
import p.b17;

public class GlueFastScrollerBehavior extends hj7	// class@0008f2 from classes.dex
{

    public void GlueFastScrollerBehavior(){
       super();
    }
    public void GlueFastScrollerBehavior(Context p0,AttributeSet p1){
       super(0);
    }
    public static RecyclerView y(CoordinatorLayout p0,RecyclerViewFastScroller p1){
       Iterator iterator = p0.m(p1).iterator();
       RecyclerView recyclerView = null;
       while (iterator.hasNext()) {
          View view = iterator.next();
          if (view instanceof RecyclerView) {
             recyclerView = view;
          }
       }
       return recyclerView;
    }
    public final boolean b(View p0,View p1){
       return p1 instanceof RecyclerView;
    }
    public final boolean d(CoordinatorLayout p0,View p1,View p2){
       p1.offsetTopAndBottom((p2.getTop() - p1.getTop()));
       RecyclerViewFastScroller a = p1.A;
       p1.A = false;
       p1.B.removeCallbacks(p1.C);
       if (a != null) {
          p1.a();
       }
       return true;
    }
    public final boolean h(CoordinatorLayout p0,View p1,int p2){
       RecyclerView recyclerView;
       boolean b;
       super.h(p0, p1, p2);
       if ((recyclerView = GlueFastScrollerBehavior.y(p0, p1)) != null) {
          if (ox7.y(p0)) {
             p1.layout(recyclerView.getLeft(), recyclerView.getTop(), (p1.getMeasuredWidth() + recyclerView.getLeft()), recyclerView.getBottom());
          }else {
             p1.layout((recyclerView.getRight() - p1.getMeasuredWidth()), recyclerView.getTop(), recyclerView.getRight(), recyclerView.getBottom());
          }
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public final boolean i(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       boolean b;
       RecyclerView recyclerView = GlueFastScrollerBehavior.y(p0, p1);
       p2 = 0;
       if (recyclerView != null) {
          p1.measure(View$MeasureSpec.makeMeasureSpec(p2, p2), b17.s(recyclerView.getMeasuredHeight()));
          b = true;
       }
       return b;
    }
}
