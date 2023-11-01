package p.l43;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.Class;
import java.util.Locale;
import java.lang.reflect.Method;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import android.icu.util.ULocale;
import p.k43;
import java.lang.Object;
import p.j43;

public abstract class l43	// class@001cdf from classes.dex
{
    public static final Method a;

    static {
       if (Build$VERSION.SDK_INT < 24) {
          try{
             Class[] uClassArray = new Class[]{Locale.class};
             l43.a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", uClassArray);
          }catch(java.lang.Exception e0){
             throw new IllegalStateException(e0);
          }
       }
    }
    public static String a(Locale p0){
       if (Build$VERSION.SDK_INT >= 24) {
          return k43.c(k43.a(k43.b(p0)));
       }
       int i = 1;
       try{
          Object[] objArray = new Object[i];
          objArray[0] = p0;
          return j43.a(l43.a.invoke(null, objArray));
       }catch(java.lang.reflect.InvocationTargetException e0){
          return j43.a(p0);
       }catch(java.lang.IllegalAccessException e0){
       }
    }
}
