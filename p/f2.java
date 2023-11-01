package p.f2;
import p.bc3;
import java.util.AbstractList;
import java.lang.UnsupportedOperationException;
import java.lang.Object;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractCollection;

public abstract class f2 extends AbstractList implements bc3	// class@00154a from classes.dex
{
    public boolean a;

    public void f2(){
       super();
       this.a = true;
    }
    public final void a(){
       if (this.a != null) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public boolean add(Object p0){
       this.a();
       return super.add(p0);
    }
    public boolean addAll(int p0,Collection p1){
       this.a();
       return super.addAll(p0, p1);
    }
    public boolean addAll(Collection p0){
       this.a();
       return super.addAll(p0);
    }
    public final boolean b(){
       return this.a;
    }
    public void clear(){
       this.a();
       super.clear();
    }
    public boolean equals(Object p0){
       int i;
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof List) {
          return false;
       }
       if (!p0 instanceof RandomAccess) {
          return super.equals(p0);
       }
       if ((i = this.size()) != p0.size()) {
          return false;
       }
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return true;
          }
          if (!this.get(i1).equals(p0.get(i1))) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return false;
    }
    public int hashCode(){
       int i = this.size();
       int i1 = 1;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          i1 = i1 * 31;
          i1 = i1 + this.get(i2).hashCode();
       }
       return i1;
    }
    public abstract Object remove(int p0);
    public final boolean remove(Object p0){
       int i;
       this.a();
       if ((i = this.indexOf(p0)) == -1) {
          return false;
       }
       this.remove(i);
       return true;
    }
    public final boolean removeAll(Collection p0){
       this.a();
       return super.removeAll(p0);
    }
    public final boolean retainAll(Collection p0){
       this.a();
       return super.retainAll(p0);
    }
}
