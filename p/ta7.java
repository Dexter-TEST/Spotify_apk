package p.ta7;
import p.sa7;
import java.lang.Object;
import android.graphics.Typeface;
import java.lang.Class;
import java.lang.reflect.Array;
import java.lang.Integer;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.String;
import java.lang.reflect.AccessibleObject;

public final class ta7 extends sa7	// class@002734 from classes.dex
{

    public void ta7(){
       super();
    }
    public final Typeface R(Object p0){
       try{
          Object obj = Array.newInstance(this.y, 1);
          Array.set(obj, 0, p0);
          Object[] objArray = new Object[]{obj,"sans-serif",Integer.valueOf(-1),Integer.valueOf(-1)};
          return this.E.invoke(null, objArray);
       }catch(java.lang.IllegalAccessException e5){
       }catch(java.lang.reflect.InvocationTargetException e5){
       }
       throw new RuntimeException(e5);
    }
    public final Method V(Class p0){
       Class[] uClassArray = new Class[4];
       uClassArray[0] = Array.newInstance(p0, 1).getClass();
       uClassArray[1] = String.class;
       p0 = Integer.TYPE;
       uClassArray[2] = p0;
       uClassArray[3] = p0;
       Method declaredMeth = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", uClassArray);
       declaredMeth.setAccessible(1);
       return declaredMeth;
    }
}
