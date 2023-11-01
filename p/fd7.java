package p.fd7;
import sun.misc.Unsafe;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Throwable;
import p.gd7;

public abstract class fd7	// class@0015ab from classes.dex
{
    public final Unsafe a;

    public void fd7(Unsafe p0){
       super();
       this.a = p0;
    }
    public final int a(Class p0){
       return this.a.arrayBaseOffset(p0);
    }
    public final int b(Class p0){
       return this.a.arrayIndexScale(p0);
    }
    public abstract void c(long p0,byte[] p1,long p2);
    public abstract boolean d(long p0,Object p1);
    public abstract byte e(long p0);
    public abstract byte f(long p0,Object p1);
    public abstract double g(long p0,Object p1);
    public abstract float h(long p0,Object p1);
    public final int i(long p0,Object p1){
       return this.a.getInt(p1, p0);
    }
    public final long j(long p0,Object p1){
       return this.a.getLong(p1, p0);
    }
    public final Object k(long p0,Object p1){
       return this.a.getObject(p1, p0);
    }
    public final long l(Field p0){
       return this.a.objectFieldOffset(p0);
    }
    public abstract void m(Object p0,long p1,boolean p2);
    public abstract void n(Object p0,long p1,byte p2);
    public abstract void o(Object p0,long p1,double p2);
    public abstract void p(Object p0,long p1,float p2);
    public final void q(int p0,long p1,Object p2){
       this.a.putInt(p2, p1, p0);
    }
    public final void r(Object p0,long p1,long p2){
       this.a.putLong(p0, p1, p2);
    }
    public final void s(long p0,Object p1,Object p2){
       this.a.putObject(p1, p0, p2);
    }
    public boolean t(){
       fd7 ta;
       Class uClass = Class.class;
       if ((ta = this.a) == null) {
          return false;
       }
       Class class = ta.getClass();
       Class[] uClassArray = new Class[]{Field.class};
       class.getMethod("objectFieldOffset", uClassArray);
       uClassArray = new Class[]{uClass};
       class.getMethod("arrayBaseOffset", uClassArray);
       uClassArray = new Class[]{uClass};
       class.getMethod("arrayIndexScale", uClassArray);
       uClassArray = new Class[2];
       uClassArray[0] = Object.class;
       Class tYPE = Long.TYPE;
       uClassArray[1] = tYPE;
       class.getMethod("getInt", uClassArray);
       Class[] uClassArray1 = new Class[]{Object.class,tYPE,Integer.TYPE};
       class.getMethod("putInt", uClassArray1);
       uClassArray1 = new Class[]{Object.class,tYPE};
       class.getMethod("getLong", uClassArray1);
       uClassArray1 = new Class[]{Object.class,tYPE,tYPE};
       class.getMethod("putLong", uClassArray1);
       uClassArray1 = new Class[]{Object.class,tYPE};
       class.getMethod("getObject", uClassArray1);
       uClassArray = new Class[]{Object.class,tYPE,Object.class};
       class.getMethod("putObject", uClassArray);
       return 1;
    }
    public abstract boolean u();
}
