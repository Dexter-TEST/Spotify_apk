package p.x6;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import android.os.IBinder;
import java.lang.Boolean;
import java.lang.reflect.Method;
import android.content.res.Configuration;
import java.util.List;
import android.os.Build$VERSION;
import java.lang.Integer;

public abstract class x6	// class@002c1d from classes.dex
{
    public static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g;

    static {
       Method method1;
       Class[] uClassArray1;
       Activity uActivity = Activity.class;
       x6.g = new Handler(Looper.getMainLooper());
       Method method = null;
       Class uClass = Class.forName("android.app.ActivityThread");
       x6.a = uClass;
       Field declaredFiel = uActivity.getDeclaredField("mMainThread");
       declaredFiel.setAccessible(true);
       x6.b = declaredFiel;
       Field declaredFiel1 = uActivity.getDeclaredField("mToken");
       declaredFiel1.setAccessible(true);
       x6.c = declaredFiel1;
       Class a = x6.a;
       int i = 0;
       int i1 = 3;
       String str = "performStopActivity";
       if (a == null) {
          method1 = method;
       }else {
          uClassArray1 = new Class[i1];
          uClassArray1[i] = IBinder.class;
          uClassArray1[1] = Boolean.TYPE;
          uClassArray1[2] = String.class;
          method1 = a.getDeclaredMethod(str, uClassArray1);
          method1.setAccessible(true);
       }
       x6.d = method1;
       if ((a = x6.a) == null) {
          method1 = method;
       }else {
          uClassArray1 = new Class[]{IBinder.class,Boolean.TYPE};
          method1 = a.getDeclaredMethod(str, uClassArray1);
          method1.setAccessible(true);
       }
       x6.e = method1;
       a = x6.a;
       int sDK_INT = ((sDK_INT = Build$VERSION.SDK_INT) != 26 && sDK_INT != 27)? 0: 1;
       if (sDK_INT && a != null) {
          Class[] uClassArray = new Class[9];
          uClassArray[i] = IBinder.class;
          uClassArray[1] = List.class;
          uClassArray[2] = List.class;
          uClassArray[i1] = Integer.TYPE;
          Class tYPE = Boolean.TYPE;
          uClassArray[4] = tYPE;
          uClassArray[5] = Configuration.class;
          uClassArray[6] = Configuration.class;
          uClassArray[7] = tYPE;
          uClassArray[8] = tYPE;
          method1 = a.getDeclaredMethod("requestRelaunchActivity", uClassArray);
          method1.setAccessible(true);
          method = method1;
       }
       x6.f = method;
    }
}
