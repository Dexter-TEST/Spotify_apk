package p.s18;
import android.os.Process;
import java.lang.StringBuilder;
import java.lang.String;
import android.content.Context;
import java.lang.Object;

public final class s18	// class@0025a0 from classes.dex
{

    static {
       String str = new StringBuilder(39)+"UID: ["+Process.myUid()+"]  PID: ["+Process.myPid()+"] ";
       String str1 = "SplitInstallInfoProvider";
       if (str1.length()) {
          str.concat(str1);
       }else {
          str1 = str;
       }
    }
    public void s18(Context p0){
       super();
       p0.getPackageName();
    }
}
