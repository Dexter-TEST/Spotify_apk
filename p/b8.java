package p.b8;
import android.app.AlarmManager;
import android.app.PendingIntent;

public abstract class b8	// class@001078 from classes.dex
{

    public static void a(AlarmManager p0,int p1,long p2,PendingIntent p3){
       p0.setExact(p1, p2, p3);
    }
}
