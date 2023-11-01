package p.i23;
import p.iu2;
import p.j23;
import p.su2;
import p.o23;
import p.gu2;
import p.g23;
import p.zt2;
import p.a23;
import p.ia4;
import p.m73;
import p.il3;
import com.google.common.collect.c;
import p.ju2;
import java.lang.Object;
import java.util.List;
import p.uk;
import java.lang.Iterable;
import p.oi;
import java.lang.String;
import java.io.Serializable;
import p.au2;
import p.co5;
import p.tt2;
import p.n13;
import java.lang.Class;
import p.k13;
import java.util.Map;
import p.io2;
import java.util.LinkedHashMap;
import p.q14;
import p.k23;
import p.eb3;
import java.util.Collection;
import p.fu2;
import p.tu2;
import p.hu2;
import p.p33;
import p.h23;
import p.c23;
import p.b23;
import p.o13;
import java.util.HashMap;
import p.n26;
import p.eo5;

public final class i23 extends iu2	// class@00190d from classes.dex
{
    public fu2 a;
    public su2 b;
    public gu2 c;
    public zt2 d;
    public final zt2 e;
    public zt2 f;
    public p33 g;
    public String h;
    public String i;
    public final ia4 j;
    public final il3 k;

    public void i23(j23 p0){
       super();
       this.a = p0.a;
       this.b = p0.b.a();
       this.c = p0.c.a();
       this.d = p0.d.a();
       this.e = p0.e.a();
       this.f = p0.f.a();
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.j = new ia4(p0.j);
       this.k = new il3(p0.k);
    }
    public final iu2 a(ju2[] p0){
       this.k.a(oi.a(uk.h0(p0)));
       return this;
    }
    public final iu2 b(String p0,Serializable p1){
       this.f = this.f.q(p0, p1);
       return this;
    }
    public final iu2 c(au2 p0){
       co5.o(p0, "custom");
       this.f = this.f.a(p0);
       return this;
    }
    public final iu2 e(String p0,tt2 p1){
       co5.o(p1, "command");
       n13.v.getClass();
       n13 on13 = k13.b(p1);
       i23 tj = this.j;
       ia4 a = tj.a;
       co5.o(a, "map");
       if (!io2.j(on13, a.get(p0))) {
          LinkedHashMap linkedHashMa = q14.t0(tj.a);
          linkedHashMa.put(p0, on13);
          tj.a = linkedHashMa;
       }
       return this;
    }
    public final iu2 f(String p0,Serializable p1){
       this.d = this.d.q(p0, p1);
       return this;
    }
    public final k23 g(){
       c uoc = c.o(this.k.a);
       co5.l(uoc, "copyOf\(list\)");
       k23.c.getClass();
       return h23.a(this.a, this.b.build(), this.c.a(), this.d.d(), this.e.d(), this.f.d(), this.g, this.h, this.i, eb3.q(this.j.a), uoc);
    }
    public final iu2 h(List p0){
       Iterable iterable = (p0 != null && !p0.isEmpty())? oi.a(p0): null;
       this.k.b(iterable);
       return this;
    }
    public final iu2 i(ju2[] p0){
       this.k.b(oi.a(uk.h0(p0)));
       return this;
    }
    public final iu2 j(String p0,String p1){
       co5.o(p1, "category");
       c23.t.getClass();
       this.a = b23.a(p0, p1);
       return this;
    }
    public final iu2 k(fu2 p0){
       co5.o(p0, "componentId");
       this.a = p0;
       return this;
    }
    public final iu2 l(au2 p0){
       zt2 ozt2;
       if (p0 != null) {
          ozt2 = p0.a();
       }else {
          a23.b.getClass();
          ozt2 = o13.a();
       }
       this.f = ozt2;
       return this;
    }
    public final iu2 m(HashMap p0){
       n13.v.getClass();
       i23 tj = this.j;
       tj.getClass();
       tj.a = eo5.x(p0, n13.class, n26.K);
       return this;
    }
    public final iu2 n(String p0){
       this.i = p0;
       return this;
    }
    public final iu2 o(String p0){
       this.h = p0;
       return this;
    }
    public final iu2 q(hu2 p0){
       gu2 ogu2;
       if (p0 != null) {
          ogu2 = p0.a();
       }else {
          g23.c.getClass();
          ogu2 = g23.j().a();
       }
       this.c = ogu2;
       return this;
    }
    public final iu2 r(){
       this.g = null;
       return this;
    }
    public final iu2 t(tu2 p0){
       su2 osu2;
       if (p0 != null) {
          osu2 = p0.a();
       }else {
          o23.c.getClass();
          osu2 = o23.b().a();
       }
       this.b = osu2;
       return this;
    }
}
