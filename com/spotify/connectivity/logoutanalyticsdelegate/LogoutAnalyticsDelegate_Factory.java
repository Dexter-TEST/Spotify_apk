package com.spotify.connectivity.logoutanalyticsdelegate.LogoutAnalyticsDelegate_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.tu1;
import p.y37;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutAnalyticsDelegate;

public final class LogoutAnalyticsDelegate_Factory implements a02	// class@000755 from classes.dex
{
    private final tm5 eventPublisherProvider;
    private final tm5 timeKeeperProvider;

    public void LogoutAnalyticsDelegate_Factory(tm5 p0,tm5 p1){
       super();
       this.eventPublisherProvider = p0;
       this.timeKeeperProvider = p1;
    }
    public static LogoutAnalyticsDelegate_Factory create(tm5 p0,tm5 p1){
       return new LogoutAnalyticsDelegate_Factory(p0, p1);
    }
    public static LogoutAnalyticsDelegate newInstance(tu1 p0,y37 p1){
       return new LogoutAnalyticsDelegate(p0, p1);
    }
    public LogoutAnalyticsDelegate get(){
       return LogoutAnalyticsDelegate_Factory.newInstance(this.eventPublisherProvider.get(), this.timeKeeperProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
