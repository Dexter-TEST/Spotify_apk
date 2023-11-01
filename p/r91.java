package p.r91;
import com.google.common.collect.e;
import p.v45;
import p.ek0;
import java.util.Comparator;
import java.lang.Object;
import com.google.common.collect.b;
import java.util.NavigableSet;
import p.qc7;
import java.util.AbstractCollection;
import java.lang.AssertionError;

public final class r91 extends e	// class@00249e from classes.dex
{
    public final e x;

    public void r91(e p0){
       e t = p0.t;
       if (t instanceof v45) {
       }else {
          t = new ek0(t);
       }
       super(t.a());
       this.x = p0;
       return;
    }
    public final e C(Object p0,boolean p1,Object p2,boolean p3){
       return this.x.B(p2, p3, p0, p1).v();
    }
    public final e F(Object p0,boolean p1){
       return this.x.y(p0, p1).v();
    }
    public final Object ceiling(Object p0){
       return this.x.floor(p0);
    }
    public final boolean contains(Object p0){
       return this.x.contains(p0);
    }
    public final NavigableSet descendingSet(){
       return this.x;
    }
    public final Object floor(Object p0){
       return this.x.ceiling(p0);
    }
    public final Object higher(Object p0){
       return this.x.lower(p0);
    }
    public final boolean k(){
       return this.x.k();
    }
    public final qc7 l(){
       return this.x.u();
    }
    public final Object lower(Object p0){
       return this.x.higher(p0);
    }
    public final int size(){
       return this.x.size();
    }
    public final e t(){
       throw new AssertionError("should never be called");
    }
    public final qc7 u(){
       return this.x.l();
    }
    public final e v(){
       return this.x;
    }
    public final e z(Object p0,boolean p1){
       return this.x.E(p0, p1).v();
    }
}
