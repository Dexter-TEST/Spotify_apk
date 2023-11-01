package p.t18;
import android.content.Context;
import java.lang.Object;
import java.io.File;

public final class t18	// class@0026e2 from classes.dex
{
    public final Context a;

    public void t18(Context p0){
       this.a = p0;
    }
    public static long a(File p0){
       if (!p0.isDirectory()) {
          return p0.length();
       }
       File[] uFileArray = p0.listFiles();
       long l = 0;
       if (uFileArray != null) {
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             l = l + t18.a(uFileArray[i]);
          }
       }
       return l;
    }
}
