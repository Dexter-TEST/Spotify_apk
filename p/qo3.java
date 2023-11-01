package p.qo3;
import p.zv6;
import java.lang.Object;
import p.m94;
import p.aq6;
import java.lang.Class;
import p.yp6;
import java.lang.String;
import p.ys5;
import com.google.common.collect.c;
import java.util.List;
import io.reactivex.rxjava3.core.Completable;
import p.ew0;
import p.bm;
import p.bi5;
import p.jk0;
import p.i77;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.zy5;
import p.xy5;
import p.f77;
import java.util.concurrent.Callable;
import p.v72;
import p.h16;
import p.i72;
import io.reactivex.rxjava3.core.Flowable;
import p.c16;
import p.qa2;
import p.yf2;
import p.we6;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.wp3;
import p.tn6;
import io.reactivex.rxjava3.core.Observable;
import p.ko1;
import io.reactivex.rxjava3.core.Single;
import p.gr7;
import io.reactivex.rxjava3.core.SingleSource;
import p.pg2;
import p.zg0;
import p.ic;
import java.lang.System;
import p.g56;

public final class qo3 implements zv6	// class@0023e2 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void qo3(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final Object get(){
       jk0 ojk0;
       qo3 tc = this.c;
       qo3 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             tb.getClass();
             if (tc.b == yp6.m0) {
                ojk0 = tb.b.a(tc, c.r(tc.toString())).n(new bm(6));
             }else {
                i77 oi77 = tb.a.B();
                String str = tc.toString();
                oi77.getClass();
                int i = 1;
                zy5 ozy5 = zy5.x(i, "SELECT\n    track_rows.track_uri\nFROM track_rows WHERE track_rows.parent_uri = ?\nORDER BY track_rows.position ASC");
                if (str == null) {
                   ozy5.z(i);
                }else {
                   ozy5.s(i, str);
                }
                String[] stringArray = new String[]{"track_rows"};
                ojk0 = new qa2(h16.a(oi77.a, false, stringArray, new f77(oi77, ozy5, 3)).g(), new c16(tb, 2, tc), false, false).n(new bm(7));
             }
             return ojk0;
             break;
           default:
             tb.getClass();
             long l = System.currentTimeMillis();
             return tc.z().a(String.valueOf(l), l).ignoreElement();
       }
       return Single.zip(tb.g.r(tb.a).firstOrError(), tb.h.r(tb.a).firstOrError(), tc.getInternetState().firstOrError(), new gr7(22));
    }
}
