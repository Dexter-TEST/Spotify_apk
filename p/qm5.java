package p.qm5;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import p.w04;
import java.lang.Class;
import p.w36;
import p.cc3;
import com.google.protobuf.g;
import com.google.protobuf.c;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.p74;
import p.q74;
import p.zo5;
import p.ay1;
import com.google.protobuf.f;
import com.google.protobuf.h;
import p.zx1;
import p.s74;
import java.lang.IllegalStateException;
import p.aj4;
import p.ml3;
import p.i14;
import p.zi4;
import p.h14;
import com.google.protobuf.e;
import java.lang.NullPointerException;

public final class qm5	// class@0023cf from classes.dex
{
    public final w04 a;
    public final ConcurrentHashMap b;
    public static final qm5 c;

    static {
       qm5.c = new qm5();
    }
    public void qm5(){
       super();
       this.b = new ConcurrentHashMap();
       this.a = new w04();
    }
    public final w36 a(Class p0){
       w36 ow36;
       Class a;
       f uof;
       w36 ow361;
       zx1 b1;
       h b2;
       zx1 b3;
       if (p0 == null) {
          throw new NullPointerException("messageType");
       }
       qm5 tb = this.b;
       if ((ow36 = tb.get(p0)) == null) {
          qm5 ta = this.a;
          ta.getClass();
          c uoc = c.class;
          if (!uoc.isAssignableFrom(p0) && ((a = g.a) != null && !a.isAssignableFrom(p0))) {
             throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
          }else {
             p74 op74 = ta.a.a(p0);
             p74 op741 = op74;
             int i = 2;
             int i1 = 1;
             int i2 = (((op741.d & i)) == i)? 1: 0;
             String str = "Protobuf runtime is not correctly loaded.";
             if (i2) {
                zo5 a1 = op741.a;
                if (uoc.isAssignableFrom(p0)) {
                   uof = new f(g.d, ay1.a, a1);
                }else {
                   h b = g.b;
                   if ((b1 = ay1.b) != null) {
                      uof = new f(b, b1, a1);
                   }else {
                      throw new IllegalStateException(str);
                   }
                }
                ow36 = uof;
             }else if(uoc.isAssignableFrom(p0)){
                if (op741.d() != i1) {
                   i1 = 0;
                }
                if (i1) {
                   ow36 = e.D(op74, aj4.b, ml3.b, g.d, ay1.a, i14.b);
                }else {
                   ow36 = e.D(op74, aj4.b, ml3.b, g.d, null, i14.b);
                }
             }else if(op741.d() == i1){
                b2 = 0;
             }
             if (i1) {
                zi4 a2 = aj4.a;
                kl3 a3 = ml3.a;
                b2 = g.b;
                if ((b3 = ay1.b) != null) {
                   ow36 = e.D(op74, a2, a3, b2, b3, i14.a);
                }else {
                   throw new IllegalStateException(str);
                }
             }else {
                ow36 = e.D(op74, aj4.a, ml3.a, g.c, null, i14.a);
             }
             if ((ow361 = tb.putIfAbsent(p0, ow36)) != null) {
                ow36 = ow361;
             }
          }
       }
       return ow36;
    }
    public final w36 b(Object p0){
       return this.a(p0.getClass());
    }
}
