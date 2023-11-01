package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService$initInternal$localAuthenticatedScopeImpl$1;
import java.util.concurrent.Executor;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService;
import java.lang.Object;
import java.lang.Runnable;
import p.sw0;
import p.tw0;
import java.lang.String;
import p.co5;
import com.spotify.clientfoundations.concurrency.async.Scheduler;

final class CoreLimitedSessionService$initInternal$localAuthenticatedScopeImpl$1 implements Executor	// class@00084c from classes.dex
{
    final CoreLimitedSessionService this$0;

    public void CoreLimitedSessionService$initInternal$localAuthenticatedScopeImpl$1(CoreLimitedSessionService p0){
       this.this$0 = p0;
       super();
    }
    public final void execute(Runnable p0){
       co5.l(p0, "it");
       CoreLimitedSessionService.access$getCoreThreadingApi$p(this.this$0).a.post(p0);
    }
}
