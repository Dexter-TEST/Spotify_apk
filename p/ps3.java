package p.ps3;
import p.a02;
import java.lang.Object;
import java.util.EnumSet;
import p.wr3;
import java.lang.Enum;
import p.co5;
import java.lang.Class;
import java.lang.Integer;
import p.as7;
import java.util.HashSet;
import p.n83;
import p.c0;
import p.t00;
import p.t2;
import p.p05;
import p.os2;
import p.ps2;
import java.lang.String;
import p.s36;
import p.v06;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.NullPointerException;
import p.nm5;
import com.spotify.hubs.moshi.HubsMoshiAdapterFactory;
import p.qx0;
import com.google.common.collect.d;
import java.util.Set;
import com.squareup.moshi.Moshi;
import p.zc4;
import p.mn2;
import p.pf1;
import p.oi4;
import p.un2;
import p.q6;
import p.rq2;
import com.spotify.litecomponents.snackalog.a;
import p.l32;
import p.in3;
import p.wm3;
import p.eo3;
import java.lang.Boolean;
import p.kt5;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Observable;
import p.xi5;

public final class ps3 implements a02	// class@0022c0 from classes.dex
{
    public final int a;

    public void ps3(int p0){
       this.a = p0;
       super();
    }
    public final EnumSet a(){
       EnumSet uEnumSet;
       switch (this.a){
           case 0:
           default:
             uEnumSet = EnumSet.allOf(wr3.class);
             co5.n(uEnumSet);
             return uEnumSet;
       }
       uEnumSet = EnumSet.of(wr3.w);
       co5.n(uEnumSet);
       return uEnumSet;
    }
    public final Object get(){
       Boolean fALSE;
       Scheduler c;
       Integer integer = Integer.valueOf(500);
       Integer integer1 = Integer.valueOf(0x2710);
       int i = 0;
       ps3 ta = this.a;
       switch (ta){
           case 0:
             return this.a();
           case 1:
             switch (ta){
                 case 1:
                   integer = integer1;
                   break;
                 default:
             }
             return integer;
             break;
           case 2:
             switch (ta){
                 case 1:
                   integer = integer1;
                   break;
                 default:
             }
             return integer;
             break;
           case 3:
             return this.a();
           case 4:
             Observable observable = Observable.interval(0, 15, TimeUnit.SECONDS, s36.b);
             co5.n(observable);
             return observable;
           case 5:
             return kt5.a;
           case 6:
             switch (ta){
                 case 6:
                   fALSE = Boolean.FALSE;
                   break;
                 default:
                   fALSE = Boolean.FALSE;
             }
             return fALSE;
             break;
           case 7:
             switch (ta){
                 case 6:
                   fALSE = Boolean.FALSE;
                   break;
                 default:
                   fALSE = Boolean.FALSE;
             }
             return fALSE;
             break;
           case 8:
             return new eo3();
           case 9:
             return new wm3();
           case 10:
             return new in3();
           case 11:
             return new l32();
           case 12:
             return new a();
           case 13:
             return new rq2();
           case 14:
             return new q6();
           case 15:
             return new un2();
           case 16:
             return new oi4();
           case 17:
             return new pf1();
           case 18:
             return new mn2();
           case 19:
             Object[] objArray = new Object[]{new HubsMoshiAdapterFactory(),new qx0()};
             return zc4.a(d.n(2, objArray));
           case 20:
             return new nm5();
           case 21:
             if ((c = s36.c) != null) {
                return new v06(c, i);
             }
             throw new NullPointerException("scheduler == null");
             break;
           case 22:
             os2 integer2 = new os2();
             integer2.f(null, "https://spclient.wg.spotify.com/");
             return integer2.b();
           case 23:
             return new p05();
           case 24:
             return new t2();
           case 25:
             return t00.b(c0.a);
           case 26:
             return new n83();
           case 27:
             return new HashSet(i);
           case 28:
             return new as7();
           default:
             return "vivo_preload";
       }
    }
}
