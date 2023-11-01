package p.jm6;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.pb3;
import p.ne5;
import p.fq;
import android.content.Context;
import p.ps2;
import com.spotify.playback.playbacknative.AudioEffectsListener;
import p.oo;
import p.as7;
import p.wv0;
import java.lang.String;
import p.co5;
import p.vv0;
import p.i16;
import com.spotify.clientfoundations.esperanto.esperantocosmos.CosmosTransport;
import p.pi5;
import com.spotify.clientfoundations.esperanto.esperantocosmos.EsperantoRxRouter;
import p.ht0;
import p.os1;
import p.vg0;
import p.ej5;
import p.kf5;
import java.lang.StringBuilder;
import p.nm3;
import java.lang.Class;
import p.kq3;
import p.qu;
import p.ye7;
import com.spotify.connectivity.MobileDeviceInfo;
import com.spotify.connectivity.systeminfo.MobileDeviceInfoDefaults;
import com.spotify.clientfoundations.core.core.DeviceType;
import p.ti3;
import p.nd1;
import p.qv0;
import p.cw0;
import p.ew0;
import p.h94;
import p.t05;
import p.j05;
import com.squareup.moshi.Moshi;
import p.yc4;
import p.bh5;
import p.tm3;
import p.qc0;
import p.uo3;
import p.ti4;
import p.fp3;
import p.rf5;
import p.hy5;
import p.eo3;
import p.do3;
import p.p54;
import io.reactivex.rxjava3.core.Observable;
import p.rp;
import p.bi5;
import p.xl6;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.yl6;
import p.w15;
import io.reactivex.rxjava3.core.Maybe;
import p.y15;
import p.ac;
import p.pi7;
import p.ys6;
import p.sa1;
import p.rr3;
import p.qr3;
import p.t74;
import p.ab3;
import p.im6;
import p.yg5;

public final class jm6 implements a02	// class@001b07 from classes.dex
{
    public final int a;
    public final tm5 b;

    public void jm6(tm5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public static jm6 a(tm5 p0){
       return new jm6(p0, 0);
    }
    public static jm6 b(tm5 p0){
       return new jm6(p0, 14);
    }
    public static jm6 c(tm5 p0){
       return new jm6(p0, 29);
    }
    public final pb3 d(){
       jm6 tb = this.b;
       switch (this.a){
           case 15:
             return new fq(1, tb.get());
           case 17:
             return new fq(2, tb.get());
           default:
             return new fq(3, tb.get().d);
       }
    }
    public final Object get(){
       int i = 1;
       jm6 tb = this.b;
       switch (this.a){
           case 0:
             return new im6(tb.get());
           case 1:
             return new ab3(tb.get());
           case 2:
             return new qr3(tb.get());
           case 3:
             return new sa1(tb.get());
           case 4:
             return new pi7(tb.get());
           case 5:
             return new w15(new y15(tb.get()));
           case 6:
             w15 a = tb.get().a;
             co5.n(a);
             return a;
           case 7:
             return new yl6(tb.get());
           case 8:
             Observable observable = tb.get().i.hide().filter(new rp(5)).map(new xl6(0)).observeOn(id.a()).filter(new rp(6)).map(new xl6(i)).distinctUntilChanged();
             co5.n(observable);
             return observable;
           case 9:
             return new do3(tb.get());
           case 10:
             return new hy5(tb.get());
           case 11:
             return new fp3(tb.get());
           case 12:
             return new uo3(tb.get());
           case 13:
             return new tm3(nd1.a(tb));
           case 14:
             return new bh5(tb.get());
           case 15:
             return this.d();
           case 16:
             return yc4.c(tb.get());
           case 17:
             return this.d();
           case 18:
             return this.d();
           case 19:
             return new j05(tb.get());
           case 20:
             return new t05(tb.get());
           case 21:
             return new h94(i, tb.get());
           case 22:
             return new ew0(tb.get());
           case 23:
             return new qv0(nd1.a(tb));
           case 24:
             MobileDeviceInfo mobileDevice = MobileDeviceInfoDefaults.defaults();
             DeviceType tABLET = (ye7.G(tb.get()))? DeviceType.TABLET: DeviceType.SMARTPHONE;
             mobileDevice.setDeviceType(tABLET.getValue());
             return mobileDevice;
             break;
           case 25:
             ej5 uoej5 = kf5.a("lite");
             tb.get().getClass();
             uoej5.j("1.9.0.49155_"+kq3.a);
             return uoej5.c();
           case 26:
             i16 oi16 = tb.get();
             co5.o(oi16, "rxRouter");
             return new os1(new ht0(new CosmosTransport(new pi5(oi16, 3))));
           case 27:
             as7 uoas7 = tb.get();
             co5.o(uoas7, "router");
             return new vv0(uoas7);
           case 28:
             return new oo(tb.get());
           default:
             return new yg5(nd1.a(tb));
       }
    }
}
