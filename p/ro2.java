package p.ro2;
import p.j80;
import java.lang.String;
import p.ir2;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;

public final class ro2	// class@000322 from classes2.dex
{
    public final j80 a;
    public final j80 b;
    public final int c;
    public static final j80 d;
    public static final j80 e;
    public static final j80 f;
    public static final j80 g;
    public static final j80 h;
    public static final j80 i;

    static {
       ro2.d = ir2.t(":");
       ro2.e = ir2.t(":status");
       ro2.f = ir2.t(":method");
       ro2.g = ir2.t(":path");
       ro2.h = ir2.t(":scheme");
       ro2.i = ir2.t(":authority");
    }
    public void ro2(String p0,String p1){
       co5.o(p0, "name");
       co5.o(p1, "value");
       super(ir2.t(p0), ir2.t(p1));
    }
    public void ro2(j80 p0,String p1){
       co5.o(p0, "name");
       co5.o(p1, "value");
       super(p0, ir2.t(p1));
    }
    public void ro2(j80 p0,j80 p1){
       co5.o(p0, "name");
       co5.o(p1, "value");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p1.d() + (p0.d() + 32);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ro2) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return this.a.q()+": "+this.b.q();
    }
}
