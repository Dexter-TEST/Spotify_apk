package p.vu6;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuffer;

public final class vu6	// class@000391 from classes2.dex
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public static final vu6 f;

    static {
       vu6 ovu6 = new vu6();
       ovu6.a = true;
       ovu6.b = false;
       ovu6.c = false;
       ovu6.d = true;
       vu6 ovu61 = new vu6();
       vu6.f = ovu61;
       ovu61.a = true;
       ovu61.b = true;
       ovu61.c = false;
       ovu61.d = false;
       ovu6.e = 1;
       ovu6 = new vu6();
       ovu6.a = false;
       ovu6.b = true;
       ovu6.c = true;
       ovu6.d = false;
       ovu6.e = 2;
    }
    public void vu6(){
       super();
       this.a = true;
       this.b = true;
       this.c = false;
       this.d = false;
    }
    public static String a(Class p0,String p1,boolean p2){
       int i;
       if (p0 == null) {
          return "ANONYMOUS";
       }
       if (p0.isArray()) {
          p0 = p0.getComponentType();
          return vu6.a(p0, p0.getName(), p2)+"[]";
       }else {
          char c = '$';
          if (!p2) {
             return p1.replace(c, 46);
          }
          if ((i = p1.lastIndexOf(46)) != -1) {
             i++;
             p1 = p1.substring(i);
          }
          return p1.replace(c, 46);
       }
    }
}
