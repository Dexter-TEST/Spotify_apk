package p.se5;
import java.lang.String;
import java.lang.System;
import java.lang.Object;
import p.pe5;
import java.lang.invoke.MethodHandles$Lookup;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Constructor;
import java.lang.reflect.AccessibleObject;
import java.util.concurrent.Executor;
import java.lang.reflect.Method;
import p.aq3;
import java.lang.invoke.MethodHandle;

public class se5	// class@000332 from classes2.dex
{
    public final boolean a;
    public final Constructor b;
    public static final se5 c;

    static {
       pe5 ope5 = ("Dalvik".equals(System.getProperty("java.vm.name")))? new pe5(): new se5(true);
       se5.c = ope5;
    }
    public void se5(boolean p0){
       try{
          super();
          this.a = p0;
          Constructor uConstructor = null;
          if (p0) {
             Class[] uClassArray = new Class[]{Class.class,Integer.TYPE};
             uConstructor = MethodHandles$Lookup.class.getDeclaredConstructor(uClassArray);
             uConstructor.setAccessible(1);
          }
          this.b = e0;
          return;
       }catch(java.lang.NoClassDefFoundError e0){
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public Executor a(){
       return null;
    }
    public Object b(Class p0,Object p1,Method p2,Object[] p3){
       se5 tb;
       MethodHandles$Lookup lookup;
       if ((tb = this.b) != null) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(-1)};
          lookup = tb.newInstance(objArray);
       }else {
          lookup = aq3.t();
       }
       return aq3.p(aq3.r(aq3.s(lookup, p2, p0), p1), p3);
    }
}
