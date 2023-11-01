package p.cs6;
import p.xt0;
import com.fasterxml.jackson.databind.deser.std.m;
import p.tu0;
import p.he3;
import p.if3;
import p.u91;
import p.m00;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import p.wf0;
import p.ia7;
import p.eg3;
import java.lang.UnsupportedOperationException;
import p.ga7;
import p.ts3;
import p.t91;
import java.lang.Boolean;

public final class cs6 extends m implements xt0	// class@00126c from classes.dex
{
    public final he3 a;
    public final if3 b;

    public void cs6(tu0 p0,he3 p1,if3 p2){
       super(p1);
       this.a = p1;
       this.b = p2;
    }
    public final if3 a(u91 p0,m00 p1){
       cs6 tb;
       if3 oif3;
       if ((tb = this.b) != null) {
          cs6 ta = this.a;
          if ((oif3 = p0.q(tb, p1, ta)) == tb) {
             return this;
          }
          wf0.t(cs6.class, this, "withDelegate");
          return new cs6(null, ta, oif3);
       }else {
          p0.f();
          throw null;
       }
    }
    public final Object deserialize(eg3 p0,u91 p1){
       if (this.b.deserialize(p0, p1) == null) {
          return null;
       }
       throw null;
    }
    public final Object deserialize(eg3 p0,u91 p1,Object p2){
       cs6 ta = this.a;
       if (ta.a.isAssignableFrom(p2.getClass())) {
          return this.b.deserialize(p0, p1, p2);
       }
       p2 = new Object[]{ta};
       throw new UnsupportedOperationException(String.format("Cannot update object of type %s \(using deserializer for type %s\)".concat(p2.getClass().getName()), p2));
    }
    public final Object deserializeWithType(eg3 p0,u91 p1,ga7 p2){
       if (this.b.deserialize(p0, p1) == null) {
          return null;
       }
       throw null;
    }
    public final if3 getDelegatee(){
       return this.b;
    }
    public final Class handledType(){
       return this.b.handledType();
    }
    public final ts3 logicalType(){
       return this.b.logicalType();
    }
    public final Boolean supportsUpdate(t91 p0){
       return this.b.supportsUpdate(p0);
    }
}
