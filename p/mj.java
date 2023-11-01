package p.mj;
import android.content.Context;
import java.lang.Class;
import java.lang.Object;
import p.eh;
import android.app.AppOpsManager;
import java.lang.String;

public abstract class mj	// class@001ead from classes.dex
{

    public static Object a(Context p0,Class p1){
       return eh.q(p0, p1);
    }
    public static int b(AppOpsManager p0,String p1,String p2){
       return eh.B(p0, p1, p2);
    }
    public static int c(AppOpsManager p0,String p1,String p2){
       return eh.a(p0, p1, p2);
    }
    public static String d(String p0){
       return eh.s(p0);
    }
}
