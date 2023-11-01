package p.zh7;
import android.os.Build$VERSION;
import android.view.ViewConfiguration;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import android.content.Context;
import java.lang.Object;
import java.lang.Integer;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public abstract class zh7	// class@002efc from classes.dex
{
    public static final Method a;

    static {
       try{
          if (Build$VERSION.SDK_INT == 25) {
             Class[] uClassArray = new Class[0];
             zh7.a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", uClassArray);
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static float a(ViewConfiguration p0,Context p1){
       Method a;
       if (Build$VERSION.SDK_INT >= 25 && (a = zh7.a) != null) {
          int i = 0;
          try{
             Object[] objArray = new Object[i];
             return (float)a.invoke(p0, objArray).intValue();
          }catch(java.lang.Exception e0){
          }
       label_001a :
          TypedValue typedValue = new TypedValue();
          if (p1.getTheme().resolveAttribute(0x101004d, typedValue, true)) {
             return typedValue.getDimension(p1.getResources().getDisplayMetrics());
          }
          return 0;
       }else {
          goto label_001a ;
       }
    }
}
