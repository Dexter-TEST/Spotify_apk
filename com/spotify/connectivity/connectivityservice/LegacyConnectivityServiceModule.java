package com.spotify.connectivity.connectivityservice.LegacyConnectivityServiceModule;
import java.lang.Object;
import p.vg0;
import java.lang.String;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import p.co5;
import p.nm3;
import android.os.Build;
import p.kq3;
import java.util.Locale;
import android.os.Build$VERSION;
import java.lang.Integer;
import java.util.Arrays;
import android.app.Application;
import p.af4;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import p.g15;
import p.sw0;
import p.pw0;
import p.re6;
import com.spotify.connectivity.MobileDeviceInfo;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import p.ej4;
import com.spotify.connectivity.eventsenderanalyticsdelegate.EventSenderAnalyticsDelegate;
import android.content.Context;
import com.spotify.connectivity.AnalyticsDelegate;

public final class LegacyConnectivityServiceModule	// class@0006e2 from classes.dex
{
    public static final LegacyConnectivityServiceModule INSTANCE;

    static {
       LegacyConnectivityServiceModule.INSTANCE = new LegacyConnectivityServiceModule();
    }
    private void LegacyConnectivityServiceModule(){
       super();
    }
    public final ApplicationScopeConfiguration provideConnectivityApplicationScopeConfiguration(vg0 p0,String p1,String p2){
       co5.o(p0, "clientInfo");
       co5.o(p1, "cachePath");
       co5.o(p2, "language");
       ApplicationScopeConfiguration uApplication = new ApplicationScopeConfiguration();
       uApplication.setClientId("7e7cf598605d47caba394c628e2735a2");
       uApplication.setCachePath(p1);
       uApplication.setDeviceId(p0.d);
       p1 = Build.MODEL;
       uApplication.setDeviceHardwareModel(p1);
       uApplication.setClientRevision(kq3.a);
       uApplication.setClientVersionLong("1.9.0.49155");
       uApplication.setAccesspointLanguage(p2);
       Object[] objArray = new Object[]{p0.a(),p1,Integer.valueOf(Build$VERSION.SDK_INT),p1};
       String str = String.format(Locale.ROOT, "Spotify/%s %s/%d \(%s\)", Arrays.copyOf(objArray, 4));
       co5.l(str, "format\(locale, format, *args\)");
       uApplication.setDefaultHTTPUserAgent(str);
       return uApplication;
    }
    public final ConnectivityService provideConnectivityService(Application p0,af4 p1,EventSenderCoreBridge p2,g15 p3,sw0 p4,pw0 p5,re6 p6,MobileDeviceInfo p7,Observable p8,ApplicationScopeConfiguration p9){
       co5.o(p0, "application");
       co5.o(p1, "nativeLibrary");
       co5.o(p2, "eventSenderCoreBridge");
       Object obj = p3;
       co5.o(obj, "okHttpClient");
       Object obj1 = p4;
       co5.o(obj1, "coreThreadingApi");
       Object obj2 = p5;
       co5.o(obj2, "corePreferencesApi");
       Object obj3 = p6;
       co5.o(obj3, "sharedCosmosRouterApi");
       Object obj4 = p7;
       co5.o(obj4, "mobileDeviceInfo");
       Object obj5 = p8;
       co5.o(obj5, "connectionTypeObservable");
       Object obj6 = p9;
       co5.o(obj6, "connectivityApplicationScopeConfiguration");
       ej4.h();
       p1.a();
       Context applicationC = p0.getApplicationContext();
       co5.l(applicationC, "application.applicationContext");
       ConnectivityService v1 = new ConnectivityService(new EventSenderAnalyticsDelegate(p2), obj1, obj2, obj6, obj4, obj3, applicationC, obj, obj5);
       return v1;
    }
}
