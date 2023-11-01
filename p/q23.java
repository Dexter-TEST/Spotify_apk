package p.q23;
import p.i13;
import p.r23;
import p.zt2;
import p.a23;
import java.lang.Integer;
import java.lang.String;
import java.io.Serializable;
import p.au2;
import java.lang.Object;
import p.co5;
import p.s23;
import java.lang.Class;
import p.p23;
import p.o13;

public final class q23 extends i13	// class@00231a from classes.dex
{
    public String a;
    public String b;
    public zt2 c;

    public void q23(r23 p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c.a();
    }
    public final i13 a(Integer p0){
       this.c = this.c.q("imageRes", p0);
       return this;
    }
    public final i13 b(au2 p0){
       co5.o(p0, "custom");
       this.c = this.c.a(p0);
       return this;
    }
    public final s23 c(){
       s23.c.getClass();
       return p23.a(this.a, this.b, this.c.d());
    }
    public final i13 d(au2 p0){
       zt2 ozt2;
       if (p0 != null) {
          ozt2 = p0.a();
       }else {
          a23.b.getClass();
          ozt2 = o13.a();
       }
       this.c = ozt2;
       return this;
    }
    public final i13 f(String p0){
       this.b = p0;
       return this;
    }
    public final i13 g(String p0){
       this.a = p0;
       return this;
    }
}
