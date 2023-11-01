package p.bl7;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.reflect.AccessibleObject;
import p.wh7;
import p.eh7;

public abstract class bl7	// class@0010ec from classes.dex
{
    public static final Method a;
    public static final boolean b;

    static {
       Rect rect = Rect.class;
       boolean b = (Build$VERSION.SDK_INT >= 27)? true: false;
       bl7.b = b;
       try{
          Class[] uClassArray = new Class[]{rect,rect};
          Method declaredMeth = View.class.getDeclaredMethod("computeFitSystemWindows", uClassArray);
          bl7.a = declaredMeth;
          if (!declaredMeth.isAccessible()) {
             declaredMeth.setAccessible(1);
          }
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public static boolean a(View p0){
       boolean b = true;
       if (eh7.d(p0) == b) {
       }else {
          b = false;
       }
       return b;
    }
}
