package p.hv0;
import p.a02;
import p.ta3;
import p.f91;
import p.tm5;
import java.lang.Object;
import android.content.Context;
import p.jp;
import p.vg0;
import p.cn3;
import p.as7;
import com.spotify.connectivity.MobileDeviceInfo;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import p.ps1;
import java.lang.Runnable;
import io.reactivex.rxjava3.core.Observable;
import p.tm3;
import p.aw6;
import p.g15;
import java.lang.String;
import p.co5;
import com.spotify.clientfoundations.jvm.jni.NativeClassLoader;
import com.spotify.clientfoundations.jvm.jni.NativeClassLoader$Companion;
import p.pv0;

public final class hv0 implements a02	// class@0018c9 from classes.dex
{
    public final tm5 a;
    public final tm5 b;
    public final tm5 c;
    public final tm5 d;
    public final tm5 e;
    public final tm5 f;
    public final tm5 g;
    public final tm5 h;
    public final tm5 i;
    public final tm5 j;

    public void hv0(ta3 p0,f91 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5,tm5 p6,tm5 p7,tm5 p8,tm5 p9){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
    }
    public final Object get(){
       Object obj = this.a.get();
       Object obj1 = this.c.get();
       Object obj2 = this.d.get();
       Object obj3 = this.e.get();
       Object obj4 = this.f.get();
       Object obj5 = this.g.get();
       Object obj6 = this.h.get();
       Runnable runnable = this.i.get();
       Object obj7 = this.j.get();
       Object obj8 = this.b.get().c.get();
       co5.o(obj, "context");
       co5.o(obj8, "okHttpClient");
       co5.o(obj1, "clientInfo");
       co5.o(obj2, "corePathResolver");
       co5.o(obj3, "wrappedRxRouter");
       co5.o(obj4, "mobileDeviceInfo");
       co5.o(obj5, "eventSenderCoreBridge");
       co5.o(obj6, "esperantoResolver");
       co5.o(runnable, "libraryLoader");
       co5.o(obj7, "connectionTypeObservable");
       runnable.run();
       NativeClassLoader.Companion.load();
       pv0 v0 = new pv0(obj, obj1, obj2, obj3, obj5, obj4, obj6, obj8, obj7);
       return v0;
    }
}
