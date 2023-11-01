package p.co7;
import p.no7;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.to7;
import p.j33;
import p.tp2;
import java.lang.StringBuilder;
import p.en6;

public final class co7 extends no7	// class@00124b from classes.dex
{
    public final String a;
    public final String b;

    public void co7(String p0,String p1){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final Object a(to7 p0,to7 p1,to7 p2,to7 p3,to7 p4,to7 p5,to7 p6,to7 p7,to7 p8,to7 p9,j33 p10,to7 p11){
       return p7.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof co7) {
          return false;
       }
       if (!p0.a.equals(this.a) || !p0.b.equals(this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + tp2.g(this.a, 0, 31));
    }
    public final String toString(){
       return en6.p("AutoLogin{username=", this.a, ", password=***}");
    }
}
