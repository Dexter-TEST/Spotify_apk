package p.kg1;
import p.yf2;
import p.ng1;
import java.lang.Object;
import p.vs;
import java.lang.Class;
import p.aw1;
import p.t67;
import java.util.List;
import java.util.Collection;
import com.google.common.collect.c;
import java.lang.Integer;
import p.q65;
import com.spotify.webapi.service.models.Entity;
import java.lang.String;
import com.spotify.webapi.service.models.Track;
import com.spotify.webapi.service.models.TrackSimple;
import com.spotify.webapi.service.models.LinkedTrack;
import p.aq6;
import p.m65;
import p.yp6;
import p.rg1;
import p.td7;
import java.lang.IllegalArgumentException;
import java.lang.Exception;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.bo3;
import com.spotify.playlist4.proto.Playlist4ApiProto$ListChanges;
import p.bh5;
import p.ah5;
import p.g16;
import p.b5;
import p.jk0;
import p.pl0;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import p.ox7;
import p.hv5;
import p.wd5;
import android.graphics.Bitmap;
import p.uv1;
import p.d26;
import p.x65;
import p.z65;
import p.l75;
import p.lv1;
import p.ej0;
import p.dt5;
import p.m73;
import java.util.Map;
import p.cm7;
import p.rm;
import p.l51;
import java.util.concurrent.TimeoutException;
import java.lang.Throwable;
import p.up0;

public final class kg1 implements yf2	// class@001c07 from classes.dex
{
    public final int a;
    public final ng1 b;

    public void kg1(ng1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       d26 uod26;
       TrackSimple linked_from;
       LinkedTrack uri;
       aq6 uoaq6;
       ok0 ook0;
       aq6 uoaq61;
       vs b2;
       ok0 ook01;
       kg1 okg1 = this;
       int i = 16;
       boolean b = false;
       kg1 b1 = okg1.b;
       switch (okg1.a){
           case 0:
             Bitmap uBitmap = b1.G.g(p0).c();
             try{
                uv1 ouv1 = new uv1(uBitmap);
                uod26 = new d26(new x65(ouv1.b).a());
             }catch(java.lang.Exception e0){
                uod26 = new l75();
             }
             return Integer.valueOf(ej0.p(uod26));
             break;
           case 1:
             Integer integer = p0;
             Entity uEntity = b1.U.x(integer.intValue());
             String str = uEntity.uri();
             if (uEntity instanceof Track && ((linked_from = uEntity.linked_from) != null && (uri = linked_from.uri) != null)) {
                str = uri;
             }
             ng1 s = b1.S;
             uoaq6 = b1.w();
             int i1 = integer.intValue();
             s.getClass();
             if (i1 >= 0 && str != null) {
                rg1 x = s.x;
                if (uoaq6.b == yp6.y0) {
                   ook0 = ((uoaq61 = td7.d(str)) == null)? Completable.h(new IllegalArgumentException(str)): x.c(uoaq61, b);
                }else {
                   rg1 w = s.w;
                   w.getClass();
                   ook0 = s.z.c(uoaq6.t, s.A.b(str, Integer.valueOf(i1), "rem")).c(Completable.i(new g16(w, i, uoaq6))).c(x.b());
                }
             }else {
                ook0 = Completable.h(new IllegalArgumentException());
             }
             return ox7.C(ook0.t(uEntity).toObservable());
             break;
           case 2:
           default:
             vs ovs = p0;
             ng1 s1 = b1.S;
             uoaq6 = b1.w();
             vs a = ovs.a;
             s1.getClass();
             if (a >= null && ((b2 = ovs.b) >= null && uoaq6.b != yp6.y0)) {
                Integer integer1 = Integer.valueOf(a);
                Integer integer2 = Integer.valueOf(true);
                if (a < b2) {
                   b2 = b2 + 1;
                }
                rg1 w1 = s1.w;
                w1.getClass();
                ook01 = s1.t.z(uoaq6.t, m73.i("range_start", integer1, "range_length", integer2, "insert_before", Integer.valueOf(b2))).ignoreElement().c(Completable.i(new g16(w1, i, uoaq6)));
             }else {
                ook01 = Completable.h(new IllegalArgumentException());
             }
             return ox7.P(ox7.P(ook01.t(ovs).toObservable().map(new rm(18)), new l51(b, new TimeoutException(), ovs), 0x2ee0), new l51(true, null, null), 200).onErrorReturn(new up0(i, ovs));
       }
       Object obj = p0;
       b1.getClass();
       obj.getClass();
       aw1 uoaw1 = new aw1(obj);
       uoaw1.c = c.o(b1.T.b);
       return uoaw1.d();
    }
}
