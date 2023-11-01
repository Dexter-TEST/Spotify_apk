package p.we5;
import p.ve5;
import p.ae3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import p.co5;
import java.lang.ClassLoader;
import java.lang.ClassNotFoundException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.yd3;

public abstract class we5	// class@002b1f from classes.dex
{
    public static final ve5 a;

    static {
       ClassLoader obj;
       ClassLoader classLoader1;
       String str = ", base type classloader: ";
       String str1 = "Instance class was loaded from a different classloader: ";
       try{
          obj = ae3.class.newInstance();
          try{
             co5.l(obj, "forName\(\"kotlin.internal…entations\"\).newInstance\(\)");
          }catch(java.lang.ClassCastException e5){
             obj = obj.getClass().getClassLoader();
             classLoader1 = ve5.class.getClassLoader();
             if (!co5.c(obj, classLoader1)) {
                throw new ClassNotFoundException(str1+obj+str+classLoader1, e5);
             }
             throw e5;
          }
       }catch(java.lang.ClassNotFoundException e0){
          try{
             obj = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
             try{
                co5.l(obj, "forName\(\"kotlin.internal…entations\"\).newInstance\(\)");
             }catch(java.lang.ClassCastException e5){
                obj = obj.getClass().getClassLoader();
                classLoader1 = ve5.class.getClassLoader();
                if (!co5.c(obj, classLoader1)) {
                   throw new ClassNotFoundException(str1+obj+e0+classLoader1, e5);
                }
                throw e5;
             }
          }catch(java.lang.ClassNotFoundException e0){
             try{
                obj = yd3.class.newInstance();
                try{
                   co5.l(obj, "forName\(\"kotlin.internal…entations\"\).newInstance\(\)");
                }catch(java.lang.ClassCastException e5){
                   obj = obj.getClass().getClassLoader();
                   classLoader1 = ve5.class.getClassLoader();
                   if (!co5.c(obj, classLoader1)) {
                      throw new ClassNotFoundException(str1+obj+e0+classLoader1, e5);
                   }
                   throw e5;
                }
             }catch(java.lang.ClassNotFoundException e0){
                try{
                   obj = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                   try{
                      co5.l(obj, "forName\(\"kotlin.internal…entations\"\).newInstance\(\)");
                   }catch(java.lang.ClassCastException e2){
                      obj = obj.getClass().getClassLoader();
                      ClassLoader classLoader = ve5.class.getClassLoader();
                      if (!co5.c(obj, classLoader)) {
                         throw new ClassNotFoundException(str1+obj+e0+classLoader, e2);
                      }
                      throw e2;
                   }
                }catch(java.lang.ClassNotFoundException e0){
                   obj = new ve5();
                }
             }
          }
       }
       we5.a = obj;
    }
}
