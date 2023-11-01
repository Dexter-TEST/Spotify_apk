package p.oc;
import p.ax0;
import p.j0;
import p.i70;
import p.ww0;
import p.xw0;
import java.lang.Throwable;
import android.os.Build$VERSION;
import java.lang.reflect.Method;
import java.lang.Thread;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Modifier;
import java.lang.Object;
import java.lang.Thread$UncaughtExceptionHandler;

public final class oc extends j0 implements ax0	// class@0020f6 from classes.dex
{
    private Object _preHandler;

    public void oc(){
       super(i70.v);
       this._preHandler = this;
    }
    public void x(xw0 p0,Throwable p1){
       Object[] objArray;
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 1;
       sDK_INT = (26 <= sDK_INT && sDK_INT < 28)? 1: 0;
       if (sDK_INT) {
          oc t_preHandler = this._preHandler;
          Object obj = null;
          if (t_preHandler != this) {
          }else {
             Class[] uClassArray = new Class[0];
             t_preHandler = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", uClassArray);
             if (!Modifier.isPublic(t_preHandler.getModifiers()) || !Modifier.isStatic(t_preHandler.getModifiers())) {
                objArray = 0;
             }
             if (!i) {
                t_preHandler = obj;
             }
             this._preHandler = t_preHandler;
          }
          if (t_preHandler != null) {
             objArray = new Object[0];
             t_preHandler = t_preHandler.invoke(obj, objArray);
          }else {
             t_preHandler = obj;
          }
          if (t_preHandler instanceof Thread$UncaughtExceptionHandler) {
             obj = t_preHandler;
          }
          if (obj != null) {
             obj.uncaughtException(Thread.currentThread(), p1);
          }
       }
       return;
    }
}
