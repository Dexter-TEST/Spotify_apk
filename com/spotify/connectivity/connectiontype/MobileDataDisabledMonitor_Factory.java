package com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import android.content.Context;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;

public final class MobileDataDisabledMonitor_Factory implements a02	// class@0006a0 from classes.dex
{
    private final tm5 contextProvider;

    public void MobileDataDisabledMonitor_Factory(tm5 p0){
       super();
       this.contextProvider = p0;
    }
    public static MobileDataDisabledMonitor_Factory create(tm5 p0){
       return new MobileDataDisabledMonitor_Factory(p0);
    }
    public static MobileDataDisabledMonitor newInstance(Context p0){
       return new MobileDataDisabledMonitor(p0);
    }
    public MobileDataDisabledMonitor get(){
       return MobileDataDisabledMonitor_Factory.newInstance(this.contextProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
