package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingActionCallback;
import java.lang.String;

public interface abstract InAppMessagingActionCallback	// class@000a2e from classes.dex
{
    public static final String TOGGLE_CONTENT = "TOGGLE_CONTENT";

    void actionEvent(String p0,String p1,boolean p2);
    void dataParsingError();
}
