package p.i53;
import p.j53;
import android.os.Binder;
import android.os.IBinder;
import java.lang.String;
import android.os.IInterface;
import p.h53;

public abstract class i53 extends Binder implements j53	// class@001929 from classes.dex
{

    public static j53 g(IBinder p0){
       IInterface iInterface;
       if ((iInterface = p0.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService")) != null && iInterface instanceof j53) {
          return iInterface;
       }
       return new h53(p0);
    }
}
