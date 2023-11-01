package p.mg6;
import p.zg6;
import p.p10;
import java.lang.Class;
import java.lang.Object;
import p.kh6;
import p.lh6;
import java.lang.String;
import java.lang.StringBuilder;

public final class mg6 extends zg6	// class@001e90 from classes.dex
{
    public final p10 a;

    public void mg6(p10 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(kh6 p0,kh6 p1,kh6 p2,kh6 p3,lh6 p4,lh6 p5,lh6 p6,lh6 p7,lh6 p8,lh6 p9,lh6 p10,lh6 p11,lh6 p12,lh6 p13){
       return p0.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof mg6) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "BirthdayEvent{event="+this.a+'}';
    }
}
