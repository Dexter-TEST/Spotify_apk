package p.t63;
import p.ly7;
import p.j65;
import p.is3;
import java.lang.Object;
import java.util.ArrayList;
import p.c0;
import p.lj2;
import p.nv6;
import java.util.Queue;
import p.tx;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
import p.xq0;
import p.b00;
import p.xy5;
import p.m91;
import p.nr7;
import java.util.List;
import p.ys5;
import com.google.common.collect.c;
import java.lang.String;
import p.w51;
import java.util.Iterator;
import com.spotify.webapi.service.models.SavedTrack;
import p.do5;
import java.util.Arrays;
import java.lang.Throwable;
import java.lang.System;
import java.lang.IllegalStateException;
import p.xw7;
import p.o08;
import p.a70;
import p.tu6;
import p.yz7;
import p.m18;
import android.content.Context;
import java.lang.Exception;
import java.lang.Integer;
import io.reactivex.rxjava3.core.Single;
import p.aq6;
import p.yp6;
import java.lang.IllegalArgumentException;
import p.cm7;
import p.up0;
import p.yf2;
import p.rm;
import p.fw;
import p.kk5;
import p.uy;
import p.uw6;
import p.sw6;
import androidx.constraintlayout.widget.ConstraintLayout;
import p.rn1;
import java.lang.Class;
import java.lang.Iterable;
import p.wq0;
import p.iq0;
import p.fr0;
import p.lj3;
import p.ov6;
import java.lang.Thread;
import java.lang.NullPointerException;
import p.ap7;
import p.o91;

public final class t63 implements ly7, j65, is3	// class@00270b from classes.dex
{
    public final int a;
    public Object b;
    public Object c;
    public Object t;

