package p.ay1;
import p.zx1;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.Object;

public abstract class ay1	// class@001015 from classes.dex
{
    public static final zx1 a;
    public static final zx1 b;

    static {
       zx1 ozx1 = new zx1();
       try{
          ay1.a = ozx1;
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          ozx1 = Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.Exception e0){
          ozx1 = null;
       }
       ay1.b = ozx1;
    }
}
