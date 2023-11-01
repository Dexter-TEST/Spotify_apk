package p.q71;
import p.dr5;
import java.util.ArrayList;
import java.lang.Object;
import p.zr5;
import android.view.ViewPropertyAnimator;
import android.view.View;
import p.zn;
import p.o71;
import p.p71;
import p.tp2;
import java.util.List;
import android.animation.ValueAnimator;
import android.animation.TimeInterpolator;

public class q71 extends dr5	// class@002344 from classes.dex
{
    public boolean g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public final ArrayList q;
    public final ArrayList r;
    public static TimeInterpolator s;

    public void q71(){
       super();
       this.g = true;
       this.h = new ArrayList();
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.m = new ArrayList();
       this.n = new ArrayList();
       this.o = new ArrayList();
       this.p = new ArrayList();
       this.q = new ArrayList();
       this.r = new ArrayList();
    }
    public static void i(ArrayList p0){
       int i = p0.size();
       while ((i = i - 1) >= 0) {
          p0.get(i).a.animate().cancel();
       }
       return;
    }
    public final boolean a(zr5 p0,zr5 p1,zn p2,zn p3){
       zn ozn;
       zn ozn1;
       boolean b1;
       zn a = p2.a;
       zn b = p2.b;
       if (p1.q()) {
          ozn = p2.b;
          ozn1 = p2.a;
       }else {
          ozn1 = p3.a;
          ozn = p3.b;
       }
       if (p0 == p1) {
          b1 = this.h(p0, a, b, ozn1, ozn);
       }else {
          zr5 a1 = p0.a;
          float translationX = a1.getTranslationX();
          float translationY = a1.getTranslationY();
          this.m(p0);
          a1.setTranslationX(translationX);
          a1.setTranslationY(translationY);
          a1.setAlpha(a1.getAlpha());
          this.m(p1);
          o71 zr5 a2 = p1.a;
          a2.setTranslationX((float)(- (int)((float)(ozn1 - a) - translationX)));
          a2.setTranslationY((float)(- (int)((float)(ozn - b) - translationY)));
          a2.setAlpha(0);
          a2 = new o71(p0, p1, a, b, ozn1, ozn);
          this.k.add(a2);
          b1 = true;
       }
       return b1;
    }
    public final void d(zr5 p0){
       float f;
       ArrayList uArrayList;
       zr5 a = p0.a;
       a.animate().cancel();
       q71 tj = this.j;
       int i = tj.size();
       while (true) {
          i = i - 1;
          f = 0;
          if (i >= 0) {
             if (tj.get(i).a == p0) {
                a.setTranslationY(f);
                a.setTranslationX(f);
                this.c(p0);
                tj.remove(i);
             }
          }else {
             break ;
          }
       }
       this.k(p0, this.k);
       if (this.h.remove(p0)) {
          a.setAlpha(0x3f800000);
          this.c(p0);
       }
       if (this.i.remove(p0)) {
          a.setAlpha(0x3f800000);
          this.c(p0);
       }
       tj = this.n;
       int i1 = tj.size();
       while ((i1 = i1 - 1) >= 0) {
          uArrayList = tj.get(i1);
          this.k(p0, uArrayList);
          if (uArrayList.isEmpty()) {
             tj.remove(i1);
          }
       }
       tj = this.m;
       i1 = tj.size();
       while ((i1 = i1 - 1) >= 0) {
          uArrayList = tj.get(i1);
          int i2 = uArrayList.size();
          while (true) {
             if ((i2 = i2 - 1) >= 0) {
                if (uArrayList.get(i2).a == p0) {
                   a.setTranslationY(f);
                   a.setTranslationX(f);
                   this.c(p0);
                   uArrayList.remove(i2);
                   if (uArrayList.isEmpty()) {
                      tj.remove(i1);
                   }else {
                      continue ;
                   }
                }
             }else {
                continue ;
             }
          }
          this.q.remove(p0);
          this.o.remove(p0);
          this.r.remove(p0);
          this.p.remove(p0);
          this.j();
          return;
       }
       tj = this.l;
       int i3 = tj.size();
       while ((i3 = i3 - 1) >= 0) {
          ArrayList uArrayList1 = tj.get(i3);
          if (uArrayList1.remove(p0)) {
             a.setAlpha(0x3f800000);
             this.c(p0);
             if (uArrayList1.isEmpty()) {
                tj.remove(i3);
             }else {
                continue ;
             }
          }else {
             continue ;
          }
       }
    }
    public final void e(){
       float f;
       zr5 a;
       float f1;
       o71 oo71;
       o71 a1;
       ArrayList uArrayList1;
       q71 tj = this.j;
       int i = tj.size();
       while (true) {
          i = i - 1;
          f = 0;
          if (i >= 0) {
             p71 op71 = tj.get(i);
             a = op71.a.a;
             a.setTranslationY(f);
             a.setTranslationX(f);
             this.c(op71.a);
             tj.remove(i);
          }else {
             break ;
          }
       }
       tj = this.h;
       i = tj.size();
       while ((i = i - 1) >= 0) {
          this.c(tj.get(i));
          tj.remove(i);
       }
       tj = this.i;
       i = tj.size();
       while (true) {
          i = i - 1;
          f1 = 0x3f800000;
          if (i >= 0) {
             a = tj.get(i);
             a.a.setAlpha(f1);
             this.c(a);
             tj.remove(i);
          }else {
             break ;
          }
       }
       tj = this.k;
       i = tj.size();
       while ((i = i - 1) >= 0) {
          oo71 = tj.get(i);
          if ((a1 = oo71.a) != null) {
             this.l(oo71, a1);
          }
          if ((a1 = oo71.b) != null) {
             this.l(oo71, a1);
          }
       }
       tj.clear();
       if (!this.f()) {
          return;
       }
       tj = this.m;
       i = tj.size();
       while ((i = i - 1) >= 0) {
          ArrayList uArrayList = tj.get(i);
          int i1 = uArrayList.size();
          while ((i1 = i1 - 1) >= 0) {
             p71 op711 = uArrayList.get(i1);
             zr5 a2 = op711.a.a;
             a2.setTranslationY(f);
             a2.setTranslationX(f);
             this.c(op711.a);
             uArrayList.remove(i1);
             if (uArrayList.isEmpty()) {
                tj.remove(uArrayList);
             }
          }
       }
       tj = this.l;
       i = tj.size();
       while ((i = i - 1) >= 0) {
          uArrayList1 = tj.get(i);
          int i2 = uArrayList1.size();
          while ((i2 = i2 - 1) >= 0) {
             zr5 ozr5 = uArrayList1.get(i2);
             ozr5.a.setAlpha(f1);
             this.c(ozr5);
             uArrayList1.remove(i2);
             if (uArrayList1.isEmpty()) {
                tj.remove(uArrayList1);
             }
          }
       }
       tj = this.n;
       i = tj.size();
       while ((i = i - 1) >= 0) {
          uArrayList1 = tj.get(i);
          int i3 = uArrayList1.size();
          while ((i3 = i3 - 1) >= 0) {
             oo71 = uArrayList1.get(i3);
             if ((a1 = oo71.a) != null) {
                this.l(oo71, a1);
             }
             if ((a1 = oo71.b) != null) {
                this.l(oo71, a1);
             }
             if (uArrayList1.isEmpty()) {
                tj.remove(uArrayList1);
             }
          }
       }
       q71.i(this.q);
       q71.i(this.p);
       q71.i(this.o);
       q71.i(this.r);
       dr5 tb = this.b;
       if (tb.size() <= 0) {
          tb.clear();
          return;
       }else {
          tp2.v(tb.get(0));
          throw null;
       }
    }
    public final boolean f(){
       boolean b = (this.i.isEmpty() && (this.k.isEmpty() && (this.j.isEmpty() && (this.h.isEmpty() && (this.p.isEmpty() && (this.q.isEmpty() && (this.o.isEmpty() && (this.r.isEmpty() && (this.m.isEmpty() && (this.l.isEmpty() && this.n.isEmpty()))))))))))? false: true;
       return b;
    }
    public final boolean h(zr5 p0,int p1,int p2,int p3,int p4){
       p71 p2;
       zr5 a = p0.a;
       int i = p1 + (int)a.getTranslationX();
       int i1 = p2 + (int)p0.a.getTranslationY();
       this.m(p0);
       p1 = p3 - i;
       p2 = p4 - i1;
       if (!p1 && !p2) {
          this.c(p0);
          return false;
       }else if(p1){
          a.setTranslationX((float)(- p1));
       }
       if (p2) {
          a.setTranslationY((float)(- p2));
       }
       p2 = new p71(p0, i, i1, p3, p4);
       this.j.add(p2);
       return true;
    }
    public final void j(){
       if (!this.f()) {
          dr5 tb = this.b;
          if (tb.size() <= 0) {
             tb.clear();
          }else {
             tp2.v(tb.get(0));
             throw null;
          }
       }
       return;
    }
    public final void k(zr5 p0,ArrayList p1){
       int i = p1.size();
       while ((i = i - 1) >= 0) {
          o71 oo71 = p1.get(i);
          if (this.l(oo71, p0) && (oo71.a == null && oo71.b == null)) {
             p1.remove(oo71);
          }
       }
       return;
    }
    public final boolean l(o71 p0,zr5 p1){
       if (p0.b == p1) {
          p0.b = null;
       }else if(p0.a == p1){
          p0.a = null;
       }else {
          return false;
       }
       p1.a.setAlpha(0x3f800000);
       zr5 a = p1.a;
       a.setTranslationX(0);
       a.setTranslationY(0);
       this.c(p1);
       return true;
    }
    public final void m(zr5 p0){
       if (q71.s == null) {
          q71.s = new ValueAnimator().getInterpolator();
       }
       p0.a.animate().setInterpolator(q71.s);
       this.d(p0);
       return;
    }
}
