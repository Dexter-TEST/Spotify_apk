package p.k31;
import p.sc;
import p.p31;
import p.et0;
import p.j31;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import java.lang.Object;
import p.ta3;
import p.tm5;
import p.wd0;
import p.u87;
import p.nd1;
import p.i31;
import p.jm6;
import p.f91;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvideInternetMonitorFactory;
import p.nd7;
import p.ng1;
import p.g54;
import p.ac;
import p.wd5;
import p.pm6;
import p.t7;
import p.r7;
import p.jl4;
import p.rf5;
import p.fv1;
import p.a75;
import p.ke6;
import p.ge6;
import p.fe6;
import p.pe6;
import p.kf6;
import p.we6;
import p.ll4;
import p.zg0;
import p.j83;
import p.eo3;
import p.s36;
import p.co5;
import p.xq7;
import com.spotify.messaging.quicksilverliteintegration.DisplayOrchestrator;
import p.p97;
import com.spotify.litecomponents.snackalog.a;
import com.spotify.litelyrics.lyrics.widget.LyricsWidgetPresenter;
import p.gy3;
import p.by3;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.hy3;
import p.b7;
import p.ae2;
import androidx.fragment.app.k;
import p.iv0;
import java.lang.String;
import p.tv0;
import p.kz6;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import p.sa;
import p.cy3;
import p.tu1;
import p.px3;
import p.al5;
import p.zo3;
import p.oo0;
import p.o11;
import p.ce7;
import p.cy5;
import p.v06;
import p.nm5;
import p.ds7;
import p.qu0;
import p.u90;
import p.ex3;
import java.lang.Class;
import p.ed;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import com.spotify.connectivity.connectiontype.DeferUntilConnected;
import p.an5;
import p.jc7;
import p.wx3;
import p.yf2;
import p.zo0;
import p.tv4;

public final class k31 implements sc	// class@001b98 from classes.dex
{
    public final int a;
    public final p31 b;
    public a02 c;
    public tm5 t;
    public Object v;
    public final Object w;

