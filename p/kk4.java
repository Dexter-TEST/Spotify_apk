package p.kk4;
import p.b5;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import java.lang.Object;
import java.lang.CharSequence;
import android.content.Context;
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

public final class kk4 implements b5	// class@001c2e from classes.dex
{
    public final int a;
    public final NowPlayingActivity b;

    public void kk4(NowPlayingActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       kk4 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.getClass();
             tb.c0.c(rv.a(R.string.added_to_queue).l());
             return;
       }
       Toast.makeText(tb, tb.getText(R.string.toast_out_of_skips), 1).show();
       NowPlayingActivity a0 = tb.a0;
       if (a0.b.c.isEmpty()) {
          xq7 c = a0.c;
          c.getClass();
          c.a.onNext(new k97(TriggerType.CLIENT_EVENT, "upsell:skip-limit-reached:v1"));
       }
       return;
    }
}
