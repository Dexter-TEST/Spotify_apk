package p.gb4;
import p.tb0;
import java.lang.Object;
import android.content.ContentResolver;
import android.database.ContentObserver;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import p.wi4;
import android.app.usage.NetworkStatsManager$UsageCallback;
import android.app.usage.NetworkStatsManager;
import p.k11;

public final class gb4 implements tb0	// class@0016d8 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void gb4(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final void cancel(){
       gb4 tc = this.c;
       gb4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             k11.u(tb.a, tc);
             return;
       }
       MobileDataDisabledMonitor.c(tb, tc);
       return;
    }
}
