package p.bj7;
import p.aj7;
import java.lang.Object;
import java.lang.Class;
import p.vi7;
import java.lang.reflect.Constructor;
import java.lang.String;
import p.co5;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.me4;

public class bj7 implements aj7	// class@0010da from classes.dex
{
    public static bj7 a;

    public void bj7(){
       super();
    }
    public vi7 a(Class p0){
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          Object obj = p0.getDeclaredConstructor(uClassArray).newInstance(objArray);
          co5.l(obj, "{\n                modelC…wInstance\(\)\n            }");
          return obj;
       }catch(java.lang.NoSuchMethodException e1){
          throw new RuntimeException(v0+p0, e1);
       }catch(java.lang.InstantiationException e1){
          throw new RuntimeException(v0+p0, e1);
       }catch(java.lang.IllegalAccessException e1){
          throw new RuntimeException(v0+p0, e1);
       }
    }
    public vi7 b(Class p0,me4 p1){
       return this.a(p0);
    }
}
