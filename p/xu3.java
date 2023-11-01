package p.xu3;
import p.av3;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class xu3 extends av3	// class@002cec from classes.dex
{
    public final Throwable a;

    public void xu3(Throwable p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof xu3) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "Error{error="+this.a+'}';
    }
}
