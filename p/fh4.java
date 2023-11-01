package p.fh4;
import p.ar5;
import java.lang.Object;
import p.gh4;
import p.yq5;
import p.ej5;
import p.un0;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.String;
import p.vr5;
import p.o7;
import java.lang.Class;
import p.n7;
import java.util.ArrayList;
import p.en6;
import p.wh7;
import android.view.View;
import java.lang.Runnable;
import p.dh7;

public final class fh4 extends ar5	// class@0015ca from classes.dex
{
    public final int a;
    public final Object b;

    public void fh4(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(){
       fh4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.j(null);
             tb.y0.f = true;
             tb.X(true);
             if (!tb.v.g()) {
                tb.requestLayout();
             }
             return;
       }
       tb.e = tb.c.d();
       gh4 d = tb.d;
       d.b.g();
       d.f();
       return;
    }
    public final void b(int p0,int p1,Object p2){
       int i;
       fh4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.j(null);
             RecyclerView v = tb.v;
             i = 1;
             if (p1 < i) {
                v.getClass();
             }else {
                o7 b = v.b;
                b.add(v.h(p2, 4, p0, p1));
                v.f = v.f | 4;
                if (b.size() == i) {
                label_003f :
                   if (i) {
                      this.g();
                   }
                   return;
                }
             }
             i = 0;
             goto label_003f ;
       }
       gh4 d = tb.d;
       i = d.i(tb);
       d.b.j((p0 + i), p1, p2);
       return;
    }
    public final void c(int p0,int p1){
       fh4 tb = this.b;
       switch (this.a){
           case 0:
             tb.e = tb.e + p1;
             gh4 d = tb.d;
             d.b.k((p0 + d.i(tb)), p1);
             if (tb.e > null && tb.c.c == 2) {
                d.f();
             }
             break;
           default:
             tb.j(null);
             RecyclerView v = tb.v;
             int i = 1;
             if (p1 < i) {
                v.getClass();
             }else {
                o7 b = v.b;
                b.add(v.h(null, i, p0, p1));
                v.f = v.f | i;
                if (b.size() == i) {
                label_0051 :
                   if (i) {
                      this.g();
                   }
                   return;
                }
             }
             i = 0;
             goto label_0051 ;
       }
       return;
    }
    public final void d(int p0,int p1){
       fh4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.j(null);
             RecyclerView v = tb.v;
             v.getClass();
             if (p0 != p1) {
                o7 b = v.b;
                b.add(v.h(null, 8, p0, p1));
                v.f = v.f | 8;
                p1 = 1;
                if (b.size() == p1) {
                label_0041 :
                   if (p1) {
                      this.g();
                   }
                   return;
                }
             }
             p1 = 0;
             goto label_0041 ;
       }
       gh4 d = tb.d;
       int i = d.i(tb);
       d.b.i((p0 + i), (p1 + i));
       return;
    }
    public final void e(int p0,int p1){
       int i = 1;
       fh4 tb = this.b;
       switch (this.a){
           case 0:
             tb.e = tb.e - p1;
             gh4 d = tb.d;
             d.b.l((p0 + d.i(tb)), p1);
             if (tb.e < i && tb.c.c == 2) {
                d.f();
             }
             break;
           default:
             tb.j(null);
             RecyclerView v = tb.v;
             int i1 = 0;
             if (p1 < i) {
                v.getClass();
             }else {
                o7 b = v.b;
                b.add(v.h(null, 2, p0, p1));
                v.f = v.f | 2;
                if (b.size() != i) {
                   i = 0;
                }
                i1 = i;
             }
             if (i1) {
                this.g();
             }
             return;
       }
       return;
    }
    public final void f(){
       RecyclerView d;
       fh4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             if (tb.t != null && (d = tb.D) != null) {
                int i = en6.A(d.c);
                int i1 = 1;
                if (i != i1) {
                   if (i == 2) {
                      i1 = 0;
                   }
                }else if(d.d() > 0){
                }
                if (i1) {
                   tb.requestLayout();
                }
             }
             return;
       }
       tb.d.f();
       return;
    }
    public final void g(){
       fh4 tb = this.b;
       if (RecyclerView.V0) {
          fh4 uofh4 = tb;
          if (uofh4.K != null && uofh4.J != null) {
             dh7.m(uofh4, uofh4.z);
          label_0021 :
             return;
          }
       }
       tb.R = true;
       tb.requestLayout();
       goto label_0021 ;
    }
}
