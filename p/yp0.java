package p.yp0;
import p.y81;
import java.lang.Object;
import javax.net.ssl.SSLSocket;
import p.xp0;
import p.vp0;
import org.conscrypt.Conscrypt;
import p.dn6;
import p.zp0;

public final class yp0 implements y81	// class@0003e0 from classes2.dex
{

    public void yp0(){
       super();
    }
    public final boolean b(SSLSocket p0){
       boolean b = (vp0.b() && Conscrypt.isConscrypt(p0))? true: false;
       return b;
    }
    public final dn6 g(SSLSocket p0){
       return new zp0();
    }
}
