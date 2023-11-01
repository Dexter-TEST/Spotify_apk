package p.lh1;
import p.do5;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class lh1 extends do5	// class@001d51 from classes.dex
{
    public final String F;

    public void lh1(String p0){
       super();
       p0.getClass();
       this.F = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof lh1) {
          return false;
       }
       return p0.F.equals(this.F);
    }
    public final int hashCode(){
       return (this.F.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("Queue{episodeUri=", this.F, '}');
    }
}
