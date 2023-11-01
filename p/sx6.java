package p.sx6;
import p.vx6;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class sx6 extends vx6	// class@0026bc from classes.dex
{
    public final Throwable a;

    public void sx6(Throwable p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof sx6) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "Error{cause="+this.a+'}';
    }
}
