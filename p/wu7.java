package p.wu7;
import android.os.Build$VERSION;
import java.lang.String;

public abstract class wu7	// class@002bae from classes.dex
{
    public static final int a;

    static {
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 0x2000000;
       if (sDK_INT >= 31) {
       }else if(sDK_INT >= 30){
          String cODENAME = Build$VERSION.CODENAME;
          if (cODENAME.length() != 1 || (cODENAME.charAt(0) < 'S' || cODENAME.charAt(0) > 'Z')) {
          }
       }else {
       }
       wu7.a = i;
    }
}
