package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentModule_ProvideInAppMessageFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import p.u73;
import com.spotify.messaging.inappmessagingsdk.display.b;
import p.co5;

public final class InAppMessagingDisplayFragmentModule_ProvideInAppMessageFactory implements a02	// class@000a37 from classes.dex
{
    private final tm5 fragmentProvider;

    public void InAppMessagingDisplayFragmentModule_ProvideInAppMessageFactory(tm5 p0){
       super();
       this.fragmentProvider = p0;
    }
    public static InAppMessagingDisplayFragmentModule_ProvideInAppMessageFactory create(tm5 p0){
       return new InAppMessagingDisplayFragmentModule_ProvideInAppMessageFactory(p0);
    }
    public static u73 provideInAppMessage(Fragment p0){
       u73 ou73 = b.b(p0);
       co5.n(ou73);
       return ou73;
    }
    public Object get(){
       return this.get();
    }
    public u73 get(){
       return InAppMessagingDisplayFragmentModule_ProvideInAppMessageFactory.provideInAppMessage(this.fragmentProvider.get());
    }
}
