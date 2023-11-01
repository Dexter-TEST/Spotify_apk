package p.ne7;
import p.sd7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.CharSequence;
import android.net.Uri;

public final class ne7 implements sd7	// class@001fc3 from classes.dex
{
    public static final ne7 b;

    static {
       ne7.b = new ne7();
    }
    public void ne7(){
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
       co5.l(p0, "decodedSegment");
       boolean b = false;
       int i = 0;
       while (true) {
          if (i < p0.length()) {
             char c = p0.charAt(i);
             int i1 = (65 <= c && c < '[')? 1: 0;
             if (!(i1 = i1 ^ 1)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             b = true;
             break ;
          }
       }
       return b;
    }
}
