package p.aj4;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.Object;
import p.zi4;

public abstract class aj4	// class@000f94 from classes.dex
{
    public static final zi4 a;
    public static final zi4 b;

    static {
       zi4 ozi4;
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          ozi4 = Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.Exception e0){
          ozi4 = null;
       }
       aj4.a = ozi4;
       aj4.b = new zi4();
    }
}
