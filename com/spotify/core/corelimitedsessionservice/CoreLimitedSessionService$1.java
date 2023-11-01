package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService$1;
import java.lang.Runnable;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService;
import java.lang.Object;
import com.spotify.clientfoundations.core.corelimitedimpl.NativeLimitedAuthenticatedScopeImpl;

final class CoreLimitedSessionService$1 implements Runnable	// class@000849 from classes.dex
{
    final CoreLimitedSessionService this$0;

    public void CoreLimitedSessionService$1(CoreLimitedSessionService p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       CoreLimitedSessionService$1 tthis$0 = this.this$0;
       CoreLimitedSessionService.access$setAuthenticatedScopeImpl$p(tthis$0, tthis$0.initInternal$src_main_java_com_spotify_core_corelimitedsessionservice_corelimitedsessionservice());
    }
}
