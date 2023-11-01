package p.w9;
import p.y9;
import java.lang.String;
import java.lang.Object;
import io.reactivex.rxjava3.core.Single;
import android.os.Build;
import p.co5;
import java.lang.UnsupportedOperationException;

public abstract class w9	// class@002af4 from classes.dex
{

    static {
    }
    public static Single a(y9 p0,String p1,String p2,String p3,String p4,String p5,String p6,int p7,Object p8){
       if (p8 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllboarding");
       }
       if ((p7 & 0x01)) {
          p1 = "";
       }
       String str = p1;
       if ((p7 & 0x08)) {
          p4 = Build.MANUFACTURER;
          co5.l(p4, "MANUFACTURER");
       }
       String str1 = p4;
       if ((p7 & 0x10)) {
          p5 = Build.MODEL;
          co5.l(p5, "MODEL");
       }
       String str2 = p5;
       if ((p7 & 0x20)) {
          p6 = "android";
       }
       return p0.c(str, p2, p3, str1, str2, p6);
    }
}
