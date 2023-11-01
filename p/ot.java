package p.ot;
import java.lang.String;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import p.en6;

public final class ot	// class@00218c from classes.dex
{
    public final String a;

    public void ot(String p0){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null referrer");
       }
       this.a = p0;
       return;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof ot) {
          return this.a.equals(p0.a);
       }
       return false;
    }
    public final int hashCode(){
       return (this.a.hashCode() ^ 0xf4243);
    }
    public final String toString(){
       return en6.p("InstallReferrerData{referrer=", this.a, "}");
    }
}
