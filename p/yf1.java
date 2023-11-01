package p.yf1;
import java.lang.ThreadLocal;
import p.cf7;
import android.content.Context;
import java.lang.ClassLoader;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import p.ye7;
import android.util.Log;
import java.lang.Throwable;

public abstract class yf1	// class@002da6 from classes.dex
{

    static {
       ThreadLocal threadLocal = new ThreadLocal();
       cf7 threadLocal1 = new cf7(5);
    }
    public static int a(Context p0){
       String str2;
       StringBuilder str = "\' didn\'t match expected id \'com.google.android.gms.auth.api.fallback\'";
       String str1 = "com.google.android.gms.dynamite.descriptors.com.google.android.gms.auth.api.fallback.ModuleDescriptor";
       int i = 0;
       try{
          Class uClass = p0.getApplicationContext().getClassLoader().loadClass(new StringBuilder(("com.google.android.gms.auth.api.fallback".length() + 61))+str1);
          Field declaredFiel = uClass.getDeclaredField("MODULE_ID");
          Field declaredFiel1 = uClass.getDeclaredField("MODULE_VERSION");
          Object obj = null;
          if (ye7.x(declaredFiel.get(obj), "com.google.android.gms.auth.api.fallback")) {
             return declaredFiel1.getInt(obj);
          }
          str2 = String.valueOf(declaredFiel.get(obj));
          Log.e("DynamiteModule", new StringBuilder(((str2.length() + 51) + "com.google.android.gms.auth.api.fallback".length()))+"Module descriptor id \'"+str2+str);
          return i;
       }catch(java.lang.ClassNotFoundException e0){
          str = new StringBuilder(("com.google.android.gms.auth.api.fallback".length() + 45));
       }catch(java.lang.Exception e7){
          str2 = String.valueOf(e7.getMessage());
          str2 = (str2.length())? "Failed to load module descriptor class: ".concat(str2): "Failed to load module descriptor class: ";
          Log.e("DynamiteModule", str2);
       }
       return i;
    }
}
