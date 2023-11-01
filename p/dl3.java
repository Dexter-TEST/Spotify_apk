package p.dl3;
import java.io.Serializable;
import java.util.AbstractMap;
import p.dv0;
import p.cl3;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.Comparable;
import java.util.Comparator;
import java.lang.ClassCastException;
import java.lang.Class;
import java.util.Map$Entry;
import java.lang.Math;
import java.util.Set;
import p.al3;
import java.lang.NullPointerException;

public final class dl3 extends AbstractMap implements Serializable	// class@00136b from classes.dex
{
    public final Comparator a;
    public cl3 b;
    public int c;
    public int t;
    public final cl3 v;
    public al3 w;
    public al3 x;
    public static final dv0 y;

    static {
       dl3.y = new dv0(8);
    }
    public void dl3(){
       super();
       this.c = 0;
       this.t = 0;
       this.v = new cl3();
       this.a = dl3.y;
    }
    private void readObject(ObjectInputStream p0){
       throw new InvalidObjectException("Deserialization is unsupported");
    }
    private Object writeReplace(){
       return new LinkedHashMap(this);
    }
    public final cl3 a(Object p0,boolean p1){
       int i;
       cl3 b;
       cl3 uocl31;
       dl3 tb = this.b;
       cl3 uocl3 = null;
       dv0 y = dl3.y;
       dl3 ta = this.a;
       if (tb != null) {
          Comparable uComparable = (ta == y)? p0: uocl3;
          while (true) {
             cl3 w = tb.w;
             if (uComparable != null) {
                i = uComparable.compareTo(w);
             label_001d :
                if (!i) {
                   return tb;
                }else if(i < 0){
                   b = tb.b;
                }else {
                   b = tb.c;
                }
                if (b != null) {
                   tb = b;
                }
             }else {
                i = ta.compare(p0, w);
                goto label_001d ;
             }
          }
       }else {
          i = 0;
       }
       if (!p1) {
          return uocl3;
       }else {
          int i1 = 1;
          dl3 tv = this.v;
          if (tb == null) {
             if (ta == y && !p0 instanceof Comparable) {
                throw new ClassCastException(p0.getClass().getName().concat(" is not Comparable"));
             }else {
                uocl31 = new cl3(tb, p0, tv, tv.v);
                this.b = uocl31;
             }
          }else {
             uocl31 = new cl3(tb, p0, tv, tv.v);
             tb.b = (i < 0)? uocl31: uocl31;
             this.c(tb, i1);
          }
          this.c = this.c + i1;
          this.t = this.t + i1;
          return uocl31;
       }
    }
    public final cl3 b(Map$Entry p0){
       cl3 x;
       int i;
       cl3 key = p0.getKey();
       cl3 uocl3 = null;
       boolean b = false;
       key = (key != null)? this.a(key, b): uocl3;
    }
    public final void c(cl3 p0,boolean p1){
       int i1;
       while (p0 != null) {
          cl3 b = p0.b;
          cl3 c = p0.c;
          int i = 0;
          cl3 y = (b != null)? b.y: 0;
          cl3 y1 = (c != null)? c.y: 0;
          if ((i1 = y - y1) == -2) {
             b = c.b;
             y = ((y = c.c) != null)? y.y: 0;
             if (b != null) {
                i = b.y;
             }
             if ((i = i - y) != -1 && (i && !p1)) {
                this.g(c);
                this.f(p0);
             }else {
                this.f(p0);
             }
             if (p1) {
                break ;
             }
          }else {
             int i3 = 1;
             if (i1 == 2) {
                c = b.b;
                y = ((y = b.c) != null)? y.y: 0;
                if (c != null) {
                   i = c.y;
                }
                if ((i = i - y) != i3 && (i && !p1)) {
                   this.f(b);
                   this.g(p0);
                }else {
                   this.g(p0);
                }
                if (p1) {
                   break ;
                }
             }else if(!i1){
                int i2 = y + 1;
                p0.y = i2;
                if (p1) {
                   break ;
                }
             }else {
                int i4 = Math.max(y, y1) + i3;
                p0.y = i4;
                if (!p1) {
                   break ;
                }
             }
          }
          p0 = p0.a;
       }
       return;
    }
    public final void clear(){
       this.b = null;
       this.c = 0;
       this.t = this.t + 1;
       dl3 tv = this.v;
       tv.v = tv;
       tv.t = tv;
    }
    public final boolean containsKey(Object p0){
       boolean b = false;
       p0 = (p0 != null)? this.a(p0, b): null;
    }
    public final void d(cl3 p0,boolean p1){
       cl3 v;
       if (p1) {
          v = p0.v;
          v.t = p0.t;
          p0.t.v = v;
       }
       v = p0.b;
       cl3 c = p0.c;
       cl3 a = p0.a;
       boolean b = false;
       if (v != null && c != null) {
          if (v.y > c.y) {
             c = v.c;
             while (true) {
                c = v;
                if ((v = c) != null) {
                   c = v.c;
                }
             }
          }else {
             v = c.b;
             while (true) {
                c = v;
                v = c;
                if (c != null) {
                   v = c.b;
                }else {
                   break ;
                }
             }
             c = v;
          }
          this.d(c, b);
          if ((v = p0.b) != null) {
             a = v.y;
             c.b = v;
             v.a = c;
             p0.b = null;
          }else {
             int i = 0;
          }
          if ((v = p0.c) != null) {
             b = v.y;
             c.c = v;
             v.a = c;
             p0.c = null;
          }
          c.y = Math.max(a, b) + 1;
          this.e(p0, c);
          return;
       }else if(v != null){
          this.e(p0, v);
          p0.b = null;
       }else if(c != null){
          this.e(p0, c);
          p0.c = null;
       }else {
          this.e(p0, null);
       }
       this.c(a, b);
       this.c = this.c - 1;
       this.t = this.t + 1;
       return;
    }
    public final void e(cl3 p0,cl3 p1){
       cl3 a = p0.a;
       p0.a = null;
       if (p1 != null) {
          p1.a = a;
       }
       if (a != null) {
          a.b = (a.b == p0)? p1: p1;
       }else {
          this.b = p1;
       }
       return;
    }
    public final Set entrySet(){
       dl3 tw;
       if ((tw = this.w) != null) {
       }else {
          tw = new al3(this, 0);
          this.w = tw;
       }
       return tw;
    }
    public final void f(cl3 p0){
       int i2;
       cl3 b = p0.b;
       cl3 c = p0.c;
       cl3 b1 = c.b;
       cl3 c1 = c.c;
       p0.c = b1;
       if (b1 != null) {
          b1.a = p0;
       }
       this.e(p0, c);
       c.b = p0;
       p0.a = c;
       int i = 0;
       b = (b != null)? b.y: 0;
       b1 = (b1 != null)? b1.y: 0;
       int i1 = Math.max(b, b1) + 1;
       p0.y = i1;
       if (c1 != null) {
          i = c1.y;
       }
       c.y = Math.max(i1, i) + 1;
       return;
    }
    public final void g(cl3 p0){
       int i2;
       cl3 b = p0.b;
       cl3 c = p0.c;
       cl3 b1 = b.b;
       cl3 c1 = b.c;
       p0.b = c1;
       if (c1 != null) {
          c1.a = p0;
       }
       this.e(p0, b);
       b.c = p0;
       p0.a = b;
       int i = 0;
       c = (c != null)? c.y: 0;
       c1 = (c1 != null)? c1.y: 0;
       int i1 = Math.max(c, c1) + 1;
       p0.y = i1;
       if (b1 != null) {
          i = b1.y;
       }
       b.y = Math.max(i1, i) + 1;
       return;
    }
    public final Object get(Object p0){
       cl3 uocl3 = null;
       if (p0 != null) {
          boolean b = false;
          try{
             p0 = this.a(p0, b);
          }catch(java.lang.ClassCastException e0){
             p0 = e0;
          }
       }else {
       }
       if (p0 != null) {
          uocl3 = p0.x;
       }
       return uocl3;
    }
    public final Set keySet(){
       dl3 tx;
       if ((tx = this.x) != null) {
       }else {
          tx = new al3(this, 1);
          this.x = tx;
       }
       return tx;
    }
    public final Object put(Object p0,Object p1){
       if (p0 == null) {
          throw new NullPointerException("key == null");
       }
       p0 = this.a(p0, true);
       cl3 x = p0.x;
       p0.x = p1;
       return x;
    }
    public final Object remove(Object p0){
       cl3 uocl3 = null;
       if (p0 != null) {
          boolean b = false;
          try{
             p0 = this.a(p0, b);
          label_000b :
             if (p0 != null) {
                this.d(p0, true);
             }
             if (p0 != null) {
                uocl3 = p0.x;
             }
             return uocl3;
          }catch(java.lang.ClassCastException e0){
          }
          p0 = e0;
          goto label_000b ;
       }else {
       }
    }
    public final int size(){
       return this.c;
    }
}
