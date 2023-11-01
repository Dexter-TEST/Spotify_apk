package p.eo1;
import p.og2;
import java.lang.Object;
import com.spotify.webapi.service.models.Playlist;
import p.or7;
import java.lang.Boolean;
import com.spotify.webapi.service.models.PlaylistBase;
import java.util.List;
import java.lang.String;
import p.ox7;
import p.us;
import p.zx2;
import p.yx2;
import p.tp2;
import java.lang.Integer;
import p.ht2;
import p.fu2;
import android.content.Context;
import p.ry7;
import java.lang.Enum;
import android.os.StrictMode$ThreadPolicy$Builder;

public final class eo1 implements og2	// class@0014c5 from classes.dex
{
    public final int a;

    public void eo1(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
             return p0.name();
           case 1:
             return Integer.valueOf(ry7.u(p0));
           case 2:
             return ht2.a(p0);
           case 3:
             tp2.v(p0);
             return ht2.b();
           case 4:
             return p0.a;
           case 5:
             or7 oor7 = new or7();
             oor7.c = Boolean.FALSE;
             oor7.a = p0.name;
             oor7.b = ox7.l(p0.images);
             return oor7.b();
           default:
             return p0.permitDiskReads();
       }
    }
}
