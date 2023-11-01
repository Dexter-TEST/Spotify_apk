package p.p41;
import p.sc;
import p.p31;
import java.lang.Object;
import p.a41;
import p.b41;
import p.c41;
import p.d41;
import p.e41;
import p.et0;
import p.f41;
import p.g41;
import p.h41;
import p.i41;
import p.j41;
import p.k41;
import p.l41;
import p.m41;
import p.n41;
import p.o41;
import p.r31;
import p.s31;
import p.t31;
import p.u31;
import p.v31;
import p.w31;
import p.x31;
import p.y31;
import p.z31;
import com.spotify.liteappstorage.files.StorageLocationMovingService;
import p.tm5;
import p.zg0;
import p.mt6;
import p.pd4;
import p.co6;
import p.mn6;
import p.f91;
import p.wd5;
import p.tl6;
import p.wl6;
import com.spotify.litelisteningexperience.share.ShareResultReceiver;
import p.fe6;
import com.spotify.litesettings.settings.PrivateSettingsActivity;
import p.we6;
import p.ew0;
import com.spotify.liteplayer.player.PlayerService;
import p.rf5;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import p.nc1;
import p.a21;
import p.vp;
import p.pm6;
import p.gg1;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsModule;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesReader;
import p.tn6;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsModule$Companion;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvidePlatformConnectionTypePropertiesFactory;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvideConnectivityUtilFactory;
import android.app.Application;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvideConnectivityListenerFactory;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvideInternetMonitorFactory;
import p.ur6;
import p.tf6;
import p.o45;
import com.spotify.litesettings.settings.OfflineSettingsActivity;
import com.spotify.liteoffline.offline.OfflineNotificationWorker;
import p.vk4;
import p.tk4;
import p.g54;
import p.ms3;
import p.ac;
import p.s36;
import p.co5;
import p.xq7;
import com.spotify.messaging.quicksilverliteintegration.DisplayOrchestrator;
import p.p97;
import com.spotify.lite.metadata.MetadataOfflineSyncBackgroundWork$MigrationWorker;
import p.n94;
import p.w12;
import com.spotify.lite.notification.LiteMediaButtonReceiver;
import p.vm3;
import com.spotify.litesettings.settings.InAppMessagingDebugActivity;
import com.spotify.remoteconfig.fetcher.worker.FetchPropertiesWorker;
import p.ti3;
import p.nd1;
import p.o12;
import p.al5;
import com.spotify.compression.extraction.ExtractCompressedLibraryWorker;
import p.tx;
import p.y37;
import p.ev0;
import p.oz3;
import java.lang.String;
import p.nc0;
import java.lang.Boolean;
import com.spotify.litesettings.settings.ExplicitContentSettingsActivity;
import p.el5;
import p.i16;
import com.spotify.clientfoundations.esperanto.esperantocosmos.CosmosTransport;
import p.pi5;
import com.spotify.clientfoundations.esperanto.esperantocosmos.EsperantoRxRouter;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateClient;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateEsperantoKt;
import com.spotify.connectivity.productstateesperanto.ProductStateMethodsImpl;
import com.spotify.connectivity.productstateesperanto.ProductStateMethods;
import p.zm1;
import p.wn3;
import p.m12;
import p.td1;
import com.spotify.litenavigation.deeplink.DeepLinkActivity;
import p.g61;
import p.ap3;
import p.fp6;
import com.spotify.lite.notification.CustomActionsReceiver;
import com.spotify.lite.metadata.MetadataCleanUpBackgroundWork$CleanUpWorker;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.rp3;
import p.gb0;
import p.d51;
import p.o11;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.k10;
import com.spotify.litesettings.settings.AudioSettingsActivity;
import p.qo5;
import p.oo;
import com.spotify.lite.about.WebViewActivity;
import com.squareup.moshi.Moshi;

public final class p41 implements sc	// class@0021e9 from classes.dex
{
    public final int a;
    public final p31 b;

