package p.wh6;
import java.lang.Object;
import p.do5;
import java.lang.System;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.lang.String;
import java.lang.StringBuilder;

public class wh6	// class@002b3b from classes.dex
{
    public int[] a;
    public Object[] b;
    public int c;
    public static Object[] t;
    public static int v;
    public static Object[] w;
    public static int x;

    public void wh6(){
       super();
       this.a = do5.c;
       this.b = do5.v;
       this.c = 0;
    }
    public void wh6(int p0){
       super();
       if (!p0) {
          this.a = do5.c;
          this.b = do5.v;
       }else {
          this.a(p0);
       }
       this.c = 0;
       return;
    }
    private void a(int p0){
       wh6 owh6;
       Object[] w;
       if (p0 == 8) {
          owh6 = wh6.class;
          _monitor_enter(owh6);
          if ((w = wh6.w) != null) {
             this.b = w;
             wh6.w = w[0];
             this.a = w[1];
             w[1] = null;
             w[0] = null;
             wh6.x = wh6.x - 1;
             _monitor_exit(owh6);
             return;
          }else {
             _monitor_exit(owh6);
          }
       }else if(p0 == 4){
          owh6 = wh6.class;
          _monitor_enter(owh6);
          if ((w = wh6.t) != null) {
             this.b = w;
             wh6.t = w[0];
             this.a = w[1];
             w[1] = null;
             w[0] = null;
             wh6.v = wh6.v - 1;
             _monitor_exit(owh6);
             return;
          }else {
             _monitor_exit(owh6);
          }
       }
       int[] ointArray = new int[p0];
       this.a = ointArray;
       Object[] objArray = new Object[(p0 << 1)];
       this.b = objArray;
       return;
    }
    public static void c(int[] p0,Object[] p1,int p2){
       int i;
       if (p0.length == 8) {
          _monitor_enter(wh6.class);
          if (wh6.x < 10) {
             p1[0] = wh6.w;
             p1[1] = p0;
             for (i = (p2 << 1) - 1; i >= 2; i--) {
                p1[i] = null;
             }
             wh6.w = p1;
             wh6.x = wh6.x + 1;
          }
          _monitor_exit(wh6.class);
       }else if(p0.length == 4){
          _monitor_enter(wh6.class);
          if (wh6.v < 10) {
             p1[0] = wh6.t;
             p1[1] = p0;
             for (i = (p2 << 1) - 1; i >= 2; i--) {
                p1[i] = null;
             }
             wh6.t = p1;
             wh6.v = wh6.v + 1;
          }
          _monitor_exit(wh6.class);
       }
       return;
    }
    public final void b(int p0){
       wh6 tc = this.c;
       wh6 ta = this.a;
       if (ta.length < p0) {
          wh6 tb = this.b;
          this.a(p0);
          if (this.c > null) {
             System.arraycopy(ta, 0, this.a, 0, tc);
             System.arraycopy(tb, 0, this.b, 0, (tc << 1));
          }
          wh6.c(ta, tb, tc);
       }
       if (this.c == tc) {
          return;
       }else {
          throw new ConcurrentModificationException();
       }
    }
    public final void clear(){
       wh6 tc;
       if ((tc = this.c) > null) {
          wh6 ta = this.a;
          wh6 tb = this.b;
          this.a = do5.c;
          this.b = do5.v;
          this.c = 0;
          wh6.c(ta, tb, tc);
       }
       if (this.c <= null) {
          return;
       }else {
          throw new ConcurrentModificationException();
       }
    }
    public final boolean containsKey(Object p0){
       boolean b = (this.e(p0) >= 0)? true: false;
       return b;
    }
    public final boolean containsValue(Object p0){
       boolean b = (this.g(p0) >= 0)? true: false;
       return b;
    }
    public final int d(int p0,Object p1){
       int i1;
       wh6 tc = this.c;
       int i = -1;
       if (tc == null) {
          return i;
       }
       wh6 ta = this.a;
       try{
          if ((i1 = do5.d(tc, p0, ta)) < 0) {
             return i1;
          }
          if (p1.equals(this.b[(i1 << 1)])) {
             return i1;
          }
          int i2 = i1 + 1;
          while (true) {
             if (i2 < tc && this.a[i2] == p0) {
                int i3 = i2 << 1;
                if (p1.equals(this.b[i3])) {
                   break ;
                }else {
                   i2 = i2 + 1;
                }
             }else {
                i1 = i1 + i;
                while (true) {
                   if (i1 < 0 || this.a[i1] != p0) {
                      return (~ i2);
                   }
                   i = i1 << 1;
                   if (p1.equals(this.b[i])) {
                      return i1;
                   }
                   i1 = i1 - 1;
                }
             }
          }
          return i2;
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
          throw new ConcurrentModificationException();
       }
    }
    public final int e(Object p0){
       int i = (p0 == null)? this.f(): this.d(p0.hashCode(), p0);
       return i;
    }
    public final boolean equals(Object p0){
       int i;
       Object obj;
       Object obj1;
       Object orDefault;
       if (this == p0) {
          return true;
       }
       boolean b = false;
       try{
          if (p0 instanceof wh6) {
             if (this.c != p0.c) {
                return b;
             }else {
                i = 0;
                while (true) {
                   if (i >= this.c) {
                      return true;
                   }
                   obj = this.h(i);
                   obj1 = this.j(i);
                   orDefault = p0.getOrDefault(obj, null);
                   if (obj1 == null) {
                      if (orDefault != null || !p0.containsKey(obj)) {
                         break ;
                      }
                   }else if(!obj1.equals(orDefault)){
                      return b;
                   }
                   i = i + 1;
                }
                return b;
             }
          }else if(p0 instanceof Map){
             if (this.c != p0.size()) {
                return b;
             }
             i = 0;
             while (true) {
                if (i >= this.c) {
                   return true;
                }
                obj = this.h(i);
                obj1 = this.j(i);
                orDefault = p0.get(obj);
                if (obj1 == null) {
                   if (orDefault != null || !p0.containsKey(obj)) {
                      break ;
                   }
                }else if(!obj1.equals(orDefault)){
                   return b;
                }
                i = i + 1;
             }
             return b;
          }else {
             return b;
          }
       }catch(java.lang.NullPointerException e0){
       }catch(java.lang.ClassCastException e0){
       }
    }
    public final int f(){
       int i2;
       wh6 tc = this.c;
       int i = -1;
       if (tc == null) {
          return i;
       }
       wh6 ta = this.a;
       int i1 = 0;
       try{
          if ((i2 = do5.d(tc, i1, ta)) < 0) {
             return i2;
          }
          if (this.b[(i2 << 1)] == null) {
             return i2;
          }
          i1 = i2 + 1;
          while (true) {
             if (i1 < tc && !this.a[i1]) {
                int i3 = i1 << 1;
                if (this.b[i3] == null) {
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                i2 = i2 + i;
                while (true) {
                   if (i2 < 0 || this.a[i2]) {
                      return (~ i1);
                   }
                   i = i2 << 1;
                   if (this.b[i] == null) {
                      return i2;
                   }
                   i2 = i2 - 1;
                }
             }
          }
          return i1;
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
          throw new ConcurrentModificationException();
       }
    }
    public final int g(Object p0){
       int i = this.c * 2;
       wh6 tb = this.b;
       if (p0 == null) {
          int i1 = 1;
          while (i1 < i) {
             if (tb[i1] == null) {
                return (i1 >> 1);
             }
             i1 = i1 + 2;
          }
       }else {
          int i2 = 1;
          while (i2 < i) {
             if (p0.equals(tb[i2])) {
                return (i2 >> 1);
             }
             i2 = i2 + 2;
          }
       }
       return -1;
    }
    public final Object get(Object p0){
       return this.getOrDefault(p0, null);
    }
    public final Object getOrDefault(Object p0,Object p1){
       int i;
       if ((i = this.e(p0)) >= 0) {
          p1 = this.b[((i << 1) + 1)];
       }
       return p1;
    }
    public final Object h(int p0){
       return this.b[(p0 << 1)];
    }
    public final int hashCode(){
       wh6 ta = this.a;
       wh6 tb = this.b;
       wh6 tc = this.c;
       int i = 1;
       int i1 = 0;
       int i2 = 0;
       while (i1 < tc) {
          object oobject = tb[i];
          int i3 = ta[i1];
          int i4 = (oobject == null)? 0: oobject.hashCode();
          i4 = i4 ^ i3;
          i2 = i2 + i4;
          i1 = i1 + 1;
          i = i + 2;
       }
       return i2;
    }
    public final Object i(int p0){
       int i4;
       int i6;
       wh6 tb = this.b;
       int i = p0 << 1;
       object oobject = tb[(i + 1)];
       wh6 tc = this.c;
       int i1 = 1;
       if (tc <= i1) {
          this.clear();
       }else {
          int i2 = tc - 1;
          wh6 ta = this.a;
          int i3 = 8;
          if (ta.length > i3 && tc < (ta.length / 3)) {
             if (tc > i3) {
                i3 = tc + (tc >> 1);
             }
             this.a(i3);
             if (tc == this.c) {
                if (p0 > 0) {
                   i3 = 0;
                   System.arraycopy(ta, i3, this.a, i3, p0);
                   System.arraycopy(tb, i3, this.b, i3, i);
                }
                if (p0 < i2) {
                   i4 = p0 + 1;
                   int i5 = i2 - p0;
                   System.arraycopy(ta, i4, this.a, p0, i5);
                   System.arraycopy(tb, (i4 << 1), this.b, i, (i5 << 1));
                }
             }else {
                throw new ConcurrentModificationException();
             }
          }else if(p0 < i2){
             i6 = p0 + 1;
             i4 = i2 - p0;
             System.arraycopy(ta, i6, ta, p0, i4);
             System.arraycopy(this.b, (i6 << i1), this.b, i, (i4 << 1));
          }
          wh6 tb1 = this.b;
          i6 = i2 << 1;
          tb1[i6] = null;
          tb1[(i6 + i1)] = null;
          if (tc == this.c) {
             this.c = i2;
          }else {
             throw new ConcurrentModificationException();
          }
       }
       return oobject;
    }
    public final boolean isEmpty(){
       boolean b = (this.c <= null)? true: false;
       return b;
    }
    public final Object j(int p0){
       return this.b[((p0 << 1) + 1)];
    }
    public final Object put(Object p0,Object p1){
       int i1;
       int i2;
       wh6 tc = this.c;
       int i = 0;
       if (p0 == null) {
          i1 = this.f();
          i2 = 0;
       }else {
          i1 = p0.hashCode();
          i2 = i1;
          i1 = this.d(i1, p0);
       }
       if (i1 >= 0) {
          int i3 = (i1 << 1) + 1;
          tc = this.b;
          object oobject = tc[i3];
          tc[i3] = p1;
          return oobject;
       }else {
          i1 = ~ i1;
          wh6 ta = this.a;
          if (tc >= ta.length) {
             int i4 = 8;
             if (tc >= i4) {
                i4 = (tc >> 1) + tc;
             }else if(tc >= 4){
                i4 = 4;
             }
             wh6 tb = this.b;
             this.a(i4);
             if (tc == this.c) {
                wh6 ta1 = this.a;
                if (ta1.length > 0) {
                   System.arraycopy(ta, i, ta1, i, ta.length);
                   System.arraycopy(tb, i, this.b, i, tb.length);
                }
                wh6.c(ta, tb, tc);
             }else {
                throw new ConcurrentModificationException();
             }
          }
          if (i1 < tc) {
             int i5 = i1 + 1;
             System.arraycopy(this.a, i1, this.a, i5, (tc - i1));
             System.arraycopy(this.b, (i1 << 1), this.b, (i5 << 1), ((this.c - i1) << 1));
          }
          wh6 tc1 = this.c;
          if (tc == tc1) {
             tc = this.a;
             if (i1 < tc.length) {
                tc[i1] = i2;
                tc = this.b;
                i1 = i1 << 1;
                tc[i1] = p0;
                tc[(i1 + 1)] = p1;
                this.c = tc1 + 1;
                return null;
             }
          }
          throw new ConcurrentModificationException();
       }
    }
    public final Object putIfAbsent(Object p0,Object p1){
       Object orDefault;
       if ((orDefault = this.getOrDefault(p0, null)) == null) {
          orDefault = this.put(p0, p1);
       }
       return orDefault;
    }
    public final Object remove(Object p0){
       int i;
       if ((i = this.e(p0)) >= 0) {
          return this.i(i);
       }
       return null;
    }
    public final boolean remove(Object p0,Object p1){
       int i;
       if ((i = this.e(p0)) >= 0) {
          Object obj = this.j(i);
          if (p1 == obj || (p1 != null || !p1.equals(obj))) {
             this.i(i);
             return true;
          }
       }
       return false;
    }
    public final Object replace(Object p0,Object p1){
       int i;
       if ((i = this.e(p0)) < 0) {
          return null;
       }
       i = (i << 1) + 1;
       wh6 tb = this.b;
       object oobject = tb[i];
       tb[i] = p1;
       return oobject;
    }
    public final boolean replace(Object p0,Object p1,Object p2){
       int i;
       wh6 obj;
       if ((i = this.e(p0)) < 0 || ((obj = this.j(i)) != p1 || (p1 != null || !p1.equals(obj)))) {
          return false;
       }
       i = (i << 1) + 1;
       obj = this.b;
       obj[i] = p2;
       return 1;
    }
    public final int size(){
       return this.c;
    }
    public final String toString(){
       Object obj;
       if (this.isEmpty()) {
          return "{}";
       }
       StringBuilder str = new StringBuilder((this.c * 28))+'{';
       int i = 0;
       while (i < this.c) {
          if (i > 0) {
             str = str.append(", ");
          }
          str = ((obj = this.h(i)) != this)? str.append(obj): str.append("\(this Map\)");
          str = str.append('=');
          str = ((obj = this.j(i)) != this)? str.append(obj): str.append("\(this Map\)");
          i = i + 1;
       }
       return str+'}';
    }
}
