package p.uo;
import p.re;
import p.li5;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Class;
import p.ye7;
import java.util.Arrays;

public class uo implements re	// class@0028f1 from classes.dex
{
    public final boolean a;
    public final String b;
    public static final uo c;

    static {
       uo.c = new uo(new li5(4));
    }
    public void uo(li5 p0){
       super();
       this.a = p0.b.booleanValue();
       this.b = p0.c;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof uo) {
          return false;
       }
       p0.getClass();
       if (ye7.x(null, null) && (this.a == p0.a && ye7.x(this.b, p0.b))) {
          return true;
       }
       return false;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{null,Boolean.valueOf(this.a),this.b};
       return Arrays.hashCode(objArray);
    }
}
