package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentModule_ProvideImpressionEndpointFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.cy5;
import p.t73;
import com.spotify.messaging.inappmessagingsdk.display.b;
import p.co5;

public final class InAppMessagingDisplayFragmentModule_ProvideImpressionEndpointFactory implements a02	// class@000a36 from classes.dex
{
    private final tm5 retrofitMakerProvider;

    public void InAppMessagingDisplayFragmentModule_ProvideImpressionEndpointFactory(tm5 p0){
       super();
       this.retrofitMakerProvider = p0;
    }
    public static InAppMessagingDisplayFragmentModule_ProvideImpressionEndpointFactory create(tm5 p0){
       return new InAppMessagingDisplayFragmentModule_ProvideImpressionEndpointFactory(p0);
    }
    public static t73 provideImpressionEndpoint(cy5 p0){
       t73 ot73 = b.a(p0);
       co5.n(ot73);
       return ot73;
    }
    public Object get(){
       return this.get();
    }
    public t73 get(){
       return InAppMessagingDisplayFragmentModule_ProvideImpressionEndpointFactory.provideImpressionEndpoint(this.retrofitMakerProvider.get());
    }
}
