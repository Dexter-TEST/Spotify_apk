package p.tb7;
import p.ir0;
import p.ub7;
import p.d22;
import java.lang.Object;
import p.bx5;
import java.lang.String;
import p.co5;
import java.lang.Class;
import java.lang.System;
import java.util.concurrent.atomic.AtomicLong;
import p.ge6;
import p.t37;
import java.lang.Long;
import p.cx5;
import java.lang.Integer;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import p.ko0;
import p.xo5;
import p.xs6;
import p.mm2;
import p.lm2;
import p.dr0;
import java.util.Set;
import java.lang.Enum;
import com.google.protobuf.c;
import java.lang.StringBuilder;
import p.za3;
import java.lang.Throwable;

public final class tb7 implements ir0	// class@00273d from classes.dex
{
    public final int a;
    public final ub7 b;
    public final d22 c;

    public void tb7(ub7 p0,d22 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void accept(Object p0){
       Object obj;
       boolean b2;
       tb7 otb7 = this;
       tb7 c = otb7.c;
       String str = "it";
       tb7 b = otb7.b;
       switch (otb7.a){
           case 0:
             break;
           default:
             obj = p0;
             co5.l(obj, str);
             b.c.getClass();
             b.g.c(obj, c, (System.currentTimeMillis() - b.f.get()));
             return;
       }
       obj = p0;
       ub7 g = b.g;
       co5.l(obj, str);
       b.c.getClass();
       long l = System.currentTimeMillis() - b.f.get();
       g.getClass();
       co5.o(c, "fetchType");
       Object[] objArray = new Object[]{Long.valueOf(l),Integer.valueOf(obj.a.t)};
       t37.a().getClass();
       ge6.a(objArray);
       bx5 b1 = obj.b;
       if (obj.a() && (b1 != null && b1.f() != null)) {
          Configuration uConfigurati = b1.f();
          co5.l(uConfigurati, "responseBody.configuration");
          if (b2 = co5.c(g.a.b().a(), dr0.c(lm2.b(uConfigurati)).a())) {
             Object[] objArray1 = new Object[0];
             t37.a().getClass();
             ge6.i(objArray1);
          }
          String str1 = b1.f().g();
          co5.l(str1, "responseBody.configurati…configurationAssignmentId");
          g.b.d(c.name(), l, b1.getSerializedSize(), str1, Long.valueOf(b1.f().i()), null, "unnecessaryFetch="+b2);
       }else {
          g.a(l, c, obj);
       }
       return;
    }
}
