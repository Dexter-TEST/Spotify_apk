package p.zi2;
import p.by5;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class zi2 extends by5	// class@002f00 from classes.dex
{

    public void zi2(Fragment p0,int p1){
       if (p1 != 1) {
          co5.o(p0, "fragment");
          super(0, p0, "Attempting to get retain instance for fragment "+p0);
          return;
       }else {
          co5.o(p0, "fragment");
          super(0, p0, "Attempting to set retain instance for fragment "+p0);
          return;
       }
    }
}
