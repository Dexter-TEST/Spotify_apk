package p.bw0;
import java.lang.Object;
import com.spotify.playerlimited.player.models.OfflineState;
import p.r45;
import java.lang.String;

public final class bw0	// class@001147 from classes.dex
{
    public final Object a;
    public final boolean b;
    public final boolean c;
    public final r45 d;

    public void bw0(Object p0,OfflineState p1,r45 p2){
       super();
       this.a = p0;
       this.d = p2;
       this.b = "forced_offline".equals(p1.a);
       this.c = "online".equals(p1.a) ^ 0x01;
    }
}
