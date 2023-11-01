package p.cq0;
import p.wq0;
import p.bq0;
import java.lang.Object;
import java.util.HashSet;
import p.bp7;
import java.util.ArrayList;
import java.util.Iterator;
import p.w51;
import java.lang.Enum;
import java.lang.AssertionError;
import java.lang.String;
import p.jn2;
import p.fn6;
import java.lang.StringBuilder;

public final class cq0	// class@001256 from classes.dex
{
    public HashSet a;
    public int b;
    public boolean c;
    public final wq0 d;
    public final bq0 e;
    public cq0 f;
    public int g;
    public int h;
    public fn6 i;

    public void cq0(wq0 p0,bq0 p1){
       super();
       this.a = null;
       this.g = 0;
       this.h = Integer.MIN_VALUE;
       this.d = p0;
       this.e = p1;
    }
    public final void a(cq0 p0,int p1){
       this.b(p0, p1, Integer.MIN_VALUE, false);
    }
    public final boolean b(cq0 p0,int p1,int p2,boolean p3){
       if (p0 == null) {
          this.j();
          return true;
       }else if(!p3 && !this.i(p0)){
          return false;
       }else {
          this.f = p0;
          if (p0.a == null) {
             p0.a = new HashSet();
          }
          if ((p0 = this.f.a) != null) {
             p0.add(this);
          }
          this.g = p1;
          this.h = p2;
          return true;
       }
    }
    public final void c(int p0,bp7 p1,ArrayList p2){
       cq0 ta;
       if ((ta = this.a) != null) {
          Iterator iterator = ta.iterator();
          while (iterator.hasNext()) {
             w51.r(iterator.next().d, p0, p2, p1);
          }
       }
       return;
    }
    public final int d(){
       if (this.c == null) {
          return 0;
       }
       return this.b;
    }
    public final int e(){
       cq0 th;
       cq0 tf;
       if (this.d.h0 == 8) {
          return 0;
       }
       if ((th = this.h) != Integer.MIN_VALUE && ((tf = this.f) != null && tf.d.h0 == 8)) {
          return th;
       }
       return this.g;
    }
    public final cq0 f(){
       cq0 te = this.e;
       cq0 td = this.d;
       switch (te.ordinal()){
           case 0:
           case 5:
           case 6:
           case 7:
           case 8:
             return null;
           case 1:
             return td.K;
           case 2:
             return td.L;
           case 3:
             return td.I;
           case 4:
             return td.J;
           default:
             throw new AssertionError(te.name());
       }
    }
    public final boolean g(){
       cq0 ta;
       if ((ta = this.a) == null) {
          return false;
       }
       Iterator iterator = ta.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().f().h()) {
             break ;
          }
       }
       return true;
    }
    public final boolean h(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public final boolean i(cq0 p0){
       boolean b1;
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       bq0 v = bq0.v;
       cq0 te = this.e;
       cq0 d = p0.d;
       if ((p0 = p0.e) == te) {
          if (te == v && (d.E == null && this.d.E != null)) {
             return b;
          }else {
             return true;
          }
       }else {
          bq0 y = bq0.y;
          bq0 c = bq0.c;
          bq0 x = bq0.x;
          bq0 a = bq0.a;
          switch (te.ordinal()){
              case 0:
              case 7:
              case 8:
              case 1:
              case 3:
                b1 = (p0 != a && p0 != c)? false: true;
                if (d instanceof jn2) {
                   if (b1 || p0 == x) {
                      b = 1;
                   }
                   b1 = b;
                }
                return b1;
                break;
              case 2:
              case 4:
                b1 = (p0 != bq0.b && p0 != bq0.t)? false: true;
                if (d instanceof jn2) {
                   if (b1 || p0 == y) {
                      b = 1;
                   }
                   b1 = b;
                }
                return b1;
                break;
              case 5:
                if (p0 != a && p0 != c) {
                   return true;
                }else {
                   return b;
                }
                break;
              case 6:
                if (p0 != v && (p0 != x && p0 != y)) {
                   b = true;
                }
                return b;
                break;
              default:
                throw new AssertionError(te.name());
          }
          return b;
       }
    }
    public final void j(){
       cq0 tf = this.f;
       HashSet hashSet = null;
       if (tf != null && (tf = tf.a) != null) {
          tf.remove(this);
          if (!this.f.a.size()) {
             this.f.a = hashSet;
          }
       }
       this.a = hashSet;
       this.f = hashSet;
       this.g = 0;
       this.h = Integer.MIN_VALUE;
       this.c = false;
       this.b = 0;
       return;
    }
    public final void k(){
       cq0 ti;
       if ((ti = this.i) == null) {
          this.i = new fn6(1);
       }else {
          ti.c();
       }
       return;
    }
    public final void l(int p0){
       this.b = p0;
       this.c = true;
    }
    public final String toString(){
       return this.d.i0+":"+this.e.toString();
    }
}
