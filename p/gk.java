package p.gk;
import p.x1;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.tp2;
import p.fv1;
import p.co5;
import p.uk;
import java.util.Collection;
import java.util.List;
import p.ye7;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Arrays;
import java.lang.IllegalStateException;
import java.lang.Class;
import java.lang.reflect.Array;

public final class gk extends x1	// class@00172a from classes.dex
{
    public int a;
    public Object[] b;
    public int c;
    public static final Object[] t;

    static {
       Object[] objArray = new Object[0];
       gk.t = objArray;
    }
    public void gk(){
       super();
       this.b = gk.t;
    }
    public void gk(int p0){
       Object[] t;
       super();
       if (!p0) {
          t = gk.t;
       }else if(p0 > 0){
          t = new Object[p0];
       }else {
          throw new IllegalArgumentException(tp2.k("Illegal Capacity: ", p0));
       }
       this.b = t;
       return;
    }
    public final int a(){
       return this.c;
    }
    public final void add(int p0,Object p1){
       int len;
       gk ta;
       gk tb;
       fv1.o(p0, this.c);
       gk tc = this.c;
       if (p0 == tc) {
          this.addLast(p1);
          return;
       }else if(!p0){
          this.addFirst(p1);
          return;
       }else {
          this.d((tc + 1));
          int i = this.l((this.a + p0));
          gk tc1 = this.c;
          int i1 = 0;
          if (p0 < ((tc1 + 1) >> 1)) {
             String str = "<this>";
             if (!i) {
                tc = this.b;
                co5.o(tc, str);
                i = tc.length;
             }
             i = i - 1;
             if ((tc1 = this.a) == null) {
                tc1 = this.b;
                co5.o(tc1, str);
                len = tc1.length;
             }
             len = len - 1;
             ta = this.a;
             if (i >= ta) {
                tb = this.b;
                tb[len] = tb[ta];
                uk.k0(ta, (ta + 1), (i + 1), tb, tb);
             }else {
                tb = this.b;
                uk.k0((ta - 1), ta, tb.length, tb, tb);
                ta = this.b;
                ta[(ta.length - 1)] = ta[i1];
                uk.k0(i1, 1, (i + 1), ta, ta);
             }
             ta[i] = p1;
             this.a = len;
          }else {
             p0 = this.l((tc1 + this.a));
             if (i < p0) {
                uk.k0((i + 1), i, p0, this.b, this.b);
             }else {
                uk.k0(1, i1, p0, this.b, this.b);
                ta = this.b;
                ta[i1] = ta[(ta.length - 1)];
                uk.k0((i + 1), i, (ta.length - 1), ta, ta);
             }
             p0[i] = p1;
          }
          this.c = this.c + 1;
          return;
       }
    }
    public final boolean add(Object p0){
       this.addLast(p0);
       return true;
    }
    public final boolean addAll(int p0,Collection p1){
       gk tb;
       int i3;
       co5.o(p1, "elements");
       fv1.o(p0, this.c);
       boolean b = false;
       if (p1.isEmpty()) {
          return b;
       }
       gk tc = this.c;
       if (p0 == tc) {
          return this.addAll(p1);
       }
       this.d((p1.size() + tc));
       int i = this.l((this.c + this.a));
       int i1 = this.l((this.a + p0));
       int i2 = p1.size();
       if (p0 < ((this.c + 1) >> 1)) {
          gk ta = this.a;
          i = ta - i2;
          if (i1 >= ta) {
             if (i >= 0) {
                uk.k0(i, ta, i1, this.b, this.b);
             }else {
                tb = this.b;
                i = i + tb.length;
                if ((i3 = tb.length - i) >= (i1 - ta)) {
                   uk.k0(i, ta, i1, tb, tb);
                }else {
                   uk.k0(i, ta, (ta + i3), tb, tb);
                   uk.k0(b, (this.a + i3), i1, this.b, this.b);
                }
             }
          }else {
             tb = this.b;
             uk.k0(i, ta, tb.length, tb, tb);
             if (i2 >= i1) {
                ta = this.b;
                uk.k0((ta.length - i2), b, i1, ta, ta);
             }else {
                ta = this.b;
                uk.k0((ta.length - i2), b, i2, ta, ta);
                uk.k0(b, i2, i1, this.b, this.b);
             }
          }
          this.a = i;
          if ((i1 = i1 - i2) < 0) {
             i1 = i1 + this.b.length;
          }
          this.c(i1, p1);
       }else {
          p0 = i1 + i2;
          if (i1 < i) {
             i2 = i2 + i;
             tb = this.b;
             if (i2 <= tb.length) {
                uk.k0(p0, i1, i, tb, tb);
             }else if(p0 >= tb.length){
                uk.k0((p0 - tb.length), i1, i, tb, tb);
             }else {
                i2 = i - (i2 - tb.length);
                uk.k0(b, i2, i, tb, tb);
                uk.k0(p0, i1, i2, this.b, this.b);
             }
          }else {
             uk.k0(i2, b, i, this.b, this.b);
             tc = this.b;
             if (p0 >= tc.length) {
                uk.k0((p0 - tc.length), i1, tc.length, tc, tc);
             }else {
                uk.k0(b, (tc.length - i2), tc.length, tc, tc);
                tc = this.b;
                uk.k0(p0, i1, (tc.length - i2), tc, tc);
             }
          }
          this.c(i1, p1);
       }
       return 1;
    }
    public final boolean addAll(Collection p0){
       co5.o(p0, "elements");
       if (p0.isEmpty()) {
          return false;
       }
       this.d((p0.size() + this.a()));
       this.c(this.l((this.a() + this.a)), p0);
       return true;
    }
    public final void addFirst(Object p0){
       gk ta;
       this.d((this.c + 1));
       if ((ta = this.a) == null) {
          ta = this.b;
          co5.o(ta, "<this>");
          ta = ta.length;
       }
       int i = ta - 1;
       this.a = i;
       this.b[i] = p0;
       this.c = this.c + 1;
       return;
    }
    public final void addLast(Object p0){
       this.d((this.a() + 1));
       this.b[this.l((this.a() + this.a))] = p0;
       this.c = this.a() + 1;
    }
    public final Object b(int p0){
       gk tb;
       gk ta;
       fv1.n(p0, this.c);
       if (p0 == ye7.B(this)) {
          return this.removeLast();
       }
       object oobject = null;
       if (!p0) {
          if (!this.isEmpty()) {
             tb = this.b;
             ta = this.a;
             object oobject1 = tb[ta];
             tb[ta] = oobject;
             this.a = this.g(ta);
             this.c = this.c - 1;
             return oobject1;
          }else {
             throw new NoSuchElementException("ArrayDeque is empty.");
          }
       }else {
          int i = this.l((this.a + p0));
          gk tb1 = this.b;
          object oobject2 = tb1[i];
          int i1 = 0;
          if (p0 < (this.c >> 1)) {
             tb = this.a;
             if (i >= tb) {
                uk.k0((tb + 1), tb, i, tb1, tb1);
             }else {
                uk.k0(1, i1, i, tb1, tb1);
                tb = this.b;
                tb[i1] = tb[(tb.length - 1)];
                ta = this.a;
                uk.k0((ta + 1), ta, (tb.length - 1), tb, tb);
             }
             ta = this.a;
             tb[ta] = oobject;
             this.a = this.g(ta);
          }else {
             p0 = this.l((ye7.B(this) + this.a));
             if (i <= p0) {
                uk.k0(i, (i + 1), (p0 + 1), this.b, this.b);
             }else {
                tb1 = this.b;
                uk.k0(i, (i + 1), tb1.length, tb1, tb1);
                ta = this.b;
                ta[(ta.length - 1)] = ta[i1];
                uk.k0(i1, 1, (p0 + 1), ta, ta);
             }
             this.b[p0] = oobject;
          }
          this.c = this.c - 1;
          return oobject2;
       }
    }
    public final void c(int p0,Collection p1){
       Iterator iterator = p1.iterator();
       int len = this.b.length;
       for (; p0 < len && iterator.hasNext(); p0++) {
          this.b[p0] = iterator.next();
       }
       gk ta = this.a;
       for (len = 0; len < ta && iterator.hasNext(); len = len + 1) {
          this.b[len] = iterator.next();
       }
       this.c = p1.size() + this.a();
       return;
    }
    public final void clear(){
       gk ta;
       int i = this.l((this.c + this.a));
       if ((ta = this.a) < i) {
          gk tb = this.b;
          co5.o(tb, "<this>");
          Arrays.fill(tb, ta, i, null);
       }else if((this.isEmpty() ^ 0x01)){
          ta = this.b;
          Arrays.fill(ta, this.a, ta.length, null);
          ta = this.b;
          co5.o(ta, "<this>");
          Arrays.fill(ta, 0, i, null);
       }
       this.a = 0;
       this.c = 0;
       return;
    }
    public final boolean contains(Object p0){
       boolean b = (this.indexOf(p0) != -1)? true: false;
       return b;
    }
    public final void d(int p0){
       Object[] objArray;
       if (p0 < 0) {
          throw new IllegalStateException("Deque is too big.");
       }
       gk tb = this.b;
       if (p0 <= tb.length) {
          return;
       }
       if (tb == gk.t) {
          if (p0 < 10) {
             p0 = 10;
          }
          objArray = new Object[p0];
          this.b = objArray;
          return;
       }else {
          int len = tb.length;
          len = len + (len >> 1);
          if (((len - p0)) < 0) {
             len = p0;
          }
          int i = 0x7ffffff7;
          if (((len - i)) > 0) {
             len = (p0 > i)? Integer.MAX_VALUE: 0x7ffffff7;
          }
          objArray = new Object[len];
          uk.k0(0, this.a, tb.length, tb, objArray);
          tb = this.b;
          gk ta = this.a;
          uk.k0((tb.length - ta), 0, ta, tb, objArray);
          this.a = 0;
          this.b = objArray;
          return;
       }
    }
    public final int g(int p0){
       gk tb = this.b;
       co5.o(tb, "<this>");
       if (p0 == (tb.length - 1)) {
          p0 = 0;
       }else {
          p0++;
       }
       return p0;
    }
    public final Object get(int p0){
       fv1.n(p0, this.c);
       return this.b[this.l((this.a + p0))];
    }
    public final int indexOf(Object p0){
       gk ta;
       int i = this.l((this.a() + this.a));
       if ((ta = this.a) < i) {
          while (true) {
             if (ta < i) {
                if (co5.c(p0, this.b[ta])) {
                   p0 = this.a;
                   break ;
                }else {
                   ta = ta + 1;
                }
             }
          }
          return (ta - p0);
       }else if(ta >= i){
          int len = this.b.length;
          while (true) {
             if (ta < len) {
                if (co5.c(p0, this.b[ta])) {
                   p0 = this.a;
                }else {
                   ta = ta + 1;
                }
             }else {
                int i1 = 0;
                while (i1 < i) {
                   if (co5.c(p0, this.b[i1])) {
                      i1 = i1 + this.b.length;
                      p0 = this.a;
                   }
                   i1 = i1 + 1;
                }
             }
          }
       }
       return -1;
    }
    public final boolean isEmpty(){
       boolean b = (!this.a())? true: false;
       return b;
    }
    public final Object k(){
       object oobject = (this.isEmpty())? null: this.b[this.l((ye7.B(this) + this.a))];
       return oobject;
    }
    public final int l(int p0){
       gk tb = this.b;
       if (p0 >= tb.length) {
          p0 = p0 - tb.length;
       }
       return p0;
    }
    public final Object last(){
       if (!this.isEmpty()) {
          return this.b[this.l((ye7.B(this) + this.a))];
       }
       throw new NoSuchElementException("ArrayDeque is empty.");
    }
    public final int lastIndexOf(Object p0){
       gk ta;
       int i = this.l((this.c + this.a));
       if ((ta = this.a) < i) {
          i = i - 1;
          if (ta <= i) {
             while (true) {
                if (co5.c(p0, this.b[i])) {
                   p0 = this.a;
                }else if(i != ta){
                   i = i - 1;
                }
             }
          }
       }else if(ta > i){
          i = i - 1;
          while (true) {
             if (-1 < i) {
                if (co5.c(p0, this.b[i])) {
                   i = i + this.b.length;
                   p0 = this.a;
                   break ;
                }else {
                   i = i - 1;
                }
             }else {
                gk tb = this.b;
                co5.o(tb, "<this>");
                i = tb.length - 1;
                if ((ta = this.a) <= i) {
                   while (true) {
                      if (co5.c(p0, this.b[i])) {
                         p0 = this.a;
                      }else if(i != ta){
                         i = i - 1;
                      }
                   }
                }
             }
          }
          return (i - p0);
       }
       return -1;
    }
    public final boolean remove(Object p0){
       int i;
       if ((i = this.indexOf(p0)) == -1) {
          return false;
       }
       this.b(i);
       return true;
    }
    public final boolean removeAll(Collection p0){
       gk ta;
       gk ogk;
       object oobject;
       int i2;
       int i3;
       int i4;
       int i6;
       co5.o(p0, "elements");
       boolean b = false;
       if (!this.isEmpty()) {
          int i = 1;
          int i1 = (!this.b.length)? 1: 0;
          if (!i1) {
             i1 = this.l((this.c + this.a));
             if ((ta = this.a) < i1) {
                ogk = ta;
                while (ta < i1) {
                   oobject = this.b[ta];
                   if (i2 = p0.contains(oobject) ^ i) {
                      i3 = ogk + 1;
                      this.b[ogk] = oobject;
                      ogk = i3;
                   }else {
                      b = true;
                   }
                   ta = ta + 1;
                }
                gk tb = this.b;
                co5.o(tb, "<this>");
                Arrays.fill(tb, ogk, i1, null);
             }else {
                i4 = this.b.length;
                gk ogk1 = ta;
                i2 = 0;
                while (ta < i4) {
                   gk tb1 = this.b;
                   object oobject1 = tb1[ta];
                   tb1[ta] = null;
                   if (i3 = p0.contains(oobject1) ^ i) {
                      int i5 = ogk1 + 1;
                      this.b[ogk1] = oobject1;
                      ogk1 = i5;
                   }else {
                      i2 = 1;
                   }
                   ta = ta + 1;
                }
                i4 = this.l(ogk1);
                while (b < i1) {
                   ta = this.b;
                   oobject = ta[b];
                   ta[b] = null;
                   if (i6 = p0.contains(oobject) ^ i) {
                      this.b[i4] = oobject;
                      i4 = this.g(i4);
                   }else {
                      i2 = 1;
                   }
                   b = b + 1;
                }
                b = i2;
             }
             if (b) {
                if ((i4 = ogk - this.a) < 0) {
                   i4 = i4 + this.b.length;
                }
                this.c = i4;
             }
          }
       }
       return b;
    }
    public final Object removeLast(){
       if (this.isEmpty()) {
          throw new NoSuchElementException("ArrayDeque is empty.");
       }
       int i = this.l((ye7.B(this) + this.a));
       gk tb = this.b;
       object oobject = tb[i];
       tb[i] = null;
       this.c = this.a() - 1;
       return oobject;
    }
    public final boolean retainAll(Collection p0){
       gk ta;
       gk ogk;
       object oobject;
       int i2;
       co5.o(p0, "elements");
       boolean b = false;
       if (!this.isEmpty()) {
          int i = (!this.b.length)? 1: 0;
          if (!i) {
             i = this.l((this.c + this.a));
             if ((ta = this.a) < i) {
                ogk = ta;
                while (ta < i) {
                   oobject = this.b[ta];
                   if (p0.contains(oobject)) {
                      int i1 = ogk + 1;
                      this.b[ogk] = oobject;
                      ogk = i1;
                   }else {
                      b = true;
                   }
                   ta = ta + 1;
                }
                gk tb = this.b;
                co5.o(tb, "<this>");
                Arrays.fill(tb, ogk, i, null);
             }else {
                i2 = this.b.length;
                gk ogk1 = ta;
                int i3 = 0;
                while (ta < i2) {
                   gk tb1 = this.b;
                   object oobject1 = tb1[ta];
                   if (tb1[ta] = null) {
                      int i4 = ogk1 + 1;
                      this.b[ogk1] = oobject1;
                      ogk1 = i4;
                   }else {
                      i3 = 1;
                   }
                   ta = ta + 1;
                }
                i2 = this.l(ogk1);
                while (b < i) {
                   ta = this.b;
                   oobject = ta[b];
                   if (ta[b] = null) {
                      this.b[i2] = oobject;
                      i2 = this.g(i2);
                   }else {
                      i3 = 1;
                   }
                   b = b + 1;
                }
                b = i3;
             }
             if (b) {
                if ((i2 = ogk - this.a) < 0) {
                   i2 = i2 + this.b.length;
                }
                this.c = i2;
             }
          }
       }
       return b;
    }
    public final Object set(int p0,Object p1){
       fv1.n(p0, this.c);
       p0 = this.l((this.a + p0));
       gk tb = this.b;
       object oobject = tb[p0];
       tb[p0] = p1;
       return oobject;
    }
    public final Object[] toArray(){
       Object[] objArray = new Object[this.a()];
       return this.toArray(objArray);
    }
    public final Object[] toArray(Object[] p0){
       gk ta;
       co5.o(p0, "array");
       gk tc = this.c;
       if (p0.length >= tc) {
       }else {
          p0 = Array.newInstance(p0.getClass().getComponentType(), tc);
          co5.j(p0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
       }
       int i = this.l((this.c + this.a));
       if ((ta = this.a) < i) {
          uk.l0(this.b, p0, 0, ta, i, 2);
       }else if((this.isEmpty() ^ 0x01)){
          gk tb = this.b;
          uk.k0(0, this.a, tb.length, tb, p0);
          tb = this.b;
          uk.k0((tb.length - this.a), 0, i, tb, p0);
       }
       tc = this.c;
       if (p0.length > tc) {
          p0[tc] = null;
       }
       return p0;
    }
}
