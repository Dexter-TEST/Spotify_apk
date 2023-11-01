package p.bg5;
import p.dg5;
import java.lang.String;
import p.f13;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class bg5 extends dg5	// class@0010bd from classes.dex
{
    public final String a;
    public final String b;

    public void bg5(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object a(f13 p0,f13 p1){
       return p1.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof bg5) {
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
       return hr7.a("Context{contextUri="+this.a+", uid=", this.b, '}');
    }
}
