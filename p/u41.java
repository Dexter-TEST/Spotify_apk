package p.u41;
import p.sc;
import p.p31;
import com.spotify.lite.welcome.WelcomeActivity;
import java.lang.Object;
import p.oq2;
import p.tm5;
import p.nd7;
import p.ta3;
import p.wd0;
import p.jm6;
import p.u87;
import p.nd1;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentModule_ProvideInAppMessageFactory;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentModule_ProvideTriggerFactory;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentModule_ProvideImpressionEndpointFactory;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentModule_ProvideMessageInteractorFactory;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentModule_ProvideInAppMessagingJavascriptInterfaceFactory;
import com.spotify.signup.signup.facebook.FacebookLoginActivity;
import p.mi;
import p.yl7;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment_MembersInjector;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterface;
import p.u73;
import p.w87;
import p.nc1;
import p.a21;
import p.qy1;
import p.vp;
import p.s01;
import p.kz1;
import java.util.Objects;
import p.lz1;
import p.bz1;
import p.bm;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.ha5;
import p.sy1;
import java.lang.Class;
import p.b5;
import p.zy1;
import p.ty1;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.yy1;
import p.ir0;
import p.xy1;
import p.uy1;
import p.wy1;
import p.vy1;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import p.jh6;
import p.yf2;
import p.hm6;
import java.util.concurrent.TimeUnit;
import p.nv1;
import com.spotify.mobius.rx3.RxEventSources;
import java.lang.String;
import p.ms3;
import p.qb4;
import p.pv;
import java.lang.Boolean;
import p.ht;
import p.sb4;
import p.is7;
import p.g54;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.so7;
import p.pm6;
import p.gg1;
import p.j8;
import com.android.installreferrer.api.InstallReferrerClient;
import p.ia3;
import p.co6;
import p.o11;
import p.mi5;
import p.az5;
import com.google.common.collect.d;
import p.dl6;
import p.ea3;
import p.fa3;
import android.app.Application;

public final class u41 implements sc	// class@00283b from classes.dex
{
    public final Object A;
    public Object B;
    public final int a;
    public final p31 b;
    public a02 c;
    public tm5 t;
    public tm5 v;
    public a02 w;
    public a02 x;
    public tm5 y;
    public tm5 z;

