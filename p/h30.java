package p.h30;
import p.rb3;
import java.util.RandomAccess;
import p.jk5;
import p.f2;
import java.lang.Object;
import java.lang.Boolean;
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

public final class h30 extends f2 implements rb3, RandomAccess, jk5	// class@0017cf from classes.dex
{
    public boolean[] b;
    public int c;
    public static final h30 t;

    static {
       boolean[] uobooleanArr = new boolean[0];
       h30 oh30 = new h30(uobooleanArr, 0);
       h30.t = oh30;
       oh30.a = false;
    }
    public void h30(boolean[] p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void add(int p0,Object p1){
       boolean b = p1.booleanValue();
       this.a();
       if (p0 >= 0) {
          h30 tc = this.c;
          if (p0 <= tc) {
             h30 tb = this.b;
             if (tc < tb.length) {
                System.arraycopy(tb, p0, tb, (p0 + 1), (tc - p0));
             }else {
                boolean[] uobooleanArr = new boolean[(((tc * 3) / 2) + 1)];
                System.arraycopy(tb, 0, uobooleanArr, 0, p0);
                System.arraycopy(this.b, p0, uobooleanArr, (p0 + 1), (this.c - p0));
                this.b = uobooleanArr;
             }
             this.b[p0] = b;
             this.c = this.c + 1;
             this.modCount = this.modCount + 1;
             return;
          }
       }
       throw new IndexOutOfBoundsException(kg4.r("Index:", p0, ", Size:")+this.c);
    }
    public final boolean add(Object p0){
       this.c(p0.booleanValue());
       return true;
    }
    public final boolean addAll(Collection p0){
       h30 c;
       this.a();
       p0.getClass();
       if (!p0 instanceof h30) {
          return super.addAll(p0);
       }
       if ((c = p0.c) == null) {
          return false;
       }
       h30 tc = this.c;
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
    public final void c(boolean p0){
       this.a();
       h30 tc = this.c;
       h30 tb = this.b;
       if (tc == tb.length) {
          boolean[] uobooleanArr = new boolean[(((tc * 3) / 2) + 1)];
          System.arraycopy(tb, 0, uobooleanArr, 0, tc);
          this.b = uobooleanArr;
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
       if (!p0 instanceof h30) {
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
          if (this.b[i] != p0[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final bc3 f(int p0){
       if (p0 >= this.c) {
          return new h30(Arrays.copyOf(this.b, p0), this.c);
       }
       throw new IllegalArgumentException();
    }
    public final Object get(int p0){
       this.d(p0);
       return Boolean.valueOf(this.b[p0]);
    }
    public final int hashCode(){
       int i = 1;
       for (int i1 = 0; i1 < this.c; i1 = i1 + 1) {
          i = i * 31;
          int i2 = (this.b[i1])? 1231: 1237;
          i = i + i2;
       }
       return i;
    }
    public final int indexOf(Object p0){
       if (!p0 instanceof Boolean) {
          return -1;
       }
       boolean b = p0.booleanValue();
       h30 tc = this.c;
       int i = 0;
       while (true) {
          if (i >= tc) {
             return -1;
          }
          if (this.b[i] == b) {
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
       h30 tb = this.b;
       boolean b = tb[p0];
       h30 tc = this.c;
       if (p0 < (tc - 1)) {
          System.arraycopy(tb, (p0 + 1), tb, p0, ((tc - p0) - 1));
       }
       this.c = this.c - 1;
       this.modCount = this.modCount + 1;
       return Boolean.valueOf(b);
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
       h30 tb = this.b;
       boolean b = tb[p0];
       tb[p0] = p1.booleanValue();
       return Boolean.valueOf(b);
    }
    public final int size(){
       return this.c;
    }
}
