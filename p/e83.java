package p.e83;
import android.webkit.ValueCallback;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment$InAppMessagingDisplayFragmentAutomationDelegate;
import java.lang.String;
import java.lang.Object;

public final class e83 implements ValueCallback	// class@001439 from classes.dex
{
    public final InAppMessagingDisplayFragment$InAppMessagingDisplayFragmentAutomationDelegate a;
    public final String b;

    public void e83(InAppMessagingDisplayFragment$InAppMessagingDisplayFragmentAutomationDelegate p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onReceiveValue(Object p0){
       InAppMessagingDisplayFragment$InAppMessagingDisplayFragmentAutomationDelegate.a(this.a, this.b, p0);
    }
}