    public void t63(int p0){
       this.a = p0;
       if (p0 != 13) {
          if (p0 != 14) {
             super();
             return;
          }else {
             super();
             this.b = new ArrayList();
             return;
          }
       }else {
          super();
          c0 a = c0.a;
          this.c = a;
          this.t = a;
          return;
       }
    }
    public void t63(Object p0,Object p1,Object p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public void t63(lj2 p0){
       this.a = 8;
       super();
       this.b = p0;
    }
    public void t63(nv6 p0,Queue p1){
       this.a = 15;
       super();
       this.c = p0;
       this.b = p0.a;
       this.t = p1;
    }
    public void t63(tx p0,ZipFile p1,ZipEntry p2){
       this.a = 7;
       this.t = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void t63(xq0 p0){
       this.a = 1;
       super();
       this.b = new ArrayList();
       this.c = new b00();
       this.t = p0;
    }
    public void t63(xy5 p0){
       this.a = 0;
       super();
       this.b = p0;
       this.c = new m91(this, p0, 11);
       this.t = new nr7(this, p0, 3);
    }
    public static ys5 t(List p0){
       SavedTrack track;
       int i = p0.size();
       w51.h(i, "expectedSize");
       w51.h(i, "initialCapacity");
       Object[] objArray = new Object[i];
       Iterator iterator = p0.iterator();
       int i1 = 0;
       int i2 = 0;
       while (iterator.hasNext()) {
          if ((track = iterator.next().track) != null) {
             int i3 = i1 + 1;
             if (objArray.length < i3) {
                objArray = Arrays.copyOf(objArray, do5.t(objArray.length, i3));
             }else if(i2){
                objArray = objArray.clone();
             }
             i2 = 0;
             i3 = i1 + 1;
             objArray[i1] = track;
             i1 = i3;
          }
       }
       return c.m(i1, objArray);
    }
    public final void a(){
       this.p(null);
    }
    public final void b(Object[] p0){
       object oobject;
       if (!p0.length) {
       }else {
          oobject = p0[(p0.length - 1)];
          if (oobject instanceof Throwable) {
          label_0011 :
             if (oobject != null) {
                if (p0.length) {
                   int i = p0.length - 1;
                   Object[] objArray = new Object[i];
                   if (i > 0) {
                      System.arraycopy(p0, 0, objArray, 0, i);
                   }
                   this.p(objArray);
                }else {
                   throw new IllegalStateException("non-sensical empty or null argument array");
                }
             }else {
                this.p(p0);
             }
             return;
          }
       }
       oobject = null;
       goto label_0011 ;
    }
    public final Object c(){
       xw7 oxw7 = this.c.c();
       a70 a = this.t.a.a;
       tu6.E(a);
       return new yz7(this.b.c(), a);
    }
    public final void d(Object p0,Exception p1){
       this.q(p0, p1);
    }
    public final void e(String p0,Exception p1){
       this.p(null);
    }
    public final void f(Integer p0){
       Object[] objArray = new Object[]{p0};
       this.p(objArray);
    }
    public final Single first(){
       if (this.b.b != yp6.y0) {
          return Single.error(new IllegalArgumentException(this.b.toString()));
       }
       return this.c.v().map(new up0(11, this));
    }
    public final Single g(String p0){
       return this.c.m(p0).map(new rm(13));
    }
    public final String getName(){
       return this.b;
    }
    public final void h(String p0){
       Object[] objArray = new Object[]{p0};
       this.p(objArray);
    }
    public final void i(String p0,Object p1,String p2){
       this.q(p0, p1);
    }
    public final fw j(){
       String str = (this.b == null)? " backendName": "";
       if (this.t == null) {
          str = str.concat(" priority");
       }
       if (str.isEmpty()) {
          return new fw(this.b, this.c, this.t);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final void k(String p0){
       this.b.b();
       uw6 ouw6 = this.t.c();
       if (p0 == null) {
          ouw6.z(1);
       }else {
          ouw6.s(1, p0);
       }
       this.b.c();
       ouw6.u();
       this.b.r();
       this.b.m();
       this.t.f(ouw6);
       return;
    }
    public final ConstraintLayout l(){
       switch (this.a){
           case 10:
           default:
             return this.b;
       }
       return this.b;
    }
    public final void m(List p0){
       this.b.b();
       this.b.c();
       t63 tc = this.c;
       tc.getClass();
       uw6 ouw6 = tc.c();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          tc.g(ouw6, iterator.next());
          ouw6.Z();
       }
       tc.f(ouw6);
       this.b.r();
       this.b.m();
       return;
    }
    public final boolean n(int p0,wq0 p1,iq0 p2){
       t63 tc = this.c;
       wq0 t = p1.T;
       tc.a = t[0];
       int i = 1;
       tc.b = t[i];
       tc.c = p1.r();
       this.c.d = p1.l();
       tc = this.c;
       tc.i = false;
       tc.j = p0;
       t = 3;
       p0 = (tc.a == t)? 1: 0;
       t = (tc.b == t)? 1: 0;
       int i1 = 0;
       p0 = (p0 && (i1 - p1.X) > 0)? 1: 0;
       t = (t && (i1 - p1.X) > 0)? 1: 0;
       wq0 t1 = p1.t;
       if (p0 && t1[0] == 4) {
          tc.a = i;
       }
       if (t && t1[i] == 4) {
          tc.b = i;
       }
       p2.b(p1, tc);
       p1.O(this.c.e);
       p1.L(this.c.f);
       t63 tc1 = this.c;
       t63 ot63 = tc1;
       p1.E = ot63.h;
       b00 g = ot63.g;
       p1.b0 = g;
       if (g <= null) {
          i = false;
       }
       p1.E = i;
       tc1.j = 0;
       return tc1.i;
    }
    public final void o(fr0 p0){
       this.t = p0;
       int i = this.b.size();
       while ((i = i - 1) >= 0) {
          lj3 olj3 = this.b.get(i);
          this.c = olj3;
          p0.accept(olj3);
       }
       this.c = null;
       this.t = null;
       return;
    }
    public final void p(Object[] p0){
       ov6 oov6 = new ov6();
       System.currentTimeMillis();
       oov6.a = this.c;
       Thread.currentThread().getName();
       oov6.b = p0;
       this.t.add(oov6);
    }
    public final void q(Object p0,Object p1){
       Object[] objArray;
       if (p1 instanceof Throwable) {
          objArray = new Object[]{p0};
          this.p(objArray);
       }else {
          objArray = new Object[]{p0,p1};
          this.p(objArray);
       }
       return;
    }
    public final void r(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null backendName");
       }
       this.b = p0;
       return;
    }
    public final void s(xq0 p0,int p1,int p2,int p3){
       wq0 c0 = p0.c0;
       wq0 d0 = p0.d0;
       p0.c0 = 0;
       p0.d0 = 0;
       p0.O(p2);
       p0.L(p3);
       p0.c0 = (c0 < null)? 0: c0;
       p0.d0 = (d0 < null)? 0: d0;
       t63 tt = this.t;
       tt.t0 = p1;
       tt.R();
       return;
    }
    public final void u(xq0 p0){
       int i2;
       this.b.clear();
       int i = p0.q0.size();
       int i1 = 0;
       while (true) {
          i2 = 1;
          if (i1 < i) {
             wq0 owq0 = p0.q0.get(i1);
             wq0 t = owq0.T;
             if (t[0] == 3 || t[i2] == 3) {
                this.b.add(owq0);
             }
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       p0.b = i2;
       return;
    }
}
