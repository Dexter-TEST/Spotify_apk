package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentModule_ProvideMessageInteractorFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.u73;
import p.w87;
import java.util.Map;
import p.c6;
import p.l83;
import p.r73;
import p.zg0;
import com.spotify.messaging.inappmessagingsdk.display.MessageInteractor;
import com.spotify.messaging.inappmessagingsdk.display.b;
import p.co5;

public final class InAppMessagingDisplayFragmentModule_ProvideMessageInteractorFactory implements a02	// class@000a39 from classes.dex
{
    private final tm5 actionHandlerMapProvider;
    private final tm5 actionStateInitializerProvider;
    private final tm5 clientLoggerProvider;
    private final tm5 clockProvider;
    private final tm5 impressionApiProvider;
    private final tm5 inAppMessageProvider;
    private final tm5 triggerProvider;

    public void InAppMessagingDisplayFragmentModule_ProvideMessageInteractorFactory(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5,tm5 p6){
       super();
       this.inAppMessageProvider = p0;
       this.triggerProvider = p1;
       this.actionHandlerMapProvider = p2;
       this.actionStateInitializerProvider = p3;
       this.clientLoggerProvider = p4;
       this.impressionApiProvider = p5;
       this.clockProvider = p6;
    }
    public static InAppMessagingDisplayFragmentModule_ProvideMessageInteractorFactory create(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5,tm5 p6){
       InAppMessagingDisplayFragmentModule_ProvideMessageInteractorFactory v8 = new InAppMessagingDisplayFragmentModule_ProvideMessageInteractorFactory(p0, p1, p2, p3, p4, p5, p6);
       return v8;
    }
    public static MessageInteractor provideMessageInteractor(u73 p0,w87 p1,Map p2,c6 p3,l83 p4,r73 p5,zg0 p6){
       MessageInteractor messageInter = b.d(p0, p1, p2, p3, p4, p5, p6);
       co5.n(messageInter);
       return messageInter;
    }
    public MessageInteractor get(){
       return InAppMessagingDisplayFragmentModule_ProvideMessageInteractorFactory.provideMessageInteractor(this.inAppMessageProvider.get(), this.triggerProvider.get(), this.actionHandlerMapProvider.get(), this.actionStateInitializerProvider.get(), this.clientLoggerProvider.get(), this.impressionApiProvider.get(), this.clockProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
