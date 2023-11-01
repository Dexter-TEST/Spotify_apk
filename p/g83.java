package p.g83;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter;
import p.j83;
import java.lang.Object;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter$Callback;
import java.lang.String;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment;
import com.spotify.messaging.quicksilverliteintegration.DisplayOrchestrator;
import java.util.HashSet;
import java.util.Set;

public final class g83 implements InAppMessagingPresenter	// class@0016bb from classes.dex
{
    public final j83 a;

    public void g83(j83 p0){
       this.a = p0;
       super();
    }
    public final void containerHeight(int p0){
    }
    public final void dismiss(){
       this.a.d();
    }
    public final void present(InAppMessagingPresenter$Callback p0){
       g83 ta = this.a;
       InAppMessagingDisplayFragment inAppMessagi = ta.e.D("IN_APP_MESSAGING_FULLSCREEN_FRAGMENT_TAG");
       j83 d = ta.d;
       if (!d.c.isEmpty()) {
          inAppMessagi.discardMessage(d.c);
          ta.d();
       }else {
          inAppMessagi.setVisible(true);
          p0.hasPresented();
       }
       return;
    }
}
