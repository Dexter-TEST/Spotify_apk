package p.d73;
import p.a73;
import java.lang.Object;
import java.lang.Class;
import java.lang.Iterable;
import java.util.Collection;
import com.google.common.collect.b;
import java.util.Iterator;
import com.google.common.collect.d;
import java.util.AbstractCollection;
import java.util.Objects;
import p.dl6;
import com.google.common.collect.g;
import p.ys5;
import com.google.common.collect.c;

public class d73 extends a73	// class@0012f1 from classes.dex
{

    public void d73(){
       super(4);
    }
    public d73 F0(Object p0){
       p0.getClass();
       this.D0(p0);
       return this;
    }
    public void G0(Iterable p0){
       if (p0 instanceof Collection) {
          Collection uCollection = p0;
          this.E0((uCollection.size() + this.G));
          if (uCollection instanceof b) {
             this.G = uCollection.b(this.G, this.F);
          }
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.D0(iterator.next());
       }
       return;
    }
    public d H0(){
       a73 tG;
       if ((tG = this.G) == null) {
          return g.A;
       }
       boolean b = true;
       if (tG != b) {
          d uod = d.n(tG, this.F);
          this.G = uod.size();
          this.H = b;
          return uod;
       }else {
          object oobject = this.F[0];
          Objects.requireNonNull(oobject);
          return new dl6(oobject);
       }
    }
    public ys5 I0(){
       this.H = true;
       return c.m(this.G, this.F);
    }
}
