package p.ne6;
import java.lang.Runnable;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import com.spotify.litelisteningexperience.share.ShareResultReceiver;
import java.lang.Class;
import p.vv7;
import android.app.PendingIntent;
import java.lang.CharSequence;
import android.content.IntentSender;
import p.r3;

public final class ne6 implements Runnable	// class@001fc2 from classes.dex
{
    public final Context a;
    public final String b;
    public final String c;
    public final String t;
    public final String v;
    public final String w;
    public final Intent x;

    public void ne6(Context p0,Intent p1,String p2,String p3,String p4,String p5,String p6){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p3;
       this.t = p4;
       this.v = p5;
       this.w = p6;
       this.x = p1;
    }
    public final void run(){
       ne6 ta = this.a;
       Intent intent = new Intent(ta, ShareResultReceiver.class);
       intent.putExtra("entity_uri", this.b);
       intent.putExtra("destination_id", "overflow-menu");
       intent.putExtra("capability", "message");
       intent.putExtra("share_id", this.c);
       intent.putExtra("source_page_uri", this.t);
       intent.putExtra("source_page_id", this.v);
       intent.putExtra("share_url", this.w);
       ta.startActivity(r3.a(this.x, ta.getText(R.string.share_chooser), PendingIntent.getBroadcast(ta, 0, intent, vv7.d(0x8000000)).getIntentSender()));
    }
}
