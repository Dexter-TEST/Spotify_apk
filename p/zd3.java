package p.zd3;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Number;

public abstract class zd3	// class@002ed4 from classes.dex
{
    public static final Integer a;

    static {
       Object obj = null;
       Object obj1 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(obj);
       if (obj1 instanceof Integer) {
       }else {
          obj1 = obj;
       }
       if (obj1 != null) {
          int i = (obj1.intValue() > 0)? 1: 0;
          if (i) {
             obj = obj1;
          }
       }
       zd3.a = obj;
    }
}
