package p.nx6;
import p.it0;
import p.g94;
import p.cm7;
import p.fa4;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import java.lang.Object;
import java.lang.String;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Integer;
import p.w51;
import p.k73;
import p.dt5;
import java.util.Map;
import io.reactivex.rxjava3.core.Single;
import p.c16;
import p.yf2;

public final class nx6	// class@00206c from classes.dex
{
    public final it0 a;
    public final g94 b;
    public final cm7 c;
    public final fa4 d;
    public final InternetMonitor e;

    public void nx6(it0 p0,g94 p1,cm7 p2,fa4 p3,InternetMonitor p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static Observable a(cm7 p0,String p1,int p2){
       Integer integer = Integer.valueOf(50);
       Integer integer1 = Integer.valueOf(p2);
       w51.f("limit", integer);
       w51.f("offset", integer1);
       Object[] objArray = new Object[]{"limit",integer,"offset",integer1};
       return p0.b(p1, dt5.k(2, objArray, null)).toObservable().concatMap(new c16(4, p0, p1));
    }
}
