package p.qv3;
import java.lang.Cloneable;
import java.lang.Object;
import p.do5;
import java.lang.Long;
import java.lang.System;
import java.lang.AssertionError;
import java.lang.String;
import java.lang.StringBuilder;

public final class qv3 implements Cloneable	// class@002420 from classes.dex
{
    public boolean a;
    public long[] b;
    public Object[] c;
    public int t;
    public static final Object v;

    static {
       qv3.v = new Object();
    }
    public void qv3(){
       super(10);
    }
    public void qv3(int p0){
       super();
       this.a = false;
       if (!p0) {
          this.b = do5.t;
          this.c = do5.v;
       }else {
          p0 = p0 * 8;
          int i = 4;
          while (i < 32) {
             int i1 = 1 << i;
             i1 = i1 - 12;
             if (p0 <= i1) {
                p0 = i1;
                break ;
             }
             i = i + 1;
          }
          p0 = p0 / 8;
          long[] olongArray = new long[p0];
          this.b = olongArray;
          Object[] objArray = new Object[p0];
          this.c = objArray;
       }
       return;
    }
    public final void a(long p0,Long p1){
       qv3 tt;
       if ((tt = this.t) != null && (p0 - this.b[(tt - 1)]) <= 0) {
          this.h(p0, p1);
          return;
       }else if(this.a != null && tt >= this.b.length){
          this.e();
       }
       if ((tt = this.t) >= this.b.length) {
          int i = (tt + 1) * 8;
          int i1 = 4;
          while (i1 < 32) {
             int i2 = 1 << i1;
             i2 = i2 - 12;
             if (i <= i2) {
                i = i2;
                break ;
             }
             i1 = i1 + 1;
          }
          i = i / 8;
          long[] olongArray = new long[i];
          Object[] objArray = new Object[i];
          qv3 tb = this.b;
          System.arraycopy(tb, 0, olongArray, 0, tb.length);
          tb = this.c;
          System.arraycopy(tb, 0, objArray, 0, tb.length);
          this.b = olongArray;
          this.c = objArray;
       }
       this.b[tt] = p0;
       p0[tt] = p1;
       this.t = tt + 1;
       return;
    }
    public final void c(){
       qv3 tt = this.t;
       qv3 tc = this.c;
       for (int i = 0; i < tt; i = i + 1) {
          tc[i] = null;
       }
       this.t = 0;
       this.a = false;
       return;
    }
    public final Object clone(){
       return this.d();
    }
    public final qv3 d(){
       try{
          qv3 oqv3 = super.clone();
          oqv3.b = this.b.clone();
          oqv3.c = this.c.clone();
          return oqv3;
       }catch(java.lang.CloneNotSupportedException e0){
          throw new AssertionError(e0);
       }
    }
    public final void e(){
       object oobject;
       qv3 tt = this.t;
       qv3 tb = this.b;
       qv3 tc = this.c;
       int i = 0;
       int i1 = 0;
       while (i < tt) {
          if ((oobject = tc[i]) != qv3.v) {
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
    public final Object f(long p0,Long p1){
       int i;
       object oobject;
       if ((i = do5.e(this.b, this.t, p0)) >= 0 && (oobject = this.c[i]) != qv3.v) {
          return oobject;
       }
       return p1;
    }
    public final long g(int p0){
       if (this.a != null) {
          this.e();
       }
       return this.b[p0];
    }
    public final void h(long p0,Object p1){
       int i;
       int i1;
       int i3;
       if ((i = do5.e(this.b, this.t, p0)) >= 0) {
          p0[i] = p1;
       }else {
          i = ~ i;
          qv3 tt = this.t;
          if (i < tt) {
             qv3 tc = this.c;
             if (tc[i] == qv3.v) {
                this.b[i] = p0;
                tc[i] = p1;
                return;
             }
          }
          if (this.a != null && tt >= this.b.length) {
             this.e();
             i = ~ do5.e(this.b, this.t, p0);
          }
          if ((tt = this.t) >= this.b.length) {
             i1 = (tt + 1) * 8;
             int i2 = 4;
             while (i2 < 32) {
                i3 = 1 << i2;
                i3 = i3 - 12;
                if (i1 <= i3) {
                   i1 = i3;
                   break ;
                }
                i2 = i2 + 1;
             }
             i1 = i1 / 8;
             long[] olongArray = new long[i1];
             Object[] objArray = new Object[i1];
             qv3 tb = this.b;
             System.arraycopy(tb, 0, olongArray, 0, tb.length);
             tb = this.c;
             System.arraycopy(tb, 0, objArray, 0, tb.length);
             this.b = olongArray;
             this.c = objArray;
          }
          if (i1 = this.t - i) {
             i3 = i + 1;
             System.arraycopy(this.b, i, this.b, i3, i1);
             System.arraycopy(this.c, i, this.c, i3, (this.t - i));
          }
          this.b[i] = p0;
          p0[i] = p1;
          this.t = this.t + 1;
       }
       return;
    }
    public final void i(long p0){
       int i;
       if ((i = do5.e(this.b, this.t, p0)) >= 0) {
          qv3 tc = this.c;
          Object v = qv3.v;
          if (tc[i] != v) {
             tc[i] = v;
             this.a = true;
          }
       }
       return;
    }
    public final int j(){
       if (this.a != null) {
          this.e();
       }
       return this.t;
    }
    public final Object k(int p0){
       if (this.a != null) {
          this.e();
       }
       return this.c[p0];
    }
    public final String toString(){
       Object obj;
       if (this.j() <= 0) {
          return "{}";
       }
       StringBuilder str = new StringBuilder((this.t * 28))+'{';
       int i = 0;
       while (i < this.t) {
          if (i > 0) {
             str = str.append(", ");
          }
          str = str.append(this.g(i)).append('=');
          str = ((obj = this.k(i)) != this)? str.append(obj): str.append("\(this Map\)");
          i = i + 1;
       }
       return str+'}';
    }
}
