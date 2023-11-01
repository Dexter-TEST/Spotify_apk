package p.vu;
import p.j8;
import com.google.common.collect.c;
import p.ys5;
import java.lang.NullPointerException;
import java.lang.String;
import p.r45;
import java.lang.Object;
import java.lang.StringBuilder;

public final class vu	// class@002a6d from classes.dex
{
    public final String a;
    public final r45 b;
    public final c c;
    public final c d;
    public static final int e;

    static {
       ys5 v;
       j8 oj8 = new j8(12);
       oj8.b = "";
       if ((v = ys5.v) == null) {
          throw new NullPointerException("Null nextTracks");
       }
       oj8.t = v;
       oj8.v = v;
       oj8.g();
    }
    public void vu(String p0,r45 p1,c p2,c p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof vu) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || !this.d.equals(p0.d)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode());
    }
    public final String toString(){
       return "PlayerQueue{revision="+this.a+", track="+this.b+", nextTracks="+this.c+", prevTracks="+this.d+"}";
    }
}
