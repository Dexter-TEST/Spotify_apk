package p.xl1;
import java.lang.String;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import p.en6;

public final class xl1	// class@002c9b from classes.dex
{
    public final String a;

    public void xl1(String p0){
       super();
       if (p0 == null) {
          throw new NullPointerException("name is null");
       }
       this.a = p0;
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof xl1) {
          return false;
       }
       return this.a.equals(p0.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() ^ 0xf4243);
    }
    public final String toString(){
       return en6.p("Encoding{name=\"", this.a, "\"}");
    }
}
