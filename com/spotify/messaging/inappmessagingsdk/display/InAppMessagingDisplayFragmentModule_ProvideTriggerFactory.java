package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentModule_ProvideTriggerFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import p.w87;
import com.spotify.messaging.inappmessagingsdk.display.b;
import p.co5;

public final class InAppMessagingDisplayFragmentModule_ProvideTriggerFactory implements a02	// class@000a3a from classes.dex
{
    private final tm5 fragmentProvider;

    public void InAppMessagingDisplayFragmentModule_ProvideTriggerFactory(tm5 p0){
       super();
       this.fragmentProvider = p0;
    }
    public static InAppMessagingDisplayFragmentModule_ProvideTriggerFactory create(tm5 p0){
       return new InAppMessagingDisplayFragmentModule_ProvideTriggerFactory(p0);
    }
    public static w87 provideTrigger(Fragment p0){
       w87 ow87 = b.e(p0);
       co5.n(ow87);
       return ow87;
    }
    public Object get(){
       return this.get();
    }
    public w87 get(){
       return InAppMessagingDisplayFragmentModule_ProvideTriggerFactory.provideTrigger(this.fragmentProvider.get());
    }
}
