package p.jv3;
import p.ac3;
import java.util.RandomAccess;
import p.jk5;
import p.f2;
import java.lang.Object;
import java.lang.Long;
import java.lang.System;
import java.util.AbstractList;
import java.lang.IndexOutOfBoundsException;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;
import java.util.Collection;
import p.cc3;
import java.lang.Class;
import java.util.Arrays;
import java.lang.OutOfMemoryError;
import p.bc3;
import java.lang.IllegalArgumentException;

public final class jv3 extends f2 implements ac3, RandomAccess, jk5	// class@001b51 from classes.dex
{
    public long[] b;
    public int c;
    public static final jv3 t;

    static {
       long[] olongArray = new long[0];
       jv3 ojv3 = new jv3(olongArray, 0);
       jv3.t = ojv3;
       ojv3.a = false;
    }
    public void jv3(long[] p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void add(int p0,Object p1){
       long l = p1.longValue();
       this.a();
       if (p0 >= 0) {
          p1 = this.c;
          if (p0 <= p1) {
             jv3 tb = this.b;
             if (p1 < tb.length) {
                System.arraycopy(tb, p0, tb, (p0 + 1), (p1 - p0));
             }else {
                p1 = new long[(((p1 * 3) / 2) + 1)];
                System.arraycopy(tb, 0, p1, 0, p0);
                System.arraycopy(this.b, p0, p1, (p0 + 1), (this.c - p0));
                this.b = p1;
             }
             p1[p0] = l;
             this.c = this.c + 1;
             this.modCount = this.modCount + 1;
             return;
          }
       }
       throw new IndexOutOfBoundsException(kg4.r("Index:", p0, ", Size:")+this.c);
    }
    public final boolean add(Object p0){
       this.c(p0.longValue());
       return true;
    }
    public final boolean addAll(Collection p0){
       jv3 c;
       this.a();
       p0.getClass();
       if (!p0 instanceof jv3) {
          return super.addAll(p0);
       }
       if ((c = p0.c) == null) {
          return false;
       }
       jv3 tc = this.c;
       if (((Integer.MAX_VALUE - tc)) < c) {
          throw new OutOfMemoryError();
       }
       int i = tc + c;
       c = this.b;
       if (i > c.length) {
          this.b = Arrays.copyOf(c, i);
       }
       System.arraycopy(p0.b, false, this.b, this.c, p0.c);
       this.c = i;
       this.modCount = this.modCount + 1;
       return 1;
    }
    public final void c(long p0){
       this.a();
       jv3 tc = this.c;
       jv3 tb = this.b;
       if (tc == tb.length) {
          long[] olongArray = new long[(((tc * 3) / 2) + 1)];
          System.arraycopy(tb, 0, olongArray, 0, tc);
          this.b = olongArray;
       }
       tb = this.c;
       this.c = tb + 1;
       this.b[tb] = p0;
       return;
    }
    public final boolean contains(Object p0){
       boolean b = (this.indexOf(p0) != -1)? true: false;
       return b;
    }
    public final void d(int p0){
       if (p0 >= 0 && p0 < this.c) {
          return;
       }
       throw new IndexOutOfBoundsException(kg4.r("Index:", p0, ", Size:")+this.c);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof jv3) {
          return super.equals(p0);
       }
       if (this.c != p0.c) {
          return false;
       }
       p0 = p0.b;
       int i = 0;
       while (true) {
          if (i >= this.c) {
             return true;
          }
          if (this.b[i] - p0[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final bc3 f(int p0){
       if (p0 >= this.c) {
          return new jv3(Arrays.copyOf(this.b, p0), this.c);
       }
       throw new IllegalArgumentException();
    }
    public final Object get(int p0){
       this.d(p0);
       return Long.valueOf(this.b[p0]);
    }
    public final int hashCode(){
       int i = 1;
       for (int i1 = 0; i1 < this.c; i1 = i1 + 1) {
          i = i * 31;
          i = i + cc3.a(this.b[i1]);
       }
       return i;
    }
    public final int indexOf(Object p0){
       if (!p0 instanceof Long) {
          return -1;
       }
       long l = p0.longValue();
       p0 = this.c;
       int i = 0;
       while (true) {
          if (i >= p0) {
             return -1;
          }
          if (!(this.b[i] - l)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public final Object remove(int p0){
       this.a();
       this.d(p0);
       jv3 tb = this.b;
       long l = tb[p0];
       jv3 tc = this.c;
       if (p0 < (tc - 1)) {
          System.arraycopy(tb, (p0 + 1), tb, p0, ((tc - p0) - 1));
       }
       this.c = this.c - 1;
       this.modCount = this.modCount + 1;
       return Long.valueOf(l);
    }
    public final void removeRange(int p0,int p1){
       this.a();
       if (p1 < p0) {
          throw new IndexOutOfBoundsException("toIndex < fromIndex");
       }
       System.arraycopy(this.b, p1, this.b, p0, (this.c - p1));
       this.c = this.c - (p1 - p0);
       this.modCount = this.modCount + 1;
       return;
    }
    public final Object set(int p0,Object p1){
       this.a();
       this.d(p0);
       p1 = this.b;
       long l = p1[p0];
       p1[p0] = p1.longValue();
       return Long.valueOf(l);
    }
    public final int size(){
       return this.c;
    }
}
