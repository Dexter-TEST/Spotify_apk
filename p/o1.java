package p.o1;
import java.util.AbstractCollection;
import p.i1;
import java.lang.Object;
import java.util.Collection;
import java.util.Map;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p.k1;
import java.lang.Class;
import java.lang.String;

public abstract class o1 extends AbstractCollection	// class@002093 from classes.dex
{
    public final Object a;
    public Collection b;
    public final o1 c;
    public final Collection t;
    public final i1 v;

    public void o1(i1 p0,Object p1,Collection p2,o1 p3){
       this.v = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       Collection uCollection = (p3 == null)? null: p3.b;
       this.t = uCollection;
       return;
    }
    public final void a(){
       o1 tc;
       if ((tc = this.c) != null) {
          tc.a();
       }else {
          this.v.c.put(this.a, this.b);
       }
       return;
    }
    public final boolean add(Object p0){
       boolean b1;
       this.b();
       boolean b = this.b.isEmpty();
       if (b1 = this.b.add(p0)) {
          o1 tv = this.v;
          tv.t = tv.t + 1;
          if (b) {
             this.a();
          }
       }
       return b1;
    }
    public final boolean addAll(Collection p0){
       boolean b;
       if (p0.isEmpty()) {
          return false;
       }
       int i = this.size();
       if (b = this.b.addAll(p0)) {
          o1 tv = this.v;
          tv.t = tv.t + (this.b.size() - i);
          if (!i) {
             this.a();
          }
       }
       return b;
    }
    public final void b(){
       o1 tc;
       Collection uCollection;
       if ((tc = this.c) != null) {
          tc.b();
          if (tc.b != this.t) {
             throw new ConcurrentModificationException();
          }
       }else if(this.b.isEmpty() && (uCollection = this.v.c.get(this.a)) != null){
          this.b = uCollection;
       }
       return;
    }
    public final void c(){
       o1 tc;
       if ((tc = this.c) != null) {
          tc.c();
       }else if(this.b.isEmpty()){
          this.v.c.remove(this.a);
       }
       return;
    }
    public final void clear(){
       int i;
       if (!(i = this.size())) {
          return;
       }
       this.b.clear();
       o1 tv = this.v;
       tv.t = tv.t - i;
       this.c();
       return;
    }
    public final boolean contains(Object p0){
       this.b();
       return this.b.contains(p0);
    }
    public final boolean containsAll(Collection p0){
       this.b();
       return this.b.containsAll(p0);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       this.b();
       return this.b.equals(p0);
    }
    public final int hashCode(){
       this.b();
       return this.b.hashCode();
    }
    public final Iterator iterator(){
       this.b();
       return new k1(this);
    }
    public final boolean remove(Object p0){
       boolean b;
       this.b();
       if (b = this.b.remove(p0)) {
          o1 tv = this.v;
          tv.t = tv.t - 1;
          this.c();
       }
       return b;
    }
    public final boolean removeAll(Collection p0){
       boolean b;
       if (p0.isEmpty()) {
          return false;
       }
       int i = this.size();
       if (b = this.b.removeAll(p0)) {
          o1 tv = this.v;
          tv.t = tv.t + (this.b.size() - i);
          this.c();
       }
       return b;
    }
    public final boolean retainAll(Collection p0){
       boolean b;
       p0.getClass();
       int i = this.size();
       if (b = this.b.retainAll(p0)) {
          o1 tv = this.v;
          tv.t = tv.t + (this.b.size() - i);
          this.c();
       }
       return b;
    }
    public final int size(){
       this.b();
       return this.b.size();
    }
    public final String toString(){
       this.b();
       return this.b.toString();
    }
}