    public void p41(p31 p0){
       this.a = 0;
       super(p0, 0, 0);
    }
    public void p41(p31 p0,int p1){
       this.a = 1;
       super(p0, 1, 0);
    }
    public void p41(p31 p0,int p1,int p2){
       this.a = p1;
       this.b = p0;
       super();
    }
    public void p41(p31 p0,Object p1){
       this.a = 2;
       super(p0, 2, 0);
    }
    public void p41(p31 p0,a41 p1){
       this.a = 18;
       super(p0, 18, 0);
    }
    public void p41(p31 p0,b41 p1){
       this.a = 22;
       super(p0, 22, 0);
    }
    public void p41(p31 p0,c41 p1){
       this.a = 11;
       super(p0, 11, 0);
    }
    public void p41(p31 p0,d41 p1){
       this.a = 21;
       super(p0, 21, 0);
    }
    public void p41(p31 p0,e41 p1){
       this.a = 24;
       super(p0, 24, 0);
    }
    public void p41(p31 p0,et0 p1){
       this.a = 3;
       super(p0, 3, 0);
    }
    public void p41(p31 p0,f41 p1){
       this.a = 17;
       super(p0, 17, 0);
    }
    public void p41(p31 p0,g41 p1){
       this.a = 23;
       super(p0, 23, 0);
    }
    public void p41(p31 p0,h41 p1){
       this.a = 4;
       super(p0, 4, 0);
    }
    public void p41(p31 p0,i41 p1){
       this.a = 12;
       super(p0, 12, 0);
    }
    public void p41(p31 p0,j41 p1){
       this.a = 20;
       super(p0, 20, 0);
    }
    public void p41(p31 p0,k41 p1){
       this.a = 26;
       super(p0, 26, 0);
    }
    public void p41(p31 p0,l41 p1){
       this.a = 9;
       super(p0, 9, 0);
    }
    public void p41(p31 p0,m41 p1){
       this.a = 13;
       super(p0, 13, 0);
    }
    public void p41(p31 p0,n41 p1){
       this.a = 10;
       super(p0, 10, 0);
    }
    public void p41(p31 p0,o41 p1){
       this.a = 15;
       super(p0, 15, 0);
    }
    public void p41(p31 p0,r31 p1){
       this.a = 7;
       super(p0, 7, 0);
    }
    public void p41(p31 p0,s31 p1){
       this.a = 14;
       super(p0, 14, 0);
    }
    public void p41(p31 p0,t31 p1){
       this.a = 5;
       super(p0, 5, 0);
    }
    public void p41(p31 p0,u31 p1){
       this.a = 25;
       super(p0, 25, 0);
    }
    public void p41(p31 p0,v31 p1){
       this.a = 16;
       super(p0, 16, 0);
    }
    public void p41(p31 p0,w31 p1){
       this.a = 6;
       super(p0, 6, 0);
    }
    public void p41(p31 p0,x31 p1){
       this.a = 8;
       super(p0, 8, 0);
    }
    public void p41(p31 p0,y31 p1){
       this.a = 27;
       super(p0, 27, 0);
    }
    public void p41(p31 p0,z31 p1){
       this.a = 19;
       super(p0, 19, 0);
    }
    public final void a(Object p0){
       p41 tb = this.b;
       switch (this.a){
           case 0:
             p0.X = new qo5(tb.h1.get(), tb.q3.get(), tb.l3.get());
             return;
           case 1:
             p0.H = tb.e();
             p0.I = tb.A1.get();
             return;
           case 2:
             p0.H = tb.e();
             p0.I = new o11(this.b(), id.a());
             return;
           case 3:
             p0.x = tb.o2.get();
             p0.y = tb.h3.get();
             p0.z = tb.g3.get();
             p0.A = tb.A1.get();
             return;
           case 4:
             p0.a = tb.q3.get();
             return;
           case 5:
             p0.Q = tb.C4.get();
             p0.R = tb.m4.get();
             p0.S = p31.b(tb);
             return;
           case 6:
             p0.H = tb.w2.get();
             return;
           case 7:
             p0.J = tb.w2.get();
             p0.K = tb.C2.get();
             p0.L = tb.s3.get();
             return;
           case 8:
             p0.Q = tb.k3.get();
             p0.R = tb.q3.get();
             i16 oi16 = tb.N2.get();
             co5.o(oi16, "rxRouter");
             ProductStateClient productState = ProductStateEsperantoKt.createProductStateClient(new CosmosTransport(new pi5(oi16, 8)));
             co5.n(productState);
             p0.S = new el5(new ProductStateMethodsImpl(productState));
             return;
           case 9:
             Object obj = tb.J2.get();
             Object obj1 = tb.X1.get();
             Object obj2 = tb.K2.get();
             p31 a = tb.a;
             co5.o(a, "context");
             co5.o(obj, "compressedLibraryLoader");
             co5.o(obj1, "timeKeeper");
             co5.o(obj2, "coreLibraryType");
             nc0 v0 = new nc0(obj, a, obj2, obj1, 3, 0);
             p0.w = v0;
             p0.x = tb.L3.get().booleanValue();
             return;
           case 10:
             p0.a = tb.k3.get();
             return;
           case 11:
             p0.x = nd1.a(tb.L4);
             return;
           case 12:
             p0.Q = tb.h3.get();
             return;
           case 13:
             p0.a = tb.k2.get();
             return;
           case 14:
             p0.a = tb.q3.get();
             return;
           case 15:
             p0.x = tb.K4.get();
             p0.y = tb.h3.get();
             return;
           case 16:
             p0.b = new tk4(tb.q3.get());
             p0.c = new g54(tb.q3.get());
             p0.t = new ms3(tb.k2.get());
             p0.v = tb.A1.get();
             p0.w = tb.J3.get();
             Scheduler b = s36.b;
             co5.n(b);
             p0.x = b;
             p0.y = new xq7(tb.x3.get(), 12, tb.j4.get());
             return;
           case 17:
             p0.x = tb.r3.get();
             return;
           case 18:
             p0.Q = tb.h1.get();
             p0.R = tb.r3.get();
             return;
           case 19:
             p0.H = tb.w2.get();
             return;
           case 20:
             p0.Q = tb.e();
             p0.R = p31.c(tb);
             p0.S = tb.A1.get();
             p0.T = tb.J3.get();
             p0.U = new gg1();
             ConnectionTypeFlagsModule$Companion companion = ConnectionTypeFlagsModule.Companion;
             boolean b1 = companion.provideNetCapabilitiesValidatedDisabledValue(new ConnectionTypePropertiesReader(tb.j()));
             PlatformConnectionTypeProperties platformConn = ConnectionTypeModule_ProvidePlatformConnectionTypePropertiesFactory.providePlatformConnectionTypeProperties(b1, companion.provideShouldUseSingleThread(new ConnectionTypePropertiesReader(tb.j())));
             p0.V = ConnectionTypeModule_ProvideInternetMonitorFactory.provideInternetMonitor(ConnectionTypeModule_ProvideConnectivityListenerFactory.provideConnectivityListener(tb.a, ConnectionTypeModule_ProvideConnectivityUtilFactory.provideConnectivityUtil(ConnectionTypeModule_ProvidePlatformConnectionTypePropertiesFactory.providePlatformConnectionTypeProperties(companion.provideNetCapabilitiesValidatedDisabledValue(new ConnectionTypePropertiesReader(tb.j())), companion.provideShouldUseSingleThread(new ConnectionTypePropertiesReader(tb.j())))), platformConn), tb.r1.get(), tb.s1.get());
             p0.W = this.b();
             p0.X = p31.d(tb);
             return;
           case 21:
             p0.b = tb.q3.get();
             return;
           case 22:
             p0.Q = tb.h1.get();
             p0.R = tb.r3.get();
             return;
           case 23:
             p0.a = tb.i();
             return;
           case 24:
             p0.I = tb.w2.get();
             p0.J = tb.r4.get();
             return;
           case 25:
             p0.H = tb.w2.get();
             return;
           case 26:
             p0.a = tb.A1.get();
             p0.b = tb.i1.get();
             p0.c = tb.s4.get();
             p0.t = tb.j();
             return;
           default:
             return;
       }
    }
    public final ur6 b(){
       p41 tb = this.b;
       switch (this.a){
           case 2:
           default:
             return new ur6(tb.a, tb.R2.get());
       }
       return new ur6(tb.a, tb.R2.get());
    }
}
