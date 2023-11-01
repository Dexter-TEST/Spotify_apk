package p.yn4;
import p.hs6;
import java.lang.Class;
import p.ts3;
import java.lang.Object;
import p.u91;
import p.z2;
import p.v91;
import com.fasterxml.jackson.databind.deser.std.m;
import java.lang.String;
import p.wf0;
import p.if3;

public abstract class yn4 extends hs6	// class@002df1 from classes.dex
{
    public final ts3 a;
    public final Object b;
    public final Object c;
    public final boolean t;

    public void yn4(Class p0,ts3 p1,Object p2,Object p3){
       super(p0);
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.t = p0.isPrimitive();
    }
    public final Object getEmptyValue(u91 p0){
       return this.c;
    }
    public final z2 getNullAccessPattern(){
       if (this.t != null) {
          return z2.c;
       }
       if (this.b == null) {
          return z2.a;
       }
       return z2.b;
    }
    public final Object getNullValue(u91 p0){
       if (this.t == null || !p0.w(v91.w)) {
          return this.b;
       }
       Object[] objArray = new Object[]{wf0.c(this.handledType())};
       p0.B(this, "Cannot map `null` into type %s \(set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to \'false\' to allow\)", objArray);
       throw null;
    }
    public final ts3 logicalType(){
       return this.a;
    }
}
