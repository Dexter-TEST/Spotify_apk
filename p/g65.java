package p.g65;
import p.kr5;
import p.an6;
import android.view.View;
import p.x45;
import p.hr5;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.util.ArrayList;
import p.mr5;
import android.widget.Scroller;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.IllegalStateException;
import java.lang.String;
import p.w45;
import android.view.animation.AccelerateInterpolator;

public class g65 extends kr5	// class@0016ac from classes.dex
{
    public RecyclerView a;
    public final an6 b;
    public w45 c;
    public w45 d;

    public void g65(){
       super();
       this.b = new an6(this);
    }
    public static int c(View p0,x45 p1){
       return (((p1.f(p0) / 2) + p1.g(p0)) - ((p1.o() / 2) + p1.n()));
    }
    public static View d(hr5 p0,x45 p1){
       int i5;
       int i = p0.I();
       View view = null;
       if (!i) {
          return view;
       }
       int i1 = (p1.o() / 2) + p1.n();
       int i2 = Integer.MAX_VALUE;
       int i3 = 0;
       while (i3 < i) {
          View view1 = p0.H(i3);
          int i4 = p1.f(view1) / 2;
          i4 = i4 + p1.g(view1);
          i4 = i4 - i1;
          if ((i5 = Math.abs(i4)) < i2) {
             view = view1;
             i2 = i5;
          }
          i3 = i3 + 1;
       }
       return view;
    }
    public final void a(RecyclerView p0){
       g65 ta;
       RecyclerView a0;
       if ((ta = this.a) == p0) {
       }else {
          g65 tb = this.b;
          if (ta != null) {
             if ((a0 = ta.A0) != null) {
                a0.remove(tb);
             }
             this.a.setOnFlingListener(null);
          }
          this.a = p0;
          if (p0 != null) {
             if (p0.getOnFlingListener() == null) {
                this.a.i(tb);
                this.a.setOnFlingListener(this);
                Scroller scroller = new Scroller(this.a.getContext(), new DecelerateInterpolator());
                this.h();
             }else {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
             }
          }
       }
       return;
    }
    public final int[] b(hr5 p0,View p1){
       int[] ointArray = new int[2];
       ointArray[0] = (p0.p())? g65.c(p1, this.f(p0)): 0;
       ointArray[1] = (p0.q())? g65.c(p1, this.g(p0)): 0;
       return ointArray;
    }
    public View e(hr5 p0){
       if (p0.q()) {
          return g65.d(p0, this.g(p0));
       }
       if (p0.p()) {
          return g65.d(p0, this.f(p0));
       }
       return null;
    }
    public final x45 f(hr5 p0){
       g65 td;
       if ((td = this.d) == null || td.b != p0) {
          this.d = x45.a(p0);
       }
       return this.d;
    }
    public final x45 g(hr5 p0){
       g65 tc;
       if ((tc = this.c) == null || tc.b != p0) {
          this.c = x45.c(p0);
       }
       return this.c;
    }
    public final void h(){
       g65 ta;
       hr5 layoutManage;
       View view;
       if ((ta = this.a) == null) {
       }else if((layoutManage = ta.getLayoutManager()) == null || (view = this.e(layoutManage)) == null){
          int[] ointArray = this.b(layoutManage, view);
          int i = ointArray[0];
          int i1 = 1;
          if (i || ointArray[i1]) {
             this.a.j0(i, ointArray[i1], null, 0);
          }
       }
       return;
    }
}
