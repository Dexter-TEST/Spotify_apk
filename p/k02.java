package p.k02;
import p.a26;
import java.util.HashMap;
import java.lang.Object;
import p.w16;

public final class k02 extends a26	// class@001b7c from classes.dex
{
    public final HashMap v;

    public void k02(){
       super();
       this.v = new HashMap();
    }
    public final w16 a(Object p0){
       return this.v.get(p0);
    }
    public final Object b(Object p0,Object p1){
       w16 ow16;
       if ((ow16 = this.a(p0)) != null) {
          return ow16.b;
       }
       k02 tv = this.v;
       w16 ow161 = new w16(p0, p1);
       this.t = this.t + 1;
       if ((p1 = this.b) == null) {
          this.a = ow161;
          this.b = ow161;
       }else {
          p1.c = ow161;
          ow161.t = p1;
          this.b = ow161;
       }
       tv.put(p0, ow161);
       return null;
    }
    public final Object c(Object p0){
       this.v.remove(p0);
       return super.c(p0);
    }
}
