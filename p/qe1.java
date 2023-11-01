package p.qe1;
import android.widget.AdapterView;
import android.widget.AbsListView;
import java.lang.Class;
import java.lang.Integer;
import android.view.View;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.reflect.AccessibleObject;
import java.lang.Throwable;

public abstract class qe1	// class@002383 from classes.dex
{
    public static final Method a;
    public static final Method b;
    public static final Method c;
    public static final boolean d;

    static {
       AdapterView uAdapterView = AdapterView.class;
       try{
          Class[] uClassArray = new Class[5];
          Class tYPE = Integer.TYPE;
          uClassArray[0] = tYPE;
          uClassArray[1] = View.class;
          uClassArray[2] = Boolean.TYPE;
          Class tYPE1 = Float.TYPE;
          uClassArray[3] = tYPE1;
          uClassArray[4] = tYPE1;
          Method declaredMeth = AbsListView.class.getDeclaredMethod("positionSelector", uClassArray);
          qe1.a = declaredMeth;
          declaredMeth.setAccessible(1);
          Class[] uClassArray1 = new Class[]{tYPE};
          declaredMeth = uAdapterView.getDeclaredMethod("setSelectedPositionInt", uClassArray1);
          qe1.b = declaredMeth;
          declaredMeth.setAccessible(1);
          uClassArray1 = new Class[]{tYPE};
          Method declaredMeth1 = uAdapterView.getDeclaredMethod("setNextSelectedPositionInt", uClassArray1);
          qe1.c = declaredMeth1;
          declaredMeth1.setAccessible(1);
          qe1.d = true;
       }catch(java.lang.NoSuchMethodException e0){
          e0.printStackTrace();
       }
    }
}
