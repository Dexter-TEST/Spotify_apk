package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment_MembersInjector;
import p.w54;
import p.tm5;
import java.lang.Object;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment;
import p.u73;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterface;
import com.spotify.messaging.inappmessagingsdk.display.MessageInteractor;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter;
import p.w87;

public final class InAppMessagingDisplayFragment_MembersInjector implements w54	// class@000a3b from classes.dex
{
    private final tm5 mInAppMessageProvider;
    private final tm5 mJavascriptInterfaceProvider;
    private final tm5 mMessageInteractorProvider;
    private final tm5 mPresenterProvider;
    private final tm5 mTriggerProvider;

    public void InAppMessagingDisplayFragment_MembersInjector(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4){
       super();
       this.mMessageInteractorProvider = p0;
       this.mPresenterProvider = p1;
       this.mJavascriptInterfaceProvider = p2;
       this.mInAppMessageProvider = p3;
       this.mTriggerProvider = p4;
    }
    public static w54 create(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4){
       InAppMessagingDisplayFragment_MembersInjector v6 = new InAppMessagingDisplayFragment_MembersInjector(p0, p1, p2, p3, p4);
       return v6;
    }
    public static void injectMInAppMessage(InAppMessagingDisplayFragment p0,u73 p1){
       p0.mInAppMessage = p1;
    }
    public static void injectMJavascriptInterface(InAppMessagingDisplayFragment p0,InAppMessagingJSInterface p1){
       p0.mJavascriptInterface = p1;
    }
    public static void injectMMessageInteractor(InAppMessagingDisplayFragment p0,Object p1){
       p0.mMessageInteractor = p1;
    }
    public static void injectMPresenter(InAppMessagingDisplayFragment p0,InAppMessagingPresenter p1){
       p0.mPresenter = p1;
    }
    public static void injectMTrigger(InAppMessagingDisplayFragment p0,w87 p1){
       p0.mTrigger = p1;
    }
    public void injectMembers(InAppMessagingDisplayFragment p0){
       InAppMessagingDisplayFragment_MembersInjector.injectMMessageInteractor(p0, this.mMessageInteractorProvider.get());
       InAppMessagingDisplayFragment_MembersInjector.injectMPresenter(p0, this.mPresenterProvider.get());
       InAppMessagingDisplayFragment_MembersInjector.injectMJavascriptInterface(p0, this.mJavascriptInterfaceProvider.get());
       InAppMessagingDisplayFragment_MembersInjector.injectMInAppMessage(p0, this.mInAppMessageProvider.get());
       InAppMessagingDisplayFragment_MembersInjector.injectMTrigger(p0, this.mTriggerProvider.get());
    }
    public void injectMembers(Object p0){
       this.injectMembers(p0);
    }
}
