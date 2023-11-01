package p.gp6;
import p.a02;
import p.tm5;
import java.lang.Object;
import android.content.Context;
import p.c96;
import p.np3;
import p.zg5;
import p.e43;
import p.zm;
import p.t2;
import p.jp;
import p.l56;
import p.ou1;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import com.spotify.liteinstrumentation.instrumentation.eventsender.EventSenderAppForegroundState;
import java.util.Objects;
import p.uu1;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import p.co5;
import com.spotify.eventsender.eventsender.a;
import p.t00;
import p.hs3;
import p.vu1;
import p.ia5;
import p.of1;
import p.to6;
import p.bp3;
import p.in3;
import p.cp6;
import p.mb1;
import p.fp6;
import p.sg0;
import p.cy5;
import p.ew5;
import p.zg0;
import p.p40;
import p.y37;
import p.v40;

public final class gp6 implements a02	// class@001755 from classes.dex
{
    public final int a;
    public final tm5 b;
    public final tm5 c;
    public final tm5 d;
    public final tm5 e;
    public final tm5 f;
    public final tm5 g;

    public void gp6(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5,int p6){
       this.a = p6;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final Object get(){
       fp6 v0;
       a v8;
       switch (this.a){
           case 0:
             v0 = new fp6(this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
             return v0;
           case 1:
             Object obj = this.b.get();
             jp ojp = this.c.get();
             Object obj1 = this.d.get();
             Object obj2 = this.e.get();
             Objects.requireNonNull(ojp);
             uu1 ouu1 = new uu1(ojp);
             Observable observable = this.f.get().isConnectedObservable();
             EventSenderAppForegroundState a = this.g.get().a;
             co5.o(obj, "context");
             co5.o(obj1, "sdkConfiguration");
             co5.o(obj2, "eventOwnerProvider");
             co5.o(observable, "connectivityObserver");
             co5.o(a, "appForegroundState");
             uu1 ouu11 = ouu1;
             v8 = new a(obj, ouu11, obj1, obj2, observable, a);
             _monitor_enter(v8);
             if (v8.i != null) {
                v8.c.b.a("Already started, Ignoring!");
             }else {
                v8.i = true;
                v8.d.a(v8.b);
                v8.e.a();
             }
             _monitor_exit(v8);
             return v8;
             break;
           case 2:
             zm v81 = new zm(this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
             return v8;
           default:
             v40 v01 = new v40(this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
             return v0;
       }
    }
}
