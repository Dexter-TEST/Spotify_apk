package p.rr0;
import android.widget.EdgeEffect;
import android.view.ContentInfo;
import android.content.ClipData;
import android.view.ContentInfo$Builder;
import android.view.View;
import android.app.Notification$Action$Builder;
import android.app.job.JobInfo$Builder;
import android.net.Uri;
import android.os.Bundle;
import java.lang.String;
import android.view.OnReceiveContentListener;
import p.th7;

public abstract class rr0	// class@002540 from classes.dex
{

    public static float a(EdgeEffect p0){
       return p0.getDistance();
    }
    public static float b(EdgeEffect p0,float p1,float p2){
       return p0.onPullDistance(p1, p2);
    }
    public static int c(ContentInfo p0){
       return p0.getFlags();
    }
    public static ClipData d(ContentInfo p0){
       return p0.getClip();
    }
    public static ContentInfo e(ContentInfo$Builder p0){
       return p0.build();
    }
    public static ContentInfo f(View p0,ContentInfo p1){
       return p0.performReceiveContent(p1);
    }
    public static void g(Notification$Action$Builder p0,boolean p1){
       p0.setAuthenticationRequired(p1);
    }
    public static void h(JobInfo$Builder p0){
       p0.setExpedited(true);
    }
    public static void i(ContentInfo$Builder p0,int p1){
       p0.setFlags(p1);
    }
    public static void j(ContentInfo$Builder p0,Uri p1){
       p0.setLinkUri(p1);
    }
    public static void k(ContentInfo$Builder p0,Bundle p1){
       p0.setExtras(p1);
    }
    public static void l(View p0,String[] p1){
       p0.setOnReceiveContentListener(p1, null);
    }
    public static void m(View p0,String[] p1,th7 p2){
       p0.setOnReceiveContentListener(p1, p2);
    }
    public static String[] n(View p0){
       return p0.getReceiveContentMimeTypes();
    }
    public static int o(ContentInfo p0){
       return p0.getSource();
    }
}