    public void u41(p31 p0,WelcomeActivity p1){
       this.a = 2;
       super();
       this.A = this;
       this.b = p0;
       p31 e1 = p0.e1;
       oq2 ooq2 = new oq2(e1, p0.g1, 4);
       this.c = ooq2;
       nd7 v1 = new nd7(p0.M1, p0.k2, ooq2, p0.y4, p0.h1, p0.A4, p0.F3, 2);
       this.t = v1;
       this.v = wd0.a(e1);
       ta3 ota3 = ta3.a(p1);
       this.w = ota3;
       this.x = wd0.b(ota3);
       jm6 ojm6 = jm6.a(p0.k2);
       this.y = ojm6;
       u87 ou87 = u87.b(p0.e1, this.v, this.w, this.x, ojm6);
       this.z = ou87;
       this.B = nd1.b(ou87);
    }
    public void u41(p31 p0,WelcomeActivity p1,int p2){
       this.a = 2;
       super(p0, p1);
    }
    public void u41(p31 p0,InAppMessagingDisplayFragment p1){
       this.a = 1;
       super();
       this.A = this;
       this.b = p0;
       ta3 ota3 = ta3.a(p1);
       this.c = ota3;
       this.t = nd1.b(InAppMessagingDisplayFragmentModule_ProvideInAppMessageFactory.create(ota3));
       this.v = nd1.b(InAppMessagingDisplayFragmentModule_ProvideTriggerFactory.create(this.c));
       InAppMessagingDisplayFragmentModule_ProvideImpressionEndpointFactory inAppMessagi = InAppMessagingDisplayFragmentModule_ProvideImpressionEndpointFactory.create(p0.K1);
       this.w = inAppMessagi;
       wd0 owd0 = new wd0(inAppMessagi, 19);
       this.x = owd0;
       this.y = nd1.b(InAppMessagingDisplayFragmentModule_ProvideMessageInteractorFactory.create(this.t, this.v, p0.H4, p0.I4, p0.J4, owd0, p0.A1));
       this.z = nd1.b(new oq2(this.c, this.t, 26));
       this.B = nd1.b(InAppMessagingDisplayFragmentModule_ProvideInAppMessagingJavascriptInterfaceFactory.create(this.c));
    }
    public void u41(p31 p0,InAppMessagingDisplayFragment p1,int p2){
       this.a = 1;
       super(p0, p1);
    }
    public void u41(p31 p0,FacebookLoginActivity p1){
       this.a = 0;
       super();
       this.B = this;
       this.b = p0;
       this.A = p1;
       ta3 ota3 = ta3.a(p1);
       this.c = ota3;
       this.t = nd1.b(new yl7(p0.n2, mi.c, ota3, 20));
       this.v = wd0.a(p0.e1);
       this.w = wd0.b(this.c);
       jm6 ojm6 = jm6.a(p0.k2);
       this.x = ojm6;
       u87 ou87 = u87.b(p0.e1, this.v, this.c, this.w, ojm6);
       this.y = ou87;
       this.z = nd1.b(ou87);
    }
    public void u41(p31 p0,FacebookLoginActivity p1,int p2){
       this.a = 0;
       super(p0, p1);
    }
    public final void a(Object p0){
       u41 ou41 = this;
       int i = 1;
       u41 b = ou41.b;
       int i1 = 0;
       switch (ou41.a){
           case 0:
             int i2 = p0;
             i2.Q = b.e();
             qy1 oqy1 = ou41.t.get();
             b = ou41.A;
             kz1 okz1 = new kz1(b, i1);
             kz1 okz11 = new kz1(b, i);
             Objects.requireNonNull(b);
             lz1 olz1 = new lz1(b, i);
             lz1 olz11 = new lz1(b, i1);
             p0 = olz11;
             kz1 okz12 = okz11;
             kz1 zy1 okz13 = okz11;
             bz1 b1 = new bz1(oqy1, p31.c(b), ou41.z.get(), okz1, okz12, olz1, p0);
             RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
             Objects.requireNonNull(oqy1);
             ha5 oha5 = new ha5(28, oqy1);
             subtypeEffec.a(sy1.class, oha5);
             subtypeEffec.g(ty1.class, new zy1(b, i1));
             subtypeEffec.c(yy1.class, okz13);
             okz13 = new zy1(b, i);
             subtypeEffec.g(xy1.class, okz13);
             subtypeEffec.c(uy1.class, okz1);
             subtypeEffec.a(wy1.class, olz1);
             subtypeEffec.a(vy1.class, p0);
             ObservableSource[] observableSo = new ObservableSource[]{ou41.t.get().d.take(1).singleOrError().toObservable().map(new jh6(12)).onErrorReturn(new jh6(13)),ou41.z.get().d.timeout(3000, TimeUnit.MILLISECONDS).onErrorResumeNext(new jh6(10)).map(new jh6(11))};
             pv i3 = new pv(2);
             Boolean fALSE = Boolean.FALSE;
             i3.a = fALSE;
             i3.e = fALSE;
             i2.S = is7.l(mi.A(new bm(18), RxConnectables.a(subtypeEffec.h())).d(new bm(9)).c(RxEventSources.a(observableSo)).e(ms3.i("FacebookLogin")), i3.a());
             i2.T = ou41.t.get();
             return;
           case 1:
             InAppMessagingDisplayFragment inAppMessagi = p0;
             InAppMessagingDisplayFragment_MembersInjector.injectMMessageInteractor(inAppMessagi, ou41.y.get());
             InAppMessagingDisplayFragment_MembersInjector.injectMPresenter(inAppMessagi, ou41.z.get());
             InAppMessagingDisplayFragment_MembersInjector.injectMJavascriptInterface(inAppMessagi, ou41.B.get());
             InAppMessagingDisplayFragment_MembersInjector.injectMInAppMessage(inAppMessagi, ou41.t.get());
             InAppMessagingDisplayFragment_MembersInjector.injectMTrigger(inAppMessagi, ou41.v.get());
             return;
           default:
             int i4 = p0;
             i4.Q = new g54(ou41.t);
             i4.R = new so7(id.a());
             i4.S = ou41.B.get();
             i4.T = b.J3.get();
             i4.U = new gg1();
             Object[] objArray = new Object[]{new az5(),new az5()};
             o11 v15 = new o11(b.h(), b.h(), d.n(2, objArray), new dl6(new az5()), d.s(new ea3(i1), new ea3(2), new ea3(i), new fa3(new ea3(0))));
             i4.V = new j8(b.B4.get(), new ia3(b.j(), v15, b.h(), b.a));
             return;
       }
    }
}
