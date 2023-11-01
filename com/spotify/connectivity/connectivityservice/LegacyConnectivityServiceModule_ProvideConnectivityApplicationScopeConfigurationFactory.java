package com.spotify.connectivity.connectivityservice.LegacyConnectivityServiceModule_ProvideConnectivityApplicationScopeConfigurationFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.vg0;
import java.lang.String;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.connectivityservice.LegacyConnectivityServiceModule;
import p.co5;

public final class LegacyConnectivityServiceModule_ProvideConnectivityApplicationScopeConfigurationFactory implements a02	// class@0006e3 from classes.dex
{
    private final tm5 cachePathProvider;
    private final tm5 clientInfoProvider;
    private final tm5 languageProvider;

    public void LegacyConnectivityServiceModule_ProvideConnectivityApplicationScopeConfigurationFactory(tm5 p0,tm5 p1,tm5 p2){
       super();
       this.clientInfoProvider = p0;
       this.cachePathProvider = p1;
       this.languageProvider = p2;
    }
    public static LegacyConnectivityServiceModule_ProvideConnectivityApplicationScopeConfigurationFactory create(tm5 p0,tm5 p1,tm5 p2){
       return new LegacyConnectivityServiceModule_ProvideConnectivityApplicationScopeConfigurationFactory(p0, p1, p2);
    }
    public static ApplicationScopeConfiguration provideConnectivityApplicationScopeConfiguration(vg0 p0,String p1,String p2){
       ApplicationScopeConfiguration uApplication = LegacyConnectivityServiceModule.INSTANCE.provideConnectivityApplicationScopeConfiguration(p0, p1, p2);
       co5.n(uApplication);
       return uApplication;
    }
    public ApplicationScopeConfiguration get(){
       return LegacyConnectivityServiceModule_ProvideConnectivityApplicationScopeConfigurationFactory.provideConnectivityApplicationScopeConfiguration(this.clientInfoProvider.get(), this.cachePathProvider.get(), this.languageProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
