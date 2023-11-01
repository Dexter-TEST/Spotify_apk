package p.k73;
import java.lang.Object;
import p.m73;
import p.dt5;
import java.lang.IllegalArgumentException;
import p.j73;
import p.do5;
import java.util.Arrays;
import p.w51;
import java.util.Map$Entry;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;

public class k73	// class@001bbc from classes.dex
{
    public Object[] a;
    public int b;
    public j73 c;

    public void k73(int p0){
       super();
       Object[] objArray = new Object[(p0 * 2)];
       this.a = objArray;
       this.b = 0;
    }
    public m73 a(){
       return this.b(true);
    }
    public final dt5 b(boolean p0){
       k73 tc;
       k73 tc1;
       if (p0 && (tc = this.c) != null) {
          throw tc.a();
       }
       dt5 uodt5 = dt5.k(this.b, this.a, this);
       if (p0 && (tc1 = this.c) != null) {
          throw tc1.a();
       }
       return uodt5;
    }
    public m73 c(){
       return this.b(true);
    }
    public k73 d(Object p0,Object p1){
       int i = (this.b + 1) * 2;
       k73 ta = this.a;
       if (i > ta.length) {
          this.a = Arrays.copyOf(ta, do5.t(ta.length, i));
       }
       w51.f(p0, p1);
       k73 ta1 = this.a;
       ta = this.b;
       int i1 = ta * 2;
       ta1[i1] = p0;
       ta1[(i1 + 1)] = p1;
       this.b = ta + 1;
       return this;
    }
    public void e(Map$Entry p0){
       this.d(p0.getKey(), p0.getValue());
    }
    public k73 f(Set p0){
       if (p0 instanceof Collection) {
          int i = (p0.size() + this.b) * 2;
          k73 ta = this.a;
          if (i > ta.length) {
             this.a = Arrays.copyOf(ta, do5.t(ta.length, i));
          }
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.e(iterator.next());
       }
       return this;
    }
}
