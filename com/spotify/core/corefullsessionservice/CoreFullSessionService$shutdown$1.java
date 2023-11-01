package com.spotify.core.corefullsessionservice.CoreFullSessionService$shutdown$1;
import java.lang.Runnable;
import com.spotify.core.corefullsessionservice.CoreFullSessionService;
import java.lang.Object;

final class CoreFullSessionService$shutdown$1 implements Runnable	// class@000844 from classes.dex
{
    final CoreFullSessionService this$0;

    public void CoreFullSessionService$shutdown$1(CoreFullSessionService p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       this.this$0.shutdownInternal$src_main_java_com_spotify_core_corefullsessionservice_corefullsessionservice();
    }
}
