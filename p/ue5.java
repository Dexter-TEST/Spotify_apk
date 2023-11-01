package p.ue5;
import java.lang.Throwable;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import p.co5;

public abstract class ue5	// class@002896 from classes.dex
{
    public static final Method a;

    static {
       object oobject;
       int i2;
       Throwable throwable = Throwable.class;
       Method[] methods = throwable.getMethods();
       co5.l(methods, "throwableMethods");
       int len = methods.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          oobject = null;
          if (i1 < len) {
             object oobject1 = methods[i1];
             if (co5.c(oobject1.getName(), "addSuppressed")) {
                Class[] parameterTyp = oobject1.getParameterTypes();
                co5.l(parameterTyp, "it.parameterTypes");
                i2 = 1;
                if (parameterTyp.length == i2) {
                   oobject = parameterTyp[i];
                }
                if (co5.c(oobject, throwable)) {
                label_0036 :
                   if (i2) {
                      oobject = oobject1;
                      break ;
                   }else {
                      i1 = i1 + 1;
                   }
                }
             }
             i2 = 0;
             goto label_0036 ;
          }else {
             break ;
          }
       }
       ue5.a = oobject;
       int len1 = methods.length;
       while (i < len1 && !co5.c(methods[i].getName(), "getSuppressed")) {
          i = i + 1;
       }
    }
}
