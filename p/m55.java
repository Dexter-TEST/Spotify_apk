package p.m55;
import android.content.pm.SigningInfo;
import android.content.pm.Signature;
import p.q3;
import android.content.pm.PackageInfo;
import p.l55;
import android.content.pm.PackageManager;
import java.lang.String;

public abstract class m55	// class@001e2c from classes.dex
{

    public static Signature[] a(SigningInfo p0){
       return q3.v(p0);
    }
    public static long b(PackageInfo p0){
       return q3.d(p0);
    }
    public static Signature[] c(SigningInfo p0){
       return l55.u(p0);
    }
    public static boolean d(SigningInfo p0){
       return q3.u(p0);
    }
    public static boolean e(PackageManager p0,String p1,byte[] p2,int p3){
       return q3.t(p0, p1, p2, p3);
    }
}
