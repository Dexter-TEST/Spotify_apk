package p.as1;
import p.yf2;
import p.bs1;
import java.lang.Object;
import com.spotify.offline_esperanto.proto.EsOffline$TotalProgressResponse;
import com.spotify.offline_esperanto.proto.EsOffline$Progress;
import java.lang.String;
import p.co5;
import java.lang.Class;
import com.spotify.playerlimited.player.models.OfflineProgress;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Boolean;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsResponse;
import com.spotify.playerlimited.player.models.OfflineTracksResources;
import p.bc3;
import java.util.ArrayList;

public final class as1 implements yf2	// class@000fe1 from classes.dex
{
    public final int a;
    public final bs1 b;

    public void as1(bs1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       as1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             OfflineTracksResources offlineTrack = new OfflineTracksResources();
             p0 = p0.f();
             co5.l(p0, "contextResponse.contextsList");
             p0 = bs1.a(tb, p0);
             if (!p0.isEmpty()) {
                offlineTrack.a = p0;
             }
             return offlineTrack;
       }
       p0 = p0.f();
       co5.l(p0, "progress.progress");
       tb.getClass();
       OfflineProgress offlineProgr = new OfflineProgress();
       offlineProgr.a = Integer.valueOf((int)p0.m());
       offlineProgr.b = Long.valueOf(p0.l());
       offlineProgr.c = Integer.valueOf((int)p0.i());
       offlineProgr.d = Long.valueOf(p0.h());
       offlineProgr.e = Integer.valueOf((int)p0.p());
       offlineProgr.f = Long.valueOf(p0.o());
       offlineProgr.h = Integer.valueOf((int)p0.g());
       offlineProgr.i = Float.valueOf(p0.k());
       offlineProgr.j = Long.valueOf(p0.n());
       offlineProgr.g = Boolean.valueOf(p0.j());
       return offlineProgr;
    }
}
