package p.l70;
import android.os.Bundle;
import java.lang.String;
import android.os.IBinder;
import java.lang.Object;
import p.co5;

public abstract class l70	// class@001cf6 from classes.dex
{

    public static final void a(Bundle p0,String p1,IBinder p2){
       co5.o(p0, "bundle");
       co5.o(p1, "key");
       p0.putBinder(p1, p2);
    }
}
