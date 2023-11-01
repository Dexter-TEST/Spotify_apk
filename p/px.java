package p.px;
import p.sd7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.CharSequence;
import java.lang.Character;

public final class px implements sd7	// class@0022f1 from classes.dex
{
    public static final px b;

    static {
       px.b = new px();
    }
    public void px(){
       super();
    }
    public final boolean a(String p0){
       co5.o(p0, "segment");
       boolean b = (p0.length() == 22)? true: false;
       return b;
    }
    public final boolean b(String p0){
       co5.o(p0, "segment");
       boolean b = false;
       int i = 0;
       while (true) {
          if (i < p0.length()) {
             if (!Character.isLetterOrDigit(p0.charAt(i))) {
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
