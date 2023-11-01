package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentBuilder;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;

public interface abstract InAppMessagingDisplayFragmentBuilder	// class@000a34 from classes.dex
{

    InAppMessagingDisplayFragment build();
    FormatType getFormat();
}
