package p.xe0;
import java.util.concurrent.Executor;
import p.ry7;
import java.lang.Object;
import p.xq5;
import p.we0;
import java.util.ArrayList;
import android.view.View;
import android.view.ViewGroup;
import p.zr5;
import androidx.recyclerview.widget.RecyclerView;
import p.yq5;
import p.jr5;
import android.view.ViewGroup$LayoutParams;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import p.en6;
import java.util.List;
import p.wh7;
import p.dh7;

public final class xe0	// class@002c5b from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public void xe0(Executor p0,ry7 p1){
       this.a = 1;
       super();
       this.b = null;
       this.c = p0;
       this.d = p1;
    }
    public void xe0(xq5 p0){
       this.a = 0;
       super();
       this.b = p0;
       this.c = new we0();
       this.d = new ArrayList();
    }
    public final void a(int p0,View p1,boolean p2){
       RecyclerView d;
       RecyclerView t;
       xe0 tb = this.b;
       p0 = (p0 < 0)? tb.c(): this.f(p0);
       this.c.e(p0, p2);
       if (p2) {
          this.i(p1);
       }
       xq5 a = tb.a;
       a.addView(p1, p0);
       zr5 ozr5 = RecyclerView.M(p1);
       if ((d = a.D) != null && ozr5 != null) {
          d.r(ozr5);
       }
       if ((t = a.T) != null) {
          t = t.size();
          while ((t--) >= 0) {
             a.T.get(t).a(p1);
          }
       }
       return;
    }
    public final void b(View p0,int p1,ViewGroup$LayoutParams p2,boolean p3){
       xe0 tb = this.b;
       p1 = (p1 < 0)? tb.c(): this.f(p1);
       this.c.e(p1, p3);
       if (p3) {
          this.i(p0);
       }
       tb.getClass();
       zr5 ozr5 = RecyclerView.M(p0);
       xq5 a = tb.a;
       if (ozr5 != null) {
          if (!ozr5.m() && !ozr5.q()) {
             throw new IllegalArgumentException(en6.m(a, "Called attach on a child which is not detached: "+ozr5));
          }else {
             ozr5.j = ozr5.j & 0xfeff;
          }
       }
       RecyclerView.b(a, p0, p1, p2);
       return;
    }
    public final void c(int p0){
       zr5 ozr5;
       p0 = this.f(p0);
       this.c.f(p0);
       xe0 tb = this.b;
       View childAt = tb.a.getChildAt(p0);
       xq5 a = tb.a;
       if (childAt != null && (ozr5 = RecyclerView.M(childAt)) != null) {
          if (ozr5.m() && !ozr5.q()) {
             throw new IllegalArgumentException(en6.m(a, "called detach on an already detached child "+ozr5));
          }else {
             ozr5.b(256);
          }
       }
       RecyclerView.c(a, p0);
       return;
    }
    public final View d(int p0){
       return this.b.a.getChildAt(this.f(p0));
    }
    public final int e(){
       return (this.b.c() - this.d.size());
    }
    public final int f(int p0){
       if (p0 < 0) {
          return -1;
       }
       int i = this.b.c();
       int i1 = p0;
       while (true) {
          if (i1 >= i) {
             return -1;
          }
          xe0 tc = this.c;
          int i2 = i1 - tc.b(i1);
          if (!(i2 = p0 - i2)) {
             while (tc.d(i1)) {
                i1 = i1 + 1;
             }
             return i1;
          }else {
             i1 = i1 + i2;
          }
       }
    }
    public final View g(int p0){
       return this.b.a.getChildAt(p0);
    }
    public final int h(){
       return this.b.c();
    }
    public final void i(View p0){
       zr5 ozr5;
       this.d.add(p0);
       xe0 tb = this.b;
       tb.getClass();
       if ((ozr5 = RecyclerView.M(p0)) != null) {
          zr5 q = ozr5.q;
          zr5 a = ozr5.a;
          ozr5.p = (q != -1)? q: dh7.c(a);
          xq5 a1 = tb.a;
          if (a1.O()) {
             ozr5.q = 4;
             a1.M0.add(ozr5);
          }else {
             dh7.s(a, 4);
          }
       }
       return;
    }
    public final int j(View p0){
       int i = this.b.a.indexOfChild(p0);
       int i1 = -1;
       if (i == i1) {
          return i1;
       }
       xe0 tc = this.c;
       if (tc.d(i)) {
          return i1;
       }
       return (i - tc.b(i));
    }
    public final boolean k(View p0){
       return this.d.contains(p0);
    }
    public final void l(int p0){
       View childAt;
       p0 = this.f(p0);
       xe0 tb = this.b;
       if ((childAt = tb.a.getChildAt(p0)) == null) {
          return;
       }
       if (this.c.f(p0)) {
          this.m(childAt);
       }
       tb.i(p0);
       return;
    }
    public final void m(View p0){
       zr5 ozr5;
       if (this.d.remove(p0)) {
          xe0 tb = this.b;
          tb.getClass();
          if ((ozr5 = RecyclerView.M(p0)) != null) {
             zr5 p = ozr5.p;
             xq5 a = tb.a;
             if (a.O()) {
                ozr5.q = p;
                a.M0.add(ozr5);
             }else {
                dh7.s(ozr5.a, p);
             }
             ozr5.p = 0;
          }
       }
       return;
    }
    public final String toString(){
       switch (this.a){
           case 0:
           default:
             return super.toString();
       }
       return this.c.toString()+", hidden list:"+this.d.size();
    }
}
