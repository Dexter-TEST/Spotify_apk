package com.spotify.core.corefullsessionservice.CoreFullSessionService$initInternal$localAuthenticatedScopeImpl$1;
import java.util.concurrent.Executor;
import com.spotify.core.corefullsessionservice.CoreFullSessionService;
import java.lang.Object;
import java.lang.Runnable;
import p.sw0;
import p.tw0;
import java.lang.String;
import p.co5;
import com.spotify.clientfoundations.concurrency.async.Scheduler;

final class CoreFullSessionService$initInternal$localAuthenticatedScopeImpl$1 implements Executor	// class@000843 from classes.dex
{
    final CoreFullSessionService this$0;

    public void CoreFullSessionService$initInternal$localAuthenticatedScopeImpl$1(CoreFullSessionService p0){
       this.this$0 = p0;
       super();
    }
    public final void execute(Runnable p0){
       co5.l(p0, "it");
       CoreFullSessionService.access$getCoreThreadingApi$p(this.this$0).a.post(p0);
    }
}
