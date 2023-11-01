package p.xx1;
import java.lang.String;
import java.lang.Class;

public abstract class xx1	// class@002d05 from classes.dex
{
    public static final Class a;

    static {
       Class uClass;
       try{
          uClass = Class.forName("com.google.protobuf.ExtensionRegistry");
       }catch(java.lang.ClassNotFoundException e0){
          uClass = null;
       }
       xx1.a = uClass;
    }
}
