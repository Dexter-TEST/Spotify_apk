package p.ce4;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import android.os.IInterface;
import java.lang.Object;
import p.a53;
import java.lang.String;
import p.co5;
import java.lang.Integer;
import java.util.Map;

public final class ce4 extends RemoteCallbackList	// class@0011ef from classes.dex
{
    public final MultiInstanceInvalidationService a;

    public void ce4(MultiInstanceInvalidationService p0){
       this.a = p0;
       super();
    }
    public final void onCallbackDied(IInterface p0,Object p1){
       co5.o(p0, "callback");
       co5.o(p1, "cookie");
       this.a.b.remove(p1);
    }
}
