package com.spotify.messaging.premiummessaging.clientoptinproxy.ClientOptInProxyService;
import p.f51;
import android.content.Intent;
import android.os.IBinder;
import android.app.Service;
import java.lang.String;
import p.co5;

public final class ClientOptInProxyService extends f51	// class@000a59 from classes.dex
{
    public static final int a;

    public void ClientOptInProxyService(){
       super();
    }
    public final IBinder onBind(Intent p0){
       return null;
    }
    public final int onStartCommand(Intent p0,int p1,int p2){
       super.onStartCommand(p0, p1, p2);
       co5.N("clientOptInProxyEndpoint");
       throw 0;
    }
}
