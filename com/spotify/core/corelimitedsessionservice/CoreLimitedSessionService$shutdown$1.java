package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService$shutdown$1;
import java.lang.Runnable;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService;
import java.lang.Object;

final class CoreLimitedSessionService$shutdown$1 implements Runnable	// class@00084d from classes.dex
{
    final CoreLimitedSessionService this$0;

    public void CoreLimitedSessionService$shutdown$1(CoreLimitedSessionService p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       this.this$0.shutdownInternal$src_main_java_com_spotify_core_corelimitedsessionservice_corelimitedsessionservice();
    }
}
