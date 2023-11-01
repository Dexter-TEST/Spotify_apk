package p.nm5;
import p.qu0;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import p.cy5;
import p.su0;
import java.lang.Class;
import p.s74;
import p.pm5;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Object;
import p.r75;
import java.lang.reflect.Field;
import p.oe7;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.tp2;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.lang.reflect.InvocationTargetException;

public final class nm5 extends qu0	// class@0002ce from classes2.dex
{

    public void nm5(){
       super();
    }
    public final su0 a(Type p0,Annotation[] p1,Annotation[] p2,cy5 p3){
       if (!p0 instanceof Class) {
          return null;
       }
       if (!s74.class.isAssignableFrom(p0)) {
          return null;
       }
       return new pm5();
    }
    public final su0 b(Type p0,Annotation[] p1,cy5 p2){
       r75 or75;
       if (!p0 instanceof Class) {
          return null;
       }
       if (!s74.class.isAssignableFrom(p0)) {
          return null;
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          or75 = p0.getDeclaredMethod("parser", uClassArray).invoke(null, objArray);
       }catch(java.lang.reflect.InvocationTargetException e3){
          throw new RuntimeException(e3.getCause());
       }catch(java.lang.NoSuchMethodException e0){
          or75 = p0.getDeclaredField("PARSER").get(null);
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.NoSuchFieldException e4){
       }catch(java.lang.IllegalAccessException e4){
       }
       throw new IllegalArgumentException(tp2.j(p0, "Found a protobuf message but ", " had no parser\(\) method or PARSER field."), e4);
    }
}
