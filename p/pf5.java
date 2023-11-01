package p.pf5;
import android.media.session.PlaybackState$Builder;
import android.media.session.PlaybackState$CustomAction;
import android.media.session.PlaybackState$CustomAction$Builder;
import android.media.session.PlaybackState;
import java.lang.String;
import java.lang.CharSequence;
import java.util.List;
import android.os.Bundle;

public abstract class pf5	// class@002250 from classes.dex
{

    public static void a(PlaybackState$Builder p0,PlaybackState$CustomAction p1){
       p0.addCustomAction(p1);
    }
    public static PlaybackState$CustomAction b(PlaybackState$CustomAction$Builder p0){
       return p0.build();
    }
    public static PlaybackState c(PlaybackState$Builder p0){
       return p0.build();
    }
    public static PlaybackState$Builder d(){
       return new PlaybackState$Builder();
    }
    public static PlaybackState$CustomAction$Builder e(String p0,CharSequence p1,int p2){
       return new PlaybackState$CustomAction$Builder(p0, p1, p2);
    }
    public static String f(PlaybackState$CustomAction p0){
       return p0.getAction();
    }
    public static long g(PlaybackState p0){
       return p0.getActions();
    }
    public static long h(PlaybackState p0){
       return p0.getActiveQueueItemId();
    }
    public static long i(PlaybackState p0){
       return p0.getBufferedPosition();
    }
    public static List j(PlaybackState p0){
       return p0.getCustomActions();
    }
    public static CharSequence k(PlaybackState p0){
       return p0.getErrorMessage();
    }
    public static Bundle l(PlaybackState$CustomAction p0){
       return p0.getExtras();
    }
    public static int m(PlaybackState$CustomAction p0){
       return p0.getIcon();
    }
    public static long n(PlaybackState p0){
       return p0.getLastPositionUpdateTime();
    }
    public static CharSequence o(PlaybackState$CustomAction p0){
       return p0.getName();
    }
    public static float p(PlaybackState p0){
       return p0.getPlaybackSpeed();
    }
    public static long q(PlaybackState p0){
       return p0.getPosition();
    }
    public static int r(PlaybackState p0){
       return p0.getState();
    }
    public static void s(PlaybackState$Builder p0,long p1){
       p0.setActions(p1);
    }
    public static void t(PlaybackState$Builder p0,long p1){
       p0.setActiveQueueItemId(p1);
    }
    public static void u(PlaybackState$Builder p0,long p1){
       p0.setBufferedPosition(p1);
    }
    public static void v(PlaybackState$Builder p0,CharSequence p1){
       p0.setErrorMessage(p1);
    }
    public static void w(PlaybackState$CustomAction$Builder p0,Bundle p1){
       p0.setExtras(p1);
    }
    public static void x(PlaybackState$Builder p0,int p1,long p2,float p3,long p4){
       p0.setState(p1, p2, p3, p4);
    }
}
