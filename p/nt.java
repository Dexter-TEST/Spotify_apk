package p.nt;
import p.kd7;
import p.sg2;
import p.x00;
import p.uv1;
import java.lang.Object;
import p.o11;
import p.xt;
import java.lang.Class;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class nt implements kd7	// class@00204a from classes.dex
{
    public final kd7 a;
    public final sg2 b;
    public final sg2 c;
    public final x00 t;
    public final uv1 v;

    public void nt(kd7 p0,sg2 p1,sg2 p2,x00 p3,uv1 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public static o11 a(){
       return new o11(26);
    }
    public final xt e(Object p0,Object p1){
       boolean b;
       Object obj = this.b.apply(p0);
       obj.getClass();
       p1 = this.c.apply(p1);
       p1.getClass();
       p1 = this.a.e(obj, p1);
       p1.getClass();
       if (b = p1.b()) {
          p0 = this.t.apply(p0, p1.c());
          p0.getClass();
       }
       nt tv = this.v;
       tv.getClass();
       p1 = p1.b;
       if (p1.isEmpty()) {
          p0 = (b)? xt.d(p0): xt.e();
       }else {
          HashSet hashSet = new HashSet();
          p1 = p1.iterator();
          while (p1.hasNext()) {
             uv1 b1 = tv.b;
             b1.getClass();
             Object obj1 = b1.apply(p1.next());
             obj1.getClass();
             hashSet.add(obj1);
          }
          p0 = (b)? new xt(p0, co5.B(hashSet)): xt.a(hashSet);
       }
       return p0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof nt) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || (!this.t.equals(p0.t) || !this.v.equals(p0.v))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.t.hashCode()) * 0xf4243) ^ this.v.hashCode());
    }
    public final String toString(){
       return "InnerUpdate{innerUpdate="+this.a+", modelExtractor="+this.b+", eventExtractor="+this.c+", modelUpdater="+this.t+", innerEffectHandler="+this.v+"}";
    }
}
