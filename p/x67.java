package p.x67;
import java.lang.String;
import android.os.Trace;
import android.os.Build$VERSION;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Object;
import java.lang.Long;
import java.lang.reflect.Method;
import java.lang.Integer;

public abstract class x67	// class@002c1c from classes.dex
{
    public static final int a;

    static {
       Class tYPE;
       try{
          if (Build$VERSION.SDK_INT < 29) {
             Trace.class.getField("TRACE_TAG_APP").getLong(null);
             Class[] uClassArray = new Class[]{tYPE};
             tYPE = Long.TYPE;
             Trace.class.getMethod("isTagEnabled", uClassArray);
             Class[] uClassArray1 = new Class[3];
             uClassArray1[0] = tYPE;
             uClassArray1[1] = String.class;
             Class tYPE1 = Integer.TYPE;
             uClassArray1[2] = tYPE1;
             Trace.class.getMethod("asyncTraceBegin", uClassArray1);
             uClassArray1 = new Class[]{tYPE,String.class,tYPE1};
             Trace.class.getMethod("asyncTraceEnd", uClassArray1);
             uClassArray = new Class[]{tYPE,String.class,tYPE1};
             Trace.class.getMethod("traceCounter", uClassArray);
          }
       }catch(java.lang.Exception e0){
       }
    }
}
