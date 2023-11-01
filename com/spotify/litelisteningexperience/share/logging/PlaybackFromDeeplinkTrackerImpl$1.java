package com.spotify.litelisteningexperience.share.logging.PlaybackFromDeeplinkTrackerImpl$1;
import p.dk3;
import com.spotify.litelisteningexperience.share.logging.a;
import java.lang.Object;
import p.vj3;
import p.fd1;
import p.sa6;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;

class PlaybackFromDeeplinkTrackerImpl$1 implements dk3	// class@000937 from classes.dex
{
    public final a a;

    public void PlaybackFromDeeplinkTrackerImpl$1(a p0){
       this.a = p0;
       super();
    }
    public void onDestroy(){
       PlaybackFromDeeplinkTrackerImpl$1 ta = this.a;
       ta.b.c(ta.e);
    }
    public void onStop(){
       cd1.d(this.a.d.a.a, null);
    }
}
