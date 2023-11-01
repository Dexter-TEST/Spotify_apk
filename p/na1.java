package p.na1;
import p.ir0;
import p.oa1;
import java.lang.Object;
import p.us6;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.wh2;
import p.xt6;
import com.spotify.messages.StorageUsageReport;
import p.vt6;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;

public final class na1 implements ir0	// class@001f99 from classes.dex
{
    public final oa1 a;

    public void na1(oa1 p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       oa1 a = this.a.a;
       co5.l(p0, "event");
       a.getClass();
       if (a.b != null) {
          xt6 oxt6 = StorageUsageReport.l();
          us6 a1 = p0.a;
          oxt6.f(a1.b);
          oxt6.g(a1.a);
          oxt6.h(a1.c);
          p0 = p0.b;
          oxt6.c(p0.b);
          oxt6.d(p0.a);
          oxt6.e(p0.c);
          p0 = oxt6.build();
          co5.l(p0, "newBuilder\(\)\n           …ternal.usedBytes\).build\(\)");
          a.a.a(p0);
       }
       return;
    }
}
