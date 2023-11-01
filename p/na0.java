package p.na0;
import p.sa0;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class na0 extends sa0	// class@001f98 from classes.dex
{
    public final String a;

    public void na0(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof na0) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("HintReceived{phoneNumber=", this.a, '}');
    }
}
