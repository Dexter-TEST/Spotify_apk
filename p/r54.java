package p.r54;
import p.zf2;
import p.gi3;
import com.spotify.localfiles.mediastore.MediaStoreReader;
import java.lang.Object;
import p.jc7;
import java.lang.Number;

public final class r54 extends gi3 implements zf2	// class@00247d from classes.dex
{
    public final int a;
    public final MediaStoreReader b;

    public void r54(MediaStoreReader p0,int p1){
       this.a = p1;
       this.b = p0;
       super(1);
    }
    public final void a(long p0){
       r54 tb = this.b;
       switch (this.a){
           case 0:
             MediaStoreReader.access$onChange(tb, p0);
             return;
           case 1:
             MediaStoreReader.access$prepareForShutdown(tb, p0);
             return;
           default:
             MediaStoreReader.access$freeHandle(tb, p0);
             return;
       }
    }
    public final Object invoke(Object p0){
       jc7 a = jc7.a;
       switch (this.a){
           case 0:
             this.a(p0.longValue());
             return a;
           case 1:
             this.a(p0.longValue());
             return a;
           default:
             this.a(p0.longValue());
             return a;
       }
    }
}
