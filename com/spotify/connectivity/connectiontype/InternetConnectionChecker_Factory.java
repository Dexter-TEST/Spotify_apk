package com.spotify.connectivity.connectiontype.InternetConnectionChecker_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import android.content.Context;
import com.spotify.connectivity.connectiontype.InternetConnectionChecker;

public final class InternetConnectionChecker_Factory implements a02	// class@00069a from classes.dex
{
    private final tm5 contextProvider;

    public void InternetConnectionChecker_Factory(tm5 p0){
       super();
       this.contextProvider = p0;
    }
    public static InternetConnectionChecker_Factory create(tm5 p0){
       return new InternetConnectionChecker_Factory(p0);
    }
    public static InternetConnectionChecker newInstance(Context p0){
       return new InternetConnectionChecker(p0);
    }
    public InternetConnectionChecker get(){
       return InternetConnectionChecker_Factory.newInstance(this.contextProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
