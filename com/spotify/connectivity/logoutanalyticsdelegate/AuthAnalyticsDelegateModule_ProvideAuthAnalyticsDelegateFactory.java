package com.spotify.connectivity.logoutanalyticsdelegate.AuthAnalyticsDelegateModule_ProvideAuthAnalyticsDelegateFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.tu1;
import p.y37;
import p.kc;
import com.spotify.connectivity.logoutanalyticsdelegate.AuthAnalyticsDelegate;
import com.spotify.connectivity.logoutanalyticsdelegate.AuthAnalyticsDelegateModule;
import p.co5;
import p.tp2;

public final class AuthAnalyticsDelegateModule_ProvideAuthAnalyticsDelegateFactory implements a02	// class@000751 from classes.dex
{
    private final tm5 eventPublisherProvider;
    private final tm5 propertiesProvider;
    private final tm5 timeKeeperProvider;

    public void AuthAnalyticsDelegateModule_ProvideAuthAnalyticsDelegateFactory(tm5 p0,tm5 p1,tm5 p2){
       super();
       this.eventPublisherProvider = p0;
       this.timeKeeperProvider = p1;
       this.propertiesProvider = p2;
    }
    public static AuthAnalyticsDelegateModule_ProvideAuthAnalyticsDelegateFactory create(tm5 p0,tm5 p1,tm5 p2){
       return new AuthAnalyticsDelegateModule_ProvideAuthAnalyticsDelegateFactory(p0, p1, p2);
    }
    public static AuthAnalyticsDelegate provideAuthAnalyticsDelegate(tu1 p0,y37 p1,kc p2){
       AuthAnalyticsDelegate uAuthAnalyti = AuthAnalyticsDelegateModule.INSTANCE.provideAuthAnalyticsDelegate(p0, p1, p2);
       co5.n(uAuthAnalyti);
       return uAuthAnalyti;
    }
    public AuthAnalyticsDelegate get(){
       tp2.v(this.propertiesProvider.get());
       return AuthAnalyticsDelegateModule_ProvideAuthAnalyticsDelegateFactory.provideAuthAnalyticsDelegate(this.eventPublisherProvider.get(), this.timeKeeperProvider.get(), null);
    }
    public Object get(){
       return this.get();
    }
}
