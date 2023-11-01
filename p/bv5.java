package p.bv5;
import p.ps2;
import java.lang.String;
import p.mp2;
import p.fv5;
import java.util.Map;
import java.lang.Object;
import p.co5;
import p.c90;
import p.fv1;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Iterable;
import p.t65;
import p.ye7;

public final class bv5	// class@001143 from classes.dex
{
    public final ps2 a;
    public final String b;
    public final mp2 c;
    public final fv5 d;
    public final Map e;
    public c90 f;

    public void bv5(ps2 p0,String p1,mp2 p2,fv5 p3,Map p4){
       co5.o(p1, "method");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final c90 a(){
       bv5 tf;
       if ((tf = this.f) == null) {
          tf = fv1.z(this.c);
          this.f = tf;
       }
       return tf;
    }
    public final String toString(){
       String str = "Request{method="+this.b+", url="+this.a;
       bv5 tc = this.c;
       if ((tc.a.length / 2)) {
          str = str+", headers=[";
          Iterator iterator = tc.iterator();
          int i = 0;
          while (true) {
             if (iterator.hasNext()) {
                t65 obj = iterator.next();
                int i1 = i + 1;
                if (i >= 0) {
                   t65 a = obj.a;
                   obj = obj.b;
                   if (i > 0) {
                      str = str.append(", ");
                   }
                   str = str.append(a).append(':').append(obj);
                   i = i1;
                }else {
                   ye7.W();
                   throw null;
                }
             }else {
                str = str+']';
             }
          }
       }
       tc = this.e;
       if ((tc.isEmpty() ^ 0x01)) {
          str = str+", tags="+tc;
       }
       str = str+'}';
       co5.l(str, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       return str;
    }
}
