package p.wd0;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.ta3;
import p.w47;
import java.lang.String;
import p.co5;
import p.z37;
import p.ld;
import p.em0;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import p.zg0;
import p.sc4;
import java.util.Set;
import p.l16;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Iterator;
import p.r81;
import java.util.ArrayList;
import p.y87;
import p.q97;
import p.tu1;
import p.l83;
import p.n74;
import p.tj5;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observable;
import android.content.Context;
import java.util.EnumMap;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.ActionType;
import java.lang.Class;
import p.m83;
import p.ti3;
import p.nd1;
import com.spotify.messaging.quicksilverliteintegration.DisplayOrchestrator;
import p.t73;
import p.s73;
import p.gz3;
import p.uy3;
import p.yy3;
import p.oo0;
import p.zc;
import android.app.Activity;
import p.xk2;
import p.hl2;
import p.dl2;
import p.n01;
import java.lang.Boolean;
import p.li5;
import p.o01;
import p.m01;
import p.mp;
import p.hv3;
import p.g8;
import p.yi0;
import p.f8;
import p.lq3;
import p.e61;
import p.ew0;
import p.un1;
import p.mt6;
import p.bt6;
import p.we6;
import p.ce0;
import p.vd0;
import p.xh2;

public final class wd0 implements a02	// class@002b11 from classes.dex
{
    public final int a;
    public final tm5 b;

    public void wd0(tm5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public static wd0 a(ta3 p0){
       return new wd0(p0, 13);
    }
    public static wd0 b(tm5 p0){
       return new wd0(p0, 14);
    }
    public final Object get(){
       Context uContext;
       dl2 uodl2;
       q97 g;
       int i = 2;
       n01 int i1 = 1;
       int i2 = 0;
       switch (this.a){
           case 0:
             return new vd0(this.b.get());
           case 1:
             return new ce0(this.b.get());
           case 2:
             return new bt6(this.b.get());
           case 3:
             return new un1(this.b.get());
           case 4:
             return new e61(this.b.get());
           case 5:
             return new f8(this.b.get(), i2);
           case 6:
             return new g8(this.b.get(), i2);
           case 7:
             return new f8(this.b.get(), i1);
           case 8:
             return new g8(this.b.get(), i1);
           case 9:
             return new f8(this.b.get(), i);
           case 10:
             return new yi0(this.b.get());
           case 11:
             return new g8(this.b.get(), i);
           case 12:
             return new hv3(this.b.get());
           case 13:
             uContext = this.b.get();
             co5.o(uContext, "context");
             if (!hl2.c.d(uContext)) {
                i1 = new n01();
                i1.b = Boolean.TRUE;
                uodl2 = new dl2(new m01(uContext, new o01(i1)));
             }else {
                uodl2 = null;
             }
             return uodl2;
             break;
           case 14:
             return new xk2(this.b.get());
           case 15:
             oo0 ooo0 = this.b.get();
             co5.o(ooo0, "configProvider");
             return new zc(i2, i2, i2, ooo0);
           case 16:
             return new uy3(this.b.get());
           case 17:
             return new yy3(this.b.get());
           case 18:
             return new gz3(this.b.get());
           case 19:
             return new s73(this.b.get());
           case 20:
             return new DisplayOrchestrator(nd1.a(this.b));
           case 21:
             uContext = this.b.get();
             EnumMap uEnumMap = new EnumMap(ActionType.class);
             uEnumMap.put(ActionType.URL, new m83(uContext, i2));
             uEnumMap.put(ActionType.EXTERNAL_URL, new m83(uContext, i1));
             uEnumMap.put(ActionType.IAP, new m83(uContext, i));
             return uEnumMap;
           case 22:
             y87 a = this.b.get().a;
             Observable observable = a.e.a.mergeWith(a.g.b.a);
             co5.n(observable);
             return observable;
           case 23:
             return new l83(this.b.get());
           case 24:
             g = this.b.get().g;
             co5.n(g);
             return g;
           case 25:
             g = this.b.get().a.d;
             co5.n(g);
             return g;
           case 26:
             l16 ol16 = new l16(s36.b);
             Iterator iterator = this.b.get().iterator();
             while (iterator.hasNext()) {
                ol16.c.add(iterator.next());
             }
             return ol16;
             break;
           case 27:
             return new sc4(this.b.get());
           case 28:
             w47 ow47 = this.b.get();
             co5.o(ow47, "timeReporter");
             ld a1 = z37.a;
             a1.c = ow47;
             a1.b.execute(new em0(26, a1));
             return a1;
           default:
             return new xh2(this.b.get());
       }
    }
}