    public void k31(p31 p0){
       this.a = 0;
       super(p0, null);
    }
    public void k31(p31 p0,int p1){
       this.a = 1;
       super(p0, null);
    }
    public void k31(p31 p0,NowPlayingActivity p1){
       this.a = 3;
       super();
       this.v = this;
       this.b = p0;
       this.w = p1;
       ta3 ota3 = ta3.a(p1);
       this.c = ota3;
       this.t = nd1.b(u87.a(p0.h4, p0.x3, ota3, p0.i4, p0.h3));
    }
    public void k31(p31 p0,NowPlayingActivity p1,int p2){
       this.a = 3;
       super(p0, p1);
    }
    public void k31(p31 p0,Object p1){
       this.a = 2;
       super(p0, null);
    }
    public void k31(p31 p0,et0 p1){
       this.a = 0;
       super();
       this.w = this;
       this.b = p0;
       this.c = jm6.c(p0.F1);
       jm6 ojm6 = jm6.b(p0.j1);
       this.t = ojm6;
       this.v = nd7.a(p0.M3, p0.M1, p0.s3, this.c, p0.t1, p0.N3, ojm6);
    }
    public void k31(p31 p0,i31 p1){
       nd7 p0;
       this.a = 2;
       super();
       this.w = this;
       this.b = p0;
       this.c = jm6.c(p0.F1);
       jm6 ojm6 = jm6.b(p0.j1);
       this.t = ojm6;
       p0 = new nd7(p0.t2, p0.k3, this.c, p0.s3, p0.t1, p0.N3, ojm6, 8);
       this.v = p0;
    }
    public void k31(p31 p0,j31 p1){
       this.a = 1;
       super();
       this.w = this;
       this.b = p0;
       this.c = jm6.c(p0.F1);
       jm6 ojm6 = jm6.b(p0.j1);
       this.t = ojm6;
       this.v = nd7.a(p0.M3, p0.M1, p0.s3, this.c, p0.t1, p0.N3, ojm6);
    }
    public final void a(Object p0){
       int i;
       k31 ok31 = this;
       k31 b = ok31.b;
       switch (ok31.a){
           case 0:
             p0.a = this.b();
             return;
           case 1:
             i = p0;
             i.E = this.b();
             i.F = b.w2.get();
             i.G = b.J3.get();
             return;
           case 2:
             i = p0;
             i.E = new g54(ok31.v);
             i.F = b.k2.get();
             i.G = b.w2.get();
             i.H = b.J3.get();
             return;
           default:
             i = p0;
             i.T = new jl4(b.q3.get(), new fv1(), new a75(), new pe6(new ke6(new ge6(0), new fv1()), b.i()));
             i.U = new kf6(b.q3.get(), 11, b.h1.get());
             i.V = new ll4(b.k2.get());
             i.W = b.A1.get();
             i.X = ok31.t.get();
             i.Y = b.c4.get();
             Scheduler LyricsWidgetPresenter b1 = s36.b;
             co5.n(b1);
             i.Z = b1;
             i.a0 = new xq7(b.x3.get(), 12, b.j4.get());
             i.b0 = b.e4.get();
             i.c0 = b.J3.get();
             k31 ok311 = ok31.w;
             ae2 uoae2 = ok311.y();
             co5.n(uoae2);
             b7 uob7 = new b7(uoae2);
             iv0 oiv0 = b.e3.get();
             co5.o(oiv0, "coreNativePlayer");
             BackpressureStrategy a = BackpressureStrategy.a;
             Flowable uFlowable = oiv0.f().toFlowable(a);
             co5.l(uFlowable, "coreNativePlayer.playerS…kpressureStrategy.BUFFER\)");
             kz6 okz6 = sa.a(uFlowable, b.A1.get());
             oiv0 = b.e3.get();
             co5.o(oiv0, "coreNativePlayer");
             uFlowable = oiv0.f().toFlowable(a);
             co5.l(uFlowable, "coreNativePlayer.playerS…kpressureStrategy.BUFFER\)");
             b1 = new LyricsWidgetPresenter(new hy3(new gy3(), new by3(id.a())), uob7, okz6, id.a(), ok311, ok311, uFlowable, new cy3(b.W1.get()), new px3(b.K3), b.k3.get(), b.k2.get());
             i.d0 = b1;
             oo0 ooo0 = b.U1.get();
             co5.o(ooo0, "configProvider");
             i.e0 = new zo3(0, ooo0);
             i.f0 = new px3(b.K3);
             cy5 uocy5 = b.K1.get();
             v06 ov06 = b.a2.get();
             nm5 onm5 = b.q2.get();
             co5.o(uocy5, "retrofit");
             co5.o(ov06, "rxJavaAdapterFactory");
             co5.o(onm5, "moshiConverter");
             ds7 okz61 = new ds7(uocy5);
             okz61.b(onm5);
             okz61.a(ov06);
             Object obj = okz61.e().b(ex3.class);
             co5.l(obj, "retrofit.newBuilder\(\)\n  …ricsEndpoint::class.java\)");
             oo0 ooo01 = b.U1.get();
             co5.o(ooo01, "configProvider");
             iv0 oiv01 = b.e3.get();
             co5.o(oiv01, "coreNativePlayer");
             Flowable uFlowable1 = oiv01.f().toFlowable(a);
             co5.l(uFlowable1, "coreNativePlayer.playerS…kpressureStrategy.BUFFER\)");
             ConnectionApis uConnectionA = b.u1.get();
             co5.o(uConnectionA, "connectionApis");
             o11 b11 = new o11(new ce7(obj, new px3(b.K3), new ed(0, ooo01)), uFlowable1, new DeferUntilConnected(uConnectionA), b.u1.get());
             i.g0 = b11;
             Observable observable = b11.w.startWithItem(jc7.a).switchMap(new wx3(b11, 1));
             co5.l(observable, "override fun observe\(\): …rack\)\n            }\n    }");
             zo0 ozo0 = observable.replay(1);
             ozo0.getClass();
             i.h0 = new tv4(ozo0);
             return;
       }
    }
    public final g54 b(){
       switch (this.a){
           case 0:
           default:
             return new g54(this.v);
       }
       return new g54(this.v);
    }
}
