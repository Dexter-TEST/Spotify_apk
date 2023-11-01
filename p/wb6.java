package p.wb6;
import java.lang.reflect.Method;
import p.qv5;
import p.lx5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.o11;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import p.uw5;
import com.spotify.clientfoundations.cosmos.cosmos.Response;
import java.lang.Class;
import com.spotify.cosmos.cosmonaut.TypedResponse;
import com.spotify.cosmos.cosmonaut.Converter;
import p.kx5;
import p.ny5;
import p.qs5;
import p.jy5;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class wb6	// class@002b05 from classes.dex
{
    public final o11 a;
    public final gx5 b;
    public final ny5 c;

    public void wb6(Method p0,qv5 p1,lx5 p2){
       ny5[] a;
       int len;
       object oobject;
       co5.o(p0, "method");
       co5.o(p1, "requestTransformers");
       co5.o(p2, "typeTransformers");
       super();
       this.a = new o11(p0, p1);
       Type genericRetur = p0.getGenericReturnType();
       co5.l(genericRetur, "method.getGenericReturnType\(\)");
       ix5 b = lx5.b;
       int i = 0;
       if (!genericRetur instanceof ParameterizedType) {
       }else {
          genericRetur = uw5.j(genericRetur);
          if (!Response.class.equals(genericRetur)) {
             len = 1;
             if (genericRetur instanceof ParameterizedType) {
                Type rawType = genericRetur.getRawType();
                if (rawType instanceof Class && TypedResponse.class.isAssignableFrom(rawType)) {
                   rawType = 1;
                label_0055 :
                   if (a) {
                      genericRetur = uw5.j(genericRetur);
                      b = new kx5(i, p2.a(genericRetur), genericRetur);
                   }else {
                      b = new kx5(len, p2.a(genericRetur), genericRetur);
                   }
                }
             }
             a = 0;
             goto label_0055 ;
          }
       }
       this.b = b;
       String str = uw5.g(p0);
       Type genericRetur1 = p0.getGenericReturnType();
       a = ny5.a;
       len = a.length;
       while (true) {
          if (i >= len) {
             throw new IllegalArgumentException(p0.toString()+"\'s \(action, return type\) pair is not supported: "+str+", "+genericRetur1);
          }
          oobject = a[i];
          co5.l(genericRetur1, "returnType");
          if (oobject.b(str, genericRetur1)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       this.c = oobject;
       return;
    }
}
