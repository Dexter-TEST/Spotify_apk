package p.c65;
import p.a02;
import java.lang.Object;
import io.reactivex.rxjava3.core.Scheduler;
import p.s36;
import p.co5;
import p.id;
import p.u67;
import java.lang.String;
import com.spotify.liteinstrumentation.instrumentation.eventsender.EventSenderAppForegroundState;
import p.z50;
import io.reactivex.rxjava3.core.Observable;
import p.cp;
import p.lu3;
import p.sn;
import java.lang.Boolean;
import p.x53;
import p.qf0;
import p.jd0;
import p.ix;
import p.rf0;
import p.ef6;
import p.by1;
import p.cp6;
import p.y50;
import p.uz0;
import p.ev0;
import p.vn6;
import p.hj4;
import p.gj4;
import p.fj4;
import p.b07;
import p.ds3;
import p.cp3;
import p.b65;
import p.cb3;

public final class c65 implements a02	// class@0011a7 from classes.dex
{
    public final int a;

    public void c65(int p0){
       this.a = p0;
       super();
    }
    public final Scheduler a(){
       Scheduler b;
       switch (this.a){
           case 9:
             b = s36.b;
             co5.n(b);
             return b;
           case 10:
             b = s36.c;
             co5.n(b);
             return b;
           default:
             return id.a();
       }
    }
    public final Object get(){
       lu3 e;
       u67 ou67;
       c65 ta = this.a;
       switch (ta){
           case 0:
             return new b65();
           case 1:
             return new cp3();
           case 2:
             return new ds3();
           case 3:
             return new b07(21);
           case 4:
             return new fj4();
           case 5:
             return new gj4();
           case 6:
             return new hj4();
           case 7:
             return new vn6();
           case 8:
             return ev0.b;
           case 9:
             return this.a();
           case 10:
             return this.a();
           case 11:
             return this.a();
           case 12:
             return new uz0();
           case 13:
             return new y50();
           case 14:
             return new cp6();
           case 15:
             return new by1();
           case 16:
             return new ef6();
           case 17:
             return new rf0();
           case 18:
             return new ix();
           case 19:
             return new jd0();
           case 20:
             return new qf0();
           case 21:
             return new x53();
           case 22:
             return Boolean.FALSE;
           case 23:
             return new sn();
           case 24:
             dt3 c = lu3.c;
             if (lu3.e == null) {
                _monitor_enter(c);
                lu3.e = new lu3();
                _monitor_exit(c);
             }
             if ((e = lu3.e) != null) {
                return e;
             }else {
                co5.N("instance");
                throw null;
             }
             break;
           case 25:
             Observable observable = Observable.just(new z50());
             co5.l(observable, "just\(\n            object…e\n            }\n        \)");
             return observable;
           case 26:
             return new EventSenderAppForegroundState();
           case 27:
             switch (ta){
                 case 27:
                   ou67 = new u67("small");
                   break;
                 default:
                   ou67 = new u67("toolbar");
             }
             return ou67;
             break;
           case 28:
             switch (ta){
                 case 27:
                   ou67 = new u67("small");
                   break;
                 default:
                   ou67 = new u67("toolbar");
             }
             return ou67;
             break;
           default:
             return new cb3();
       }
    }
}
