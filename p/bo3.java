package p.bo3;
import p.m12;
import p.yp6;
import java.lang.Enum;
import java.util.EnumSet;
import java.util.Set;
import java.util.Collections;
import p.h12;
import p.bn6;
import p.vi0;
import p.cm7;
import p.zp3;
import p.mp;
import p.tm5;
import java.lang.Object;
import java.util.ArrayList;
import p.an5;
import p.xn3;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.vs3;
import p.ir0;
import p.jk0;
import p.ew0;
import io.reactivex.rxjava3.core.Maybe;
import java.lang.Class;
import p.bm;
import p.bi5;
import p.ok0;
import p.am0;
import java.lang.Runnable;
import p.aq6;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Exception;
import p.zn3;
import p.b5;
import p.cn6;
import com.spotify.socialgraph.proto.SocialgraphV2$SocialGraphRequest;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.xi0;

public final class bo3 implements m12	// class@001103 from classes.dex
{
    public final h12 a;
    public final bn6 b;
    public final vi0 c;
    public final cm7 d;
    public final zp3 e;
    public final mp f;
    public final tm5 g;
    public final ArrayList h;
    public final an5 i;
    public final an5 j;
    public final an5 k;
    public final an5 l;
    public final an5 m;
    public final an5 n;
    public final an5 o;
    public final an5 p;
    public static final Set q;

    static {
       yp6[] oyp6Array = new yp6[]{yp6.b,yp6.A,yp6.B,yp6.l0,yp6.w,yp6.G};
       bo3.q = Collections.unmodifiableSet(EnumSet.complementOf(EnumSet.of(yp6.t, oyp6Array)));
    }
    public void bo3(h12 p0,bn6 p1,vi0 p2,cm7 p3,zp3 p4,mp p5,tm5 p6){
       super();
       this.h = new ArrayList(10);
       an5 uoan5 = new an5();
       this.i = uoan5;
       an5 uoan51 = new an5();
       this.j = uoan51;
       an5 uoan52 = new an5();
       this.k = uoan52;
       an5 uoan53 = new an5();
       this.l = uoan53;
       an5 uoan54 = new an5();
       this.m = uoan54;
       an5 uoan55 = new an5();
       this.n = uoan55;
       an5 uoan56 = new an5();
       this.o = uoan56;
       an5 uoan57 = new an5();
       this.p = uoan57;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       uoan51.switchMapCompletable(new xn3(this, 0)).subscribe();
       uoan52.switchMapCompletable(new xn3(this, 1)).subscribe();
       uoan53.switchMapCompletable(new xn3(this, 2)).subscribe();
       uoan54.switchMapCompletable(new xn3(this, 3)).subscribe();
       uoan55.switchMapCompletable(new xn3(this, 4)).subscribe();
       uoan56.switchMapCompletable(new xn3(this, 5)).subscribe();
       uoan57.switchMapCompletable(new xn3(this, 6)).subscribe();
       uoan5.subscribe(new vs3(7, this));
    }
    public final jk0 a(){
       Maybe maybe = this.g.get().e().firstElement();
       maybe.getClass();
       jk0 ojk0 = new jk0(maybe, 5, new xn3(this, 7));
       return ojk0.n(new bm(22));
    }
    public final ok0 b(){
       return Completable.j(new am0(23, this));
    }
    public final Completable c(aq6 p0,boolean p1){
       ok0 ook0;
       Completable uCompletable;
       ok0 ook01;
       Completable uCompletable1;
       int i = p0.b.ordinal();
       int i1 = 1;
       if (i != i1) {
          i1 = 3;
          bo3 td = this.d;
          aq6 t = p0.t;
          if (i != i1) {
             if (i != 5) {
                if (i != 16) {
                   if (i != 51) {
                      if (i != 9 && i != 10) {
                         return Completable.h(new IllegalArgumentException("Unsupported uri: "+p0));
                      }else {
                         ook0 = Completable.i(new zn3(this, 5));
                         uCompletable = (p1)? td.e(t): td.n(t);
                      }
                   }else {
                      ook0 = Completable.i(new zn3(this, i1));
                      uCompletable = (p1)? td.h(t): td.y(t);
                   }
                }else {
                   ook01 = Completable.i(new zn3(this, 4));
                   cn6 uocn6 = SocialgraphV2$SocialGraphRequest.g();
                   uocn6.c(p0.toString());
                   SocialgraphV2$SocialGraphRequest socialGraphR = uocn6.build();
                   bo3 tb = this.b;
                   if (p1) {
                      uCompletable1 = tb.b(socialGraphR);
                   label_00d3 :
                      uCompletable = uCompletable1;
                      ook0 = ook01;
                   }else {
                      uCompletable1 = tb.a(socialGraphR);
                      goto label_00d3 ;
                   }
                }
             }else {
                ook0 = Completable.i(new zn3(this, 2));
                uCompletable = (p1)? td.o(t): td.u(t);
             }
          }else {
             ook0 = Completable.i(new zn3(this, 0));
             uCompletable = (p1)? td.p(t): td.t(t);
          }
       }else {
          ook01 = Completable.i(new zn3(this, i1));
          uCompletable1 = this.c.b(p0.toString(), p1);
          goto label_00d3 ;
       }
       return uCompletable.c(this.b()).c(ook0).m();
    }
}
