package p.rm5;
import java.util.RandomAccess;
import p.f2;
import java.lang.Object;
import java.lang.System;
import java.util.AbstractList;
import java.lang.IndexOutOfBoundsException;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;
import java.util.Arrays;
import p.bc3;
import java.lang.IllegalArgumentException;

public final class rm5 extends f2 implements RandomAccess	// class@002518 from classes.dex
{
    public Object[] b;
    public int c;
    public static final rm5 t;

    static {
       Object[] objArray = new Object[0];
       rm5 orm5 = new rm5(0, objArray);
       rm5.t = orm5;
       orm5.a = false;
    }
    public void rm5(int p0,Object[] p1){
       super();
       this.b = p1;
       this.c = p0;
    }
    public final void add(int p0,Object p1){
       this.a();
       if (p0 >= 0) {
          rm5 tc = this.c;
          if (p0 <= tc) {
             rm5 tb = this.b;
             if (tc < tb.length) {
                System.arraycopy(tb, p0, tb, (p0 + 1), (tc - p0));
             }else {
                Object[] objArray = new Object[(((tc * 3) / 2) + 1)];
                System.arraycopy(tb, 0, objArray, 0, p0);
                System.arraycopy(this.b, p0, objArray, (p0 + 1), (this.c - p0));
                this.b = objArray;
             }
             this.b[p0] = p1;
             this.c = this.c + 1;
             this.modCount = this.modCount + 1;
             return;
          }
       }
       throw new IndexOutOfBoundsException(kg4.r("Index:", p0, ", Size:")+this.c);
    }
    public final boolean add(Object p0){
       this.a();
       rm5 tc = this.c;
       rm5 tb = this.b;
       if (tc == tb.length) {
          this.b = Arrays.copyOf(tb, (((tc * 3) / 2) + 1));
       }
       tb = this.c;
       this.c = tb + 1;
       this.b[tb] = p0;
       this.modCount = this.modCount + 1;
       return 1;
    }
    public final void c(int p0){
       if (p0 >= 0 && p0 < this.c) {
          return;
       }
       throw new IndexOutOfBoundsException(kg4.r("Index:", p0, ", Size:")+this.c);
    }
    public final bc3 f(int p0){
       if (p0 >= this.c) {
          return new rm5(this.c, Arrays.copyOf(this.b, p0));
       }
       throw new IllegalArgumentException();
    }
    public final Object get(int p0){
       this.c(p0);
       return this.b[p0];
    }
    public final Object remove(int p0){
       this.a();
       this.c(p0);
       rm5 tb = this.b;
       object oobject = tb[p0];
       rm5 tc = this.c;
       if (p0 < (tc - 1)) {
          System.arraycopy(tb, (p0 + 1), tb, p0, ((tc - p0) - 1));
       }
       this.c = this.c - 1;
       this.modCount = this.modCount + 1;
       return oobject;
    }
    public final Object set(int p0,Object p1){
       this.a();
       this.c(p0);
       rm5 tb = this.b;
       object oobject = tb[p0];
       tb[p0] = p1;
       this.modCount = this.modCount + 1;
       return oobject;
    }
    public final int size(){
       return this.c;
    }
}
