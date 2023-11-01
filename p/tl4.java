package p.tl4;
import p.lv1;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class tl4 extends lv1	// class@002794 from classes.dex
{
    public final String P;

    public void tl4(String p0){
       super();
       p0.getClass();
       this.P = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof tl4) {
          return false;
       }
       return p0.P.equals(this.P);
    }
    public final int hashCode(){
       return (this.P.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("OpenSleepTimer{uri=", this.P, '}');
    }
}
