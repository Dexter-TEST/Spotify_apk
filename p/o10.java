package p.o10;
import p.p10;
import java.util.Calendar;
import java.lang.Class;
import java.lang.Object;
import p.s10;
import java.lang.String;
import java.lang.StringBuilder;

public final class o10 extends p10	// class@00208a from classes.dex
{
    public final Calendar a;
    public final Calendar b;

    public void o10(Calendar p0,Calendar p1){
       super();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final Object a(s10 p0,s10 p1,s10 p2){
       return p2.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof o10) {
          return false;
       }
       if (!p0.a.equals(this.a) || !p0.b.equals(this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + ((this.a.hashCode() + 0) * 31));
    }
    public final String toString(){
       return "DateOfBirthEntered{date="+this.a+", now="+this.b+'}';
    }
}
