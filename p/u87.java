package p.u87;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.ta3;
import p.wd0;
import p.jm6;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.messaging.quicksilverliteintegration.DisplayOrchestrator;
import androidx.fragment.app.k;
import p.tj5;
import p.w12;
import p.j83;
import p.ae2;
import android.content.Context;
import p.dl2;
import p.a7;
import p.xk2;
import p.im6;
import p.hm6;
import p.mt6;
import p.rf5;
import p.ew0;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.zg0;
import p.ut6;
import p.oi4;
import p.dp3;
import p.qi4;
import p.or3;
import p.ur3;
import java.util.EnumSet;
import p.yo3;
import p.qr3;
import p.q6;
import p.l32;
import p.we6;
import p.tn6;
import p.eq3;
import p.bq3;
import p.it0;
import p.g94;
import p.cm7;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.nx6;
import p.fa4;
import java.util.Set;
import android.os.Looper;
import java.lang.String;
import p.jl;
import java.lang.Class;
import p.wp3;
import p.rn6;
import p.f15;
import p.a90;
import java.io.File;
import java.util.Iterator;
import p.pb3;
import p.co5;
import java.util.ArrayList;
import p.yz6;
import javax.net.ssl.SSLSocketFactory;
import p.ci4;
import java.lang.IllegalArgumentException;
import p.so3;
import p.c81;
import java.util.concurrent.Executor;
import p.y84;
import p.fr7;
import p.wv1;
import p.zx6;
import p.t87;
import p.ah0;
import p.j36;
import p.md7;
import p.sq7;
import p.qt5;
import p.ns7;
import p.qs7;
import io.reactivex.rxjava3.core.Scheduler;
import p.ps7;

public final class u87 implements a02	// class@002864 from classes.dex
{
    public final int a;
    public final tm5 b;
    public final tm5 c;
    public final tm5 d;
    public final tm5 e;
    public final tm5 f;

    public void u87(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,int p5){
       this.a = p5;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public static u87 a(tm5 p0,tm5 p1,ta3 p2,wd0 p3,tm5 p4){
       u87 v7 = new u87(p0, p1, p2, p3, p4, 10);
       return v7;
    }
    public static u87 b(ta3 p0,tm5 p1,tm5 p2,tm5 p3,jm6 p4){
       u87 v7 = new u87(p0, p1, p2, p3, p4, 9);
       return v7;
    }
    public final Object get(){
       t87 v1;
       String str;
       pb3 opb3;
       u87 ou87 = this;
       u87 f = ou87.f;
       u87 e = ou87.e;
       u87 d = ou87.d;
       u87 c = ou87.c;
       u87 b = ou87.b;
       switch (ou87.a){
           case 0:
             v1 = new t87(b.get(), c.get(), d.get(), e.get(), f.get());
             return v1;
           case 1:
             c81 v11 = new c81(b.get(), c.get(), d.get(), e.get(), f.get());
             return v1;
           case 2:
             so3 v12 = new so3(b.get(), c.get(), d.get(), e.get(), f.get());
             return v1;
           case 3:
             Context uContext = b.get();
             mt6 omt6 = c.get();
             Set set = d.get();
             Set set1 = e.get();
             we6 owe6 = f.get();
             boolean b1 = (Looper.myLooper() != Looper.getMainLooper())? true: false;
             jl.h(b1, "OkHttp created on the main thread");
             omt6.getClass();
             long l = owe6.a.b(wp3.x, (eq3.j / 4));
             f15 uof15 = new f15();
             if ((l) > 0) {
                File uFile = new File(uContext.getApplicationContext().getCacheDir(), "view-cache");
                if (!uFile.exists()) {
                   uFile.mkdirs();
                }
                uof15.k = new a90(uFile, l);
             }else {
                jl.p("No memory for view cache");
             }
             Iterator iterator = set.iterator();
             while (true) {
                str = "interceptor";
                if (iterator.hasNext()) {
                   opb3 = iterator.next();
                   co5.o(opb3, str);
                   uof15.c.add(opb3);
                }else {
                   break ;
                }
             }
             iterator = set1.iterator();
             while (iterator.hasNext()) {
                opb3 = iterator.next();
                co5.o(opb3, str);
                uof15.d.add(opb3);
             }
             yz6 oyz6 = new yz6();
             if ((oyz6 instanceof SSLSocketFactory ^ 1)) {
                if (!co5.c(oyz6, uof15.p)) {
                   uof15.D = null;
                }
                uof15.p = oyz6;
                return new ci4(0, uof15);
             }else {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
             }
             break;
           case 4:
             nx6 f1 = new nx6(b.get(), c.get(), d.get(), e.get(), f.get());
             return f;
           case 5:
             eq3 f2 = new eq3(b.get(), c.get(), d.get(), e.get(), f.get());
             return f;
           case 6:
             yo3 f3 = new yo3(b.get(), c.get(), d.get(), e.get(), f.get());
             return f;
           case 7:
             qi4 v13 = new qi4(b.get(), c.get(), d.get(), e.get(), f.get());
             return v1;
           case 8:
             ut6 v14 = new ut6(b.get(), c.get(), d.get(), e.get(), f.get());
             return v1;
           case 9:
             hm6 v15 = new hm6(b.get(), c.get(), d.get(), e.get(), f.get());
             return v1;
           case 10:
             j83 f4 = new j83(b.get(), c.get(), d.get().y(), e.get(), f.get());
             return f;
           default:
             ps7 v16 = new ps7(b.get(), c.get(), d.get(), e.get(), f.get());
             return v1;
       }
    }
}
