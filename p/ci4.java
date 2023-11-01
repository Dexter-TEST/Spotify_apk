package p.ci4;
import p.aw6;
import java.lang.Object;
import com.spotify.litesettings.settings.OfflineSettingsActivity;
import p.wp3;
import p.tn6;
import io.reactivex.rxjava3.core.Observable;
import p.ko1;
import java.lang.Boolean;
import com.spotify.litesettings.settings.ExplicitContentSettingsActivity;
import p.al5;
import p.i76;
import p.yf2;
import p.cw0;
import p.ow0;
import com.spotify.connectivity.connectiontype.ConnectionType;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import p.vg0;
import p.nm3;
import p.f15;
import java.lang.Class;
import p.g15;
import com.spotify.litesettings.settings.PrivateSettingsActivity;

public final class ci4 implements aw6	// class@001212 from classes.dex
{
    public final int a;
    public final Object b;

    public void ci4(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object get(){
       ci4 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return new g15(tb);
           case 1:
             return tb.b;
           case 2:
             return Boolean.valueOf(tb.p.getConnectionType().isCellularNetwork());
           case 3:
             return Boolean.valueOf((tb.Q.c.distinctUntilChanged().map(new i76(20)).blockingFirst().booleanValue() ^ 0x01));
           case 4:
             OfflineSettingsActivity q = tb.Q;
             return q.d.r(q.a).blockingFirst();
           default:
             PrivateSettingsActivity q1 = tb.Q;
             return q1.e.r(q1.a).blockingFirst();
       }
    }
}
