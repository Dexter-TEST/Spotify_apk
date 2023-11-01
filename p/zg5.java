package p.zg5;
import p.m12;
import p.ti3;
import p.ah5;
import p.bh5;
import java.lang.Object;
import p.dp;
import java.lang.String;
import io.reactivex.rxjava3.core.Completable;
import p.aq6;
import p.td7;
import p.yp6;
import java.lang.Integer;
import com.spotify.playlist4.proto.Playlist4ApiProto$ListChanges;
import p.g16;
import p.b5;
import p.ok0;
import p.jk0;
import p.bo3;
import java.lang.IllegalArgumentException;
import java.lang.Exception;
import java.lang.StringBuilder;

public final class zg5	// class@002ef1 from classes.dex
{
    public final m12 a;
    public final ah5 b;
    public final bh5 c;
    public final dp d;

    public void zg5(m12 p0,ti3 p1,ah5 p2,bh5 p3){
       super();
       this.a = p0;
       this.d = new dp(p1, 3);
       this.b = p2;
       this.c = p3;
    }
    public final Completable a(String p0,String p1){
       aq6 uoaq6;
       aq6 t;
       aq6 b;
       if (p0 == null || p1 == null) {
          return Completable.h(new IllegalArgumentException(p0+'/'+p1));
       }
       if ((uoaq6 = td7.d(p0)) != null && ((t = uoaq6.t) != null && ((b = uoaq6.b) == yp6.A && b != yp6.B))) {
          return this.b.c(t, this.c.b(p1, Integer.valueOf(0), "add")).c(Completable.i(new g16(this, 15, uoaq6))).c(this.a.b());
       }
       return Completable.h(new IllegalArgumentException(p0));
    }
}
