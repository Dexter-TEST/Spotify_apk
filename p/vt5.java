package p.vt5;
import p.yf2;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.ConnectionType;
import java.lang.Boolean;
import p.bx5;
import p.cx5;
import java.lang.String;
import p.mp2;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Single;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import p.co5;
import p.mm2;
import p.lm2;
import p.xo5;
import p.dr0;
import p.tp2;
import java.lang.System;

public final class vt5 implements yf2	// class@002a61 from classes.dex
{
    public final int a;
    public static final vt5 b;
    public static final vt5 c;
    public static final vt5 t;

    static {
       vt5.b = new vt5(1);
       vt5.c = new vt5(2);
       vt5.t = new vt5(3);
    }
    public void vt5(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       String str;
       switch (this.a){
           case 0:
             tp2.v(p0);
             throw null;
           case 1:
             co5.l(p0, "it");
             return dr0.c(lm2.b(p0));
           case 2:
             p0 = ((str = p0.a.w.a("location")) == null)? Single.error(new Exception("No redirect url in header for response: {"+p0+"}}")): Single.just(str);
             return p0;
             break;
           case 3:
             return Boolean.valueOf(p0.isCellularNetwork());
           case 4:
             return p0;
           default:
             return System.getProperty(p0);
       }
    }
    public final String toString(){
       switch (this.a){
           case 4:
           default:
             return super.toString();
       }
       return "IdentityFunction";
    }
}
