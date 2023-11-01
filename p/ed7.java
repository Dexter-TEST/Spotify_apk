package p.ed7;
import p.fd7;
import sun.misc.Unsafe;
import p.gd7;
import java.lang.Object;
import java.lang.Class;
import java.lang.Long;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Byte;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Double;
import java.lang.Throwable;
import java.lang.reflect.Field;
import java.lang.Integer;

public final class ed7 extends fd7	// class@001468 from classes.dex
{

    public void ed7(Unsafe p0){
       super(p0);
    }
    public final void c(long p0,byte[] p1,long p2){
       this.a.copyMemory(null, p0, p1, (gd7.f + 0), p2);
    }
    public final boolean d(long p0,Object p1){
       return this.a.getBoolean(p1, p0);
    }
    public final byte e(long p0){
       return this.a.getByte(p0);
    }
    public final byte f(long p0,Object p1){
       return this.a.getByte(p1, p0);
    }
    public final double g(long p0,Object p1){
       return this.a.getDouble(p1, p0);
    }
    public final float h(long p0,Object p1){
       return this.a.getFloat(p1, p0);
    }
    public final void m(Object p0,long p1,boolean p2){
       this.a.putBoolean(p0, p1, p2);
    }
    public final void n(Object p0,long p1,byte p2){
       this.a.putByte(p0, p1, p2);
    }
    public final void o(Object p0,long p1,double p2){
       this.a.putDouble(p0, p1, p2);
    }
    public final void p(Object p0,long p1,float p2){
       this.a.putFloat(p0, p1, p2);
    }
    public final boolean t(){
       Object obj = Object.class;
       if (!super.t()) {
          return false;
       }
       Class class = this.a.getClass();
       Class[] uClassArray = new Class[2];
       uClassArray[0] = obj;
       Class tYPE = Long.TYPE;
       uClassArray[1] = tYPE;
       class.getMethod("getByte", uClassArray);
       Class[] uClassArray1 = new Class[]{obj,tYPE,Byte.TYPE};
       class.getMethod("putByte", uClassArray1);
       uClassArray1 = new Class[]{obj,tYPE};
       class.getMethod("getBoolean", uClassArray1);
       uClassArray1 = new Class[]{obj,tYPE,Boolean.TYPE};
       class.getMethod("putBoolean", uClassArray1);
       uClassArray1 = new Class[]{obj,tYPE};
       class.getMethod("getFloat", uClassArray1);
       uClassArray1 = new Class[]{obj,tYPE,Float.TYPE};
       class.getMethod("putFloat", uClassArray1);
       uClassArray1 = new Class[]{obj,tYPE};
       class.getMethod("getDouble", uClassArray1);
       uClassArray = new Class[]{obj,tYPE,Double.TYPE};
       class.getMethod("putDouble", uClassArray);
       return 1;
    }
    public final boolean u(){
       fd7 ta;
       int i;
       Class tYPE;
       String str = "getLong";
       if ((ta = this.a) != null) {
          Class class1 = ta.getClass();
          Class[] uClassArray2 = new Class[]{Field.class};
          class1.getMethod("objectFieldOffset", uClassArray2);
          Class[] uClassArray = new Class[]{Object.class,Long.TYPE};
          class1.getMethod(str, uClassArray);
          if (gd7.e() != null) {
             class1 = 1;
          label_0037 :
             if (!i) {
                return false;
             }else {
                Class class = ta.getClass();
                uClassArray = new Class[]{tYPE};
                tYPE = Long.TYPE;
                class.getMethod("getByte", uClassArray);
                uClassArray = new Class[]{tYPE,Byte.TYPE};
                class.getMethod("putByte", uClassArray);
                uClassArray = new Class[]{tYPE};
                class.getMethod("getInt", uClassArray);
                uClassArray = new Class[]{tYPE,Integer.TYPE};
                class.getMethod("putInt", uClassArray);
                Class[] uClassArray1 = new Class[]{tYPE};
                class.getMethod(str, uClassArray1);
                uClassArray1 = new Class[]{tYPE,tYPE};
                class.getMethod("putLong", uClassArray1);
                uClassArray1 = new Class[]{tYPE,tYPE,tYPE};
                class.getMethod("copyMemory", uClassArray1);
                uClassArray1 = new Class[]{Object.class,tYPE,Object.class,tYPE,tYPE};
                class.getMethod("copyMemory", uClassArray1);
                return 1;
             }
          }
       }
       i = 0;
       goto label_0037 ;
    }
}
