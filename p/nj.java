package p.nj;
import android.app.AppOpsManager;
import java.lang.String;
import android.content.Context;
import p.u3;
import java.lang.Object;
import p.eh;

public abstract class nj	// class@001ff1 from classes.dex
{

    public static int a(AppOpsManager p0,String p1,int p2,String p3){
       if (p0 == null) {
          return 1;
       }
       return p0.checkOpNoThrow(p1, p2, p3);
    }
    public static String b(Context p0){
       return u3.i(p0);
    }
    public static AppOpsManager c(Context p0){
       return eh.p(p0);
    }
}
