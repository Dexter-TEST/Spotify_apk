package p.ly6;
import android.app.Service;
import android.app.Notification;
import p.es3;
import androidx.work.impl.foreground.SystemForegroundService;
import java.lang.Class;
import java.lang.Object;

public abstract class ly6	// class@001dec from classes.dex
{

    public static void a(Service p0,int p1,Notification p2,int p3){
       try{
          p0.startForeground(p1, p2, p3);
       }catch(android.app.ForegroundServiceStartNotAllowedException e0){
          es3.c().getClass();
       }
       return;
    }
}
