package com.spotify.connectivity.logoutanalyticsdelegate.AuthAnalyticsDelegateModule;
import java.lang.Object;
import p.tu1;
import p.y37;
import p.kc;
import com.spotify.connectivity.logoutanalyticsdelegate.AuthAnalyticsDelegate;
import java.lang.String;
import p.co5;

public final class AuthAnalyticsDelegateModule	// class@000750 from classes.dex
{
    public static final AuthAnalyticsDelegateModule INSTANCE;

    static {
       AuthAnalyticsDelegateModule.INSTANCE = new AuthAnalyticsDelegateModule();
    }
    private void AuthAnalyticsDelegateModule(){
       super();
    }
    public final AuthAnalyticsDelegate provideAuthAnalyticsDelegate(tu1 p0,y37 p1,kc p2){
       co5.o(p0, "eventPublisher");
       co5.o(p1, "timeKeeper");
       co5.o(p2, "properties");
       throw null;
    }
}
