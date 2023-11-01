package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterface;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter;
import com.spotify.messaging.inappmessagingsdk.display.MessageInteractor;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingActionCallback;
import com.spotify.messaging.inappmessagingsdk.display.TouchBoundaryFrameLayout;
import java.lang.String;

public interface abstract InAppMessagingJSInterface	// class@000a3c from classes.dex
{

    void bannerHeight(int p0);
    void bind(InAppMessagingPresenter p0,MessageInteractor p1,InAppMessagingActionCallback p2,TouchBoundaryFrameLayout p3);
    void call(String p0);
    void callV2(String p0,String p1,boolean p2);
    void documentReady();
    void documentReady(String p0);
    void noteHeight(int p0);
    void unbind();
}
