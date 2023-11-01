package p.ut3;
import p.du3;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.nu3;
import p.xc5;
import java.lang.StringBuilder;
import p.hr7;

public final class ut3 extends du3	// class@002918 from classes.dex
{
    public final String a;

    public void ut3(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(nu3 p0,nu3 p1,nu3 p2,nu3 p3,nu3 p4,nu3 p5,nu3 p6,nu3 p7,nu3 p8,xc5 p9,xc5 p10){
       return p8.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ut3) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("HintReceived{username=", this.a, '}');
    }
}
