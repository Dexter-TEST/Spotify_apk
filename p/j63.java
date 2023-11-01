package p.j63;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.ta3;
import java.lang.String;
import p.vg0;
import java.lang.StringBuilder;
import p.nm3;
import android.os.Build$VERSION;
import android.os.Build;
import p.xj0;
import p.co5;
import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Locale;
import p.g15;
import p.aw6;
import p.i12;
import p.tn6;
import p.wp3;
import p.jq3;
import p.fq3;
import p.np3;
import p.mp3;
import p.dp3;
import p.ap3;
import p.bp3;
import p.hn3;
import p.cy5;
import p.os2;
import p.ps2;
import java.lang.Class;
import p.ds7;
import p.nm5;
import p.qu0;
import p.v06;
import p.u90;
import p.xs7;
import p.pb3;
import java.util.Set;
import java.util.Collections;
import p.yc4;
import p.zg0;
import java.util.Random;
import p.ic;
import java.lang.System;
import p.xh2;
import p.pj0;
import p.w47;
import p.yr3;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.vy5;
import p.b17;
import p.ka4;
import p.lq7;
import p.a70;
import p.xy5;
import p.uf6;
import p.xp3;
import p.ov5;
import p.ti3;
import p.nd1;
import p.bi4;
import p.su1;
import p.t74;
import com.spotify.eventsender.corebridge.EventSenderCoreBridgeImpl;
import p.mp;
import java.util.Objects;
import p.bb3;
import com.android.installreferrer.api.InstallReferrerClient$Builder;
import com.android.installreferrer.api.InstallReferrerClient;
import p.iw3;
import p.ac;
import com.spotify.liteinstrumentation.instrumentation.LiteLifecycleLogger;

public final class j63 implements a02	// class@001a75 from classes.dex
{
    public final int a;
    public final tm5 b;

    public void j63(tm5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public static j63 a(ta3 p0){
       return new j63(p0, 28);
    }
    public final String b(){
       String str;
       TelephonyManager systemServic;
       j63 tb = this.b;
       switch (this.a){
           case 8:
           default:
             str = ((systemServic = tb.get().getSystemService("phone")) == null || (str = systemServic.getSimCountryIso()) == null)? "": str.toLowerCase(Locale.ROOT);
             co5.n(str);
             return str;
       }
       str = xj0.I0("Spotify-Lite/"+tb.get().a()+" Android/"+Build$VERSION.SDK_INT+" \("+Build.MODEL+')');
       co5.n(str);
       return str;
    }
    public final g15 c(){
       g15 og15;
       j63 tb = this.b;
       switch (this.a){
           case 10:
           default:
             og15 = tb.get().get();
             co5.n(og15);
             return og15;
       }
       og15 = tb.get().get();
       co5.n(og15);
       return og15;
    }
    public final Object get(){
       Context uContext;
       int i = 2;
       boolean b = true;
       Object obj = null;
       j63 tb = this.b;
       switch (this.a){
           case 0:
             return new iw3(tb.get());
           case 1:
             uContext = tb.get();
             co5.o(uContext, "context");
             InstallReferrerClient installRefer = InstallReferrerClient.newBuilder(uContext.getApplicationContext()).build();
             co5.l(installRefer, "newBuilder\(context.applicationContext\).build\(\)");
             return installRefer;
           case 2:
             mp omp = tb.get();
             Objects.requireNonNull(omp);
             return new bb3(omp);
           case 3:
             EventSenderCoreBridgeImpl uEventSender = tb.get();
             co5.n(uEventSender);
             return uEventSender;
           case 4:
             return new EventSenderCoreBridgeImpl(tb.get());
           case 5:
             return new t74(tb.get());
           case 6:
             return new bi4(nd1.a(tb), 0);
           case 7:
             return new ov5(tb.get());
           case 8:
             return this.b();
           case 9:
             pb3 opb3 = tb.get();
             co5.n(opb3);
             return opb3;
           case 10:
             return this.c();
           case 11:
             co5.o(tb.get(), "clientInfo");
             return new uf6(xp3.a);
           case 12:
             uContext = tb.get();
             vy5 ovy5 = b17.i(uContext.getApplicationContext(), MetadataRoomDatabase.class, "metadata.db");
             ovy5.l = false;
             ovy5.m = b;
             ka4[] oka4Array = new ka4[]{new lq7(6, obj),new lq7(7),new lq7(8),new lq7(9, 0),new lq7(10)};
             ovy5.a(oka4Array);
             ovy5.i = new a70(uContext);
             return ovy5.b();
           case 13:
             return this.b();
           case 14:
             w47[] ow47Array = new w47[i];
             ow47Array[0] = tb.get();
             ow47Array[b] = new yr3();
             return new pj0(ow47Array);
           case 15:
             tb.get().getClass();
             return new Random(System.currentTimeMillis());
           case 16:
             yc4 oyc4 = tb.get();
             co5.n(oyc4);
             return oyc4;
           case 17:
             return this.c();
           case 18:
             Set set = Collections.singleton(tb.get());
             co5.n(set);
             return set;
           case 19:
             cy5 uocy5 = tb.get();
             os2 i1 = new os2();
             i1.f(obj, "https://spclient.wg.spotify.com/");
             uocy5.getClass();
             ds7 uods7 = new ds7(uocy5);
             uods7.d(i1.b());
             uods7.b(new nm5());
             uods7.a(v06.b());
             xs7 oxs7 = uods7.e().b(xs7.class);
             co5.n(oxs7);
             return oxs7;
           case 20:
             return new hn3(tb.get());
           case 21:
             return new bp3(tb.get());
           case 22:
             return new dp3(tb.get());
           case 23:
             return new mp3(tb.get());
           case 24:
             return new np3(tb.get());
           case 25:
             return new fq3(tb.get());
           case 26:
             return new jq3(tb.get());
           case 27:
             return new wp3(tb.get());
           case 28:
             return new i12(tb.get());
           default:
             return new LiteLifecycleLogger(tb.get());
       }
    }
}
