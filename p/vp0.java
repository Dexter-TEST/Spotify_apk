package p.vp0;
import org.conscrypt.Conscrypt$Version;
import org.conscrypt.Conscrypt;
import p.xp0;

public abstract class vp0	// class@00038b from classes2.dex
{

    public static boolean a(){
       Conscrypt$Version version = Conscrypt.version();
       boolean b = false;
       if (version.major() != 2) {
          if (version.major() > 2) {
             b = true;
          }
          return b;
       }else if(version.minor() != 1){
          if (version.minor() > 1) {
             b = true;
          }
          return b;
       }else if(version.patch() >= 0){
          b = true;
       }
       return b;
    }
    public static boolean b(){
       return xp0.d;
    }
}
