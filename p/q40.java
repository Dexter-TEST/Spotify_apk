package p.q40;
import p.p40;
import p.su1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.oh5;
import p.kg4;
import p.x40;
import com.spotify.messages.BootstrapRequestNonAuth;
import p.b17;
import java.util.TreeMap;
import com.google.protobuf.c;
import com.google.protobuf.b;
import com.google.protobuf.a;
import p.nc2;
import java.lang.Integer;
import java.lang.Number;

public final class q40 implements p40	// class@002329 from classes.dex
{
    public final su1 a;

    public void q40(su1 p0){
       co5.o(p0, "eventPublisher");
       super();
       this.a = p0;
    }
    public final void a(long p0,int p1,int p2,String p3,String p4,String p5,oh5 p6){
       co5.o(p6, "policyInputs");
       kg4.t(1, "fetchedReason");
       x40 ox40 = BootstrapRequestNonAuth.n();
       ox40.g(p0);
       ox40.j(p1);
       ox40.e(p3);
       ox40.h((long)p2);
       ox40.f(b17.c());
       ox40.c(p6.b());
       if (p4 != null) {
          ox40.d(p4);
       }
       if (p5 != null) {
          ox40.i(p5);
       }
       byte[] uobyteArray = ox40.build().toByteArray();
       co5.l(uobyteArray, "it.toByteArray\(\)");
       this.a.c("BootstrapRequestNonAuth", uobyteArray);
       return;
    }
    public final void b(long p0,Integer p1,oh5 p2){
       co5.o(p2, "policyInputs");
       kg4.t(1, "fetchedReason");
       x40 ox40 = BootstrapRequestNonAuth.n();
       ox40.g(p0);
       ox40.e("timeout");
       ox40.f(b17.c());
       if (p1 != null) {
          ox40.j(p1.intValue());
       }
       ox40.c(p2.b());
       byte[] uobyteArray = ox40.build().toByteArray();
       co5.l(uobyteArray, "it.toByteArray\(\)");
       this.a.c("BootstrapRequestNonAuth", uobyteArray);
       return;
    }
}
