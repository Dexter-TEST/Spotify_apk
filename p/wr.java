package p.wr;
import p.vr;
import java.lang.String;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import p.en6;

public final class wr	// class@002b94 from classes.dex
{
    public final jz0 a;
    public final String b;

    public void wr(vr p0,String p1){
       super();
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null sessionId");
       }
       this.b = p1;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof wr) {
          return false;
       }
       if (!this.a.equals(p0.a) || !this.b.equals(p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode());
    }
    public final String toString(){
       return en6.p("CrashlyticsReportWithSessionId{report="+this.a+", sessionId=", this.b, "}");
    }
}
