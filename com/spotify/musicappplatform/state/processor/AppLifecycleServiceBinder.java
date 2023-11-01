package com.spotify.musicappplatform.state.processor.AppLifecycleServiceBinder;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AppLifecycleServiceBinder extends Enum	// class@000a9a from classes.dex
{
    public static final AppLifecycleServiceBinder BACKGROUND;
    public static final AppLifecycleServiceBinder CONNECT;
    public static final AppLifecycleServiceBinder COSMOS;
    public static final AppLifecycleServiceBinder EIS;
    public static final AppLifecycleServiceBinder EVENT_SENDER;
    public static final AppLifecycleServiceBinder TEST;
    public static final AppLifecycleServiceBinder[] a;

    static {
       AppLifecycleServiceBinder uAppLifecycl = new AppLifecycleServiceBinder("TEST", 0);
       AppLifecycleServiceBinder.TEST = uAppLifecycl;
       AppLifecycleServiceBinder uAppLifecycl1 = new AppLifecycleServiceBinder("COSMOS", 1);
       AppLifecycleServiceBinder.COSMOS = uAppLifecycl1;
       AppLifecycleServiceBinder uAppLifecycl2 = new AppLifecycleServiceBinder("CONNECT", 2);
       AppLifecycleServiceBinder.CONNECT = uAppLifecycl2;
       AppLifecycleServiceBinder uAppLifecycl3 = new AppLifecycleServiceBinder("EIS", 3);
       AppLifecycleServiceBinder.EIS = uAppLifecycl3;
       AppLifecycleServiceBinder uAppLifecycl4 = new AppLifecycleServiceBinder("BACKGROUND", 4);
       AppLifecycleServiceBinder.BACKGROUND = uAppLifecycl4;
       AppLifecycleServiceBinder uAppLifecycl5 = new AppLifecycleServiceBinder("EVENT_SENDER", 5);
       AppLifecycleServiceBinder.EVENT_SENDER = uAppLifecycl5;
       AppLifecycleServiceBinder[] uAppLifecycl6 = new AppLifecycleServiceBinder[]{uAppLifecycl,uAppLifecycl1,uAppLifecycl2,uAppLifecycl3,uAppLifecycl4,uAppLifecycl5};
       AppLifecycleServiceBinder.a = uAppLifecycl6;
    }
    public void AppLifecycleServiceBinder(String p0,int p1){
       super(p0, p1);
    }
    public static AppLifecycleServiceBinder valueOf(String p0){
       return Enum.valueOf(AppLifecycleServiceBinder.class, p0);
    }
    public static AppLifecycleServiceBinder[] values(){
       return AppLifecycleServiceBinder.a.clone();
    }
}
