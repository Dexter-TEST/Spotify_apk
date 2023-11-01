package p.if4;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import java.lang.Object;
import io.reactivex.rxjava3.core.ObservableEmitter;
import com.spotify.clientfoundations.esperanto.esperantoimpl.NativeTransport;
import java.lang.String;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import android.os.Handler;
import android.content.ContentResolver;
import android.net.Uri;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.Single;
import p.yf2;
import p.fn0;
import p.zl7;
import p.hi6;
import p.tb0;
import p.bm7;
import p.am7;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;

public final class if4 implements ObservableOnSubscribe, SingleOnSubscribe	// class@001982 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object t;
    public final Object v;

    public void if4(Object p0,Object p1,Object p2,Object p3,int p4){
       this.a = p4;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       super();
    }
    public void subscribe(ObservableEmitter p0){
       if4 tv = this.v;
       if4 tt = this.t;
       if4 tc = this.c;
       if4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             MobileDataDisabledMonitor.a(tb, tc, tt, tv, p0);
             return;
       }
       NativeTransport.a(tb, tc, tt, tv, p0);
       return;
    }
    public void subscribe(SingleEmitter p0){
       if4 tv = this.v;
       if4 tt = this.t;
       if4 tc = this.c;
       if4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             fn0 uofn0 = new fn0();
             p0.setCancellable(new zl7(0, uofn0));
             bm7 tv1 = new bm7(p0, uofn0, tc, tt, tv);
             uofn0.c(tb.subscribe(tv, new am7(p0, 0)));
             return;
       }
       NativeTransport.b(tb, tc, tt, tv, p0);
       return;
    }
}
