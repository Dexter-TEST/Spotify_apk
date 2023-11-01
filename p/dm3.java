package p.dm3;
import p.em3;
import p.h51;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public final class dm3 extends em3	// class@001374 from classes.dex
{
    public final h51 a;

    public void dm3(h51 p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 != null && dm3.class == p0.getClass()) {
          return this.a.equals(p0.a);
       }
       return false;
    }
    public final int hashCode(){
       return (this.a.hashCode() + (dm3.class.getName().hashCode() * 31));
    }
    public final String toString(){
       return "Success {mOutputData="+this.a+'}';
    }
}
