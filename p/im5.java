package p.im5;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Integer;
import p.e67;
import p.wn4;
import java.lang.Object;

public final class im5 implements Serializable	// class@0019c2 from classes.dex
{
    public final Boolean a;
    public final String b;
    public final Integer c;
    public final String t;
    public final e67 v;
    public final wn4 w;
    public final wn4 x;
    public static final im5 A;
    public static final im5 y;
    public static final im5 z;

    static {
       im5 v8 = new im5(Boolean.TRUE, null, null, null, null, null, null);
       im5.y = v8;
       v8 = new im5(Boolean.FALSE, null, null, null, null, null, null);
       im5.z = v8;
       v8 = new im5(null, null, null, null, null, null, null);
       im5.A = v8;
    }
    public void im5(Boolean p0,String p1,Integer p2,String p3,e67 p4,wn4 p5,wn4 p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       if (p3 == null || p3.isEmpty()) {
          p3 = null;
       }
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       return;
    }
    public Object readResolve(){
       im5 ta;
       if (this.b != null || (this.c != null || (this.t != null || (this.v != null || (this.w != null || this.x != null))))) {
          return this;
       }
       if ((ta = this.a) == null) {
          return im5.A;
       }
       ta = (ta.booleanValue())? im5.y: im5.z;
       return ta;
    }
}
