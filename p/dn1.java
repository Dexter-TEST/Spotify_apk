package p.dn1;
import p.jn1;
import p.aq6;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class dn1 extends jn1	// class@00137b from classes.dex
{
    public final aq6 a;

    public void dn1(aq6 p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof dn1) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "Download{spotifyUri="+this.a+'}';
    }
}
