package p.uk4;
import p.b5;
import p.vk4;
import java.lang.Object;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import android.widget.Toast;
import p.xq7;
import com.spotify.messaging.quicksilverliteintegration.DisplayOrchestrator;
import java.util.HashSet;
import p.p97;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import java.lang.Class;
import p.k97;
import java.lang.String;
import p.an5;
import p.i77;
import p.rv;
import p.ym6;

public final class uk4 implements b5	// class@0028c9 from classes.dex
{
    public final int a;
    public final vk4 b;

    public void uk4(vk4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       uk4 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.w.c(rv.a(R.string.player_error_ad_is_playing).l());
             return;
       }
       Toast.makeText(tb.requireContext(), tb.getText(R.string.toast_out_of_skips), 1).show();
       vk4 y = tb.y;
       if (y.b.c.isEmpty()) {
          xq7 c = y.c;
          c.getClass();
          c.a.onNext(new k97(TriggerType.CLIENT_EVENT, "upsell:skip-limit-reached:v1"));
       }
       return;
    }
}
