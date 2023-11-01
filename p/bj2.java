package p.bj2;
import p.by5;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class bj2 extends by5	// class@0010d5 from classes.dex
{

    public void bj2(Fragment p0,int p1){
       String str = "fragment";
       if (p1 != 1) {
          co5.o(p0, str);
          super(1, p0, "Attempting to get target request code from fragment "+p0);
          return;
       }else {
          co5.o(p0, str);
          super(1, p0, "Attempting to get target fragment from fragment "+p0);
          return;
       }
    }
}
