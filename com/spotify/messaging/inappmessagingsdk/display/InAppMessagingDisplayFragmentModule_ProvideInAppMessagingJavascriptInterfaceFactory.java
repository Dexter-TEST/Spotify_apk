package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentModule_ProvideInAppMessagingJavascriptInterfaceFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterface;
import com.spotify.messaging.inappmessagingsdk.display.b;
import p.co5;

public final class InAppMessagingDisplayFragmentModule_ProvideInAppMessagingJavascriptInterfaceFactory implements a02	// class@000a38 from classes.dex
{
    private final tm5 fragmentProvider;

    public void InAppMessagingDisplayFragmentModule_ProvideInAppMessagingJavascriptInterfaceFactory(tm5 p0){
       super();
       this.fragmentProvider = p0;
    }
    public static InAppMessagingDisplayFragmentModule_ProvideInAppMessagingJavascriptInterfaceFactory create(tm5 p0){
       return new InAppMessagingDisplayFragmentModule_ProvideInAppMessagingJavascriptInterfaceFactory(p0);
    }
    public static InAppMessagingJSInterface provideInAppMessagingJavascriptInterface(Fragment p0){
       InAppMessagingJSInterface inAppMessagi = b.c(p0);
       co5.n(inAppMessagi);
       return inAppMessagi;
    }
    public InAppMessagingJSInterface get(){
       return InAppMessagingDisplayFragmentModule_ProvideInAppMessagingJavascriptInterfaceFactory.provideInAppMessagingJavascriptInterface(this.fragmentProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
