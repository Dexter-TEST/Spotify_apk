package p.hx0;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import p.i16;
import java.util.List;
import java.lang.Object;
import p.gx0;
import java.lang.Class;
import java.lang.String;
import p.co5;
import java.lang.ClassLoader;
import p.s83;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class hx0 implements Cosmonaut	// class@0018db from classes.dex
{
    public final i16 a;
    public final gx0 b;

    public void hx0(i16 p0,List p1){
       super();
       this.a = p0;
       this.b = new gx0(p1);
    }
    public final Object createCosmosService(Class p0){
       co5.o(p0, "serviceClazz");
       hx0 tb = this.b;
       tb.getClass();
       hx0 ta = this.a;
       co5.o(ta, "rxRouter");
       Class[] uClassArray = new Class[]{p0};
       return Proxy.newProxyInstance(p0.getClassLoader(), uClassArray, new s83(tb, ta));
    }
}
