package p.so3;
import p.k33;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.bf5;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.rxjava3.core.Single;
import p.rf5;
import p.ew0;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.we6;
import java.util.Objects;
import p.po3;
import p.zv6;
import p.qo3;
import p.cv2;
import p.j33;
import p.ro3;
import p.qg2;
import p.pl0;
import p.p54;
import io.reactivex.rxjava3.core.Observable;
import p.bm;
import p.bi5;
import io.reactivex.rxjava3.core.Completable;
import p.ff5;

public final class so3 implements k33	// class@00266a from classes.dex
{
    public final rf5 b;
    public final ew0 c;
    public final MetadataRoomDatabase d;
    public final Single e;
    public final Single f;
    public static final Single g;

    static {
       so3.g = Single.just(new bf5(new IllegalArgumentException("Invalid event type")));
    }
    public void so3(rf5 p0,ew0 p1,MetadataRoomDatabase p2,InternetMonitor p3,we6 p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       Objects.requireNonNull(p3);
       this.e = Single.defer(new po3(p3, 0));
       this.f = Single.defer(new qo3(p4, 0, p3));
    }
    public final Single a(cv2 p0){
       return p0.a(new j33(7), new j33(8), new ro3(this, 0), new ro3(this, 1), new j33(9), new j33(10), new ro3(this, 2));
    }
    public final pl0 b(){
       return this.b.f().filter(new bm(4)).take(1).ignoreElements().t(new ff5());
    }
}
