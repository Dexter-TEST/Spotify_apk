package p.n70;
import android.os.Bundle;
import java.lang.String;
import android.os.IBinder;

public abstract class n70	// class@001f7c from classes.dex
{

    public static IBinder a(Bundle p0,String p1){
       return p0.getBinder(p1);
    }
    public static void b(Bundle p0,String p1,IBinder p2){
       p0.putBinder(p1, p2);
    }
}
