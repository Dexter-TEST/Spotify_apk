package p.yx1;
import java.lang.Object;
import java.util.Map;
import java.util.Collections;
import p.xx1;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;

public final class yx1	// class@002e44 from classes.dex
{
    public static yx1 a;
    public static final yx1 b;

    static {
       yx1.b = new yx1();
    }
    public void yx1(){
       super();
       Collections.emptyMap();
    }
    public static yx1 a(){
       yx1 a;
       if ((a = yx1.a) == null) {
          _monitor_enter(yx1.class);
          if ((a = yx1.a) == null) {
             String str = "getEmptyRegistry";
             Class a1 = xx1.a;
             yx1 oyx1 = null;
             if (a1 != null) {
                int i = 0;
                try{
                   Class[] uClassArray = new Class[i];
                   Object[] objArray = new Object[i];
                   oyx1 = a1.getDeclaredMethod(str, uClassArray).invoke(oyx1, objArray);
                }catch(java.lang.Exception e0){
                }
             }
             if (oyx1 == null) {
                oyx1 = yx1.b;
             }
             yx1.a = oyx1;
             a = oyx1;
          }
          _monitor_exit(yx1.class);
       }
       return a;
    }
}
