package p.bi2;
import java.lang.Runnable;
import java.lang.ThreadLocal;
import p.dv0;
import java.lang.Object;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import p.zr5;
import p.xe0;
import android.view.View;
import p.pr5;
import p.zh2;
import java.lang.Math;
import p.ai2;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.lang.ref.Reference;
import p.dr5;
import p.hr5;
import p.x67;
import java.lang.String;
import p.w67;
import p.vr5;
import p.yq5;
import java.util.concurrent.TimeUnit;

public final class bi2 implements Runnable	// class@0010cc from classes.dex
{
    public final ArrayList a;
    public long b;
    public long c;
    public final ArrayList t;
    public static final ThreadLocal v;
    public static final dv0 w;

    static {
       bi2.v = new ThreadLocal();
       bi2.w = new dv0(3);
    }
    public void bi2(){
       super();
       this.a = new ArrayList();
       this.t = new ArrayList();
    }
    public static zr5 c(RecyclerView p0,int p1,long p2){
       RecyclerView c;
       zr5 ozr51;
       int i = p0.w.h();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             zr5 ozr5 = RecyclerView.M(p0.w.g(i1));
             if (ozr5.c == p1 && !ozr5.i()) {
                i = 1;
             label_0024 :
                if (i) {
                   return null;
                }
                c = p0.c;
                p0.S();
                if ((ozr51 = c.l(p1, p2)) != null) {
                   if (ozr51.h() && !ozr51.i()) {
                      c.i(ozr51.a);
                      break ;
                   }else {
                      c.a(ozr51, false);
                      break ;
                   }
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             c = 0;
             goto label_0024 ;
          }
       }
       p0.T(false);
       return ozr51;
    }
    public final void a(RecyclerView p0,int p1,int p2){
       if (p0.isAttachedToWindow() && !(this.b)) {
          this.b = p0.getNanoTime();
          p0.post(this);
       }
       p0 = p0.x0;
       p0.a = p1;
       p0.b = p2;
       return;
    }
    public final void b(long p0){
       RecyclerView recyclerView;
       RecyclerView recyclerView1;
       int i5;
       ai2 uoai2;
       ai2 d1;
       long l;
       zr5 ozr5;
       RecyclerView recyclerView2;
       bi2 uobi2 = this;
       bi2 a = uobi2.a;
       int i = a.size();
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          recyclerView = a.get(i1);
          if (!recyclerView.getWindowVisibility()) {
             RecyclerView x0 = recyclerView.x0;
             x0.b(recyclerView, false);
             i2 = i2 + x0.c;
          }
          i1 = i1 + 1;
       }
       bi2 t = uobi2.t;
       t.ensureCapacity(i2);
       i2 = 0;
       int i3 = 0;
       while (i2 < i) {
          recyclerView1 = a.get(i2);
          if (!recyclerView1.getWindowVisibility()) {
             RecyclerView x01 = recyclerView1.x0;
             int i4 = Math.abs(x01.b) + Math.abs(x01.a);
             i5 = 0;
             while (true) {
                int i6 = x01.c * 2;
                if (i5 < i6) {
                   if (i3 >= t.size()) {
                      uoai2 = new ai2();
                      t.add(uoai2);
                   }else {
                      uoai2 = t.get(i3);
                   }
                   zh2 d = x01.d;
                   int i7 = i5 + 1;
                   boolean b = ((i7 = d[i7]) <= i4)? true: false;
                   uoai2.a = b;
                   uoai2.b = i4;
                   uoai2.c = i7;
                   uoai2.d = recyclerView1;
                   uoai2.e = d[i5];
                   i3 = i3 + 1;
                   i5 = i5 + 2;
                }
             }
          }
          i2 = i2 + 1;
       }
       Collections.sort(t, bi2.w);
       for (int i8 = 0; i8 < t.size(); i8 = i8 + 1) {
          ai2 uoai21 = t.get(i8);
          if ((d1 = uoai21.d) == null) {
             break ;
          }else if(uoai21.a != null){
             l = Long.MAX_VALUE;
          }else {
             l = p0;
          }
          if ((ozr5 = bi2.c(d1, uoai21.e, l)) != null && (ozr5.b != null && (ozr5.h() && (!ozr5.i() && (recyclerView2 = ozr5.b.get()) != null)))) {
             if (recyclerView2.U != null && recyclerView2.w.h()) {
                if ((recyclerView = recyclerView2.g0) != null) {
                   recyclerView.e();
                }
                recyclerView = recyclerView2.E;
                recyclerView1 = recyclerView2.c;
                if (recyclerView != null) {
                   recyclerView.x0(recyclerView1);
                   recyclerView2.E.y0(recyclerView1);
                }
                recyclerView1.d.clear();
                recyclerView1.g();
             }
             recyclerView = recyclerView2.x0;
             recyclerView.b(recyclerView2, true);
             if (recyclerView.c != null) {
                w67.a("RV Nested Prefetch");
                recyclerView1 = recyclerView2.y0;
                recyclerView1.d = 1;
                recyclerView1.e = recyclerView2.D.d();
                recyclerView1.g = false;
                recyclerView1.h = false;
                recyclerView1.i = false;
                int i9 = 0;
                while (true) {
                   int i10 = recyclerView.c * 2;
                   if (i9 < i10) {
                      bi2.c(recyclerView2, recyclerView.d[i9], p0);
                      i9 = i9 + 2;
                   }else {
                      break ;
                   }
                }
                w67.b();
             label_013f :
                uoai21.a = false;
                uoai21.b = 0;
                uoai21.c = 0;
                uoai21.d = null;
                uoai21.e = 0;
             }
          }
          i5 = p0;
          goto label_013f ;
       }
       return;
    }
    public final void run(){
       w67.a("RV Prefetch");
       bi2 ta = this.a;
       if (ta.isEmpty()) {
          this.b = 0;
          w67.b();
          return;
       }else {
          int i = ta.size();
          int i1 = 0;
          long l = 0;
          while (i1 < i) {
             RecyclerView recyclerView = ta.get(i1);
             if (!recyclerView.getWindowVisibility()) {
                l = Math.max(recyclerView.getDrawingTime(), l);
             }
             i1 = i1 + 1;
          }
          if (!(l)) {
             this.b = 0;
             w67.b();
             return;
          }else {
             this.b((TimeUnit.MILLISECONDS.toNanos(l) + this.c));
             this.b = 0;
             w67.b();
             return;
          }
       }
    }
}
