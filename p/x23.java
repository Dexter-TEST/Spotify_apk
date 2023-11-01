package p.x23;
import p.a43;
import p.y23;
import p.iu2;
import p.k23;
import p.il3;
import com.google.common.collect.c;
import p.zt2;
import p.a23;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Iterable;
import p.oi;
import p.ju2;
import p.uk;
import java.io.Serializable;
import p.au2;
import p.z23;
import java.lang.Class;
import p.h23;
import java.util.Collection;
import p.o13;

public final class x23 extends a43	// class@002bf4 from classes.dex
{
    public String a;
    public String b;
    public iu2 c;
    public final il3 d;
    public final il3 e;
    public final String f;
    public zt2 g;

    public void x23(y23 p0){
       y23 c;
       super();
       this.a = p0.a;
       this.b = p0.b;
       iu2 oiu2 = ((c = p0.c) != null)? c.a(): null;
       this.c = oiu2;
       this.d = new il3(p0.d);
       this.e = new il3(p0.e);
       this.f = p0.f;
       this.g = p0.g.a();
       return;
    }
    public final a43 a(List p0){
       co5.o(p0, "components");
       this.d.a(oi.a(p0));
       return this;
    }
    public final a43 b(ju2[] p0){
       this.d.a(oi.a(uk.h0(p0)));
       return this;
    }
    public final a43 c(String p0,Serializable p1){
       this.g = this.g.q(p0, p1);
       return this;
    }
    public final a43 d(au2 p0){
       co5.o(p0, "custom");
       this.g = this.g.a(p0);
       return this;
    }
    public final a43 e(List p0){
       Iterable iterable = (p0 != null && !p0.isEmpty())? oi.a(p0): null;
       this.d.b(iterable);
       return this;
    }
    public final a43 f(ju2[] p0){
       this.d.b(oi.a(uk.h0(p0)));
       return this;
    }
    public final z23 g(){
       x23 tc;
       k23 ok23;
       z23 v8;
       x23 ta = this.a;
       x23 tb = this.b;
       if ((tc = this.c) != null) {
          k23.c.getClass();
          ok23 = h23.b(tc.g());
       }else {
          v8 = 0;
       }
       c uoc = c.o(this.d.a);
       co5.l(uoc, "copyOf\(list\)");
       c uoc1 = c.o(this.e.a);
       co5.l(uoc1, "copyOf\(list\)");
       a23.b.getClass();
       v8 = new z23(ta, tb, ok23, uoc, uoc1, this.f, o13.b(this.g.d()));
       return v8;
    }
    public final a43 h(au2 p0){
       zt2 ozt2;
       if (p0 != null) {
          ozt2 = p0.a();
       }else {
          a23.b.getClass();
          ozt2 = o13.a();
       }
       this.g = ozt2;
       return this;
    }
    public final a43 i(ju2 p0){
       iu2 oiu2 = (p0 != null)? p0.a(): null;
       this.c = oiu2;
       return this;
    }
    public final a43 j(String p0){
       this.a = p0;
       return this;
    }
    public final a43 k(ju2[] p0){
       this.e.b(oi.a(uk.h0(p0)));
       return this;
    }
    public final a43 l(String p0){
       this.b = p0;
       return this;
    }
}
