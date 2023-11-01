package p.a94;
import p.yf2;
import java.lang.Object;
import com.spotify.lite.metadata.MetadataCleanUpBackgroundWork$CleanUpWorker;
import p.em3;
import p.co3;
import java.lang.Long;
import p.tn6;
import p.ok0;
import p.ko1;
import p.pl0;
import io.reactivex.rxjava3.core.Completable;
import p.rn6;

public final class a94 implements yf2	// class@000f3b from classes.dex
{
    public final int a;
    public final long b;
    public final Object c;

    public void a94(int p0,long p1,Object p2){
       this.a = p0;
       this.c = p2;
       this.b = p1;
       super();
    }
    public final Object apply(Object p0){
       a94 tb = this.b;
       a94 tc = this.c;
       switch (this.a){
           case 0:
           default:
             return Long.valueOf(p0.b(tc, tb));
       }
       MetadataCleanUpBackgroundWork$CleanUpWorker y = tc.y;
       return y.g.s(y.i, Long.valueOf(tb)).t(p0);
    }
}
