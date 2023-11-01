package com.spotify.connectivity.productstateesperanto.LoggedInProductStateClient_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient;
import com.spotify.connectivity.productstateesperanto.LoggedInProductStateClient;

public final class LoggedInProductStateClient_Factory implements a02	// class@0007e8 from classes.dex
{
    private final tm5 accumulatedProductStateClientProvider;
    private final tm5 isLoggedInProvider;

    public void LoggedInProductStateClient_Factory(tm5 p0,tm5 p1){
       super();
       this.isLoggedInProvider = p0;
       this.accumulatedProductStateClientProvider = p1;
    }
    public static LoggedInProductStateClient_Factory create(tm5 p0,tm5 p1){
       return new LoggedInProductStateClient_Factory(p0, p1);
    }
    public static LoggedInProductStateClient newInstance(Observable p0,AccumulatedProductStateClient p1){
       return new LoggedInProductStateClient(p0, p1);
    }
    public LoggedInProductStateClient get(){
       return LoggedInProductStateClient_Factory.newInstance(this.isLoggedInProvider.get(), this.accumulatedProductStateClientProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
