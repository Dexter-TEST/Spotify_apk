package p.zl6;
import java.util.AbstractMap;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.lang.Comparable;
import java.lang.Object;
import p.cm6;
import java.lang.UnsupportedOperationException;
import java.util.Set;
import p.kk;
import java.util.Map$Entry;
import java.lang.Iterable;
import p.uw5;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.ArrayList;
import java.util.Iterator;

public final class zl6 extends AbstractMap	// class@002f1f from classes.dex
{
    public final int a;
    public List b;
    public Map c;
    public boolean t;
    public kk v;
    public Map w;
    public static final int x;

    public void zl6(int p0){
       super();
       this.a = p0;
       this.b = Collections.emptyList();
       this.c = Collections.emptyMap();
       this.w = Collections.emptyMap();
    }
    public final int a(Comparable p0){
       int i;
       int i1;
       int i3;
       if ((i = this.b.size() - 1) >= 0) {
          if ((i1 = p0.compareTo(this.b.get(i).a)) > 0) {
             i = - (i + 2);
          }else if(!i1){
          label_0021 :
             i1 = 0;
             while (true) {
                if (i1 <= i) {
                   int i2 = i1 + i;
                   i2 = i2 / 2;
                   if ((i3 = p0.compareTo(this.b.get(i2).a)) < 0) {
                      i = i2 - 1;
                   }else if(i3 > 0){
                      i1 = i2 + 1;
                   }else {
                      i = i2;
                      break ;
                   }
                }else {
                   i = - (i1 + 1);
                   break ;
                }
             }
          }
       }else {
          goto label_0021 ;
       }
       return i;
    }
    public final void b(){
       if (this.t == null) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public final void c(){
       this.b();
       if (!this.b.isEmpty()) {
          this.b.clear();
       }
       if (!this.c.isEmpty()) {
          this.c.clear();
       }
       return;
    }
    public final void clear(){
       this.c();
    }
    public final boolean containsKey(Object p0){
       return this.d(p0);
    }
    public final boolean d(Object p0){
       boolean b = (this.a(p0) < 0 && !this.c.containsKey(p0))? false: true;
       return b;
    }
    public final Set e(){
       if (this.v == null) {
          this.v = new kk(this);
       }
       return this.v;
    }
    public final Set entrySet(){
       return this.e();
    }
    public final boolean equals(Object p0){
       return this.f(p0);
    }
    public final boolean f(Object p0){
       int i;
       int i1;
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof zl6) {
          return super.equals(p0);
       }
       if ((i = this.p()) != p0.p()) {
          return false;
       }
       if ((i1 = this.i()) != p0.i()) {
          return this.e().equals(p0.e());
       }
       int i2 = 0;
       while (true) {
          if (i2 < i1) {
             if (!this.h(i2).equals(p0.h(i2))) {
                break ;
             }else {
                i2 = i2 + 1;
             }
          }else if(i1 != i){
             return this.c.equals(p0.c);
          }else {
             return b;
          }
       }
       return false;
    }
    public final Object g(Object p0){
       int i;
       if ((i = this.a(p0)) >= 0) {
          return this.b.get(i).b;
       }
       return this.c.get(p0);
    }
    public final Object get(Object p0){
       return this.g(p0);
    }
    public final Map$Entry h(int p0){
       return this.b.get(p0);
    }
    public final int hashCode(){
       return this.l();
    }
    public final int i(){
       return this.b.size();
    }
    public final Iterable j(){
       bm6 x = (this.c.isEmpty())? uw5.x: this.c.entrySet();
       return x;
    }
    public final SortedMap k(){
       this.b();
       if (this.c.isEmpty() && !this.c instanceof TreeMap) {
          TreeMap treeMap = new TreeMap();
          this.c = treeMap;
          this.w = treeMap.descendingMap();
       }
       return this.c;
    }
    public final int l(){
       int i = this.i();
       int i2 = 0;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          i2 = i2 + this.b.get(i1).hashCode();
       }
       if (this.c.size() > 0) {
          i2 = i2 + this.c.hashCode();
       }
       return i2;
    }
    public final Object m(Comparable p0,Object p1){
       int i;
       this.b();
       if ((i = this.a(p0)) >= 0) {
          return this.b.get(i).setValue(p1);
       }
       this.b();
       zl6 ta = this.a;
       if (this.b.isEmpty() && !this.b instanceof ArrayList) {
          this.b = new ArrayList(ta);
       }
       if ((i = - (i + 1)) >= ta) {
          return this.k().put(p0, p1);
       }else if(this.b.size() == ta){
          cm6 uocm6 = this.b.remove((ta - 1));
          this.k().put(uocm6.a, uocm6.b);
       }
       this.b.add(i, new cm6(this, p0, p1));
       return null;
    }
    public final Object n(Object p0){
       int i;
       this.b();
       if ((i = this.a(p0)) >= 0) {
          return this.o(i);
       }
       if (this.c.isEmpty()) {
          return null;
       }
       return this.c.remove(p0);
    }
    public final Object o(int p0){
       this.b();
       cm6 b = this.b.remove(p0).b;
       if (!this.c.isEmpty()) {
          Iterator iterator = this.k().entrySet().iterator();
          Map$Entry uEntry = iterator.next();
          Comparable key = uEntry.getKey();
          this.b.add(new cm6(this, key, uEntry.getValue()));
          iterator.remove();
       }
       return b;
    }
    public final int p(){
       return (this.c.size() + this.b.size());
    }
    public final Object put(Object p0,Object p1){
       return this.m(p0, p1);
    }
    public final Object remove(Object p0){
       return this.n(p0);
    }
    public final int size(){
       return this.p();
    }
}
