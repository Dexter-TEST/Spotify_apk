package com.spotify.core.corefullsessionservice.CoreFullSessionService$1;
import java.lang.Runnable;
import com.spotify.core.corefullsessionservice.CoreFullSessionService;
import java.lang.Object;
import com.spotify.clientfoundations.core.corefullimpl.NativeFullAuthenticatedScopeImpl;

final class CoreFullSessionService$1 implements Runnable	// class@000840 from classes.dex
{
    final CoreFullSessionService this$0;

    public void CoreFullSessionService$1(CoreFullSessionService p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       CoreFullSessionService$1 tthis$0 = this.this$0;
       CoreFullSessionService.access$setAuthenticatedScopeImpl$p(tthis$0, tthis$0.initInternal$src_main_java_com_spotify_core_corefullsessionservice_corefullsessionservice());
    }
}
