package p.ij3;
import java.lang.Object;
import p.uj3;
import p.kj3;
import java.lang.String;
import p.co5;
import java.lang.Enum;

public final class ij3	// class@0019a5 from classes.dex
{

    public void ij3(){
       super();
    }
    public static kj3 a(uj3 p0){
       int i;
       kj3 okj3;
       co5.o(p0, "state");
       if ((i = p0.ordinal()) != 1) {
          if (i != 2) {
             okj3 = (i != 3)? null: kj3.ON_RESUME;
          }else {
             okj3 = kj3.ON_START;
          }
       }else {
          okj3 = kj3.ON_CREATE;
       }
       return okj3;
    }
}
