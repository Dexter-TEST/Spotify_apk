package p.kd;
import p.dn6;
import p.jd;
import java.lang.Class;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import java.lang.reflect.Method;
import p.co5;
import javax.net.ssl.SSLSocket;
import p.oe0;
import java.nio.charset.Charset;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.NullPointerException;
import java.lang.AssertionError;
import p.gd;
import p.ir2;
import java.util.List;
import p.re5;

public class kd implements dn6	// class@00027d from classes2.dex
{
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;
    public static final jd f;

    static {
       kd.f = new jd();
    }
    public void kd(Class p0){
       super();
       this.a = p0;
       Class[] uClassArray = new Class[]{Boolean.TYPE};
       Method declaredMeth = p0.getDeclaredMethod("setUseSessionTickets", uClassArray);
       co5.l(declaredMeth, "sslSocketClass.getDeclar…:class.javaPrimitiveType\)");
       this.b = declaredMeth;
       uClassArray = new Class[]{String.class};
       this.c = p0.getMethod("setHostname", uClassArray);
       Class[] uClassArray1 = new Class[0];
       this.d = p0.getMethod("getAlpnSelectedProtocol", uClassArray1);
       Class[] uClassArray2 = new Class[]{byte[].class};
       this.e = p0.getMethod("setAlpnProtocols", uClassArray2);
    }
    public final String a(SSLSocket p0){
       byte[] uobyteArray;
       String str = null;
       if (!this.a.isInstance(p0)) {
          return str;
       }
       try{
          Object[] objArray = new Object[0];
          if ((uobyteArray = this.d.invoke(p0, objArray)) != null) {
             str = new String(uobyteArray, oe0.a);
          }
          return str;
       }catch(java.lang.IllegalAccessException e4){
          throw new AssertionError(e4);
       }catch(java.lang.reflect.InvocationTargetException e4){
          Throwable cause = e4.getCause();
          if (cause instanceof NullPointerException && co5.c(cause.getMessage(), "ssl == null")) {
          }else {
             throw new AssertionError(e4);
          }
       }
    }
    public final boolean b(SSLSocket p0){
       return this.a.isInstance(p0);
    }
    public final boolean c(){
       return gd.e.C();
    }
    public final void d(SSLSocket p0,String p1,List p2){
       co5.o(p2, "protocols");
       if (this.a.isInstance(p0)) {
          try{
             int i = 1;
             Object[] objArray = new Object[i];
             objArray[0] = Boolean.TRUE;
             this.b.invoke(p0, objArray);
             if (p1 != null) {
                objArray = new Object[i];
                objArray[0] = p1;
                this.c.invoke(p0, objArray);
             }
             Object[] objArray1 = new Object[i];
             objArray1[0] = ir2.o(p2);
             this.e.invoke(p0, objArray1);
          }catch(java.lang.IllegalAccessException e6){
             throw new AssertionError(e6);
          }catch(java.lang.reflect.InvocationTargetException e6){
             throw new AssertionError(e6);
          }
       }
       return;
    }
}
