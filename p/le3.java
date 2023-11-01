package p.le3;
import p.re5;
import java.lang.String;
import java.lang.System;
import java.lang.Integer;
import p.yu6;
import javax.net.ssl.SSLSocket;
import java.lang.Class;
import java.lang.reflect.Method;
import java.util.List;
import java.lang.Object;
import p.co5;
import javax.net.ssl.SSLParameters;
import java.util.ArrayList;
import p.ir2;
import p.u3;
import java.lang.NullPointerException;

public final class le3 extends re5	// class@00029d from classes2.dex
{
    public static final boolean c;

    static {
       String property;
       Integer integer = ((property = System.getProperty("java.specification.version")) == null)? null: yu6.c0(property);
       try{
          boolean b = false;
          if (integer != null) {
             if (integer.intValue() < 9) {
             label_0024 :
                le3.c = b;
             }
          }else {
             Class[] uClassArray = new Class[b];
             SSLSocket.class.getMethod("getApplicationProtocol", uClassArray);
          }
          b = true;
          goto label_0024 ;
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public void le3(){
       super();
    }
    public final void d(SSLSocket p0,String p1,List p2){
       Object[] objArray;
       co5.o(p2, "protocols");
       SSLParameters sSLParameter = p0.getSSLParameters();
       String[] stringArray = new String[0];
       if ((objArray = ir2.c(p2).toArray(stringArray)) == null) {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
       }
       u3.t(sSLParameter, objArray);
       p0.setSSLParameters(sSLParameter);
       return;
    }
    public final String f(SSLSocket p0){
       String str;
       try{
          int i = ((str = u3.j(p0)) == null)? 1: co5.c(str, "");
          if (i) {
             str = null;
          }
       }catch(java.lang.UnsupportedOperationException e0){
       }
       return str;
    }
}
