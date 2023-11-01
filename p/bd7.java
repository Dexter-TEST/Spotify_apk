package p.bd7;
import p.os5;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Long;
import java.lang.Boolean;
import p.wf3;
import java.lang.StringBuilder;
import java.lang.SecurityException;

public final class bd7 extends os5	// class@0010a5 from classes.dex
{
    public final Object b;
    public final Field c;
    public static Class d;

    public void bd7(){
       Object obj;
       super();
       try{
          int i = 0;
          Class uClass = Class.forName("sun.misc.Unsafe");
          bd7.d = uClass;
          Field declaredFiel = uClass.getDeclaredField("theUnsafe");
          declaredFiel.setAccessible(true);
          obj = declaredFiel.get(i);
       }catch(java.lang.Exception e0){
          obj = e0;
       }
       this.b = obj;
       try{
          Field declaredFiel1 = AccessibleObject.class.getDeclaredField("override");
          this.c = e0;
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void a(AccessibleObject p0){
       bd7 tb;
       bd7 tc;
       int i = 0;
       if ((tb = this.b) != null && (tc = this.c) != null) {
          try{
             Class[] uClassArray = new Class[]{Field.class};
             Object[] objArray = new Object[]{tc};
             Class[] uClassArray1 = new Class[]{Object.class,Long.TYPE,Boolean.TYPE};
             Object[] objArray1 = new Object[]{p0,Long.valueOf(bd7.d.getMethod("objectFieldOffset", uClassArray).invoke(tb, objArray).longValue()),Boolean.TRUE};
             bd7.d.getMethod("putBoolean", uClassArray1).invoke(tb, objArray1);
             i = 1;
          }catch(java.lang.Exception e0){
          }
       }
       if (!i) {
          try{
             p0.setAccessible(e0);
          }catch(java.lang.SecurityException e0){
             throw new wf3("Gson couldn\'t modify fields for "+p0+"\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e0);
          }
       }
       return;
    }
}
