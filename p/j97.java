package p.j97;
import p.o97;
import p.u65;
import java.lang.Class;
import java.lang.Object;
import p.r97;
import p.xc5;
import p.s97;
import java.lang.String;
import java.lang.StringBuilder;

public final class j97 extends o97	// class@001a93 from classes.dex
{
    public final u65 a;

    public void j97(u65 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(r97 p0,xc5 p1,r97 p2,r97 p3,xc5 p4,s97 p5){
       return p4.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof j97) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "MessageFetchSuccess{messageTriggerPair="+this.a+'}';
    }
}
