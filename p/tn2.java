package p.tn2;
import p.sn2;
import android.os.Looper;
import android.os.Handler;
import java.lang.Throwable;
import p.tx5;
import p.eb3;
import android.os.Build$VERSION;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.NullPointerException;
import android.os.Handler$Callback;
import java.lang.Boolean;
import java.lang.reflect.Constructor;

public abstract class tn2	// class@0027a4 from classes.dex
{
    private static Choreographer choreographer;

    static {
       sn2 osn2 = new sn2(tn2.a(Looper.getMainLooper()));
       if (osn2 instanceof tx5) {
          osn2 = 0;
       }
    }
    public static final Handler a(Looper p0){
       Looper looper = Looper.class;
       if (Build$VERSION.SDK_INT >= 28) {
          Class[] uClassArray = new Class[]{looper};
          Object[] objArray = new Object[]{p0};
          if ((p0 = Handler.class.getDeclaredMethod("createAsync", uClassArray).invoke(null, objArray)) != null) {
             return p0;
          }
          throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
       }else {
          int i = 3;
          try{
             Class[] uClassArray1 = new Class[i];
             uClassArray1[0] = looper;
             uClassArray1[1] = Handler$Callback.class;
             uClassArray1[2] = Boolean.TYPE;
             Object[] objArray1 = new Object[i];
             objArray1[0] = p0;
             objArray1[1] = null;
             objArray1[2] = Boolean.TRUE;
             return Handler.class.getDeclaredConstructor(uClassArray1).newInstance(objArray1);
          }catch(java.lang.NoSuchMethodException e0){
             return new Handler(p0);
          }
       }
    }
}
