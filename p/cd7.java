package p.cd7;
import java.security.PrivilegedExceptionAction;
import java.lang.Object;
import sun.misc.Unsafe;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.reflect.AccessibleObject;

public final class cd7 implements PrivilegedExceptionAction	// class@0011e9 from classes.dex
{

    public void cd7(){
       super();
    }
    public static Unsafe a(){
       Object obj;
       Unsafe unsafe = Unsafe.class;
       Field[] declaredFiel = unsafe.getDeclaredFields();
       int len = declaredFiel.length;
       int i = 0;
       while (true) {
          obj = null;
          if (i >= len) {
             return obj;
          }
          object oobject = declaredFiel[i];
          oobject.setAccessible(true);
          obj = oobject.get(obj);
          if (unsafe.isInstance(obj)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return unsafe.cast(obj);
    }
    public final Object run(){
       return cd7.a();
    }
}
