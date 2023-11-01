package p.sk;
import java.util.Collection;
import java.util.Set;
import java.lang.Object;
import p.do5;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.PrintStream;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p.lk;
import java.lang.Class;
import java.lang.reflect.Array;

public final class sk implements Collection, Set	// class@00264b from classes.dex
{
    public int[] a;
    public Object[] b;
    public int c;
    public static Object[] t;
    public static int v;
    public static Object[] w;
    public static int x;
    public static final Object y;
    public static final Object z;

    static {
       sk.y = new Object();
       sk.z = new Object();
    }
    public void sk(int p0){
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
    public static void b(int[] p0,Object[] p1,int p2){
       Object z;
       if (p0.length == 8) {
          z = sk.z;
          _monitor_enter(z);
          if (sk.x < 10) {
             p1[0] = sk.w;
             p1[1] = p0;
             for (p2 = p2 - 1; p2 >= 2; p2--) {
                p1[p2] = null;
             }
             sk.w = p1;
             sk.x = sk.x + 1;
          }
          _monitor_exit(z);
       }else if(p0.length == 4){
          z = sk.y;
          _monitor_enter(z);
          if (sk.v < 10) {
             p1[0] = sk.t;
             p1[1] = p0;
             for (p2 = p2 - 1; p2 >= 2; p2--) {
                p1[p2] = null;
             }
             sk.t = p1;
             sk.v = sk.v + 1;
          }
          _monitor_exit(z);
       }
       return;
    }
    public final void a(int p0){
       Object[] z;
       Object[] w;
       object oobject;
       String str = "ArraySet Found corrupt ArraySet cache: [0]=";
       String str1 = "ArraySet Found corrupt ArraySet cache: [0]=";
       if (p0 == 8) {
          z = sk.z;
          _monitor_enter(z);
          if ((w = sk.w) != null) {
             try{
                this.b = w;
                sk.w = w[0];
                oobject = w[1];
                this.a = oobject;
                if (oobject != null) {
                   w[1] = null;
                   w[0] = null;
                   sk.x = sk.x - 1;
                   _monitor_exit(z);
                   return;
                }else {
                   System.out.println(str1+e0[0]+" [1]="+e0[1]);
                   sk.w = null;
                   sk.x = 0;
                }
             }catch(java.lang.ClassCastException e0){
             }
          }
          _monitor_exit(z);
       }else if(p0 == 4){
          Object y = sk.y;
          _monitor_enter(y);
          if ((z = sk.t) != null) {
             try{
                this.b = z;
                sk.t = z[0];
                oobject = z[1];
                this.a = oobject;
                if (oobject != null) {
                   z[1] = null;
                   z[0] = null;
                   sk.v = sk.v - 1;
                   _monitor_exit(y);
                   return;
                }else {
                   System.out.println(e0+z[0]+" [1]="+z[1]);
                   sk.t = null;
                   sk.v = 0;
                }
             }catch(java.lang.ClassCastException e0){
             }
          }
          _monitor_exit(y);
       }
       int[] ointArray = new int[p0];
       this.a = ointArray;
       Object[] objArray = new Object[p0];
       this.b = objArray;
       return;
    }
    public final boolean add(Object p0){
       int i;
       int i1;
       int i2;
       sk tc = this.c;
       boolean b = false;
       if (p0 == null) {
          i = this.d();
          i1 = 0;
       }else {
          i = p0.hashCode();
          i1 = i;
          i = this.c(i, p0);
       }
       if (i >= 0) {
          return b;
       }else {
          i = ~ i;
          sk ta = this.a;
          if (tc >= ta.length) {
             i2 = 8;
             if (tc >= i2) {
                i2 = (tc >> 1) + tc;
             }else if(tc >= 4){
                i2 = 4;
             }
             sk tb = this.b;
             this.a(i2);
             if (tc == this.c) {
                sk ta1 = this.a;
                if (ta1.length > 0) {
                   System.arraycopy(ta, b, ta1, b, ta.length);
                   System.arraycopy(tb, b, this.b, b, tb.length);
                }
                sk.b(ta, tb, tc);
             }else {
                throw new ConcurrentModificationException();
             }
          }
          if (i < tc) {
             int i3 = i + 1;
             i2 = tc - i;
             System.arraycopy(this.a, i, this.a, i3, i2);
             System.arraycopy(this.b, i, this.b, i3, i2);
          }
          sk tc1 = this.c;
          if (tc == tc1) {
             tc = this.a;
             if (i < tc.length) {
                tc[i] = i1;
                this.b[i] = p0;
                this.c = tc1 + 1;
                return 1;
             }
          }
          throw new ConcurrentModificationException();
       }
    }
    public final boolean addAll(Collection p0){
       sk tc1;
       int i = p0.size() + this.c;
       sk tc = this.c;
       sk ta = this.a;
       int i1 = 0;
       if (ta.length < i) {
          sk tb = this.b;
          this.a(i);
          if ((tc1 = this.c) > null) {
             System.arraycopy(ta, i1, this.a, i1, tc1);
             System.arraycopy(tb, i1, this.b, i1, this.c);
          }
          sk.b(ta, tb, this.c);
       }
       if (this.c == tc) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             i1 = i1 | this.add(iterator.next());
          }
          return i1;
       }else {
          throw new ConcurrentModificationException();
       }
    }
    public final int c(int p0,Object p1){
       sk tc;
       int i;
       if ((tc = this.c) == null) {
          return -1;
       }
       try{
          if ((i = do5.d(tc, p0, this.a)) < 0) {
             return i;
          }
          if (p1.equals(this.b[i])) {
             return i;
          }
          int i1 = i + 1;
          while (true) {
             if (i1 < tc && this.a[i1] == p0) {
                if (p1.equals(this.b[i1])) {
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                i = i - 1;
                while (true) {
                   if (i < 0 || this.a[i] != p0) {
                      return (~ i1);
                   }
                   if (p1.equals(this.b[i])) {
                      return i;
                   }
                   i = i - 1;
                }
             }
          }
          return i1;
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
          throw new ConcurrentModificationException();
       }
    }
    public final void clear(){
       sk tc;
       if ((tc = this.c) != null) {
          sk ta = this.a;
          sk tb = this.b;
          this.a = do5.c;
          this.b = do5.v;
          this.c = 0;
          sk.b(ta, tb, tc);
       }
       if (this.c == null) {
          return;
       }else {
          throw new ConcurrentModificationException();
       }
    }
    public final boolean contains(Object p0){
       boolean i = (p0 == null)? this.d(): this.c(p0.hashCode(), p0);
       i = (i >= 0)? true: false;
       return i;
    }
    public final boolean containsAll(Collection p0){
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (!this.contains(iterator.next())) {
             break ;
          }
       }
       return false;
    }
    public final int d(){
       sk tc;
       int i;
       if ((tc = this.c) == null) {
          return -1;
       }
       try{
          if ((i = do5.d(tc, 0, this.a)) < 0) {
             return i;
          }
          if (this.b[i] == null) {
             return i;
          }
          int i1 = i + 1;
          while (true) {
             if (i1 < tc && !this.a[i1]) {
                if (this.b[i1] == null) {
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                i = i - 1;
                while (true) {
                   if (i < 0 || this.a[i]) {
                      return (~ i1);
                   }
                   if (this.b[i] == null) {
                      return i;
                   }
                   i = i - 1;
                }
             }
          }
          return i1;
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
          throw new ConcurrentModificationException();
       }
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof Set) {
          return false;
       }
       if (this.c != p0.size()) {
          return false;
       }
       int i = 0;
       try{
          while (true) {
             if (i >= this.c) {
                return true;
             }
             if (!p0.contains(this.b[i])) {
                break ;
             }else {
                i = i + 1;
             }
          }
          return false;
       }catch(java.lang.NullPointerException e0){
       }catch(java.lang.ClassCastException e0){
       }
    }
    public final void g(int p0){
       int i2;
       sk tc = this.c;
       sk tb = this.b;
       if (tc <= 1) {
          this.clear();
       }else {
          int i = tc - 1;
          sk ta = this.a;
          int i1 = 8;
          if (ta.length > i1 && tc < (ta.length / 3)) {
             if (tc > i1) {
                i1 = tc + (tc >> 1);
             }
             this.a(i1);
             if (p0 > 0) {
                i1 = 0;
                System.arraycopy(ta, i1, this.a, i1, p0);
                System.arraycopy(tb, i1, this.b, i1, p0);
             }
             if (p0 < i) {
                i2 = p0 + 1;
                int i3 = i - p0;
                System.arraycopy(ta, i2, this.a, p0, i3);
                System.arraycopy(tb, i2, this.b, p0, i3);
             }
          }else if(p0 < i){
             int i4 = p0 + 1;
             i2 = i - p0;
             System.arraycopy(ta, i4, ta, p0, i2);
             System.arraycopy(this.b, i4, this.b, p0, i2);
          }
          p0[i] = null;
          if (tc == this.c) {
             this.c = i;
          }else {
             throw new ConcurrentModificationException();
          }
       }
       return;
    }
    public final int hashCode(){
       sk ta = this.a;
       sk tc = this.c;
       int i1 = 0;
       for (int i = 0; i < tc; i = i + 1) {
          i1 = i1 + ta[i];
       }
       return i1;
    }
    public final boolean isEmpty(){
       boolean b = (this.c <= null)? true: false;
       return b;
    }
    public final Iterator iterator(){
       return new lk(this);
    }
    public final boolean remove(Object p0){
       int i = (p0 == null)? this.d(): this.c(p0.hashCode(), p0);
       if (i >= 0) {
          this.g(i);
          return true;
       }else {
          return false;
       }
    }
    public final boolean removeAll(Collection p0){
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i | this.remove(iterator.next());
       }
       return i;
    }
    public final boolean retainAll(Collection p0){
       int i = this.c - 1;
       boolean b = false;
       while (i >= 0) {
          if (!p0.contains(this.b[i])) {
             this.g(i);
             b = true;
          }
          i = i - 1;
       }
       return b;
    }
    public final int size(){
       return this.c;
    }
    public final Object[] toArray(){
       sk tc = this.c;
       Object[] objArray = new Object[tc];
       System.arraycopy(this.b, 0, objArray, 0, tc);
       return objArray;
    }
    public final Object[] toArray(Object[] p0){
       if (p0.length < this.c) {
          p0 = Array.newInstance(p0.getClass().getComponentType(), this.c);
       }
       System.arraycopy(this.b, 0, p0, 0, this.c);
       sk tc = this.c;
       if (p0.length > tc) {
          p0[tc] = null;
       }
       return p0;
    }
    public final String toString(){
       object oobject;
       if (this.isEmpty()) {
          return "{}";
       }
       StringBuilder str = new StringBuilder((this.c * 14))+'{';
       int i = 0;
       while (i < this.c) {
          if (i > 0) {
             str = str.append(", ");
          }
          str = ((oobject = this.b[i]) != this)? str.append(oobject): str.append("\(this Set\)");
          i = i + 1;
       }
       return str+'}';
    }
}
