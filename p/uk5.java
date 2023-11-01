package p.uk5;
import java.lang.String;
import p.es3;
import java.lang.Object;
import p.co5;
import android.content.Context;
import p.bo0;
import android.os.Build$VERSION;
import p.ue;
import p.uw5;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.AccessibleObject;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.content.pm.ApplicationInfo;

public abstract class uk5	// class@0028ca from classes.dex
{

    static {
       co5.l(es3.d("ProcessUtils"), "tagWithPrefix\(\"ProcessUtils\"\)");
    }
    public static final boolean a(Context p0,bo0 p1){
       String str;
       Object obj1;
       co5.o(p0, "context");
       co5.o(p1, "configuration");
       if (Build$VERSION.SDK_INT >= 28) {
          str = ue.a.a();
       }else {
          boolean b = false;
          Class[] uClassArray = new Class[b];
          Method declaredMeth = Class.forName("android.app.ActivityThread", b, uw5.class.getClassLoader()).getDeclaredMethod("currentProcessName", uClassArray);
          declaredMeth.setAccessible(true);
          Object[] objArray = new Object[b];
          Object obj = declaredMeth.invoke(null, objArray);
          co5.i(obj);
          if (obj instanceof String) {
             str = obj;
          }else {
             int i = Process.myPid();
             List systemServic = p0.getSystemService("activity");
             co5.j(systemServic, "null cannot be cast to non-null type android.app.ActivityManager");
             if ((systemServic = systemServic.getRunningAppProcesses()) != null) {
                Iterator iterator = systemServic.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj1 = iterator.next();
                      int i1 = (obj1.pid == i)? 1: 0;
                      if (!i1) {
                         continue ;
                      }
                   }else {
                      obj1 = null;
                   }
                   if (obj1 != null) {
                      str = obj1.processName;
                      break ;
                   }
                }
             }
             str = null;
          }
       }
       return co5.c(str, p0.getApplicationInfo().processName);
    }
}
