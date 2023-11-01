package p.wy;
import p.nu7;
import android.os.Looper;
import android.os.Message;
import java.lang.Exception;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.Status;
import android.util.Pair;
import java.lang.Object;
import p.tp2;
import p.wx5;

public final class wy extends nu7	// class@002bd3 from classes.dex
{

    public void wy(Looper p0){
       super(p0);
    }
    public final void handleMessage(Message p0){
       Message what;
       Exception uException;
       if ((what = p0.what) != 1) {
          if (what != 2) {
             uException = new Exception();
             return;
          }else {
             p0.obj.E(Status.z);
             return;
          }
       }else {
          p0 = p0.obj;
          tp2.v(p0.first);
          try{
             uException = 0;
             throw uException;
          }catch(java.lang.RuntimeException e3){
             throw e3;
          }
       }
    }
}
