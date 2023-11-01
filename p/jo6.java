package p.jo6;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.System;
import java.lang.AssertionError;
import java.lang.Integer;
import p.do5;
import java.lang.String;
import java.lang.StringBuilder;

public final class jo6 implements Cloneable	// class@001b18 from classes.dex
{
    public boolean a;
    public int[] b;
    public Object[] c;
    public int t;
    public static final Object v;

    static {
       jo6.v = new Object();
    }
    public void jo6(){
       int i2;
       super();
       this.a = false;
       int i = 4;
       int i1 = 4;
       while (true) {
          i2 = 40;
          if (i1 < 32) {
             int i3 = 1 << i1;
             i3 = i3 - 12;
             if (i2 <= i3) {
                i2 = i3;
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             break ;
          }
       }
       i2 = i2 / i;
       int[] ointArray = new int[i2];
       this.b = ointArray;
       Object[] objArray = new Object[i2];
       this.c = objArray;
       return;
    }
    public final void a(int p0,Object p1){
       jo6 tt;
       if ((tt = this.t) != null && p0 <= this.b[(tt - 1)]) {
          this.f(p0, p1);
          return;
       }else if(this.a != null && tt >= this.b.length){
          this.d();
       }
       if ((tt = this.t) >= this.b.length) {
          int i = 4;
          int i1 = (tt + 1) * 4;
          int i2 = 4;
          while (i2 < 32) {
             int i3 = 1 << i2;
             i3 = i3 - 12;
             if (i1 <= i3) {
                i1 = i3;
                break ;
             }
             i2 = i2 + 1;
          }
          i1 = i1 / i;
          int[] ointArray = new int[i1];
          Object[] objArray = new Object[i1];
          jo6 tb = this.b;
          System.arraycopy(tb, 0, ointArray, 0, tb.length);
          tb = this.c;
          System.arraycopy(tb, 0, objArray, 0, tb.length);
          this.b = ointArray;
          this.c = objArray;
       }
       this.b[tt] = p0;
       p0[tt] = p1;
       this.t = tt + 1;
       return;
    }
    public final jo6 c(){
       try{
          jo6 ojo6 = super.clone();
          ojo6.b = this.b.clone();
          ojo6.c = this.c.clone();
          return ojo6;
       }catch(java.lang.CloneNotSupportedException e0){
          throw new AssertionError(e0);
       }
    }
    public final Object clone(){
       return this.c();
    }
    public final void d(){
       object oobject;
       jo6 tt = this.t;
       jo6 tb = this.b;
       jo6 tc = this.c;
       int i = 0;
       int i1 = 0;
       while (i < tt) {
          if ((oobject = tc[i]) != jo6.v) {
             if (i != i1) {
                tb[i1] = tb[i];
                tc[i1] = oobject;
                tc[i] = null;
             }
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       this.a = false;
       this.t = i1;
       return;
    }
    public final Object e(int p0,Integer p1){
       object oobject;
       if ((p0 = do5.d(this.t, p0, this.b)) >= 0 && (oobject = this.c[p0]) != jo6.v) {
          return oobject;
       }
       return p1;
    }
    public final void f(int p0,Object p1){
       int i;
       int i2;
       int i3;
       if ((i = do5.d(this.t, p0, this.b)) >= 0) {
          p0[i] = p1;
       }else {
          i = ~ i;
          jo6 tt = this.t;
          if (i < tt) {
             jo6 tc = this.c;
             if (tc[i] == jo6.v) {
                this.b[i] = p0;
                tc[i] = p1;
                return;
             }
          }
          if (this.a != null && tt >= this.b.length) {
             this.d();
             i = ~ do5.d(this.t, p0, this.b);
          }
          if ((tt = this.t) >= this.b.length) {
             int i1 = 4;
             i2 = (tt + 1) * 4;
             i3 = 4;
             while (i3 < 32) {
                int i4 = 1 << i3;
                i4 = i4 - 12;
                if (i2 <= i4) {
                   i2 = i4;
                   break ;
                }
                i3 = i3 + 1;
             }
             i2 = i2 / i1;
             int[] ointArray = new int[i2];
             Object[] objArray = new Object[i2];
             jo6 tb = this.b;
             System.arraycopy(tb, 0, ointArray, 0, tb.length);
             tb = this.c;
             System.arraycopy(tb, 0, objArray, 0, tb.length);
             this.b = ointArray;
             this.c = objArray;
          }
          if (i2 = this.t - i) {
             i3 = i + 1;
             System.arraycopy(this.b, i, this.b, i3, i2);
             System.arraycopy(this.c, i, this.c, i3, (this.t - i));
          }
          this.b[i] = p0;
          p0[i] = p1;
          this.t = this.t + 1;
       }
       return;
    }
    public final int g(){
       if (this.a != null) {
          this.d();
       }
       return this.t;
    }
    public final Object h(int p0){
       if (this.a != null) {
          this.d();
       }
       return this.c[p0];
    }
    public final String toString(){
       Object obj;
       if (this.g() <= 0) {
          return "{}";
       }
       StringBuilder str = new StringBuilder((this.t * 28))+'{';
       int i = 0;
       while (i < this.t) {
          if (i > 0) {
             str = str.append(", ");
          }
          if (this.a != null) {
             this.d();
          }
          str = str.append(this.b[i]).append('=');
          str = ((obj = this.h(i)) != this)? str.append(obj): str.append("\(this Map\)");
          i = i + 1;
       }
       return str+'}';
    }
}
