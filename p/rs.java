package p.rs;
import p.hz0;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class rs extends hz0	// class@002550 from classes.dex
{
    public final String a;

    public void rs(String p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof hz0) {
          return this.a.equals(p0.a);
       }
       return false;
    }
    public final int hashCode(){
       return (this.a.hashCode() ^ 0xf4243);
    }
    public final String toString(){
       return en6.p("User{identifier=", this.a, "}");
    }
}
