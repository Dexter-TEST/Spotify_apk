package p.l13;
import p.st2;
import p.m13;
import p.zt2;
import p.a23;
import java.lang.String;
import java.io.Serializable;
import p.n13;
import java.lang.Class;
import java.lang.Object;
import p.au2;
import p.k13;
import p.o13;

public final class l13 extends st2	// class@001cc3 from classes.dex
{
    public String a;
    public zt2 b;

    public void l13(m13 p0){
       super();
       this.a = p0.a;
       this.b = p0.b.a();
    }
    public final st2 a(String p0,Serializable p1){
       this.b = this.b.q(p0, p1);
       return this;
    }
    public final n13 b(){
       n13.v.getClass();
       return k13.a(this.a, this.b.d());
    }
    public final st2 c(au2 p0){
       zt2 ozt2;
       if (p0 == null || (ozt2 = p0.a()) == null) {
          a23.b.getClass();
          ozt2 = o13.a();
       }
       this.b = ozt2;
       return this;
    }
    public final st2 d(String p0){
       this.a = p0;
       return this;
    }
}
