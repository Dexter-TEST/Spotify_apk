package p.h83;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter;
import p.j83;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import p.tw5;
import java.lang.Runnable;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter$Callback;
import java.lang.String;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment;
import com.spotify.messaging.quicksilverliteintegration.DisplayOrchestrator;
import java.util.HashSet;
import java.util.Set;

public final class h83 implements InAppMessagingPresenter	// class@0017fe from classes.dex
{
    public final j83 a;

    public void h83(j83 p0){
       this.a = p0;
       super();
    }
    public final void containerHeight(int p0){
       new Handler(Looper.getMainLooper()).post(new tw5(p0, 1, this));
    }
    public final void dismiss(){
       j83.a(this.a);
    }
    public final void present(InAppMessagingPresenter$Callback p0){
       h83 ta = this.a;
       InAppMessagingDisplayFragment inAppMessagi = ta.e.D("IN_APP_MESSAGING_BANNER_FRAGMENT_TAG");
       j83 d = ta.d;
       if (!d.c.isEmpty()) {
          inAppMessagi.discardMessage(d.c);
          j83.a(ta);
       }else {
          inAppMessagi.setVisible(true);
          p0.hasPresented();
       }
       return;
    }
}
