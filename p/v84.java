package p.v84;
import p.ub3;
import java.lang.Object;
import java.lang.String;
import p.tp6;
import java.util.Map;

public final class v84 implements ub3	// class@0029a1 from classes.dex
{

    public void v84(int p0){
       super();
    }
    public void v84(int p0,int p1){
       p1 = 2;
       if (p0 != p1) {
          p1 = 3;
          if (p0 != p1) {
             p1 = 4;
             if (p0 != p1) {
                if (p0 != 5) {
                   switch (p0){
                       case 20:
                         super(20);
                         return;
                       case 21:
                         super(21);
                         return;
                       case 22:
                         super(22);
                         return;
                       case 23:
                         super(23);
                         return;
                       case 24:
                         super(24);
                         return;
                       case 25:
                         super(25);
                         return;
                       case 26:
                         super(26);
                         return;
                       case 27:
                         super(27);
                         return;
                       case 28:
                         super(28);
                         return;
                       case 29:
                         super(29);
                         return;
                       default:
                         super(1);
                         return;
                   }
                }else {
                   super(5);
                   return;
                }
             }else {
                super(p1);
                return;
             }
          }else {
             super(p1);
             return;
          }
       }else {
          super(p1);
          return;
       }
    }
    public static tp6 a(String p0){
       tp6 otp6;
       Map f = tp6.f;
       if ((otp6 = f.get(p0)) == null) {
          otp6 = new tp6(p0);
          f.put(p0, otp6);
       }
       return otp6;
    }
}
