package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter$Callback;

public interface abstract InAppMessagingPresenter	// class@000a43 from classes.dex
{

    void containerHeight(int p0);
    void dismiss();
    void present(InAppMessagingPresenter$Callback p0);
}
