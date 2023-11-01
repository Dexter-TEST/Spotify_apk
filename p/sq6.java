package p.sq6;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Object;
import java.util.ArrayList;
import android.view.View;
import p.pq6;
import android.view.ViewGroup$LayoutParams;
import p.x45;
import java.lang.Class;
import p.hr5;

public final class sq6	// class@00267f from classes.dex
{
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public final StaggeredGridLayoutManager f;

    public void sq6(StaggeredGridLayoutManager p0,int p1){
       this.f = p0;
       super();
       this.a = new ArrayList();
       this.b = Integer.MIN_VALUE;
       this.c = Integer.MIN_VALUE;
       this.d = 0;
       this.e = p1;
    }
    public static pq6 h(View p0){
       return p0.getLayoutParams();
    }
    public final void a(){
       sq6 ta = this.a;
       View view = ta.get((ta.size() - 1));
       pq6 opq6 = sq6.h(view);
       this.c = this.f.J.e(view);
       opq6.getClass();
    }
    public final void b(){
       this.a.clear();
       this.b = Integer.MIN_VALUE;
       this.c = Integer.MIN_VALUE;
       this.d = 0;
    }
    public final int c(){
       sq6 ta = this.a;
       int i = (this.f.O != null)? this.e((ta.size() - 1), -1): this.e(0, ta.size());
       return i;
    }
    public final int d(){
       sq6 ta = this.a;
       int i = (this.f.O != null)? this.e(0, ta.size()): this.e((ta.size() - 1), -1);
       return i;
    }
    public final int e(int p0,int p1){
       sq6 tf = this.f;
       int i = tf.J.n();
       int i1 = tf.J.i();
       int i2 = -1;
       int i3 = (p1 > p0)? 1: -1;
       while (p0 != p1) {
          View view = this.a.get(p0);
          int i4 = tf.J.g(view);
          int i5 = tf.J.e(view);
          int i6 = 0;
          int i7 = (i4 <= i1)? 1: 0;
          if (i5 >= i) {
             i6 = 1;
          }
          if (i7 && (i6 && (i4 < i && i5 <= i1))) {
             i2 = hr5.R(view);
             break ;
          }
          p0 = p0 + i3;
       }
       return i2;
    }
    public final int f(int p0){
       sq6 tc;
       if ((tc = this.c) != Integer.MIN_VALUE) {
          return tc;
       }
       if (!this.a.size()) {
          return p0;
       }
       this.a();
       return this.c;
    }
    public final View g(int p0,int p1){
       sq6 ta = this.a;
       int i = -1;
       sq6 tf = this.f;
       View view = null;
       if (p1 == i) {
          p1 = ta.size();
          i = 0;
          while (i < p1) {
             View view1 = ta.get(i);
             if (tf.O == null || (hr5.R(view1) > p0 && (tf.O != null || (hr5.R(view1) < p0 && view1.hasFocusable())))) {
                i = i + 1;
                view = view1;
             }
          }
       }else {
          p1 = ta.size() + i;
          while (p1 >= 0) {
             View view2 = ta.get(p1);
             if (tf.O == null || (hr5.R(view2) < p0 && (tf.O != null || (hr5.R(view2) > p0 && view2.hasFocusable())))) {
                p1--;
                view = view2;
             }
          }
       }
       return view;
    }
    public final int i(int p0){
       sq6 tb;
       if ((tb = this.b) != Integer.MIN_VALUE) {
          return tb;
       }
       tb = this.a;
       if (!tb.size()) {
          return p0;
       }
       View view = tb.get(0);
       pq6 opq6 = sq6.h(view);
       this.b = this.f.J.g(view);
       opq6.getClass();
       return this.b;
    }
}
