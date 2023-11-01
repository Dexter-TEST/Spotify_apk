package p.zp0;
import p.dn6;
import p.ir2;
import p.yp0;
import java.lang.Object;
import javax.net.ssl.SSLSocket;
import java.lang.String;
import org.conscrypt.Conscrypt;
import p.xp0;
import java.util.List;
import p.co5;
import p.re5;
import java.util.ArrayList;
import java.lang.NullPointerException;

public final class zp0 implements dn6	// class@0003f7 from classes2.dex
{
    public static final ir2 a;
    public static final yp0 b;

    static {
       zp0.a = new ir2(18, 0);
       zp0.b = new yp0();
    }
    public void zp0(){
       super();
    }
    public final String a(SSLSocket p0){
       String applicationP = (this.b(p0))? Conscrypt.getApplicationProtocol(p0): null;
       return applicationP;
    }
    public final boolean b(SSLSocket p0){
       return Conscrypt.isConscrypt(p0);
    }
    public final boolean c(){
       return xp0.d;
    }
    public final void d(SSLSocket p0,String p1,List p2){
       Object[] objArray;
       co5.o(p2, "protocols");
       if (this.b(p0)) {
          Conscrypt.setUseSessionTickets(p0, true);
          String[] stringArray = new String[0];
          if ((objArray = ir2.c(p2).toArray(stringArray)) != null) {
             Conscrypt.setApplicationProtocols(p0, objArray);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
          }
       }
       return;
    }
}
