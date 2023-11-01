package p.ep0;
import java.lang.RuntimeException;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;

public class ep0 extends RuntimeException	// class@0014cd from classes.dex
{
    public final Object a;

    public void ep0(Object p0,Throwable p1){
       p0.getClass();
       super(p0.toString(), p1);
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ep0) {
          return false;
       }
       return this.a.equals(p0.a);
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
}
