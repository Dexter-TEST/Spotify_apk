package p.s37;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Integer;
import java.io.IOException;
import java.lang.RuntimeException;
import java.lang.Error;

public abstract class s37	// class@0025b2 from classes.dex
{
    public static final Object a;

    static {
       Method method;
       boolean b = false;
       ClassLoader uClassLoader = null;
       try{
          Class[] uClassArray = new Class[b];
          Object[] objArray = new Object[b];
          Object obj = Class.forName("sun.misc.SharedSecrets", b, uClassLoader).getMethod("getJavaLangAccess", uClassArray).invoke(uClassLoader, objArray);
          s37.a = obj;
          String str = "sun.misc.JavaLangAccess";
          int i = 1;
          if (obj != null) {
             Class[] uClassArray2 = new Class[2];
             uClassArray2[b] = Throwable.class;
             uClassArray2[i] = Integer.TYPE;
             String str1 = "getStackTraceElement";
             try{
                Class.forName(str, b, uClassLoader).getMethod(str1, uClassArray2);
             }catch(java.lang.ThreadDeath e0){
                throw e0;
             }
          }
          try{
             if (obj != null) {
                try{
                   Class[] uClassArray1 = new Class[i];
                   uClassArray1[b] = Throwable.class;
                   try{
                      if ((method = Class.forName(str, b, uClassLoader).getMethod("getStackTraceDepth", uClassArray1)) != null) {
                         objArray = new Object[i];
                         objArray[b] = new Throwable();
                         method.invoke(obj, objArray);
                      }
                   }catch(java.lang.ThreadDeath e0){
                      throw e0;
                   }
                }catch(java.lang.UnsupportedOperationException e0){
                }catch(java.lang.IllegalAccessException e0){
                }catch(java.lang.reflect.InvocationTargetException e0){
                }
             }
          }catch( e0){
          }catch(java.lang.IllegalAccessException e0){
          }
       }catch(java.lang.ThreadDeath e0){
          throw e0;
       }
    }
    public static void a(Throwable p0){
       IOException iOException = IOException.class;
       if (iOException.isInstance(p0)) {
          throw iOException.cast(p0);
       }
       if (p0 instanceof RuntimeException) {
          throw p0;
       }
       if (!p0 instanceof Error) {
          return;
       }
       throw p0;
    }
}
