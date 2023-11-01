package p.i14;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.Object;
import p.h14;

public abstract class i14	// class@001904 from classes.dex
{
    public static final h14 a;
    public static final h14 b;

    static {
       h14 oh14;
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          oh14 = Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.Exception e0){
          oh14 = null;
       }
       i14.a = oh14;
       i14.b = new h14();
    }
}
