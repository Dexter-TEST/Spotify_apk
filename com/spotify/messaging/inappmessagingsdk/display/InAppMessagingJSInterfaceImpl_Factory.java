package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterfaceImpl_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterfaceImpl;
import java.lang.Float;

public final class InAppMessagingJSInterfaceImpl_Factory implements a02	// class@000a40 from classes.dex
{
    private final tm5 densityProvider;

    public void InAppMessagingJSInterfaceImpl_Factory(tm5 p0){
       super();
       this.densityProvider = p0;
    }
    public static InAppMessagingJSInterfaceImpl_Factory create(tm5 p0){
       return new InAppMessagingJSInterfaceImpl_Factory(p0);
    }
    public static InAppMessagingJSInterfaceImpl newInstance(float p0){
       return new InAppMessagingJSInterfaceImpl(p0);
    }
    public InAppMessagingJSInterfaceImpl get(){
       return InAppMessagingJSInterfaceImpl_Factory.newInstance(this.densityProvider.get().floatValue());
    }
    public Object get(){
       return this.get();
    }
}
