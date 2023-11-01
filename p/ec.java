package p.ec;
import p.dn6;
import p.ir2;
import java.lang.Object;
import javax.net.ssl.SSLSocket;
import java.lang.String;
import p.u3;
import p.co5;
import java.util.List;
import javax.net.ssl.SSLParameters;
import p.re5;
import java.util.ArrayList;
import java.lang.NullPointerException;
import java.io.IOException;
import java.lang.Throwable;

public final class ec implements dn6	// class@0001d3 from classes2.dex
{
    public static final ir2 a;

    static {
       ec.a = new ir2(13, 0);
    }
    public void ec(){
       super();
    }
    public final String a(SSLSocket p0){
       String str;
       int i = ((str = u3.j(p0)) == null)? 1: co5.c(str, "");
       if (i) {
          str = null;
       }
       return str;
    }
    public final boolean b(SSLSocket p0){
       return u3.w(p0);
    }
    public final boolean c(){
       return ec.a.C();
    }
    public final void d(SSLSocket p0,String p1,List p2){
       Object[] objArray;
       p1 = "protocols";
       try{
          co5.o(p2, p1);
          u3.u(p0);
          SSLParameters sSLParameter = p0.getSSLParameters();
          String[] stringArray = new String[0];
          if ((objArray = ir2.c(p2).toArray(stringArray)) == null) {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
          }
          u3.t(sSLParameter, objArray);
          p0.setSSLParameters(sSLParameter);
          return;
       }catch(java.lang.IllegalArgumentException e2){
          throw new IOException("Android internal error", e2);
       }
    }
}
