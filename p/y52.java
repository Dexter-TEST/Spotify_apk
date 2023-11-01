package p.y52;
import p.wb3;
import java.util.RandomAccess;
import p.jk5;
import p.f2;
import java.lang.Object;
import java.lang.Float;
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

public final class y52 extends f2 implements wb3, RandomAccess, jk5	// class@002d4f from classes.dex
{
    public float[] b;
    public int c;
    public static final y52 t;

    static {
       float[] uofloatArray = new float[0];
       y52 oy52 = new y52(0, uofloatArray);
       y52.t = oy52;
       oy52.a = false;
    }
    public void y52(int p0,float[] p1){
       super();
       this.b = p1;
       this.c = p0;
    }
    public final void add(int p0,Object p1){
       float f = p1.floatValue();
       this.a();
       if (p0 >= 0) {
          y52 tc = this.c;
          if (p0 <= tc) {
             y52 tb = this.b;
             if (tc < tb.length) {
                System.arraycopy(tb, p0, tb, (p0 + 1), (tc - p0));
             }else {
                float[] uofloatArray = new float[(((tc * 3) / 2) + 1)];
                System.arraycopy(tb, 0, uofloatArray, 0, p0);
                System.arraycopy(this.b, p0, uofloatArray, (p0 + 1), (this.c - p0));
                this.b = uofloatArray;
             }
             this.b[p0] = f;
             this.c = this.c + 1;
             this.modCount = this.modCount + 1;
             return;
          }
       }
       throw new IndexOutOfBoundsException(kg4.r("Index:", p0, ", Size:")+this.c);
    }
    public final boolean add(Object p0){
       this.c(p0.floatValue());
       return true;
    }
    public final boolean addAll(Collection p0){
       y52 c;
       this.a();
       p0.getClass();
       if (!p0 instanceof y52) {
          return super.addAll(p0);
       }
       if ((c = p0.c) == null) {
          return false;
       }
       y52 tc = this.c;
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
    public final void c(float p0){
       this.a();
       y52 tc = this.c;
       y52 tb = this.b;
       if (tc == tb.length) {
          float[] uofloatArray = new float[(((tc * 3) / 2) + 1)];
          System.arraycopy(tb, 0, uofloatArray, 0, tc);
          this.b = uofloatArray;
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
       if (!p0 instanceof y52) {
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
          if (Float.floatToIntBits(this.b[i]) != Float.floatToIntBits(p0[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final bc3 f(int p0){
       if (p0 >= this.c) {
          return new y52(this.c, Arrays.copyOf(this.b, p0));
       }
       throw new IllegalArgumentException();
    }
    public final Object get(int p0){
       this.d(p0);
       return Float.valueOf(this.b[p0]);
    }
    public final int hashCode(){
       int i = 1;
       for (int i1 = 0; i1 < this.c; i1 = i1 + 1) {
          i = i * 31;
          i = i + Float.floatToIntBits(this.b[i1]);
       }
       return i;
    }
    public final int indexOf(Object p0){
       if (!p0 instanceof Float) {
          return -1;
       }
       float f = p0.floatValue();
       y52 tc = this.c;
       int i = 0;
       while (true) {
          if (i >= tc) {
             return -1;
          }
          if (!(f - this.b[i])) {
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
       y52 tb = this.b;
       int i = tb[p0];
       y52 tc = this.c;
       if (p0 < (tc - 1)) {
          System.arraycopy(tb, (p0 + 1), tb, p0, ((tc - p0) - 1));
       }
       this.c = this.c - 1;
       this.modCount = this.modCount + 1;
       return Float.valueOf(i);
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
       y52 tb = this.b;
       int i = tb[p0];
       tb[p0] = p1.floatValue();
       return Float.valueOf(i);
    }
    public final int size(){
       return this.c;
    }
}
