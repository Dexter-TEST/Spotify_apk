package p.eh4;
import java.util.LinkedHashMap;
import java.lang.Object;
import p.dh4;
import java.lang.Class;
import java.lang.String;
import p.ir2;
import p.co5;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import p.tp2;

public final class eh4	// class@001489 from classes.dex
{
    public final LinkedHashMap a;
    public static final LinkedHashMap b;

    static {
       eh4.b = new LinkedHashMap();
    }
    public void eh4(){
       super();
       this.a = new LinkedHashMap();
    }
    public final void a(dh4 p0){
       String str = ir2.z(p0.getClass());
       if (!ir2.H(str)) {
          throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
       }
       eh4 ta = this.a;
       dh4 uodh4 = ta.get(str);
       if (!co5.c(uodh4, p0)) {
          int i = (uodh4 != null && uodh4.b == 1)? 1: 0;
          if ((i ^ 1)) {
             if ((p0.b ^ 1)) {
                ta.put(str, p0);
             }else {
                throw new IllegalStateException("Navigator "+p0+" is already attached to another NavController".toString());
             }
          }else {
             throw new IllegalStateException("Navigator "+p0+" is replacing an already attached "+uodh4.toString());
          }
       }
       return;
    }
    public final dh4 b(String p0){
       dh4 uodh4;
       co5.o(p0, "name");
       if (!ir2.H(p0)) {
          throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
       }
       if ((uodh4 = this.a.get(p0)) != null) {
          return uodh4;
       }
       throw new IllegalStateException(tp2.m("Could not find Navigator with name \"", p0, "\". You must call NavController.addNavigator\(\) for each navigation type."));
    }
}
