package p.ff2;
import p.af2;
import android.view.View;
import java.lang.Object;
import p.h87;
import java.util.ArrayList;
import p.m87;
import java.util.List;
import android.view.ViewGroup;
import p.k87;
import p.cf2;
import p.g87;
import p.df2;
import android.graphics.Rect;
import p.bf2;
import p.xe7;
import p.ac0;
import p.ka0;
import p.oe7;
import p.zb0;
import p.ef2;
import java.util.Collection;

public class ff2 extends af2	// class@0015b6 from classes.dex
{

    public void ff2(){
       super();
    }
    public final void a(View p0,Object p1){
       p1.c(p0);
    }
    public final void b(Object p0,ArrayList p1){
       int i1;
       if (p0 == null) {
          return;
       }
       List list = null;
       int i = 0;
       if (p0 instanceof m87) {
          i1 = p0.O.size();
          for (; i < i1; i = i + 1) {
             h87 oh87 = (i >= 0 && i < p0.O.size())? p0.O.get(i): list;
             this.b(oh87, p1);
          }
       }else if(af2.h(p0.v) && (af2.h(list) && af2.h(list))){
          i1 = 0;
       }else {
          i1 = 1;
       }
       if (!i1 && af2.h(p0.w)) {
          i1 = p1.size();
          for (; i < i1; i = i + 1) {
             p0.c(p1.get(i));
          }
       }
       return;
    }
    public final void c(ViewGroup p0,Object p1){
       k87.a(p0, p1);
    }
    public final boolean e(Object p0){
       return p0 instanceof h87;
    }
    public final Object f(Object p0){
       p0 = (p0 != null)? p0.k(): null;
       return p0;
    }
    public final Object i(Object p0,Object p1,Object p2){
       if (p0 != null && p1 != null) {
          m87 om87 = new m87();
          om87.L(p0);
          om87.L(p1);
          om87.P = false;
          p0 = om87;
       }else if(p0 != null){
          p0 = (p1 != null)? p1: null;
       }
       if (p2 != null) {
          p1 = new m87();
          if (p0 != null) {
             p1.L(p0);
          }
          p1.L(p2);
          return p1;
       }else {
          return p0;
       }
    }
    public final Object j(Object p0,Object p1){
       m87 om87 = new m87();
       if (p0 != null) {
          om87.L(p0);
       }
       om87.L(p1);
       return om87;
    }
    public final void k(Object p0,View p1,ArrayList p2){
       p0.a(new cf2(p1, p2));
    }
    public final void l(Object p0,Object p1,ArrayList p2,Object p3,ArrayList p4){
       df2 v6 = new df2(this, p1, p2, p3, p4);
       p0.a(v6);
    }
    public final void m(View p0,Object p1){
       if (p0 != null) {
          af2.g(p0, new Rect());
          p1.D(new bf2());
       }
       return;
    }
    public final void n(Object p0,Rect p1){
       p0.D(new bf2());
    }
    public final void o(Object p0,ac0 p1,ka0 p2){
       p1.a(new oe7(this, p0));
       p0.a(new ef2(p2));
    }
    public final void p(Object p0,View p1,ArrayList p2){
       h87 w = p0.w;
       w.clear();
       int i = p2.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          af2.d(p2.get(i1), w);
       }
       w.add(p1);
       p2.add(p1);
       this.b(p0, p2);
       return;
    }
    public final void q(Object p0,ArrayList p1,ArrayList p2){
       if (p0 != null) {
          h87 w = p0.w;
          w.clear();
          w.addAll(p2);
          this.s(p0, p1, p2);
       }
       return;
    }
    public final Object r(Object p0){
       if (p0 == null) {
          return null;
       }
       m87 om87 = new m87();
       om87.L(p0);
       return om87;
    }
    public final void s(Object p0,ArrayList p1,ArrayList p2){
       int i1;
       h87 w;
       List list = null;
       int i = 0;
       if (p0 instanceof m87) {
          i1 = p0.O.size();
          for (; i < i1; i = i + 1) {
             h87 oh87 = (i >= 0 && i < p0.O.size())? p0.O.get(i): list;
             this.s(oh87, p1, p2);
          }
       }else if(af2.h(p0.v) && (af2.h(list) && af2.h(list))){
          w = 0;
       }else {
          i1 = 1;
       }
       if (!i1) {
          w = p0.w;
          if (w.size() == p1.size() && w.containsAll(p1)) {
             w = (p2 == null)? 0: p2.size();
             while (i < w) {
                p0.c(p2.get(i));
                i = i + 1;
             }
             int i2 = p1.size();
             while ((i2--) >= 0) {
                p0.z(p1.get(i2));
             }
          }
       }
       return;
    }
}
