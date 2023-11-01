package p.qn3;
import p.yf2;
import p.aq6;
import java.lang.Object;
import java.util.Set;
import p.y15;
import java.lang.Boolean;
import java.lang.String;
import android.support.v4.media.MediaMetadataCompat;
import p.ox7;

public final class qn3 implements yf2	// class@0023d9 from classes.dex
{
    public final int a;
    public final aq6 b;

    public void qn3(aq6 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       qn3 tb = this.b;
       switch (this.a){
           case 0:
             return Boolean.valueOf(p0.contains(tb.toString()));
           case 1:
             return Boolean.valueOf(p0.contains(tb.t));
           default:
             return Boolean.valueOf(tb.toString().equals(ox7.o(p0, "spotify.media.metadata.PENDING_CONTEXT_URI")));
       }
    }
}
