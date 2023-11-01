package com.spotify.lyrics.corecomponents.presenter.controller.LyricsPlaybackControllerImpl$clientLifecycleObserver$2$1;
import p.dk3;
import p.gy3;
import java.lang.Object;
import p.dx3;
import p.gu0;
import p.u44;

public final class LyricsPlaybackControllerImpl$clientLifecycleObserver$2$1 implements dk3	// class@0009e8 from classes.dex
{
    public final gy3 a;

    public void LyricsPlaybackControllerImpl$clientLifecycleObserver$2$1(gy3 p0){
       this.a = p0;
       super();
    }
    public final void onStart(){
       gy3 a;
       gy3 b;
       LyricsPlaybackControllerImpl$clientLifecycleObserver$2$1 ta = this.a;
       if ((a = ta.a) == null) {
          return;
       }
       if ((b = ta.b) == null) {
          return;
       }
       ta.a(a, b);
       return;
    }
    public final void onStop(){
       this.a.f.t();
    }
}
