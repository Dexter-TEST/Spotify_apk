package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterfaceImpl$documentReady$1;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter$Callback;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterfaceImpl;
import java.lang.Object;
import com.spotify.messaging.inappmessagingsdk.display.MessageInteractor;

final class InAppMessagingJSInterfaceImpl$documentReady$1 implements InAppMessagingPresenter$Callback	// class@000a3d from classes.dex
{
    final InAppMessagingJSInterfaceImpl this$0;

    public void InAppMessagingJSInterfaceImpl$documentReady$1(InAppMessagingJSInterfaceImpl p0){
       this.this$0 = p0;
       super();
    }
    public final void hasPresented(){
       MessageInteractor messageInter;
       if ((messageInter = InAppMessagingJSInterfaceImpl.access$get_messageInteractor$p(this.this$0)) != null) {
          messageInter.onImpression();
       }
       return;
    }
}
