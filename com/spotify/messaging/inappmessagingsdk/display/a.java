package com.spotify.messaging.inappmessagingsdk.display.a;
import java.lang.Runnable;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment$1;
import java.lang.String;
import java.lang.Object;

public final class a implements Runnable	// class@000a47 from classes.dex
{
    public final InAppMessagingDisplayFragment$1 a;
    public final String b;

    public void a(InAppMessagingDisplayFragment$1 p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void run(){
       InAppMessagingDisplayFragment$1.a(this.a, this.b);
    }
}
