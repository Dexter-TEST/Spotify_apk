package p.r3;
import android.content.Intent;
import java.lang.CharSequence;
import android.content.IntentSender;
import android.app.Activity;
import android.net.Uri;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.media.session.PlaybackState$Builder;
import android.os.Message;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public abstract class r3	// class@00246f from classes.dex
{

    public static Intent a(Intent p0,CharSequence p1,IntentSender p2){
       return Intent.createChooser(p0, p1, p2);
    }
    public static Uri b(Activity p0){
       return p0.getReferrer();
    }
    public static Bundle c(PlaybackState p0){
       return p0.getExtras();
    }
    public static void d(PlaybackState$Builder p0,Bundle p1){
       p0.setExtras(p1);
    }
    public static void e(Message p0){
       p0.setAsynchronous(true);
    }
    public static void f(View p0,AccessibilityNodeInfo p1){
       p1.setTraversalAfter(p0);
    }
}
