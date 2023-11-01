package p.ps;
import p.ez0;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class ps extends ez0	// class@0022c5 from classes.dex
{
    public final String a;

    public void ps(String p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof ez0) {
          return this.a.equals(p0.a);
       }
       return false;
    }
    public final int hashCode(){
       return (this.a.hashCode() ^ 0xf4243);
    }
    public final String toString(){
       return en6.p("Log{content=", this.a, "}");
    }
}
