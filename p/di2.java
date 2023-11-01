package p.di2;
import p.ei2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public final class di2	// class@001350 from classes.dex
{
    public final ei2 a;

    public void di2(ei2 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof di2) {
          return false;
       }
       if (p0.a != this.a) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "GenderEntered{gender="+this.a+'}';
    }
}
