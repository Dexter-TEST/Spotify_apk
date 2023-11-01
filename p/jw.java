package p.jw;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class jw	// class@001b5e from classes.dex
{
    public final String a;
    public final String b;

    public void jw(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof jw) {
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
       return en6.p("UserCredentials{username="+this.a+", storedCredential=", this.b, "}");
    }
}
