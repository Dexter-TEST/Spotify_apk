package p.x26;
import java.lang.Class;
import android.app.Application;
import p.m26;
import java.lang.Object;
import java.util.List;
import p.ye7;
import java.lang.reflect.Constructor;
import java.lang.String;
import p.co5;
import p.uk;
import java.util.Collection;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import p.vi7;
import java.util.Arrays;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;

public abstract class x26	// class@002bf7 from classes.dex
{
    public static final List a;
    public static final List b;

    static {
       Class[] uClassArray = new Class[]{Application.class,m26.class};
       x26.a = ye7.K(uClassArray);
       x26.b = ye7.J(m26.class);
    }
    public static final Constructor a(List p0,Class p1){
       object oobject;
       co5.o(p0, "signature");
       Constructor[] constructors = p1.getConstructors();
       co5.l(constructors, "modelClass.constructors");
       int len = constructors.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = constructors[i];
          Class[] parameterTyp = oobject.getParameterTypes();
          co5.l(parameterTyp, "constructor.parameterTypes");
          List list = uk.t0(parameterTyp);
          if (co5.c(p0, list)) {
             break ;
          }else if(p0.size() == list.size() && list.containsAll(p0)){
             throw new UnsupportedOperationException("Class "+p1.getSimpleName()+" must have parameters in the proper order: "+p0);
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static final vi7 b(Class p0,Constructor p1,Object[] p2){
       try{
          return p1.newInstance(Arrays.copyOf(p2, p2.length));
       }catch(java.lang.IllegalAccessException e3){
          throw new RuntimeException("Failed to access "+p0, e3);
       }catch(java.lang.InstantiationException e3){
          throw new RuntimeException("A "+p0+" cannot be instantiated.", e3);
       }catch(java.lang.reflect.InvocationTargetException e3){
          throw new RuntimeException("An exception happened in constructor of "+p0, e3.getCause());
       }
    }
}
