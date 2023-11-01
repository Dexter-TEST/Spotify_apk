package p.eo7;
import p.no7;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import p.to7;
import p.j33;
import p.tp2;
import java.lang.StringBuilder;

public final class eo7 extends no7	// class@0014cb from classes.dex
{
    public final String a;
    public final String b;
    public final Throwable c;

    public void eo7(String p0,String p1,Throwable p2){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
       p2.getClass();
       this.c = p2;
    }
    public final Object a(to7 p0,to7 p1,to7 p2,to7 p3,to7 p4,to7 p5,to7 p6,to7 p7,to7 p8,to7 p9,j33 p10,to7 p11){
       return p10.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof eo7) {
          return false;
       }
       if (!p0.a.equals(this.a) || (!p0.b.equals(this.b) || !p0.c.equals(this.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.c.hashCode() + tp2.g(this.b, tp2.g(this.a, 0, 31), 31));
    }
    public final String toString(){
       return "AutoLoginFailed{username="+this.a+", password=***, cause="+this.c+'}';
    }
}
