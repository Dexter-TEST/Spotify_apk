package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment$Builder;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragmentBuilder;
import p.w87;
import p.u73;
import java.lang.Object;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;

public class InAppMessagingDisplayFragment$Builder implements InAppMessagingDisplayFragmentBuilder	// class@000a31 from classes.dex
{
    private final u73 mMessage;
    private final w87 mTrigger;

    public void InAppMessagingDisplayFragment$Builder(w87 p0,u73 p1){
       super();
       this.mTrigger = p0;
       this.mMessage = p1;
    }
    public InAppMessagingDisplayFragment build(){
       return InAppMessagingDisplayFragment.access$100(this.mMessage, this.mTrigger);
    }
    public FormatType getFormat(){
       return this.mMessage.w;
    }
}
