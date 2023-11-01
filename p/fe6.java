package p.fe6;
import p.tu1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ee6;
import p.de6;
import com.spotify.share.loggingimpl.events.proto.Share;
import com.google.protobuf.c;
import com.google.protobuf.b;

public final class fe6	// class@0015b1 from classes.dex
{
    public final tu1 a;

    public void fe6(tu1 p0){
       co5.o(p0, "eventPublisher");
       super();
       this.a = p0;
    }
    public final void a(ee6 p0){
       de6 uode6 = Share.r();
       uode6.f(p0.a);
       uode6.e(p0.b);
       uode6.i(p0.d);
       uode6.c(p0.c);
       uode6.g(p0.g);
       uode6.j(p0.h);
       ee6 e = p0.e;
       int i = 0;
       int i1 = (e.length() > 0)? 1: 0;
       if (i1) {
          uode6.m(e);
       }
       e = p0.f;
       i1 = (e.length() > 0)? 1: 0;
       if (i1) {
          uode6.l(e);
       }
       i1 = ((e = p0.k) != null && e.length())? 0: 1;
       if (!i1) {
          uode6.d(e);
       }
       i1 = ((e = p0.j) != null && e.length())? 0: 1;
       if (!i1) {
          uode6.n(e);
       }
       i1 = ((e = p0.l) != null && e.length())? 0: 1;
       if (!i1) {
          uode6.h(e);
       }
       if ((p0 = p0.i) == null || !p0.length()) {
          i = 1;
       }
       if (!i) {
          uode6.k(p0);
       }
       c uoc = uode6.build();
       co5.l(uoc, "builder.build\(\)");
       this.a.a(uoc);
       return;
    }
}
