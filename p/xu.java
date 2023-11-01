package p.xu;
import p.zu;
import p.iw;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import p.t63;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.StringBuilder;

public final class xu	// class@002cf1 from classes.dex
{
    public final zu a;
    public final iw b;
    public final List c;

    public void xu(zu p0,iw p1,List p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static xu a(zu p0,iw p1,ArrayList p2){
       t63 ot63 = new t63(9);
       if (p0 == null) {
          throw new NullPointerException("Null entity");
       }
       ot63.b = p0;
       if (p1 == null) {
          throw new NullPointerException("Null owner");
       }
       ot63.c = p1;
       ot63.t = p2;
       String str = "";
       if (str.isEmpty()) {
          return new xu(ot63.b, ot63.c, ot63.t);
       }
       throw new IllegalStateException("Missing required properties:".concat(str));
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof xu) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || !this.c.equals(p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode());
    }
    public final String toString(){
       return "Playlist{entity="+this.a+", owner="+this.b+", images="+this.c+"}";
    }
}
