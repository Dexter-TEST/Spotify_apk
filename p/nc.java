package p.nc;
import p.uz3;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import p.tz3;
import android.os.Looper;
import p.sn2;
import android.os.Handler;
import p.tn2;
import java.lang.IllegalStateException;

public final class nc implements uz3	// class@001fb2 from classes.dex
{

    public void nc(){
       super();
    }
    public String a(){
       return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
    public tz3 b(List p0){
       Looper mainLooper;
       if ((mainLooper = Looper.getMainLooper()) != null) {
          return new sn2(tn2.a(mainLooper));
       }
       throw new IllegalStateException("The main looper is not available");
    }
    public int c(){
       return 0x3fffffff;
    }
}
