package p.je3;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.String;
import p.co5;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.Void;
import java.util.List;
import java.lang.NullPointerException;
import java.util.Arrays;

public final class je3 implements InvocationHandler	// class@00025d from classes2.dex
{
    public final List a;
    public boolean b;
    public String c;

    public void je3(ArrayList p0){
       super();
       this.a = p0;
    }
    public final Object invoke(Object p0,Method p1,Object[] p2){
       int i2;
       Object obj1;
       co5.o(p0, "proxy");
       co5.o(p1, "method");
       int i = 0;
       if (p2 == null) {
          p2 = new Object[i];
       }
       String name = p1.getName();
       Class returnType = p1.getReturnType();
       if (co5.c(name, "supports") && co5.c(Boolean.TYPE, returnType)) {
          return Boolean.TRUE;
       }else {
          Object obj = null;
          if (co5.c(name, "unsupported") && co5.c(Void.TYPE, returnType)) {
             this.b = true;
             return obj;
          }else {
             je3 ta = this.a;
             if (co5.c(name, "protocols")) {
                int i1 = (!p2.length)? 1: 0;
                if (i1) {
                   return ta;
                }
             }
             if (co5.c(name, "selectProtocol") || (co5.c(name, "select") && (co5.c(String.class, returnType) && p2.length == 1))) {
                object oobject = p2[i];
                if (oobject instanceof List) {
                   if (oobject != null) {
                      if ((i2 = oobject.size()) >= 0) {
                         int i3 = 0;
                         while (true) {
                            int i4 = i3 + 1;
                            if ((obj1 = oobject.get(i3)) == null) {
                               throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            if (ta.contains(obj1)) {
                               this.c = obj1;
                               return obj1;
                            }else if(i3 == i2){
                               i3 = i4;
                            }
                         }
                      }
                      i = ta.get(i);
                      this.c = i;
                      return i;
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                   }
                }
             }
             if (!co5.c(name, "protocolSelected") && (!co5.c(name, "selected") || p2.length != 1)) {
                return p1.invoke(this, Arrays.copyOf(p2, p2.length));
             }else if((i = p2[i]) != null){
                this.c = i;
                return obj;
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
             }
          }
       }
    }
}
