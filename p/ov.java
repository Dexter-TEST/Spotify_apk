package p.ov;
import p.si4;
import p.pr;
import java.lang.NullPointerException;
import java.lang.String;
import p.r45;
import java.lang.Object;
import java.lang.StringBuilder;

public final class ov	// class@00219e from classes.dex
{
    public final r45 a;
    public final pr b;
    public static final int c;

    static {
       pr e;
       si4 osi4 = new si4(12);
       if ((e = pr.e) == null) {
          throw new NullPointerException("Null commandOptions");
       }
       osi4.b = e;
       osi4.b();
    }
    public void ov(r45 p0,pr p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ov) {
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
       return "SkipToPrevTrackOptions{allowSeeking="+this.a+", commandOptions="+this.b+"}";
    }
}
