package p.l50;
import p.dn6;
import p.ir2;
import p.i70;
import java.lang.Object;
import javax.net.ssl.SSLSocket;
import java.lang.String;
import org.bouncycastle.jsse.BCSSLSocket;
import p.co5;
import p.k50;
import java.util.List;
import org.bouncycastle.jsse.BCSSLParameters;
import p.re5;
import java.util.ArrayList;
import java.lang.NullPointerException;

public final class l50 implements dn6	// class@000295 from classes2.dex
{
    public static final ir2 a;
    public static final i70 b;

    static {
       l50.a = new ir2(16, 0);
       l50.b = new i70();
    }
    public void l50(){
       super();
    }
    public final String a(SSLSocket p0){
       String applicationP;
       int i = ((applicationP = p0.getApplicationProtocol()) == null)? 1: co5.c(applicationP, "");
       if (i) {
          applicationP = null;
       }
       return applicationP;
    }
    public final boolean b(SSLSocket p0){
       return p0 instanceof BCSSLSocket;
    }
    public final boolean c(){
       return k50.d.C();
    }
    public final void d(SSLSocket p0,String p1,List p2){
       Object[] objArray;
       co5.o(p2, "protocols");
       if (this.b(p0)) {
          BCSSLParameters parameters = p0.getParameters();
          String[] stringArray = new String[0];
          if ((objArray = ir2.c(p2).toArray(stringArray)) != null) {
             parameters.setApplicationProtocols(objArray);
             p0.setParameters(parameters);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
          }
       }
       return;
    }
}
