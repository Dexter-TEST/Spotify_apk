package p.lt7;
import java.lang.Object;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.String;
import java.lang.Throwable;
import java.lang.RuntimeException;
import p.ll2;
import p.si4;

public abstract class lt7	// class@001dc0 from classes.dex
{
    public final int a;

    public void lt7(int p0){
       super();
       this.a = p0;
    }
    public static Status a(RemoteException p0){
       return new Status(19, p0.getClass().getSimpleName()+": "+p0.getLocalizedMessage(), 0);
    }
    public abstract void b(Status p0);
    public abstract void c(RuntimeException p0);
    public abstract void d(ll2 p0);
    public abstract void e(si4 p0,boolean p1);
}
