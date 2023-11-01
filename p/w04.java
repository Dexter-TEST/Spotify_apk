package p.w04;
import p.u04;
import p.v04;
import p.q74;
import p.hi2;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import p.cc3;

public final class w04	// class@002a9e from classes.dex
{
    public final q74 a;
    public static final u04 b;

    static {
       w04.b = new u04();
    }
    public void w04(){
       q74 oq74;
       q74[] oq74Array = new q74[2];
       int i = 0;
       oq74Array[0] = hi2.a;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          oq74 = Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", uClassArray).invoke(null, objArray);
       }catch(java.lang.Exception e0){
          oq74 = w04.b;
       }
       oq74Array[1] = oq74;
       super();
       this.a = new v04(oq74Array);
       return;
    }
}
