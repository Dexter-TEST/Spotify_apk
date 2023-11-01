package p.q84;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class q84 extends Enum implements tb3	// class@002350 from classes.dex
{
    public final int a;
    public static final q84 b;
    public static final q84 c;
    public static final q84 t;
    public static final q84 v;
    public static final q84 w;
    public static final q84[] x;

    static {
       q84 oq84 = new q84("AD", 0, 0);
       q84.b = oq84;
       q84 oq841 = new q84("SUBSCRIPTION", 1, 1);
       q84.c = oq841;
       q84 oq842 = new q84("CATALOGUE_ALL", 2, 2);
       q84.t = oq842;
       q84 oq843 = new q84("SHUFFLE", 3, 3);
       q84.v = oq843;
       q84 oq844 = new q84("COMMERCIAL", 4, 4);
       q84.w = oq844;
       q84[] oq84Array = new q84[]{oq84,oq841,oq842,oq843,oq844};
       q84.x = oq84Array;
    }
    public void q84(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static q84 a(int p0){
       if (!p0) {
          return q84.b;
       }
       if (p0 == 1) {
          return q84.c;
       }
       if (p0 == 2) {
          return q84.t;
       }
       if (p0 == 3) {
          return q84.v;
       }
       if (p0 != 4) {
          return null;
       }
       return q84.w;
    }
    public static q84 valueOf(String p0){
       return Enum.valueOf(q84.class, p0);
    }
    public static q84[] values(){
       return q84.x.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}
