package p.wd7;
import p.sd7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.CharSequence;
import android.net.Uri;
import java.util.List;
import p.av6;
import p.vv7;

public final class wd7 implements sd7	// class@002b18 from classes.dex
{
    public static final wd7 b;

    static {
       wd7.b = new wd7();
    }
    public void wd7(){
       super();
    }
    public final boolean a(String p0){
       co5.o(p0, "segment");
       boolean b = (p0.length() > 0)? true: false;
       return b;
    }
    public final boolean b(String p0){
       co5.o(p0, "segment");
       p0 = Uri.decode(p0);
       co5.l(p0, "url");
       String[] stringArray = new String[]{"://"};
       int i = 0;
       List list = av6.B0(p0, stringArray, i, 6);
       if (list.size() == 2) {
          String str = list.get(i);
          int i1 = (!co5.c(str, "https") && !co5.c(str, "http"))? 0: 1;
          if (str) {
             list = list.get(1);
             str = (list.length() > 0)? 1: 0;
             if (str) {
                i1 = 0;
                while (true) {
                   if (i1 < list.length()) {
                      if (vv7.z(list.charAt(i1))) {
                         list = 0;
                      label_0066 :
                         if (list) {
                            list = 1;
                         label_006b :
                            if (list) {
                               i = true;
                               break ;
                            }
                         }
                      }else {
                         i1 = i1 + 1;
                      }
                   }else {
                      list = 1;
                      goto label_0066 ;
                   }
                }
             }
             list = 0;
             goto label_006b ;
          }
       }
       return i;
    }
}
