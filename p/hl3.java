package p.hl3;
import java.util.RandomAccess;
import java.io.Serializable;
import p.x1;
import java.lang.Object;
import p.io2;
import p.xa6;
import java.util.Collection;
import java.io.NotSerializableException;
import java.lang.String;
import p.fv1;
import p.co5;
import java.util.Iterator;
import java.util.List;
import java.lang.UnsupportedOperationException;
import p.gl3;
import java.util.Arrays;
import p.uk;
import java.lang.OutOfMemoryError;
import java.lang.IllegalStateException;
import java.util.ListIterator;
import p.vv7;
import java.lang.Class;
import java.lang.StringBuilder;

public final class hl3 extends x1 implements RandomAccess, Serializable	// class@001874 from classes.dex
{
    public Object[] a;
    public final int b;
    public int c;
    public boolean t;
    public final hl3 v;
    public final hl3 w;

    public void hl3(){
       super(10);
    }
    public void hl3(int p0){
       super(io2.b(p0), 0, 0, false, null, null);
    }
    public void hl3(Object[] p0,int p1,int p2,boolean p3,hl3 p4,hl3 p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
    }
    private final Object writeReplace(){
       int i = 0;
       hl3 tw = (this.t == null && ((tw = this.w) == null && tw.t != null))? 0: 1;
       if (tw) {
          return new xa6(i, this);
       }else {
          throw new NotSerializableException("The list cannot be serialized while it is being built.");
       }
    }
    public final int a(){
       return this.c;
    }
    public final void add(int p0,Object p1){
       this.g();
       fv1.o(p0, this.c);
       this.d((this.b + p0), p1);
    }
    public final boolean add(Object p0){
       this.g();
       this.d((this.b + this.c), p0);
       return true;
    }
    public final boolean addAll(int p0,Collection p1){
       co5.o(p1, "elements");
       this.g();
       fv1.o(p0, this.c);
       int i = p1.size();
       this.c((this.b + p0), p1, i);
       boolean b = (i > 0)? true: false;
       return b;
    }
    public final boolean addAll(Collection p0){
       co5.o(p0, "elements");
       this.g();
       int i = p0.size();
       this.c((this.b + this.c), p0, i);
       boolean b = (i > 0)? true: false;
       return b;
    }
    public final Object b(int p0){
       this.g();
       fv1.n(p0, this.c);
       return this.l((this.b + p0));
    }
    public final void c(int p0,Collection p1,int p2){
       hl3 tv;
       if ((tv = this.v) != null) {
          tv.c(p0, p1, p2);
          this.a = tv.a;
          this.c = this.c + p2;
       }else {
          this.k(p0, p2);
          Iterator iterator = p1.iterator();
          for (int i = 0; i < p2; i = i + 1) {
             int i1 = p0 + i;
             this.a[i1] = iterator.next();
          }
       }
       return;
    }
    public final void clear(){
       this.g();
       this.m(this.b, this.c);
    }
    public final void d(int p0,Object p1){
       hl3 tv;
       int i = 1;
       if ((tv = this.v) != null) {
          tv.d(p0, p1);
          this.a = tv.a;
          this.c = this.c + i;
       }else {
          this.k(p0, i);
          this.a[p0] = p1;
       }
       return;
    }
    public final boolean equals(Object p0){
       hl3 tc;
       int i;
       int i2;
       boolean b = true;
       if (p0 != this) {
          if (p0 instanceof List) {
             hl3 ta = this.a;
             if ((tc = this.c) == p0.size()) {
                int i1 = 0;
                while (true) {
                   if (i1 < tc) {
                      if (i2 = this.b + i1) {
                         i1 = i1 + 1;
                      }
                   }else {
                      i = 1;
                   label_002d :
                      if (!i) {
                      label_0030 :
                         b = false;
                         break ;
                      }
                   }
                }
             }
             i = 0;
             goto label_002d ;
          }else {
             goto label_0030 ;
          }
       }
       return b;
    }
    public final void g(){
       hl3 tw = (this.t == null && ((tw = this.w) == null && tw.t != null))? 0: 1;
       if (!tw) {
          return;
       }else {
          throw new UnsupportedOperationException();
       }
    }
    public final Object get(int p0){
       fv1.n(p0, this.c);
       return this.a[(this.b + p0)];
    }
    public final int hashCode(){
       hl3 ta = this.a;
       hl3 tc = this.c;
       int i = 1;
       for (int i1 = 0; i1 < tc; i1 = i1 + 1) {
          int i2 = this.b + i1;
          object oobject = ta[i2];
          i = i * 31;
          i2 = (oobject != null)? oobject.hashCode(): 0;
          i = i + i2;
       }
       return i;
    }
    public final int indexOf(Object p0){
       int i = 0;
       while (true) {
          if (i >= this.c) {
             return -1;
          }
          int i1 = this.b + i;
          if (co5.c(this.a[i1], p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public final boolean isEmpty(){
       boolean b = (this.c == null)? true: false;
       return b;
    }
    public final Iterator iterator(){
       return new gl3(this, 0);
    }
    public final void k(int p0,int p1){
       int i = this.c + p1;
       if (this.v != null) {
          throw new IllegalStateException();
       }
       if (i < 0) {
          throw new OutOfMemoryError();
       }
       hl3 ta = this.a;
       if (i > ta.length) {
          int len = ta.length;
          len = len + (len >> 1);
          if (((len - i)) < 0) {
             len = i;
          }
          if (((len - 0x7ffffff7)) > 0) {
             len = (i > 0x7ffffff7)? Integer.MAX_VALUE: 0x7ffffff7;
          }
          co5.o(ta, "<this>");
          Object[] objArray = Arrays.copyOf(ta, len);
          co5.l(objArray, "copyOf\(this, newSize\)");
          this.a = objArray;
       }
       uk.k0((p0 + p1), p0, (this.b + this.c), this.a, this.a);
       this.c = this.c + p1;
       return;
    }
    public final Object l(int p0){
       hl3 tv;
       if ((tv = this.v) != null) {
          this.c = this.c - 1;
          return tv.l(p0);
       }else {
          tv = this.a;
          hl3 tb = this.b;
          uk.k0(p0, (p0 + 1), (this.c + tb), tv, tv);
          hl3 ta = this.a;
          co5.o(ta, "<this>");
          ta[((tb + this.c) - 1)] = null;
          this.c = this.c - 1;
          return tv[p0];
       }
    }
    public final int lastIndexOf(Object p0){
       int i = this.c - 1;
       while (true) {
          if (i < 0) {
             return -1;
          }
          int i1 = this.b + i;
          if (co5.c(this.a[i1], p0)) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return i;
    }
    public final ListIterator listIterator(){
       return new gl3(this, 0);
    }
    public final ListIterator listIterator(int p0){
       fv1.o(p0, this.c);
       return new gl3(this, p0);
    }
    public final void m(int p0,int p1){
       hl3 tv;
       if ((tv = this.v) != null) {
          tv.m(p0, p1);
       }else {
          uk.k0(p0, (p0 + p1), this.c, this.a, this.a);
          tv = this.c;
          io2.s((tv - p1), tv, this.a);
       }
       this.c = this.c - p1;
       return;
    }
    public final int n(int p0,int p1,Collection p2,boolean p3){
       hl3 tv;
       if ((tv = this.v) != null) {
          p0 = tv.n(p0, p1, p2, p3);
          this.c = this.c - p0;
          return p0;
       }else {
          int i = 0;
          int i1 = 0;
          while (i < p1) {
             int i2 = p0 + i;
             if (p2.contains(this.a[i2]) == p3) {
                hl3 ta = this.a;
                int i3 = i1 + 1;
                i1 = i1 + p0;
                i = i + 1;
                ta[i1] = ta[i2];
                i1 = i3;
             }else {
                i = i + 1;
             }
          }
          int i4 = p1 - i1;
          uk.k0((p0 + i1), (p1 + p0), this.c, this.a, this.a);
          hl3 tc = this.c;
          io2.s((tc - i4), tc, this.a);
          this.c = this.c - i4;
          return i4;
       }
    }
    public final boolean remove(Object p0){
       boolean i;
       this.g();
       if ((i = this.indexOf(p0)) >= 0) {
          this.b(i);
       }
       i = (i >= 0)? true: false;
       return i;
    }
    public final boolean removeAll(Collection p0){
       co5.o(p0, "elements");
       this.g();
       boolean b = false;
       if (this.n(this.b, this.c, p0, b) > 0) {
          b = true;
       }
       return b;
    }
    public final boolean retainAll(Collection p0){
       co5.o(p0, "elements");
       this.g();
       boolean b = true;
       if (this.n(this.b, this.c, p0, b) > 0) {
       }else {
          b = false;
       }
       return b;
    }
    public final Object set(int p0,Object p1){
       this.g();
       fv1.n(p0, this.c);
       hl3 ta = this.a;
       int i = this.b + p0;
       object oobject = ta[i];
       ta[i] = p1;
       return oobject;
    }
    public final List subList(int p0,int p1){
       hl3 tw;
       fv1.p(p0, p1, this.c);
       hl3 ta = this.a;
       int i = this.b + p0;
       int i1 = p1 - p0;
       hl3 tt = this.t;
       hl3 ohl3 = ((tw = this.w) == null)? this: tw;
       hl3 v0 = new hl3(ta, i, i1, tt, this, ohl3);
       return v0;
    }
    public final Object[] toArray(){
       hl3 ta = this.a;
       hl3 tb = this.b;
       int i = this.c + tb;
       co5.o(ta, "<this>");
       vv7.i(i, ta.length);
       Object[] objArray = Arrays.copyOfRange(ta, tb, i);
       co5.l(objArray, "copyOfRange\(this, fromIndex, toIndex\)");
       return objArray;
    }
    public final Object[] toArray(Object[] p0){
       co5.o(p0, "destination");
       hl3 tc = this.c;
       hl3 tb = this.b;
       if (p0.length < tc) {
          p0 = Arrays.copyOfRange(this.a, tb, (tc + tb), p0.getClass());
          co5.l(p0, "copyOfRange\(array, offse…h, destination.javaClass\)");
          return p0;
       }else {
          uk.k0(0, tb, (tc + tb), this.a, p0);
          tc = this.c;
          if (p0.length > tc) {
             p0[tc] = null;
          }
          return p0;
       }
    }
    public final String toString(){
       hl3 ta = this.a;
       hl3 tc = this.c;
       StringBuilder str = new StringBuilder(((tc * 3) + 2))+"[";
       for (int i = 0; i < tc; i = i + 1) {
          if (i > 0) {
             str = str.append(", ");
          }
          int i1 = this.b + i;
          str = str.append(ta[i1]);
       }
       String str1 = str+"]";
       co5.l(str1, "sb.toString\(\)");
       return str1;
    }
}
