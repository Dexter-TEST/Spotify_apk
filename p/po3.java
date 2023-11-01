package p.po3;
import p.zv6;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import java.lang.Object;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Observable;
import p.rm;
import p.yf2;
import io.reactivex.rxjava3.core.Maybe;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import java.util.Objects;
import p.jh2;
import p.k34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.a44;

public final class po3 implements zv6	// class@00229d from classes.dex
{
    public final int a;
    public final InternetMonitor b;

    public void po3(InternetMonitor p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       po3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             Maybe maybe = tb.getInternetState().map(new rm(11)).firstElement();
             Boolean fALSE = Boolean.FALSE;
             maybe.getClass();
             Objects.requireNonNull(fALSE, "item is null");
             k34 ok34 = new k34(maybe, new jh2(fALSE), 2);
             Objects.requireNonNull(fALSE, "defaultItem is null");
             return new a44(ok34, 1, fALSE).toMaybe();
       }
       return tb.isPermanentlyOffline();
    }
}
