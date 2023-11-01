package p.hi2;
import p.q74;
import java.lang.Object;
import java.lang.Class;
import p.p74;
import com.google.protobuf.c;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;

public final class hi2 implements q74	// class@001858 from classes.dex
{
    public static final hi2 a;

    static {
       hi2.a = new hi2();
    }
    public void hi2(){
       super();
    }
    public final p74 a(Class p0){
       c uoc = c.class;
       if (uoc.isAssignableFrom(p0)) {
          return c.getDefaultInstance(p0.asSubclass(uoc)).buildMessageInfo();
       }
       throw new IllegalArgumentException("Unsupported message type: ".concat(p0.getName()));
    }
    public final boolean b(Class p0){
       return c.class.isAssignableFrom(p0);
    }
}
