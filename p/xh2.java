package p.xh2;
import p.w47;
import p.tu1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.a47;
import java.util.Set;
import p.gs5;
import p.vv7;
import p.d47;
import com.spotify.messages.TimeMeasurementErrorNonAuth;
import java.util.UUID;
import java.util.Map;
import java.lang.Number;
import p.c47;
import p.kg4;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.m47;
import com.spotify.messages.TimeMeasurementNonAuth;

public final class xh2 implements w47	// class@002c78 from classes.dex
{
    public final tu1 a;
    public final boolean b;

    public void xh2(tu1 p0){
       co5.o(p0, "_eventPublisher");
       super();
       this.a = p0;
       this.b = true;
    }
    public final void a(a47 p0){
       a47 i1;
       a47 h;
       gs5 ogs51;
       c uoc;
       co5.o(p0, "measurement");
       xh2 ta = this.a;
       int i = 0;
       xh2 tb = this.b;
       a47 f = p0.f;
       a47 c = p0.c;
       a47 d = p0.d;
       a47 b = p0.b;
       a47 a = p0.a;
       a47 e = p0.e;
       if ((i1 = p0.i) != null) {
          if (tb == null) {
             ta = i;
          }
          if (ta != null) {
             gs5 ogs5 = vv7.L(e);
             d47 uod47 = TimeMeasurementErrorNonAuth.t();
             uod47.n(a.toString());
             uod47.k(b);
             uod47.c(d);
             uod47.e(c);
             uod47.j(ogs5.a);
             uod47.h(ogs5.b);
             uod47.i(ogs5.c);
             if (f != null) {
                uod47.m(f);
             }
             if ((h = p0.h) != null) {
                uod47.o(h.longValue());
             }
             if ((p0 = p0.g) != null) {
                uod47.p(p0.toString());
             }
             uod47.l(kg4.i(i1.a));
             uod47.d(i1.b);
             ogs51 = vv7.L(i1.c);
             uod47.g(ogs51.a);
             uod47.f(ogs51.c);
             uoc = uod47.build();
             co5.l(uoc, "builder.build\(\)");
             ta.a(uoc);
          }
       }else if(tb != null){
          ta = i;
       }
       if (ta != null) {
          ogs51 = vv7.L(e);
          m47 om47 = TimeMeasurementNonAuth.n();
          om47.j(a.toString());
          om47.h(b);
          om47.c(d);
          om47.d(c);
          om47.g(ogs51.a);
          om47.e(ogs51.b);
          om47.f(ogs51.c);
          if (f != null) {
             om47.i(f);
          }
          uoc = om47.build();
          co5.l(uoc, "builder.build\(\)");
          ta.a(uoc);
       }
       return;
    }
}
